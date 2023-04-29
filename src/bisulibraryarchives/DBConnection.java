/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bisulibraryarchives;



/**
 *
 * @author User1
 */ 
import java.sql.*;
import javax.swing.*;

public class DBConnection {
      static Connection connect;
       static String status;
   
  public static void setConnection()
  {
      try
      {
         //Class.forName("com.mysql.jdbc.Driver");
          connect = DriverManager.getConnection("jdbc:mysql://sv6.byethost6.org:3306/accenzos_onlinepayment", "accenzos_onlinepayuser", "onlinepaypass");
       //JOptionPane.showMessageDialog(null, "Succesfully Connected!");
      }catch(Exception e)
     {
       //  JOptionPane.showMessageDialog(null, "Connection Failed");
         e.printStackTrace();
          
      }
  }
    public static Connection getConnection()
    {
      
        return connect;
    }
    
     public static String getStatusConnection(){
        if(connect!=null){
           status = "Database Connectivity : Successfully Connected";
        }
        else{
             status = "Database Connectivity: Connection Failed";
        }
        return status;
        
    }

    
}
