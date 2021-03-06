/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import com.toedter.calendar.JCalendar;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.util.*;

/**
 *
 * @author amonkats
 */
public class LibraryForm3 extends javax.swing.JFrame {

    /**
     * Creates new form LibraryForm3
     */
    public LibraryForm3() {
        initComponents();
        setLocation(230,140);
        setResizable(false);
        setTitle("IUEA Database Oriented System");
    }

   public LibraryForm3(JLabel issueMessage, String id, String title, String name,
                        String pub, String ed, String num, String d) {
       initComponents();
       jLabel1.setText("Request Approved, the book has been issued to you !");
       lbid.setText(id);
       lbtitle.setText(title);
       lbname.setText(name);
       lbpub.setText(pub);
       lbed.setText(ed);
       lbno.setText(num);
       lbdate.setText(d);
       setLocation(230,140);
       setResizable(false);
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbno = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        lbtitle = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbpub = new javax.swing.JLabel();
        lbed = new javax.swing.JLabel();
        lbdate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(690, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 110, 38));

        jButton2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 112, 37));

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel1.setText("           ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 430, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Book Title:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 67, 22));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Author Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("             Librarian's Response:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 340, 22));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Book ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, 22));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Publisher:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 60, 22));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Edition:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 50, 22));

        lbno.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lbno.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbno, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 50, 22));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Invoice No:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 70, 22));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("              Student's Request Info:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 340, 22));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Invoice Date:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 160, -1, 22));

        lbid.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lbid.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, 22));

        lbtitle.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lbtitle.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 110, 22));

        lbname.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lbname.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 22));

        lbpub.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lbpub.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 110, 22));

        lbed.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lbed.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, 22));

        lbdate.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lbdate.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 200, 22));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new LibraryForm2().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LibraryForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryForm3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryForm3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbdate;
    private javax.swing.JLabel lbed;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbno;
    private javax.swing.JLabel lbpub;
    private javax.swing.JLabel lbtitle;
    // End of variables declaration//GEN-END:variables
}
