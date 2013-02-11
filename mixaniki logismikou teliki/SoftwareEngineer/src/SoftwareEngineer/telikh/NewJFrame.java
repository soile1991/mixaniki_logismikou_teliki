
package SoftwareEngineer.telikh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apo
 */
class Global
{
public static String onoma=" ";
}

public class NewJFrame extends javax.swing.JFrame {
  

    
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setSize(750,600);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ΟΝΟΜΑ ΧΡΗΣΤΗ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 360, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ΚΩΔΙΚΟΣ ΧΡΗΣΤΗ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 400, 150, 22);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 360, 120, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 400, 120, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Είσοδος");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(80, 450, 120, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Διαχείριση Ιατρικού Φακέλου");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 30, 410, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("ΕΓΓΡΑΦΕΣ ΝΕΩΝ  ΧΡΗΣΤΩΝ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 330, 280, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Εγγραφή");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(520, 380, 140, 60);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Secretariat", "Doctor", "Nurse" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(230, 450, 150, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SoftwareEngineer/telikh/shutterstock_17829079.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -20, 800, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String NAME = null;
         String PASS = null;
         String EIDI = null;
        String LOG = null;
        
       Connection conn = null;
         Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
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
        String eidikotita;
        eidikotita = (String) jComboBox1.getSelectedItem();
         System.out.println("NAME: "+eidikotita);
      //if statement is created successfully, execute query and get results
      if(stmt != null) {
       try {
         LOG = jTextField1.getText();
        rs = stmt.executeQuery("SELECT * FROM USER WHERE NAME='"+LOG+"';");
        } catch (SQLException e) {
	 System.out.println("Unable to create statement");
			}
		}
       //if resultset is received and is not empty,
   		// iterate over resultset to get values
                if(rs != null) {
		   try {
             while (rs.next())
                  {
                      
              NAME = rs.getString("NAME");
              PASS = rs.getString("PASS");
              EIDI = rs.getString("EIDIKOTITA");
              }
            } catch (SQLException e) {
		        System.out.println("Unable to iterate over resultset");
		    }
                       }
        
               System.out.println("NAME: " + NAME + ", PASS: " + PASS+",LOG IS"+LOG);
        try {
          if (rs != null) { rs.close(); }
           if (conn != null) { conn.close(); }
           if (stmt != null) { stmt.close(); }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       if (jTextField1.getText().equals(NAME) && jPasswordField1.getText().equals(PASS) &&   jComboBox1.getSelectedItem().equals("Doctor")){
        this.setVisible(false);
        new NewJFrame3().setVisible(true);
        }
        else if (jTextField1.getText().equals(NAME) && jPasswordField1.getText().equals(PASS) &&  jComboBox1.getSelectedItem().equals("Nurse")){
        this.setVisible(false);
        new NewJFrame6().setVisible(true);
        }
        else if (jTextField1.getText().equals(NAME) && jPasswordField1.getText().equals(PASS) &&  jComboBox1.getSelectedItem().equals("Secretariat")){
        this.setVisible(false);
        new NewJFrame11().setVisible(true);
        }
        else{
            this.setVisible(false);
            new NewJFrame24().setVisible(true);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new NewJFrame15().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
       
      
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        } );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
