package Data;

import Domain.Invoice;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InvoiceData {

    private Database databaseConn;

    public InvoiceData() {
        databaseConn = new Database();
    }

    public boolean insertInvoice(Invoice newInvoice) throws SQLException {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();

        String articles = "";
        String quantity = "";

        for (int i = 0; i < newInvoice.getOrderArray().length; i++) {
            if (i < newInvoice.getOrderArray().length - 1) {
                articles += newInvoice.getOrderArray()[i].getArticle().getIdArticle() + ",";
                quantity += newInvoice.getOrderArray()[i].getQuantity() + ",";
            } else {
                articles += newInvoice.getOrderArray()[i].getArticle().getIdArticle() + "";
                quantity += newInvoice.getOrderArray()[i].getQuantity() + "";
            }
        }
                
                
        CallableStatement call = conn.prepareCall("{call sp_insertar_compra(?,?,?)}");
        call.setInt(1, newInvoice.getEmployee().getDNI());
        call.setString(2, articles);
        call.setString(3, quantity);

        try {
            call.execute();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (conn != null) {
                this.databaseConn.closeConnection();
            }
            if(call != null){
                call.close();
            }
        }
        
        return false;
    }
    
    public ResultSet reportingSalesData(int month, int year) throws SQLException{
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();
        
        CallableStatement call = conn.prepareCall("{call sp_monthly_sales(?,?)}");
        call.setInt(1, month);
        call.setInt(2, year);
        
        call.execute();
        ResultSet rs = call.getResultSet();
        return rs;
        
     /*   while(rs.next()){
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2)+ " ");
            System.out.print(rs.getDouble(3)+ " ");
            System.out.println(rs.getInt(4));
        }
    */
        
    }
            
    
}
