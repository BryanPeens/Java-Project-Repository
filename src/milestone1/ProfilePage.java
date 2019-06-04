package milestone1;

import helperpackage.User;
import helperpackage.DataHandler;
import helperpackage.dbInterface;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Bryan
 */
public class ProfilePage extends javax.swing.JFrame {
    public dbInterface b;
    public ProfilePage() {
        initComponents();
    }
    
    public ProfilePage(String userName) throws SQLException //Overload the constructor
    {   try {
        this.b = (dbInterface) Naming.lookup("rmi://localhost:8080/DBClas");
        initComponents();
        String name = userName;
        jUserNameDisplay.setText(name);
        
        DataHandler dh = new DataHandler();
        User user = dh.finedByUsername(name);
        
        jUserIDField.setText(String.valueOf(user.getUserID()));
        jNameField.setText(user.getName());
        jLastNameField.setText(user.getSurname());
        jUserNameField.setText(user.getUsername());
        jPasswordField1.setText(user.getPassword());
        jDateOfBirthField.setText(user.getBirthDate());
        jDepartmentField.setText(user.getDepartment());
        jLocationField.setText(user.getLocation());
        jContactDetailField.setText(user.getContact());
        jCheckAdmin3.setSelected(user.isIsAdmin());
        } catch (NotBoundException ex) {
            Logger.getLogger(ProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCloseWindow = new javax.swing.JLabel();
        jLabelMinimizeWindow = new javax.swing.JLabel();
        jButtonToUserPage = new javax.swing.JButton();
        jUserNameDisplay = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jUserNameField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLastNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDateOfBirthField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDepartmentField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLocationField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jContactDetailField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonRegister1 = new javax.swing.JButton();
        jUserIDField = new javax.swing.JTextField();
        jCheckAdmin3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profile Page");

        jLabelCloseWindow.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelCloseWindow.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCloseWindow.setText("X");
        jLabelCloseWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseWindowMouseClicked(evt);
            }
        });

        jLabelMinimizeWindow.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabelMinimizeWindow.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimizeWindow.setText("-");
        jLabelMinimizeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeWindowMouseClicked(evt);
            }
        });

        jButtonToUserPage.setBackground(new java.awt.Color(0, 153, 153));
        jButtonToUserPage.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonToUserPage.setForeground(new java.awt.Color(255, 255, 255));
        jButtonToUserPage.setText("HOME");
        jButtonToUserPage.setName("btnReg"); // NOI18N
        jButtonToUserPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonToUserPageMouseClicked(evt);
            }
        });
        jButtonToUserPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToUserPageActionPerformed(evt);
            }
        });

        jUserNameDisplay.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jUserNameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        jUserNameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUserNameDisplay.setText("UserNameDisplayHere");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jUserNameDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonToUserPage, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(486, Short.MAX_VALUE)
                    .addComponent(jLabelMinimizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabelCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonToUserPage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUserNameDisplay))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCloseWindow)
                        .addComponent(jLabelMinimizeWindow))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");

        jUserNameField.setBackground(new java.awt.Color(108, 122, 137));
        jUserNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jUserNameField.setForeground(new java.awt.Color(228, 241, 254));
        jUserNameField.setName("uName"); // NOI18N
        jUserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserNameFieldActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(228, 241, 254));
        jPasswordField1.setName("FirstPw"); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Birth Date :");

        jNameField.setBackground(new java.awt.Color(108, 122, 137));
        jNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jNameField.setForeground(new java.awt.Color(228, 241, 254));
        jNameField.setName("Fname"); // NOI18N
        jNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name :");

        jLastNameField.setBackground(new java.awt.Color(108, 122, 137));
        jLastNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLastNameField.setForeground(new java.awt.Color(228, 241, 254));
        jLastNameField.setName("Lname"); // NOI18N
        jLastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLastNameFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name :");

        jDateOfBirthField.setBackground(new java.awt.Color(108, 122, 137));
        jDateOfBirthField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jDateOfBirthField.setForeground(new java.awt.Color(228, 241, 254));
        jDateOfBirthField.setName("DOB"); // NOI18N
        jDateOfBirthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDateOfBirthFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Department :");

        jDepartmentField.setBackground(new java.awt.Color(108, 122, 137));
        jDepartmentField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jDepartmentField.setForeground(new java.awt.Color(228, 241, 254));
        jDepartmentField.setName("dept"); // NOI18N
        jDepartmentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepartmentFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Location :");

        jLocationField.setBackground(new java.awt.Color(108, 122, 137));
        jLocationField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLocationField.setForeground(new java.awt.Color(228, 241, 254));
        jLocationField.setName("location"); // NOI18N
        jLocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLocationFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contact Detail :");

        jContactDetailField.setBackground(new java.awt.Color(108, 122, 137));
        jContactDetailField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jContactDetailField.setForeground(new java.awt.Color(228, 241, 254));
        jContactDetailField.setName("contact"); // NOI18N
        jContactDetailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContactDetailFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(242, 38, 19));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DELETE");
        jButton1.setName("btnCan"); // NOI18N

        jButtonRegister1.setBackground(new java.awt.Color(0, 153, 153));
        jButtonRegister1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonRegister1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister1.setText("UPDATE");
        jButtonRegister1.setName("btnReg"); // NOI18N
        jButtonRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegister1MouseClicked(evt);
            }
        });
        jButtonRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegister1ActionPerformed(evt);
            }
        });

        jUserIDField.setBackground(new java.awt.Color(108, 122, 137));
        jUserIDField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jUserIDField.setForeground(new java.awt.Color(228, 241, 254));
        jUserIDField.setName("Fname"); // NOI18N
        jUserIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserIDFieldActionPerformed(evt);
            }
        });

        jCheckAdmin3.setText("Make User Admin");
        jCheckAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAdmin3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(jDateOfBirthField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(jDepartmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(jLocationField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(jContactDetailField)
                                .addComponent(jUserIDField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                            .addComponent(jCheckAdmin3))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jUserIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jDateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jDepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jContactDetailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jCheckAdmin3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseWindowMouseClicked
        System.exit(0); // this will close the JFrame window on a mouse click event
    }//GEN-LAST:event_jLabelCloseWindowMouseClicked

    private void jLabelMinimizeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeWindowMouseClicked
        this.setState(JFrame.ICONIFIED); // this will minimize a JFrame window on a click event
    }//GEN-LAST:event_jLabelMinimizeWindowMouseClicked

    private void jButtonToUserPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonToUserPageMouseClicked
        //               ////////////////////////////////////////////////////////////////////////
        String name = jNameField.getText();
        String surname = jLastNameField.getText();
        String username = jUserNameField.getText();
        String pass1 = jPasswordField1.getText();
        String department = jDepartmentField.getText();
        String location = jLocationField.getText();
        String contactDeets = jContactDetailField.getText();
        String birthDate = jDateOfBirthField.getText();
        //
        DataHandler handler = new DataHandler();
        try {
            handler.InsertUser(name,surname,department,location,contactDeets,false,pass1,birthDate,username);
        } catch (Exception ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        LoginForm lf = null;
        lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonToUserPageMouseClicked

    private void jButtonToUserPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToUserPageActionPerformed
        String username = jUserNameDisplay.getText();
        
        DataHandler dh = new DataHandler();
        User u = null;
        try {
            u = dh.GetUserInfo(username);
        } catch (Exception ex) {
            Logger.getLogger(ProfilePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UserPage userPage = new UserPage(u);
        userPage.setVisible(true);
        userPage.pack();
        userPage.setLocationRelativeTo(null);
        userPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonToUserPageActionPerformed

    private void jButtonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegister1ActionPerformed
        DataHandler dh = new DataHandler();
               
        int id = Integer.parseInt(jUserIDField.getText());
        String userName = jNameField.getText();
        String userSurname = jLastNameField.getText();
        String useName = jUserNameField.getText();
        String uPass = jPasswordField1.getText();
        String uDepartment = jDepartmentField.getText();
        String uLocation = jLocationField.getText();
        String uDob = jDateOfBirthField.getText();
        int uContact = Integer.parseInt(jContactDetailField.getText());
        boolean uAdmin = jCheckAdmin3.isSelected();
        
        try
        {
            if (b.UpdateUser(id,userName, userSurname, uDepartment,uLocation, uContact, uAdmin, uPass, uDob,useName))
            {
                System.out.println("Success");
                String getUserName = jUserNameField.getText();
                jUserNameDisplay.setText(getUserName);
            }
            else
            {
                System.out.println("Failed to update record");
            }
        } 
        catch (Exception ex)
        {
        Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRegister1ActionPerformed

    private void jButtonRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegister1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegister1MouseClicked

    private void jContactDetailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContactDetailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jContactDetailFieldActionPerformed

    private void jLocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLocationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLocationFieldActionPerformed

    private void jDepartmentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepartmentFieldActionPerformed

    }//GEN-LAST:event_jDepartmentFieldActionPerformed

    private void jDateOfBirthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDateOfBirthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateOfBirthFieldActionPerformed

    private void jLastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLastNameFieldActionPerformed

    private void jNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameFieldActionPerformed

    private void jUserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserNameFieldActionPerformed

    private void jUserIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserIDFieldActionPerformed

    private void jCheckAdmin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAdmin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckAdmin3ActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegister1;
    private javax.swing.JButton jButtonToUserPage;
    private javax.swing.JCheckBox jCheckAdmin;
    private javax.swing.JCheckBox jCheckAdmin1;
    private javax.swing.JCheckBox jCheckAdmin2;
    private javax.swing.JCheckBox jCheckAdmin3;
    private javax.swing.JTextField jContactDetailField;
    private javax.swing.JTextField jDateOfBirthField;
    private javax.swing.JTextField jDepartmentField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCloseWindow;
    private javax.swing.JLabel jLabelMinimizeWindow;
    private javax.swing.JTextField jLastNameField;
    private javax.swing.JTextField jLocationField;
    private javax.swing.JTextField jNameField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jUserIDField;
    private javax.swing.JLabel jUserNameDisplay;
    private javax.swing.JTextField jUserNameField;
    // End of variables declaration//GEN-END:variables
}
