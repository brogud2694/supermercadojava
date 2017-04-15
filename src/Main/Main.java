package Main;

import Business.DatabaseBusiness;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseBusiness bd = new DatabaseBusiness();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//END MAIN
}//END CLASS MAIN
