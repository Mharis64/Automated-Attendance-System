
package AAS.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBReader {
   


    ResultSet getRecords(String dblQuery,Connection conn) {
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(dblQuery);            
        }
        catch (Exception e) {
            System.out.println("Error Trace in getRecords() : " + e.getMessage());
        }
        return null;
    }

}

