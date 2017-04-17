package Business;


import Data.EmployeeData;
import Domain.Sesion;
import java.sql.SQLException;


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
