/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author PC
 */
public class ConnectionProvider {
   
    public static Connection getCon(){
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
           //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","prashant@24051998");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms?autoReconnect=true&useSSL=false","root","prashant@2405");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
