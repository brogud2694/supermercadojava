package Data;

import Domain.Article;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.JDBCType;
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
        Article newArticle = null;

        Statement statment;
        ResultSet resultSet;
        statment = conn.createStatement();
        resultSet = statment.executeQuery("SELECT nombre, precio "
                + "FROM Articulo WHERE idArticulo=" + idProduct);

        resultSet.next();
        if (resultSet.getRow() != 0) {
            newArticle = new Article();
            newArticle.setIdArticle(idProduct);
            newArticle.setName(resultSet.getString(1));
            newArticle.setPrice(resultSet.getDouble(2));
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

    public Article[] getAllInventory() throws SQLException {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();
        Article newArticle = null;

        Statement statment;
        ResultSet resultSet;
        statment = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        resultSet = statment.executeQuery("SELECT Articulo.idArticulo, Articulo.nombre,"
                + "Inventario.unidades FROM Articulo INNER JOIN Inventario "
                + "ON Articulo.idArticulo = Inventario.idArticulo");
        int rowCount = 0;

        try {
            resultSet.last();
            rowCount = resultSet.getRow();
            resultSet.beforeFirst();
        } catch (SQLException ex) {
            throw new SQLException();
        }

        Article[] articleArray = new Article[rowCount];
        int index = 0;

        while (resultSet.next()) {
            newArticle = new Article();
            newArticle.setIdArticle(resultSet.getInt(1));
            newArticle.setName(resultSet.getString(2));
            newArticle.setQuantity(resultSet.getInt(3));
            articleArray[index++] = newArticle;
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
        return articleArray;
    }

    public boolean addArticleToInventory(Article newArticle) throws SQLException {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();

        CallableStatement call = conn.prepareCall("{call sp_insertar_inventario(?,?,?)}");
        call.setInt(1, newArticle.getIdArticle());
        call.setInt(2, newArticle.getQuantity());
        call.registerOutParameter(3, java.sql.Types.INTEGER);

        try {
            call.execute();

            if (call.getInt(3) == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        return false;
    }

    public boolean deleteArticleInventory(int id) throws SQLException {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();

        CallableStatement call = conn.prepareCall("{call sp_eliminar_inventario(?,?)}");
        call.setInt(1, id);
        call.registerOutParameter(2, java.sql.Types.INTEGER);

        try {
            call.execute();

            if (call.getInt(2) == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        return false;
    }

}
