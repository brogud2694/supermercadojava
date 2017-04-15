package Main;

import Data.EmployeeData;
import Domain.Employee;
import Domain.Job;
import GUI.JPPrincipal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        initSystem();


//        try {
//            asdf = new EmployeeData();
//            asdf.login(131231, "micontraseñita");
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

    }//END MAIN

    public static void initSystem() {
        JPPrincipal jp = new JPPrincipal();
    }//END METHOD INITSYSTEM
}//END CLASS MAIN
