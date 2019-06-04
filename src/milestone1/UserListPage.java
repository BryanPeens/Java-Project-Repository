/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone1;
import helperpackage.User;
import helperpackage.DataHandler;
import helperpackage.dbInterface;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */

public class UserListPage extends javax.swing.JFrame {
public dbInterface b;
    public UserListPage() throws SQLException {
    try {
        this.b = (dbInterface) Naming.lookup("rmi://localhost:8080/DBClas");
        initComponents();
    } catch (NotBoundException ex) {
        Logger.getLogger(UserListPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
        Logger.getLogger(UserListPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (RemoteException ex) {
        Logger.getLogger(UserListPage.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCloseWindow = new javax.swing.JLabel();
        jLabelMinimizeWindow = new javax.swing.JLabel();
        jBtnHome = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jUserTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jUserNameField = new javax.swing.JTextField();
        jUserSurnameField = new javax.swing.JTextField();
        jPass = new javax.swing.JTextField();
        jDepartment = new javax.swing.JTextField();
        jLocation = new javax.swing.JTextField();
        jDOB = new javax.swing.JTextField();
        jContactDeets = new javax.swing.JTextField();
        jDeleteUser = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jUsername = new javax.swing.JTextField();
        jUserID = new javax.swing.JTextField();
        jCheckAdmin = new javax.swing.JCheckBox();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Users");

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

        jBtnHome.setText("HOME");
        jBtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnHome)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(546, Short.MAX_VALUE)
                    .addComponent(jLabelMinimizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabelCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBtnHome))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCloseWindow)
                        .addComponent(jLabelMinimizeWindow))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));

        jUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Surname", "Username", "Department", "Location", "Date Of Birth", "Contact", "Admin"
            }
        ));
        jUserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUserTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jUserTable);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jUserNameField.setText("Name");

        jUserSurnameField.setText("Surname");

        jPass.setText("Password");

        jDepartment.setText("Department");

        jLocation.setText("Location");

        jDOB.setText("Date of Birth");

        jContactDeets.setText("Contact Details");

        jDeleteUser.setBackground(new java.awt.Color(242, 38, 19));
        jDeleteUser.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        jDeleteUser.setText("DELETE");
        jDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteUserActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("INSERT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jUsername.setText("Username");

        jUserID.setText("User ID");

        jCheckAdmin.setText("Make User Admin");
        jCheckAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAdminActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(0, 153, 153));
        jButtonReset.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReset.setText("RESET");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(jDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jContactDeets, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jUserSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckAdmin)
                            .addComponent(jUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 588, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUserSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jContactDeets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckAdmin)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseWindowMouseClicked
        System.exit(0); // this will close the JFrame window on a mouse click event
    }//GEN-LAST:event_jLabelCloseWindowMouseClicked

    private void jLabelMinimizeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeWindowMouseClicked
        this.setState(JFrame.ICONIFIED); // this will minimize a JFrame window on a click event
    }//GEN-LAST:event_jLabelMinimizeWindowMouseClicked

    private void jBtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeActionPerformed
        AdminPage adminP = null;
        adminP = new AdminPage();
        adminP.setVisible(true);
        adminP.pack();
        adminP.setLocationRelativeTo(null);
        adminP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBtnHomeActionPerformed

     public void populateUserTable()
     {
        DataHandler dh = new DataHandler();
        List<User> users = null;
        try 
        {
            users = b.userList();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(UserListPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel tm = (DefaultTableModel) jUserTable.getModel();
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
              tm.removeRow(i);
        }

        for (User user : users) {
            Object[] obj = new Object[10];
            obj[0] = user.getUserID();
            obj[1] = user.getName();
            obj[2] = user.getSurname();
            obj[3] = user.getUsername();
            obj[4] = user.getPassword();
            obj[5] = user.getDepartment();
            obj[6] = user.getLocation();
            obj[7] = user.getBirthDate();
            obj[8] = user.getContact();
            obj[9] = user.isIsAdmin();

            tm.addRow(obj);
        }

        jUserTable.setModel(tm);
     }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
       populateUserTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jUserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUserTableMouseClicked
        try {                                        
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            DataHandler dh = new DataHandler();
            dh.connect();
            dh.st = null;
            dh.rs =  null;
            try {
                int row = jUserTable.getSelectedRow();
                String tableClick = (jUserTable.getModel().getValueAt(row, 0).toString());
                String query = "SELECT * FROM tbluser WHERE `U_ID` = '"+ tableClick+"' ";
                dh.st = dh.conn.prepareStatement(query);
                dh.rs = dh.st.executeQuery(query);
                
                if (dh.rs.next())
                {
                    String add1 = dh.rs.getString("U_ID");
                    jUserID.setText(add1);
                    String add2 = dh.rs.getString("name");
                    jUserNameField.setText(add2);
                    String add3 = dh.rs.getString("surname");
                    jUserSurnameField.setText(add3);
                    String add4 = dh.rs.getString("username");
                    jUsername.setText(add4);
                    String add5 = dh.rs.getString("password");
                    jPass.setText(add5);
                    String add6 = dh.rs.getString("dept_id");
                    jDepartment.setText(add6);
                    String add7 = dh.rs.getString("location");
                    jLocation.setText(add7);
                    String add8 = dh.rs.getString("birthDate");
                    jDOB.setText(add8);
                    String add9 = dh.rs.getString("contact");
                    jContactDeets.setText(add9);
                    boolean add10 = dh.rs.getBoolean("isAdmin");
                    jCheckAdmin.setSelected(add10);
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(UserListPage.class.getName()).log(Level.SEVERE,null, ex);
        }
    }//GEN-LAST:event_jUserTableMouseClicked

    private void jDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteUserActionPerformed
        
        DataHandler dh = new DataHandler();
        int ID = Integer.parseInt(jUserID.getText());
        try {
            if (b.DeleteUser(ID))
            {
                System.out.println("Success");
                populateUserTable();
            }
            else
            {
                System.out.println("Failed to delete record");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }                     
    }//GEN-LAST:event_jDeleteUserActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DataHandler dh = new DataHandler();
        String userName = jUserNameField.getText();
        String userSurname = jUserSurnameField.getText();
        String useName = jUsername.getText();
        String uPass = jPass.getText();
        String uDepartment = jDepartment.getText();
        String uLocation = jLocation.getText();
        String uDob = jDOB.getText();
        String uContact = jContactDeets.getText();
        boolean uAdmin = jCheckAdmin.isSelected();
            try {
            if (dh.InsertUser(userName, userSurname, uDepartment,uLocation, uContact, uAdmin, uPass, uDob,useName))
            {
                //`name`, `surname`, `dept_id`, `location`,`contact`,`isAdmin`,`password`,`birthDate`,`username`"
                System.out.println("Success");
                populateUserTable();
            }
            else
            {
                System.out.println("Failed to update record");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckAdminActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jUserID.setText("");
        jUserNameField.setText("");
        jUserSurnameField.setText("");
        jUsername.setText("");
        jPass.setText("");
        jDepartment.setText("");
        jLocation.setText("");
        jDOB.setText("");
        jContactDeets.setText("");
        jCheckAdmin.setSelected(false);

    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DataHandler dh = new DataHandler();
        int id = Integer.parseInt(jUserID.getText());
        String userName = jUserNameField.getText();
        String userSurname = jUserSurnameField.getText();
        String useName = jUsername.getText();
        String uPass = jPass.getText();
        String uDepartment = jDepartment.getText();
        String uLocation = jLocation.getText();
        String uDob = jDOB.getText();
        int uContact = Integer.parseInt(jContactDeets.getText());
        boolean uAdmin = jCheckAdmin.isSelected();
        
            try {
            if (dh.UpdateUser(id,userName, userSurname, uDepartment,uLocation, uContact, uAdmin, uPass, uDob,useName))
            {
                System.out.println("Success");
                populateUserTable();
            }
            else
            {
                System.out.println("Failed to update record");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }                   
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserListPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserListPage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserListPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnHome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckAdmin;
    private javax.swing.JTextField jContactDeets;
    private javax.swing.JTextField jDOB;
    private javax.swing.JButton jDeleteUser;
    private javax.swing.JTextField jDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCloseWindow;
    private javax.swing.JLabel jLabelMinimizeWindow;
    private javax.swing.JTextField jLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jPass;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jUserID;
    private javax.swing.JTextField jUserNameField;
    private javax.swing.JTextField jUserSurnameField;
    private javax.swing.JTable jUserTable;
    private javax.swing.JTextField jUsername;
    // End of variables declaration//GEN-END:variables
}
