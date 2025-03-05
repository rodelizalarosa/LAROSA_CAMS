
package dashboard;

import config.connectDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class adminDashOverview extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public adminDashOverview() {
        initComponents();
        loadUsers();
    }
    
    Color navcolor = new Color (0,204,204); //teal
    Color hovercolor = new Color (255,255,255); //white
    
    private void loadUsers() {
         
         connectDB connect = new connectDB();
         
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("User ID");
        model.addColumn("First Name");
        model.addColumn("Middle Name");
        model.addColumn("Last Name");
        model.addColumn("Contact Number");
        model.addColumn("Email");
        model.addColumn("Type");
        model.addColumn("Username");
        model.addColumn("Status");
        
           
        try {
            Connection conn = connect.getConnection(); // Get database connection
            if (conn == null) {
                System.out.println("Database connection failed!");
                return;
            }

            String query = "SELECT user_id, user_fname, user_middle, user_lname, contact, email, user_type, user_name, status FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("user_id"),
                    rs.getString("user_fname"),
                    rs.getString("user_middle"),
                    rs.getString("user_lname"),
                    rs.getString("contact"),
                    rs.getString("email"),
                    rs.getString("user_type"),
                    rs.getString("user_name"),
                    rs.getString("status"),
                    
                   
                   
                });
            }
          
            rs.close();
            stmt.close();
            conn.close(); 
             
       
        } catch (SQLException ex) {
            System.out.println("Error loading users: " + ex.getMessage());
            ex.printStackTrace();
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        signInUser2 = new javax.swing.JLabel();
        admin1 = new javax.swing.JLabel();
        welcome1 = new javax.swing.JLabel();
        LOGOUT1 = new javax.swing.JLabel();
        adminmsg = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        dashpanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        jInternalFrame2.setVisible(true);

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medlogo1.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        signInUser2.setBackground(new java.awt.Color(255, 255, 255));
        signInUser2.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        signInUser2.setForeground(new java.awt.Color(0, 204, 204));
        signInUser2.setText("Care Connect");
        jPanel4.add(signInUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 20));

        admin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        jPanel4.add(admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 100, 100));

        welcome1.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        welcome1.setForeground(new java.awt.Color(255, 255, 255));
        welcome1.setText("DentaLink");
        jPanel4.add(welcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        LOGOUT1.setBackground(new java.awt.Color(255, 255, 255));
        LOGOUT1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        LOGOUT1.setForeground(new java.awt.Color(0, 204, 204));
        LOGOUT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGOUT1.setText("LOG OUT");
        LOGOUT1.setDoubleBuffered(true);
        LOGOUT1.setOpaque(true);
        LOGOUT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUT1MouseClicked(evt);
            }
        });
        jPanel4.add(LOGOUT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 150, 30));

        adminmsg.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        adminmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminmsg.setText("Welcome,");
        jPanel4.add(adminmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        admin.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        admin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, 30));

        dashpanel1.setBackground(new java.awt.Color(255, 255, 255));
        dashpanel1.setInheritsPopupMenu(true);
        dashpanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpanel1MouseExited(evt);
            }
        });
        dashpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
        });
        dashpanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 30));

        jPanel4.add(dashpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 240, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 650));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        jPanel3.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Dashboard");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 860, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGOUT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT1MouseClicked
        this.dispose();
    }//GEN-LAST:event_LOGOUT1MouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered

    }//GEN-LAST:event_homeMouseEntered

    private void dashpanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel1MouseEntered
        dashpanel1.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel1MouseEntered

    private void dashpanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel1MouseExited
        dashpanel1.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel1MouseExited

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
            java.util.logging.Logger.getLogger(adminDashOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashOverview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGOUT1;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admin1;
    private javax.swing.JLabel adminmsg;
    private javax.swing.JPanel dashpanel1;
    private javax.swing.JLabel home;
    private javax.swing.JLabel icon;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel signInUser2;
    private javax.swing.JLabel welcome1;
    // End of variables declaration//GEN-END:variables
}
