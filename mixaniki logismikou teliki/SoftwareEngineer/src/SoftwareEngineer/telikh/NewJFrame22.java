/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame22.java
 *
 * Created on 7 Φεβ 2013, 1:38:35 πμ
 */

package SoftwareEngineer.telikh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author apo
 */
public class NewJFrame22 extends javax.swing.JFrame {
 String name, surname,age,numberPasp,asTameio,amka,thl,city,area,stret;
       Object sql = null;
       int error = 1;
    /** Creates new form NewJFrame22 */
    public NewJFrame22() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Εισαγωγή νέου ασθενή");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ονομα", "Επώνυμο", "Ηλικία", "Αριθμός ταυτότητας", "Ασφαλιστικό ταμείο", " Α.Μ.Κ.Α", "Τηλέφωνο", "Πόλη", "Περιοχή", "Οδός"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        p1.setCellSelectionEnabled(true);
        p1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                p1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(p1);
        p1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 717, 90));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Καθαρισμός");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 196, 140, 40));

        jButton1.setText("Καταχώρηση");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 197, 140, 40));

        jButton3.setText("Ακύρωση");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 197, 140, 40));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jInternalFrame1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new NewJFrame22().setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
        
      DefaultTableModel  model = ( DefaultTableModel)p1.getModel();
       name = (String) model.getValueAt(0,0);
     surname = (String) model.getValueAt(0,1);
      age = (String) model.getValueAt(0,2);
       numberPasp = (String) model.getValueAt(0,3);
       asTameio = (String) model.getValueAt(0,4);
       amka = (String) model.getValueAt(0,5);
       thl = (String) model.getValueAt(0,6);
       city = (String) model.getValueAt(0,7);
       area = (String) model.getValueAt(0,8);
       stret = (String) model.getValueAt(0,9);
    
     System.out.print("ΝΑΜΕ IS " + name + " SURNAME IS " + surname + " AGE IS " + age);
       
        Connection conn = null;
         Statement stmt = null;
        ResultSet rs = null;
       //load jdbc driver for mysql database
        try
      { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();;
       }catch(Exception e) {
			System.out.println("Unable to load Driver");
		}
        //Establish connection using DriverManager 
		try {
        String connectionUrl;
            connectionUrl = "jdbc:mysql://localhost:3306/BASH";
        String connectionUser;
            connectionUser = "root";
        String connectionPassword = "apo";
        conn = DriverManager.getConnection(connectionUrl, connectionUser,
        connectionPassword);
        } catch (SQLException e) {
			System.out.println("Unable to connect to database");
		}
     //if connection is successfully established, create statement
        if(conn != null) {
      try {         
        stmt = conn.createStatement();
        } catch (SQLException e) {
			     System.out.println("Unable to create statement");
			}
      }
        if(stmt != null) {
       try {
   String sql;
 sql = "INSERT INTO HOSPITAL (NAME,SURNAME,AGE,NUMBER_PAS,AMKA,AS_TAMEIO,THL,CITY,AREA,ODOS ) VALUES ( '"+name+"','"+surname+"','"+age+"','"+numberPasp+"','"+asTameio+"','"+amka+"','"+thl+"','"+city+"','"+area+"','"+stret+"');";
         
          
      //System.out.print("name is " + name + " pass is "+pass);      
      //String sql;
        //        sql = "INSERT INTO STUFF (NAME,PASS,EIDIKOTITA) VALUES ('"+name+"','"+pass+"','"+ eidikotita+"');";
       
       stmt.executeUpdate(sql);
       }
        
        catch (SQLException es) {
	 System.out.println("Unable to insert int the databese");
         error = 0;
			}
        }

          try {
          if (rs != null) { rs.close(); }
           if (conn != null) { conn.close(); }
           if (stmt != null) { stmt.close(); }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        
        
        
        if(error == 1) { 
        this.setVisible(false);
        new NewJFrame23().setVisible(true);
        }
        else {
          this.setVisible(false);
        new NewJFrame25().setVisible(true);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        
        new NewJFrame3().setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

    private void p1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_p1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_p1AncestorAdded

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable p1;
    // End of variables declaration//GEN-END:variables

}
