package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Database {

    private String connectionUrl = "jdbc:sqlserver://163.178.107.130"
            + "databaseName=IF5100_Barrientos_Sandoval;user=sqlserver; password=saucr.12;";
    private Connection con = null;

    public Database() {
        try {
            conection();
        } catch (ClassNotFoundException ex) {
            System.err.println("(ERROR 000: Conexión BD Fallida) "+ex);
        } catch (SQLException ex) {
            System.err.println("(ERROR 001: Conexión BD Fallida) "+ex);
        }//END TRY/CATCH

    }//END DEFAULT CONSTRUCT
    
    public void conection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.con = DriverManager.getConnection(this.connectionUrl);
    }//END METHOD CONECTION

}//END DATABASE
