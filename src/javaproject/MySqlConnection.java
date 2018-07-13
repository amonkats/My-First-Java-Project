/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.sql.*;

/**
 *
 * @author amonkats
 */
public class MySqlConnection {
     Connection con = null;
    public MySqlConnection (){}
    
    
    public Connection open(){      
        String url = "jdbc:mysql://localhost:3306/javaproject";
        String user = "root";
        String pass = "";
        
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            e.printStackTrace();
        }     
        return con;
    }

   
}
