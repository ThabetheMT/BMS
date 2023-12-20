/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbershop.db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class DBConnection {
    
   // private Connection con;
    
    public static Connection con() throws ClassNotFoundException, SQLException{
        
        String myDb = "jdbc:derby://localhost:1527/BMSDatabase";
         
           // Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(myDb,"app","123");
            
            return con;
       
    }
}
