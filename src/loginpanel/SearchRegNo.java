/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpanel;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author amonkats
 */
public class SearchRegNo {
    
    Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
     public ResultSet find(String str){
            try{
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "");
                String query = "select * from javastudent where RegNo = ?";
                pst = (PreparedStatement) conn.prepareStatement(query);
                pst.setString(1, str);
                rs = pst.executeQuery();          
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Connection Failed !");
            }
            return rs;
        }
    
}
