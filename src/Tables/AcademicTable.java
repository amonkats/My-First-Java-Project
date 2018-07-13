/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import loginpanel2.AcaLogin;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author amonkats
 */
public class AcademicTable extends javax.swing.JFrame {

    MysqlDataSource data;
         
    
    /**
     * Creates new form AcademicTable
     */
    public AcademicTable() {
        initComponents();
        setLocation(110, 95);
        setResizable(false);
        setTitle("IUEA Database Oriented System");
        
        data = new MysqlDataSource();
        data.setURL("jdbc:mysql://localhost:3306/javaproject");
        data.setUser("root");
        data.setPassword("");
              
    }
    
         
    
   public void updateRank(){
        
        Connection conn = null;
        PreparedStatement pst = null;
        int rowSelected = table.getSelectedRow();
        if(rowSelected < 0)
            JOptionPane.showMessageDialog(null, "Select the row to Update !", "Error",JOptionPane.ERROR_MESSAGE);
        
        else{
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        String regNo = model.getValueAt(rowSelected, 1).toString();
        String oop = model.getValueAt(rowSelected, 2).toString();
        String web = model.getValueAt(rowSelected, 3).toString();
        String ooad = model.getValueAt(rowSelected, 4).toString();
        String is = model.getValueAt(rowSelected, 5).toString();
        String rm = model.getValueAt(rowSelected, 6).toString();
        String gd = model.getValueAt(rowSelected, 7).toString();
        String ds = model.getValueAt(rowSelected, 8).toString();
        String gpa = model.getValueAt(rowSelected,9).toString();
        String cgpa = model.getValueAt(rowSelected, 10).toString();
        String serial = model.getValueAt(rowSelected, 0).toString();
       
        String newReg = JOptionPane.showInputDialog(null, "Enter new RegNo",regNo);
        String newOop = JOptionPane.showInputDialog(null, "Enter new OOP Mark",oop);
        String newWeb = JOptionPane.showInputDialog(null, "Enter new WEBIII Mark",web);
        String newOoad = JOptionPane.showInputDialog(null, "Enter new OOAD Mark",ooad);
        String newIs = JOptionPane.showInputDialog(null, "Enter new Information Systems Mark",is);
        String newRm = JOptionPane.showInputDialog(null, "Enter new Research methods Mark",rm);
        String newGd = JOptionPane.showInputDialog(null, "Enter new Graphics Design Mark",gd);
        String newDs = JOptionPane.showInputDialog(null, "Enter new Database Systems Mark",ds);
        String newGpa = JOptionPane.showInputDialog(null, "Enter new GPA ",gpa);
        String newCgpa = JOptionPane.showInputDialog(null, "Enter new CGPA Mark",cgpa);
        String newSerial = JOptionPane.showInputDialog(null, "Enter new SerialNo",serial);
        
        
        int convertoop = Integer.parseInt(newOop);
        int convertweb = Integer.parseInt(newWeb);
        int convertooad = Integer.parseInt(newOoad);
        int convertis = Integer.parseInt(newIs);
        int convertrm = Integer.parseInt(newRm);
        int convertgd = Integer.parseInt(newGd);
        int convertds = Integer.parseInt(newDs);
        double convertgpa = Double.parseDouble(newGpa);
        double convertcgpa = Double.parseDouble(newCgpa);
        int convertserial = Integer.parseInt(newSerial);
        
        model.setValueAt(newReg, rowSelected, 1);
        model.setValueAt(convertoop, rowSelected, 2);
        model.setValueAt(convertweb, rowSelected, 3);
        model.setValueAt(convertooad, rowSelected, 4);
        model.setValueAt(convertis, rowSelected, 5);
        model.setValueAt(convertrm, rowSelected, 6);
        model.setValueAt(convertgd, rowSelected, 7);
        model.setValueAt(convertds, rowSelected, 8);
        model.setValueAt(convertgpa, rowSelected, 9);
        model.setValueAt(convertcgpa, rowSelected, 10);
        model.setValueAt(convertserial, rowSelected, 0);
        
           
        try{
            conn = data.getConnection();
            String query = "UPDATE Javastudent set RegNo=?, OOP=?, WEBIII=?, OOAD=?, Information_Systems=?, Research_Methods=?, Graphics_Design=?, Database_Systems=?, GPA=?, CGPA=? where SerialNo=?";
            pst = conn.prepareStatement(query);
            pst.setString(1, newReg);
            pst.setInt(2, convertoop);
            pst.setInt(3, convertweb);
            pst.setInt(4, convertooad);
            pst.setInt(5, convertis);
            pst.setInt(6, convertrm);
            pst.setInt(7, convertgd);
            pst.setInt(8, convertds);
            pst.setDouble(9, convertgpa);
            pst.setDouble(10, convertcgpa);
            pst.setInt(11, convertserial);
           
            int count = pst.executeUpdate();
            if(count >= 0)
               JOptionPane.showMessageDialog(null, "Row has been Updated");
             if(rowSelected > 0 && count < 0)
               JOptionPane.showMessageDialog(null, "Row wasn't update");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
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
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onWindowOpen(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerialNo", "RegNo", "OOP", "WebIII", "OOAD", "Information_Systems", "Research_Methods", "Graphics_Design", "Database_Systems", "GPA", "CGPA"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 750, 250));

        btnUpdate.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        btnCancel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        btnDelete.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("IUEA  STUDENT'S  ACADEMIC  RECORDS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 340, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onWindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowOpen
        
        AcademicUpdate academic = new AcademicUpdate();
        academic.update();
        
    }//GEN-LAST:event_onWindowOpen

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       
        dispose();
        new AcaLogin().setVisible(true);
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        int row = table.getSelectedRow();
        
        if(row < 0)
            JOptionPane.showMessageDialog(null, "Select the row to delete !", "Error",JOptionPane.ERROR_MESSAGE);
        
        else{
            
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String selected = model.getValueAt(row, 0).toString();
        
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?","Deletion in progress",JOptionPane.YES_NO_OPTION);
         
        try{
         conn = data.getConnection();
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
            JOptionPane.showMessageDialog(null, "Deletion Cancelled....","Error",JOptionPane.ERROR_MESSAGE);
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
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        updateRank();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    public class AcademicUpdate{
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        public void update(){
        
        try{
          conn = data.getConnection();
          String query = "Select * from javaStudent";
          pst = conn.prepareStatement(query);
          rs = pst.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)  {
          JOptionPane.showMessageDialog(null, e);
     } 
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
            java.util.logging.Logger.getLogger(AcademicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcademicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcademicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcademicTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcademicTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
