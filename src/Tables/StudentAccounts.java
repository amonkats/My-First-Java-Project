/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.sql.*;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import loginpanel2.AccountsLogin;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author amonkats
 */
public class StudentAccounts extends javax.swing.JFrame {

    /**
     * Creates new form StudentAccounts
     */
    public StudentAccounts() {
        initComponents();
        setLocation(135, 80);
        setResizable(false);
        setTitle("IUEA Database Oriented System");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onWindowOpen(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(685, 330));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegNo", "Names", "Function Fee", "Tuition Fee"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 590, 230));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("IUEA STUDENT'S ACCOUNTS RECORDS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 350, 30));

        jButton1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 110, 30));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 110, 30));

        jButton3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onWindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowOpen
        
        populate();
        
    }//GEN-LAST:event_onWindowOpen

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new AccountsLogin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        rank r = new rank();
        r.updateRank();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
        int row = table.getSelectedRow();
        
        if(row < 0)
            JOptionPane.showMessageDialog(null, "Select the row to delete !", "Error",JOptionPane.ERROR_MESSAGE);
        
        else{
            
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?","Deletion in progress",JOptionPane.YES_NO_OPTION);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String selected = model.getValueAt(row, 0).toString();
         
         try{
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "");
          
          String query = "delete from javaStudent where serialNo=?";
          pst = conn.prepareStatement(query);
          pst.setString(1, selected);
             
          if(row >= 0 ){
            if(reply == JOptionPane.YES_OPTION){
                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Row has been deleted Successfully !");
                  model.removeRow(row);
          }
           else{
            JOptionPane.showMessageDialog(null, "Deletion Cancelled.....");
            pst.close();
            conn.close();
          }
          }else{
              pst.close();
              conn.close();
          }
        }catch(Exception e)  {
          JOptionPane.showMessageDialog(null, e);
    
        }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public class rank{
    public void updateRank(){
        
        Connection conn = null;
        PreparedStatement pst = null;
        int rowSelected = table.getSelectedRow();
        
        if(rowSelected < 0)
            JOptionPane.showMessageDialog(null, "Select the row to Update !", "Error",JOptionPane.ERROR_MESSAGE);
        
        else{
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        String fn = model.getValueAt(rowSelected, 1).toString();
        String ff = model.getValueAt(rowSelected, 2).toString();
        String tf = model.getValueAt(rowSelected, 3).toString();
        String rn = model.getValueAt(rowSelected, 0).toString();
        
        String newfn = JOptionPane.showInputDialog(null, "Enter new Names",fn);
        String newff = JOptionPane.showInputDialog(null, "Enter new Functional Fee",ff);
        String newtf = JOptionPane.showInputDialog(null, "Enter new Tuition Fee",tf);
        String newrn = JOptionPane.showInputDialog(null, "Enter new RegNo Fee",rn);
        
        int convertff = Integer.parseInt(newff);
        int converttf = Integer.parseInt(newtf);
        
        model.setValueAt(newfn, rowSelected, 1);
        model.setValueAt(convertff, rowSelected, 2);
        model.setValueAt(converttf, rowSelected, 3);
        model.setValueAt(newrn, rowSelected, 0);
        
           
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaProject", "root", "");
            String query = "UPDATE tuition set FullNames=?, Functional_Fee=?, Tuition_Fee=? where RegNo=?";
            pst = conn.prepareStatement(query);
            pst.setString(1, newfn);
            pst.setInt(2, convertff);
            pst.setInt(3, converttf);
            pst.setString(4, newrn);
            
           
            int count = pst.executeUpdate();
            if(count >= 0)
           JOptionPane.showMessageDialog(null, "Row has been Updated");
        
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    }
    }
    
     public void populate(){
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
            String query = "select * from tuition";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery(); 
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
