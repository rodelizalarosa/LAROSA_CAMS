
package signInUp;

import config.connectDB;
import dashboard.doctorDash;
import dashboard.adminDash;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sem
 */
public class signIn extends javax.swing.JFrame {


    public signIn() {
        initComponents();
        
        
    }

    adminDash dash = new adminDash();
    doctorDash udash = new doctorDash();

    public static String signIn(String username, String password) {
        connectDB connector = new connectDB();
        String query = "SELECT user_type, status FROM users WHERE user_name = ? AND user_pass = ?";

        try (PreparedStatement pstmt = connector.getConnection().prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {
                String status = resultSet.getString("status");

                if (status.equalsIgnoreCase("pending")) {
                    return "inactive"; // Indicate that the account is inactive
                }
                return resultSet.getString("user_type"); // Return the user's role if active
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null; // Return null if login fails
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        holder = new javax.swing.JPanel();
        loginbg = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        SI = new javax.swing.JLabel();
        signInUser = new javax.swing.JLabel();
        userSignIn = new javax.swing.JTextField();
        signInPass = new javax.swing.JLabel();
        passSignIn = new javax.swing.JPasswordField();
        forgotPass = new javax.swing.JLabel();
        SIGNIN1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signInUser1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameErrorLabel = new javax.swing.JLabel();
        passErrorLabel = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        desc3 = new javax.swing.JLabel();
        desc4 = new javax.swing.JLabel();
        desc5 = new javax.swing.JLabel();
        SIGNUP = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        hidePass = new javax.swing.JLabel();
        
        userSignIn = new PlaceholderTextField("Enter your username");
        passSignIn = new PlaceholderPasswordField("Enter your password");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        holder.setBackground(new java.awt.Color(255, 255, 255));
        holder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginbg.setBackground(new java.awt.Color(0, 204, 204));
        loginbg.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        loginbg.setName("dashboard"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SI.setBackground(new java.awt.Color(0, 204, 204));
        SI.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        SI.setForeground(new java.awt.Color(0, 204, 204));
        SI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SI.setText("SIGN IN");
        jPanel4.add(SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 174, 53));

        signInUser.setBackground(new java.awt.Color(255, 255, 255));
        signInUser.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        signInUser.setForeground(new java.awt.Color(0, 204, 204));
        signInUser.setText("DentaLink");
        jPanel4.add(signInUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 28, -1, 20));

        userSignIn.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        userSignIn.setForeground(new java.awt.Color(0, 0, 0));
        userSignIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userSignInFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userSignInFocusLost(evt);
            }
        });
        userSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSignInActionPerformed(evt);
            }
        });
        jPanel4.add(userSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 30));

        signInPass.setBackground(new java.awt.Color(255, 255, 255));
        signInPass.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        signInPass.setForeground(new java.awt.Color(0, 204, 204));
        signInPass.setText("Password");
        jPanel4.add(signInPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        passSignIn.setForeground(new java.awt.Color(0, 0, 0));
        passSignIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passSignInFocusLost(evt);
            }
        });
        passSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passSignInActionPerformed(evt);
            }
        });
        jPanel4.add(passSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, 30));

        forgotPass.setBackground(new java.awt.Color(255, 255, 255));
        forgotPass.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        forgotPass.setForeground(new java.awt.Color(0, 204, 204));
        forgotPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPass.setText("Forgot Password?");
        jPanel4.add(forgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 150, -1));

        SIGNIN1.setBackground(new java.awt.Color(0, 204, 204));
        SIGNIN1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        SIGNIN1.setForeground(new java.awt.Color(255, 255, 255));
        SIGNIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIGNIN1.setText("SIGN IN");
        SIGNIN1.setDoubleBuffered(true);
        SIGNIN1.setOpaque(true);
        SIGNIN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNIN1MouseClicked(evt);
            }
        });
        jPanel4.add(SIGNIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medlogo1.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        signInUser1.setBackground(new java.awt.Color(255, 255, 255));
        signInUser1.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        signInUser1.setForeground(new java.awt.Color(0, 204, 204));
        signInUser1.setText("Username");
        jPanel4.add(signInUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, -1));

        usernameErrorLabel.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel4.add(usernameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, -1));

        passErrorLabel.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jPanel4.add(passErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, -1));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medlogo.png"))); // NOI18N

        desc1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        desc1.setForeground(new java.awt.Color(255, 255, 255));
        desc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc1.setText("Your health,");

        desc2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        desc2.setForeground(new java.awt.Color(255, 255, 255));
        desc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc2.setText("our priority.");

        desc3.setFont(new java.awt.Font("Nirmala UI", 1, 28)); // NOI18N
        desc3.setForeground(new java.awt.Color(255, 255, 255));
        desc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc3.setText("Sign Up now!");

        desc4.setBackground(new java.awt.Color(255, 255, 255));
        desc4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        desc4.setForeground(new java.awt.Color(255, 255, 255));
        desc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc4.setText("Provide your details to book an appointment");
        desc4.setAutoscrolls(true);
        desc4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        desc5.setBackground(new java.awt.Color(255, 255, 255));
        desc5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        desc5.setForeground(new java.awt.Color(255, 255, 255));
        desc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc5.setText("and receive quality care.");
        desc5.setAutoscrolls(true);
        desc5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SIGNUP.setBackground(new java.awt.Color(255, 255, 255));
        SIGNUP.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        SIGNUP.setForeground(new java.awt.Color(0, 204, 204));
        SIGNUP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SIGNUP.setText("SIGN UP");
        SIGNUP.setDoubleBuffered(true);
        SIGNUP.setOpaque(true);
        SIGNUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNUPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginbgLayout = new javax.swing.GroupLayout(loginbg);
        loginbg.setLayout(loginbgLayout);
        loginbgLayout.setHorizontalGroup(
            loginbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginbgLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(loginbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbgLayout.createSequentialGroup()
                            .addComponent(LOGO)
                            .addGap(176, 176, 176))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbgLayout.createSequentialGroup()
                            .addGroup(loginbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(desc5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(desc4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(83, 83, 83))
                        .addGroup(loginbgLayout.createSequentialGroup()
                            .addComponent(desc1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(desc2)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbgLayout.createSequentialGroup()
                        .addComponent(desc3)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbgLayout.createSequentialGroup()
                        .addComponent(SIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        loginbgLayout.setVerticalGroup(
            loginbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addGroup(loginbgLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc1)
                    .addComponent(desc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc3)
                .addGap(18, 18, 18)
                .addComponent(desc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desc5)
                .addGap(31, 31, 31)
                .addComponent(SIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        holder.add(loginbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 540));

        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        holder.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 280, 30, 30));

        hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePassMouseClicked(evt);
            }
        });
        holder.add(hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 280, 30, 30));

        getContentPane().add(holder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userSignInActionPerformed

    private void passSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passSignInActionPerformed

    private void SIGNUPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNUPMouseClicked
        signUp sn = new signUp();
        sn.setLocationRelativeTo(null);
        sn.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_SIGNUPMouseClicked

    private void SIGNIN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNIN1MouseClicked

        String username = userSignIn.getText().trim();
        String password = new String(passSignIn.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in both fields.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else {

            String role = signIn(username, password);

            if ("inactive".equals(role)) {
                JOptionPane.showMessageDialog(this, "Your account is inactive. Please contact support.", "Account Inactive", JOptionPane.WARNING_MESSAGE);
            } else if (role != null) {
                JOptionPane.showMessageDialog(this, "Login successful!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

                if (role.equalsIgnoreCase("admin")) {
                    new adminDash().setVisible(true);

                } else {

                    new doctorDash().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }

//        dashboard dash = new dashboard();
//        dash.setLocationRelativeTo(null);
//        dash.setVisible(true);
//       
//        this.dispose();
    }//GEN-LAST:event_SIGNIN1MouseClicked

    private void userSignInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userSignInFocusLost

        String user = userSignIn.getText();

        if (user.isEmpty()) {
            usernameErrorLabel.setForeground(Color.RED);
            usernameErrorLabel.setText("Username is required");
            usernameErrorLabel.setForeground(Color.RED);
        } else {
            usernameErrorLabel.setForeground(Color.BLACK);
            usernameErrorLabel.setText("");
        }

        userSignIn.repaint();


    }//GEN-LAST:event_userSignInFocusLost

    private void passSignInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passSignInFocusLost

            

         String pass = passSignIn.getText();

        if (pass.isEmpty()) {
            passErrorLabel.setForeground(Color.RED);
            passErrorLabel.setText("Password is required");
            passErrorLabel.setForeground(Color.RED);
        } else {
            passErrorLabel.setForeground(Color.BLACK);
            passErrorLabel.setText("");
        }

        userSignIn.repaint();



    }//GEN-LAST:event_passSignInFocusLost

    private void userSignInFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userSignInFocusGained
        
    }//GEN-LAST:event_userSignInFocusGained

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        passSignIn.setEchoChar((char) 0);
        showPass.setVisible(false);
        hidePass.setVisible(true);
    }//GEN-LAST:event_showPassMouseClicked

    private void hidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMouseClicked
       passSignIn.setEchoChar('•');
        hidePass.setVisible(false);
        showPass.setVisible(true);
    }//GEN-LAST:event_hidePassMouseClicked
    
    public class PlaceholderTextField extends JTextField {
    private String placeholder;

    public PlaceholderTextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (getText().isEmpty()) {
            g.setColor(Color.GRAY);
            g.drawString(placeholder, getInsets().left, getHeight() / 2 + 5);
        }
    }
    }
    
    
    
    
   public class PlaceholderPasswordField extends JPasswordField {
    private String placeholder;

    public PlaceholderPasswordField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (getPassword().length == 0) {
            g.setColor(Color.GRAY);
            g.drawString(placeholder, getInsets().left, getHeight() / 2 + 5);
        }
    }
   }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel SI;
    private javax.swing.JLabel SIGNIN1;
    private javax.swing.JLabel SIGNUP;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel desc3;
    private javax.swing.JLabel desc4;
    private javax.swing.JLabel desc5;
    private javax.swing.JLabel forgotPass;
    private javax.swing.JLabel hidePass;
    private javax.swing.JPanel holder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel loginbg;
    private javax.swing.JLabel passErrorLabel;
    private javax.swing.JPasswordField passSignIn;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel signInPass;
    private javax.swing.JLabel signInUser;
    private javax.swing.JLabel signInUser1;
    private javax.swing.JTextField userSignIn;
    private javax.swing.JLabel usernameErrorLabel;
    // End of variables declaration//GEN-END:variables
}
