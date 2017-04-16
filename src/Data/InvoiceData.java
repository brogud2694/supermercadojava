package Data;

import java.sql.Connection;


public class InvoiceData {

    private Database databaseConn;

    public InvoiceData() {
        databaseConn = new Database();
    }

    public boolean registerProductInvoice() {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();
        
        
        
        return false;
    }
}
