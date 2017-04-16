package Data;

import Domain.Article;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ArticleData {

    private Database databaseConn;

    public ArticleData() {
        databaseConn = new Database();
    }

    public Article getArticle(int idProduct) throws SQLException {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();
        
        Statement statment;
        ResultSet resultSet;
        
        statment = conn.createStatement();
        resultSet = statment.executeQuery("SELECT nombre, precio "
                + "FROM Articulo WHERE idArticulo=" + idProduct);
        
        Article newArticle = new Article();
        
        resultSet.next();
        if(resultSet.getRow() != 0){
            newArticle.setIdArticle(idProduct);
            newArticle.setName(resultSet.getString(1));
            newArticle.setPrice(resultSet.getDouble(2));
            
            System.out.println(newArticle.toString());
        }
        
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
            }
        }
        if (statment != null) {
            try {
                statment.close();
            } catch (SQLException e) {
            }
        }
        if (conn != null) {
            this.databaseConn.closeConnection();
        }
        return newArticle;
    }
}
