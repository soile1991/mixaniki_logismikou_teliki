/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author apo
 */
public class NewJFrame4 extends javax.swing.JFrame {

  String name, surname,age,numberPas,asTameio,amka,thl,city,area,odos;
       String VAR;
  public NewJFrame4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setTitle("Αναζήτηση ασθενή");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("ΑΝΑΖΗΤΗΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 210, 161, 49));

        jButton2.setText("ΑΡΧΙΚΟ ΜΕΝΟΥ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 210, 156, 49));

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
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        p1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        p1.getColumnModel().getColumn(0).setResizable(false);
        p1.getColumnModel().getColumn(1).setResizable(false);
        p1.getColumnModel().getColumn(2).setResizable(false);
        p1.getColumnModel().getColumn(3).setResizable(false);
        p1.getColumnModel().getColumn(4).setResizable(false);
        p1.getColumnModel().getColumn(5).setResizable(false);
        p1.getColumnModel().getColumn(6).setResizable(false);
        p1.getColumnModel().getColumn(7).setResizable(false);
        p1.getColumnModel().getColumn(8).setResizable(false);
        p1.getColumnModel().getColumn(9).setResizable(false);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 729, 87));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 110, 121, 38));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Αριθμός ταυτότητας");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 108, 139, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          this.setVisible(false);
        new NewJFrame3().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_p1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_p1AncestorAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
  
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
         DefaultTableModel  model = ( DefaultTableModel)p1.getModel();     
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
     VAR = jTextField1.getText();
      rs = stmt.executeQuery("SELECT * FROM HOSPITAL WHERE NUMBER_PAS='"+VAR+"';");
      
       }
        
        catch (SQLException es) {
	 System.out.println("Unable to create statement");
         
			}
        }
         if(rs != null) {
		   try {
        while (rs.next())
           {        
              name = rs.getString("NAME");
              surname = rs.getString("SURNAME");
              age = rs.getString("AGE");
              numberPas = rs.getString("NUMBER_PAS");
              amka = rs.getString("AMKA");
              asTameio = rs.getString("AS_TAMEIO");
              thl = rs.getString("THL");
              city = rs.getString("CITY");
              area = rs.getString("AREA");
              odos = rs.getString("ODOS"); 
             
           }
        model.addRow(new Object[] {name,surname,age,numberPas,amka,asTameio,thl,city,area,odos});
        System.out.printf("NAME IS " + name + " NUMBER CART IS " + numberPas);
                   }
                   catch (SQLException e) {
		        System.out.println("Unable to iterate over resultset");
		    }
                       
                    }

          try {
          if (rs != null) { rs.close(); }
           if (conn != null) { conn.close(); }
           if (stmt != null) { stmt.close(); }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable p1;
    // End of variables declaration//GEN-END:variables
}
