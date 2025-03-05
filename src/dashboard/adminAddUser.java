
package dashboard;

import config.connectDB;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import signInUp.signIn;
import dashboard.adminDash;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import signInUp.signUp;
import dashboard.adminDash;


public class adminAddUser extends javax.swing.JFrame {

    public adminAddUser() {
        initComponents();
    }
    
     Color navcolor = new Color (0,204,204); //teal
    Color hovercolor = new Color (255,255,255); //white
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        UserAccount = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        fnameSU = new javax.swing.JTextField();
        mname = new javax.swing.JLabel();
        mnameSU = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        lnameSU = new javax.swing.JTextField();
        cont = new javax.swing.JLabel();
        contSU = new javax.swing.JTextField();
        signUpUser6 = new javax.swing.JLabel();
        emailSU = new javax.swing.JTextField();
        signUpUser = new javax.swing.JLabel();
        typeUser = new javax.swing.JComboBox<>();
        signUpUser1 = new javax.swing.JLabel();
        userSU = new javax.swing.JTextField();
        signUpPass = new javax.swing.JLabel();
        passSU = new javax.swing.JPasswordField();
        back = new javax.swing.JLabel();
        createAcc1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        UserAccount.setBackground(new java.awt.Color(0, 204, 204));
        UserAccount.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        UserAccount.setForeground(new java.awt.Color(0, 204, 204));
        UserAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserAccount.setText("Create User Account");
        jPanel1.add(UserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 310, 40));

        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 204, 204));
        fname.setText("First Name");
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 90, 30));

        fnameSU.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        fnameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameSUActionPerformed(evt);
            }
        });
        jPanel1.add(fnameSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 240, 40));

        mname.setBackground(new java.awt.Color(255, 255, 255));
        mname.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        mname.setForeground(new java.awt.Color(0, 204, 204));
        mname.setText("Middle Name");
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 110, 30));

        mnameSU.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        mnameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameSUActionPerformed(evt);
            }
        });
        jPanel1.add(mnameSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 240, 40));

        lname.setBackground(new java.awt.Color(255, 255, 255));
        lname.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 204, 204));
        lname.setText("Last Name");
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 90, 30));

        lnameSU.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        lnameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameSUActionPerformed(evt);
            }
        });
        jPanel1.add(lnameSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 240, 40));

        cont.setBackground(new java.awt.Color(255, 255, 255));
        cont.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        cont.setForeground(new java.awt.Color(0, 204, 204));
        cont.setText("Contact Number");
        jPanel1.add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 140, 30));

        contSU.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        contSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contSUActionPerformed(evt);
            }
        });
        jPanel1.add(contSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 240, 40));

        signUpUser6.setBackground(new java.awt.Color(255, 255, 255));
        signUpUser6.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        signUpUser6.setForeground(new java.awt.Color(0, 204, 204));
        signUpUser6.setText("Email");
        jPanel1.add(signUpUser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 50, 30));

        emailSU.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        emailSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailSUActionPerformed(evt);
            }
        });
        jPanel1.add(emailSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 240, 40));

        signUpUser.setBackground(new java.awt.Color(255, 255, 255));
        signUpUser.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        signUpUser.setForeground(new java.awt.Color(0, 204, 204));
        signUpUser.setText("Type");
        jPanel1.add(signUpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 50, 30));

        typeUser.setEditable(true);
        typeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a type", "Patient", "Doctor" }));
        typeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeUserActionPerformed(evt);
            }
        });
        jPanel1.add(typeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 240, 40));

        signUpUser1.setBackground(new java.awt.Color(255, 255, 255));
        signUpUser1.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        signUpUser1.setForeground(new java.awt.Color(0, 204, 204));
        signUpUser1.setText("Username");
        jPanel1.add(signUpUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 100, 30));

        userSU.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        userSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSUActionPerformed(evt);
            }
        });
        jPanel1.add(userSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 240, 40));

        signUpPass.setBackground(new java.awt.Color(255, 255, 255));
        signUpPass.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        signUpPass.setForeground(new java.awt.Color(0, 204, 204));
        signUpPass.setText("Password");
        jPanel1.add(signUpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 80, 30));

        passSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passSUActionPerformed(evt);
            }
        });
        jPanel1.add(passSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 240, 40));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 204, 204));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setDoubleBuffered(true);
        back.setOpaque(true);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 610, 70, 40));

        createAcc1.setBackground(new java.awt.Color(0, 204, 204));
        createAcc1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        createAcc1.setForeground(new java.awt.Color(255, 255, 255));
        createAcc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createAcc1.setText("CREATE ACCOUNT");
        createAcc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createAcc1.setDoubleBuffered(true);
        createAcc1.setOpaque(true);
        createAcc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAcc1MouseClicked(evt);
            }
        });
        jPanel1.add(createAcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateContact(javax.swing.JTextField contSU) {
        String contactText = contSU.getText().trim();
            if (contactText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Contact Number cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            } else if (!contactText.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Contact Number must contain only numbers", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            } else if (contactText.length() != 11) {  
                JOptionPane.showMessageDialog(this, "Contact Number must be exactly 11 digits", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            }
            return true;
    }
    
    private boolean validatePassword(javax.swing.JPasswordField passSU) {
        String passwordText = new String(passSU.getPassword());
            if (passwordText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            } else if (passwordText.length() < 8) {
                JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            } else if (!passwordText.matches(".*[A-Z].*")) { 
                JOptionPane.showMessageDialog(this, "Password must contain at least one uppercase letter", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            } else if (!passwordText.matches(".*[a-z].*")) { 
                JOptionPane.showMessageDialog(this, "Password must contain at least one lowercase letter", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            } else if (!passwordText.matches(".*\\d.*")) { 
                JOptionPane.showMessageDialog(this, "Password must contain at least one digit", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            } else if (!passwordText.matches(".*[!@#$%^&*()_+=\\-\\[\\]{};':\"\\\\|,.<>\\/?].*")) { 
                JOptionPane.showMessageDialog(this, "Password must contain at least one special character", "Validation Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/images/error.png")));
                return false;
            }
            return true;
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

    private boolean isUsernameTaken(String username) {
        connectDB connect = new connectDB();
        
        String sql = "SELECT COUNT(*) FROM users WHERE user_name = ?"; // Corrected SQL
        try (PreparedStatement pst = connect.getConnection().prepareStatement(sql)) {
            pst.setString(1, username);
            try (ResultSet rs = pst.executeQuery()) { // Use try-with-resources for ResultSet
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception appropriately (e.g., log it)
        }
        return false;
    }
    
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

    private void home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_home1MouseEntered

    private void dashpanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel2MouseEntered
        dashpanel2.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel2MouseEntered

    private void dashpanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel2MouseExited
        dashpanel2.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel2MouseExited

    private void DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseEntered

    }//GEN-LAST:event_DashboardMouseEntered

    private void dashpanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel1MouseEntered
        dashpanel1.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel1MouseEntered

    private void dashpanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel1MouseExited
        dashpanel1.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel1MouseExited

    private void patientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_patientsMouseEntered

    private void dashpanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel3MouseEntered
        dashpanel3.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel3MouseEntered

    private void dashpanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel3MouseExited
        dashpanel3.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel3MouseExited

    private void appointmentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentsMouseEntered

    private void dashpanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel5MouseEntered
        dashpanel5.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel5MouseEntered

    private void dashpanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel5MouseExited
        dashpanel5.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel5MouseExited

    private void patients1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patients1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_patients1MouseEntered

    private void dashpanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel4MouseEntered
        dashpanel4.setBackground(hovercolor); //white
    }//GEN-LAST:event_dashpanel4MouseEntered

    private void dashpanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpanel4MouseExited
        dashpanel4.setBackground(navcolor); //teal
    }//GEN-LAST:event_dashpanel4MouseExited

    private void fnameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameSUActionPerformed

    private void mnameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameSUActionPerformed

    private void lnameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameSUActionPerformed

    private void contSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contSUActionPerformed

    private void emailSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailSUActionPerformed

    private void typeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeUserActionPerformed

    private void userSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userSUActionPerformed

    private void passSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passSUActionPerformed

    
    private boolean isAllFieldsEmpty() {
        return fnameSU.getText().trim().isEmpty() && mnameSU.getText().trim().isEmpty()
                && lnameSU.getText().trim().isEmpty() && contSU.getText().trim().isEmpty()
                && typeUser.getSelectedIndex() == 0 && emailSU.getText().trim().isEmpty()
                && userSU.getText().trim().isEmpty() && passSU.getPassword().length == 0;
    }
    
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
   
        adminDash adm = new adminDash(2);
        adm.setLocationRelativeTo(null);
        adm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void createAcc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAcc1MouseClicked
        
        connectDB connect = new connectDB();

        String firstname = fnameSU.getText().trim();
        String middlename = mnameSU.getText().trim();
        String lastname = lnameSU.getText().trim();
        String contact = contSU.getText().trim();
        String email = emailSU.getText().trim();
        String type = typeUser.getSelectedItem().toString();
        String username = userSU.getText().trim();
        char[] password = passSU.getPassword();

        StringBuilder errorMessage = new StringBuilder(); // Use StringBuilder for efficiency

        if (isAllFieldsEmpty()) {
            errorMessage.append("Please fill out the registration form.\n");
        } else { // Only perform individual field checks if the form isn't completely empty
            if (firstname.isEmpty()) {
                errorMessage.append("First Name cannot be empty.\n");
            }

            if (lastname.isEmpty()) {
                errorMessage.append("Last Name cannot be empty.\n");
            }

            if (!validateContact(contSU)) {
                return;
            }

            if (typeUser.getSelectedIndex() == 0) {
                errorMessage.append("Please select a type.\n");
            }

            String emailText = emailSU.getText().trim();
            if (emailText.isEmpty()) {
                errorMessage.append("Email cannot be empty.\n");
            } else if (!isValidEmail(emailText)) {
                errorMessage.append("Invalid email format.\n");
            }

            String usernameText = userSU.getText().trim();
            if (usernameText.isEmpty()) {
                errorMessage.append("Username cannot be empty.\n");
            } else if (isUsernameTaken(usernameText)) {
                errorMessage.append("Username is already taken.\n");
            }

            if (!validatePassword(passSU)) {
                return;
            }
        }

        if (errorMessage.length() > 0) {  // Check if any errors were added
            JOptionPane.showMessageDialog(this, errorMessage.toString(), "Validation Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing if there are errors
        }

        String passwordText = new String(password); // Get the password string *only* if validation passed.
        String sql = "INSERT INTO users (user_fname, user_middle, user_lname, contact, email, user_type, user_name, user_pass, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = connect.getConnection().prepareStatement(sql)) {
            pst.setString(1, firstname);
            pst.setString(2, middlename);
            pst.setString(3, lastname);
            pst.setString(4, contact);
            pst.setString(5, email);
            pst.setString(6, type);
            pst.setString(7, username);
            pst.setString(8, passwordText);
            pst.setString(9, "pending");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            fnameSU.setText("");
            mnameSU.setText("");
            lnameSU.setText("");
            contSU.setText("");
            emailSU.setText("");
            userSU.setText("");
            passSU.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_createAcc1MouseClicked

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
            java.util.logging.Logger.getLogger(adminAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminAddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel LOGOUT;
    private javax.swing.JLabel UserAccount;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel adminmsg;
    private javax.swing.JLabel appointments;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cont;
    private javax.swing.JTextField contSU;
    private javax.swing.JLabel createAcc1;
    private javax.swing.JPanel dashpanel1;
    private javax.swing.JPanel dashpanel2;
    private javax.swing.JPanel dashpanel3;
    private javax.swing.JPanel dashpanel4;
    private javax.swing.JPanel dashpanel5;
    private javax.swing.JTextField emailSU;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField fnameSU;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField lnameSU;
    private javax.swing.JLabel mname;
    private javax.swing.JTextField mnameSU;
    private javax.swing.JPasswordField passSU;
    private javax.swing.JLabel patients;
    private javax.swing.JLabel patients1;
    private javax.swing.JLabel signInUser1;
    private javax.swing.JLabel signUpPass;
    private javax.swing.JLabel signUpUser;
    private javax.swing.JLabel signUpUser1;
    private javax.swing.JLabel signUpUser6;
    private javax.swing.JComboBox<String> typeUser;
    private javax.swing.JTextField userSU;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

    void setLocationRelative(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
