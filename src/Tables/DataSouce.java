/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author amonkats
 */
public class DataSouce {
    
    public void safestway(){
         MysqlDataSource data = new MysqlDataSource();
         data.setURL("jdbc:mysql://localhost:3306/javaproject");
         data.setUser("root");
         data.setPassword("");
        try {
            Connection conn = data.getConnection();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
        
    }
    
}
}