
package dashboard;

import config.connectDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import signInUp.signIn;
import dashboard.adminAddUser;

public class adminDash extends javax.swing.JFrame {
    
     private int loggedInAdminId;
     
    
    public adminDash(int userId) {
        initComponents();
        this.loggedInAdminId = userId;
        loadUsers();
     
    }
    
    Color navcolor = new Color (0,204,204); //teal
    Color hovercolor = new Color (255,255,255); //white
    
        
    private void loadUsers() {
         
         connectDB connect = new connectDB();
         
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("User ID");
        model.addColumn("First Name"); 
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

            String query = "SELECT user_id, user_fname, user_lname, contact, email, user_type, user_name, status FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("user_id"),
                    rs.getString("user_fname"),               
                    rs.getString("user_lname"),
                    rs.getString("contact"),
                    rs.getString("email"),
                    rs.getString("user_type"),
                    rs.getString("user_name"),
                    rs.getString("status"),
                   
                });
                
                if (rs.getInt("user_id") == loggedInAdminId) {
                String firstName = rs.getString("user_fname");
                adminName.setText(firstName);
            }
            }
            

            dashTable.setModel(model);
            model.fireTableDataChanged(); 

            rs.close();
            stmt.close();
            conn.close(); 
             
       
        } catch (SQLException ex) {
            System.out.println("Error loading users: " + ex.getMessage());
            ex.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        signInUser1 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JLabel();
        adminmsg = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        dashpanel2 = new javax.swing.JPanel();
        home1 = new javax.swing.JLabel();
        dashpanel1 = new javax.swing.JPanel();
        Dashboard = new javax.swing.JLabel();
        dashpanel3 = new javax.swing.JPanel();
        patients = new javax.swing.JLabel();
        dashpanel5 = new javax.swing.JPanel();
        appointments = new javax.swing.JLabel();
        dashpanel4 = new javax.swing.JPanel();
        patients1 = new javax.swing.JLabel();
        OK = new javax.swing.JLabel();
        ADD = new javax.swing.JLabel();
        UPDATE = new javax.swing.JLabel();
        ARCHIVE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        jInternalFrame2.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashTable.setBackground(new java.awt.Color(0, 0, 0));
        dashTable.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        dashTable.setForeground(new java.awt.Color(204, 255, 255));
        dashTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        dashTable.setEnabled(false);
        jScrollPane1.setViewportView(dashTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 810, 470));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medlogo1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        signInUser1.setBackground(new java.awt.Color(255, 255, 255));
        signInUser1.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        signInUser1.setForeground(new java.awt.Color(0, 204, 204));
        signInUser1.setText("Care Connect");
        jPanel2.add(signInUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 20));

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        jPanel2.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 100));

        welcome.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("DentaLink");
        jPanel2.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        LOGOUT.setBackground(new java.awt.Color(255, 255, 255));
        LOGOUT.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(0, 204, 204));
        LOGOUT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGOUT.setText("LOG OUT");
        LOGOUT.setDoubleBuffered(true);
        LOGOUT.setOpaque(true);
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });
        jPanel2.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 150, 30));

        adminmsg.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        adminmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminmsg.setText("Welcome,");
        jPanel2.add(adminmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 40));

        adminName.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jPanel2.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 130, 40));

        dashpanel2.setBackground(new java.awt.Color(0, 204, 204));
        dashpanel2.setInheritsPopupMenu(true);
        dashpanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpanel2MouseExited(evt);
            }
        });
        dashpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home1.setBackground(new java.awt.Color(51, 51, 51));
        home1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        home1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home1.setText("Home");
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home1MouseEntered(evt);
            }
        });
        dashpanel2.add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 30));

        jPanel2.add(dashpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 50));

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

        Dashboard.setBackground(new java.awt.Color(51, 51, 51));
        Dashboard.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard.setText("Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashboardMouseEntered(evt);
            }
        });
        dashpanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 30));

        jPanel2.add(dashpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 50));

        dashpanel3.setBackground(new java.awt.Color(0, 204, 204));
        dashpanel3.setInheritsPopupMenu(true);
        dashpanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpanel3MouseExited(evt);
            }
        });
        dashpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patients.setBackground(new java.awt.Color(51, 51, 51));
        patients.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        patients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patients.setText("Manage Patients");
        patients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientsMouseEntered(evt);
            }
        });
        dashpanel3.add(patients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 30));

        jPanel2.add(dashpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 50));

        dashpanel5.setBackground(new java.awt.Color(0, 204, 204));
        dashpanel5.setInheritsPopupMenu(true);
        dashpanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpanel5MouseExited(evt);
            }
        });
        dashpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointments.setBackground(new java.awt.Color(51, 51, 51));
        appointments.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        appointments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appointments.setText("Appointments");
        appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appointmentsMouseEntered(evt);
            }
        });
        dashpanel5.add(appointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 30));

        jPanel2.add(dashpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 50));

        dashpanel4.setBackground(new java.awt.Color(0, 204, 204));
        dashpanel4.setInheritsPopupMenu(true);
        dashpanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpanel4MouseExited(evt);
            }
        });
        dashpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patients1.setBackground(new java.awt.Color(51, 51, 51));
        patients1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        patients1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patients1.setText("Manage Patients");
        patients1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patients1MouseEntered(evt);
            }
        });
        dashpanel4.add(patients1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 30));

        jPanel2.add(dashpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 240, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 670));

        OK.setBackground(new java.awt.Color(0, 204, 204));
        OK.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        OK.setForeground(new java.awt.Color(255, 255, 255));
        OK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OK.setText("OK");
        OK.setDoubleBuffered(true);
        OK.setOpaque(true);
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });
        jPanel1.add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 50, 30));

        ADD.setBackground(new java.awt.Color(0, 204, 204));
        ADD.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADD.setText("Add");
        ADD.setDoubleBuffered(true);
        ADD.setOpaque(true);
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 120, 30));

        UPDATE.setBackground(new java.awt.Color(0, 204, 204));
        UPDATE.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        UPDATE.setForeground(new java.awt.Color(255, 255, 255));
        UPDATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UPDATE.setText("Update");
        UPDATE.setDoubleBuffered(true);
        UPDATE.setOpaque(true);
        UPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEMouseClicked(evt);
            }
        });
        jPanel1.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, 30));

        ARCHIVE.setBackground(new java.awt.Color(0, 204, 204));
        ARCHIVE.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        ARCHIVE.setForeground(new java.awt.Color(255, 255, 255));
        ARCHIVE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ARCHIVE.setText("Archive");
        ARCHIVE.setDoubleBuffered(true);
        ARCHIVE.setOpaque(true);
        ARCHIVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ARCHIVEMouseClicked(evt);
            }
        });
        jPanel1.add(ARCHIVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 130, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        jPanel3.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Dashboard");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 840, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        
        int choice = JOptionPane.showConfirmDialog(
        this, 
        "Are you sure you want to log out?", 
        "Confirm Logout", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE, 
        new ImageIcon(getClass().getResource("/images/logoutIcon.png")) 
        );

        if (choice == JOptionPane.YES_OPTION) {
            signIn sn = new signIn();
            sn.setLocationRelativeTo(null);
            sn.setVisible(true);

            this.dispose();
        }
        
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked

    }//GEN-LAST:event_OKMouseClicked

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
       adminAddUser addUser = new adminAddUser();
       addUser.setLocationRelativeTo(null);
       addUser.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_ADDMouseClicked

    private void UPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDATEMouseClicked

    private void ARCHIVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ARCHIVEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ARCHIVEMouseClicked

    private void dashpanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel1MouseEntered
        dashpanel1.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel1MouseEntered

    private void dashpanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel1MouseExited
        dashpanel1.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel1MouseExited

    private void DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseEntered
       
    }//GEN-LAST:event_DashboardMouseEntered

    private void home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_home1MouseEntered

    private void dashpanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel2MouseEntered
        dashpanel2.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel2MouseEntered

    private void dashpanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel2MouseExited
        dashpanel2.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel2MouseExited

    private void patientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsMouseEntered

    private void dashpanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel3MouseEntered
         dashpanel3.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel3MouseEntered

    private void dashpanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel3MouseExited
         dashpanel3.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel3MouseExited

    private void patients1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patients1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_patients1MouseEntered

    private void dashpanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel4MouseEntered
         dashpanel4.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel4MouseEntered

    private void dashpanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel4MouseExited
         dashpanel4.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel4MouseExited

    private void appointmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentsMouseEntered

    private void dashpanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel5MouseEntered
        dashpanel5.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel5MouseEntered

    private void dashpanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel5MouseExited
         dashpanel5.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel5MouseExited

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
            java.util.logging.Logger.getLogger(adminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDash(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADD;
    private javax.swing.JLabel ARCHIVE;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel LOGOUT;
    private javax.swing.JLabel OK;
    private javax.swing.JLabel UPDATE;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel adminmsg;
    private javax.swing.JLabel appointments;
    private javax.swing.JTable dashTable;
    private javax.swing.JPanel dashpanel1;
    private javax.swing.JPanel dashpanel2;
    private javax.swing.JPanel dashpanel3;
    private javax.swing.JPanel dashpanel4;
    private javax.swing.JPanel dashpanel5;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel icon;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patients;
    private javax.swing.JLabel patients1;
    private javax.swing.JLabel signInUser1;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

}