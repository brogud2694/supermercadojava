package Business;

import Data.Database;
import Data.EmployeeData;
import Domain.Sesion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeBusiness {
    
    EmployeeData empD;
    //private Database database;

    public EmployeeBusiness() {
        //this.database = new Database();
        empD = new EmployeeData();
    }//END DEFAULT CONSTRUCTOR
    
    public Sesion loginBusiness(int id, String pass){
        try {
            return empD.login(id, pass);
        } catch (SQLException ex) {
            return null;
        }
    }
    
}//END CLASS DATABASEBUSINESS
