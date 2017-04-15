package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class Database {

    final private String connectionUrl = "jdbc:sqlserver://163.178.107.130;"
            + "databaseName=IF5100_Barrientos_Sandoval;user=sqlserver; password=saucr.12;";
    private Connection con;

    public Database() {
        con = null;
    }//END DEFAULT CONSTRUCT

    public void openConnection() {
        try {
            this.con = DriverManager.getConnection(this.connectionUrl);
        } catch (SQLException e) {

        }
    }//END METHOD CONECTION

    public void closeConnection() {
        if (this.con != null) {
            try {
                this.con.close();
            } catch (SQLException e) {

            }
        }
    }

    public Connection getConnection() {
        return this.con;
    }

}//END DATABASE
