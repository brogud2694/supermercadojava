package Business;

import Data.Database;

public class DatabaseBusiness {
    
    private Database database;

    public DatabaseBusiness() throws Exception {
        this.database = new Database();
        this.database.get();
    }//END DEFAULT CONSTRUCTOR
}//END CLASS DATABASEBUSINESS
