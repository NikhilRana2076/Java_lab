/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc_nikhil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikhil
 */
public class insert {
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            //System.out.println("Connection successfull with id "+con);
            
           Statement statement = con.createStatement();

            // Step 4: Execute a SQL query to create the table
            System.out.println("Inserting records into the table... \n");          
         String sql = "INSERT INTO student VALUES (1,'Gopal', 18)";
         statement.executeUpdate(sql);
         /*sql = "INSERT INTO student VALUES (2,'Ram', 25)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO student VALUES (3,'Hari', 30)";
         statement.executeUpdate(sql);
         sql = "INSERT INTO student VALUES(4,'Sumit', 28)";
         statement.executeUpdate(sql);*/
         System.out.println("Inserted records into the table...");   
        con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
