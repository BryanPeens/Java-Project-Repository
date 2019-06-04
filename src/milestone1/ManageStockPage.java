package milestone1;

import helperpackage.Product;
import helperpackage.DataHandler;
import helperpackage.dbInterface;
import java.awt.Font;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Bryan
 */
public class ManageStockPage extends javax.swing.JFrame {

    public String[] categoryArray = {"Pens and Pencils","Stappeling","Clipboards","Measuring","Badges and Lanyards","Whiteboards","Scissors","Papers","Stamping","Storage and organization","Board Markers"};
    public dbInterface b;
    public String BackupValue = "";
    public ManageStockPage()  {
        try {
            initComponents();
            this.b = (dbInterface) Naming.lookup("rmi://localhost:8080/DBClas");
            jCategory.removeAllItems();
            for (String category : categoryArray)
            {
                jCategory.addItem(category);
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductTable = new javax.swing.JTable();
        btnviewAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSearchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtlotNum = new javax.swing.JTextField();
        txtmanu = new javax.swing.JTextField();
        txtquant = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        btnDeleteProd = new javax.swing.JButton();
        btnUpdateProd = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jCategory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Inventory");

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

        jBtnHome.setBackground(new java.awt.Color(255, 255, 255));
        jBtnHome.setForeground(new java.awt.Color(248, 148, 6));
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

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jProductTable.setBackground(new java.awt.Color(153, 153, 153));
        jProductTable.setForeground(new java.awt.Color(255, 255, 255));
        jProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Description", "Lot.Number", "Manufacturer", "Quantity", "Price", "Category"
            }
        ));
        jProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jProductTable);

        btnviewAll.setBackground(new java.awt.Color(102, 102, 102));
        btnviewAll.setForeground(new java.awt.Color(255, 255, 255));
        btnviewAll.setText("View All");
        btnviewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewAllActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Product Name you wish to alter");

        jSearchField.setBackground(new java.awt.Color(108, 122, 137));

        btnSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });

        txtmanu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanuActionPerformed(evt);
            }
        });

        btnDeleteProd.setBackground(new java.awt.Color(242, 38, 19));
        btnDeleteProd.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnDeleteProd.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteProd.setText("DELETE");
        btnDeleteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProdActionPerformed(evt);
            }
        });

        btnUpdateProd.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdateProd.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnUpdateProd.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateProd.setText("UPDATE");
        btnUpdateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProdActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(0, 153, 153));
        btnInsert.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidFocusGained(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 153, 153));
        btnReset.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCategoryActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lot Number");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manufacturer");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtquant, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmanu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlotNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdesc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDeleteProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnviewAll, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(jCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnviewAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlotNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    
    public void populateTable()
    {
        DataHandler dh = new DataHandler();
        List<Product> product = null;
        try {
            product = dh.productList();
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel tm = (DefaultTableModel) jProductTable.getModel();
        
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
              tm.removeRow(i);
        }
        
        for (Product product1 : product)
        {
            Object[] obj = new Object[8];
            obj[0] = product1.getProductid();
            obj[1] = product1.getProductName();
            obj[2] = product1.getProductDescription();
            obj[3] = product1.getProductNumber();
            obj[4] = product1.getProductManufacturer();
            obj[5] = product1.getProductQuantity();
            obj[6] = product1.getProductPrice();
            obj[7] = product1.getCategory();

           tm.addRow(obj);
        }
        jProductTable.setModel(tm);
    }
    
    
    private void btnviewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewAllActionPerformed
        txtid.setVisible(true); 
        populateTable();
    }//GEN-LAST:event_btnviewAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchWord = jSearchField.getText();
        DataHandler dh = new DataHandler();
        List<Product> searchedList = null;
        try {
            searchedList = dh.searchProduct(searchWord);
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel tm = (DefaultTableModel) jProductTable.getModel();
        
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
              tm.removeRow(i);
        }
        
        for (Product product1 : searchedList)
        {
            Object[] obj = new Object[8];
            obj[0] = product1.getProductid();
            obj[1] = product1.getProductName();
            obj[2] = product1.getProductDescription();
            obj[3] = product1.getProductNumber();
            obj[4] = product1.getProductManufacturer();
            obj[5] = product1.getProductQuantity();
            obj[6] = product1.getProductPrice();
            obj[7] = product1.getCategory();

           tm.addRow(obj);
        }
        jProductTable.setModel(tm);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

    }//GEN-LAST:event_btnSearchMouseClicked

    private void jProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductTableMouseClicked
        try {                                           
            DataHandler dh = new DataHandler();
            dh.connect();
            dh.st = null;
            dh.rs =  null;
            
            try {
                
                int row = jProductTable.getSelectedRow();
                String tableClick = (jProductTable.getModel().getValueAt(row, 0).toString());
                String query = "SELECT * FROM tblproduct WHERE productid = '" + tableClick + "' ";
                dh.st = dh.conn.prepareStatement(query);
                dh.rs = dh.st.executeQuery(query);
                
                if (dh.rs.next())
                {
                    String add1 = dh.rs.getString("productid");
                    txtid.setText(add1);
                    String add2 = dh.rs.getString("productName");
                    txtname.setText(add2);
                    String add3 = dh.rs.getString("productDescription");
                    txtdesc.setText(add3);
                    String add4 = dh.rs.getString("productNumber");
                    txtlotNum.setText(add4);
                    String add5 = dh.rs.getString("productManufacturer");
                    txtmanu.setText(add5);
                    String add6 = dh.rs.getString("productQuantity");
                    txtquant.setText(add6);
                    String add7 = dh.rs.getString("productPrice");
                    txtprice.setText(add7);                   
                    String category = dh.rs.getString("category");
                    jCategory.setSelectedItem(category);
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE,null, ex);
        }
    }//GEN-LAST:event_jProductTableMouseClicked

    private void jBtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHomeActionPerformed
        AdminPage adminP = null;
        adminP = new AdminPage();
        adminP.setVisible(true);
        adminP.pack();
        adminP.setLocationRelativeTo(null);
        adminP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBtnHomeActionPerformed

    private void btnDeleteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProdActionPerformed

        DataHandler dh = new DataHandler();
        int ID = Integer.parseInt(txtid.getText());
        try {
            if (dh.DeleteProduct(ID))
            {
                System.out.println("Success");
                populateTable();
            }
            else
            {
                System.out.println("Failed to delete record");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteProdActionPerformed

    private void btnUpdateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProdActionPerformed
        DataHandler dh = new DataHandler();
        int ID = Integer.parseInt(txtid.getText());
        String prodName = txtname.getText();
        String prodDescription = txtdesc.getText();
        int lotNumber = Integer.parseInt(txtlotNum.getText());
        String prodManufact = txtmanu.getText();
        int productQuantity = Integer.parseInt(txtquant.getText());
        double prodPrice = Double.parseDouble(txtprice.getText());
        String category = (String)jCategory.getSelectedItem();
        
            try {
            if (dh.UpdateProduct(ID,prodName,prodDescription,lotNumber,prodManufact,productQuantity,prodPrice,category))
            {
                System.out.println("Success");
                populateTable();
            }
            else
            {
                System.out.println("Failed to update record");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateProdActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       
        txtid.setText("");
        txtid.setVisible(false);
        txtdesc.setText("");
        txtlotNum.setText("");
        txtmanu.setText("");
        txtquant.setText("");
        txtprice.setText("");  
        jCategory.setSelectedItem(0);
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        DataHandler dh = new DataHandler();
        String prodName = txtname.getText();
        String prodDescription = txtdesc.getText();
        int lotNumber = Integer.parseInt(txtlotNum.getText());
        String prodManufact = txtmanu.getText();
        int productQuantity = Integer.parseInt(txtquant.getText());
        double prodPrice = Double.parseDouble(txtprice.getText());    
        String category = (String)jCategory.getSelectedItem();
             
            try {
            if (dh.InsertProduct(prodName,prodDescription,lotNumber,prodManufact,productQuantity,prodPrice,category))
            {
                System.out.println("Success");
                populateTable();//Repopulate the table on the form after insert
            }
            else
            {
                System.out.println("Failed to update record");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnInsertActionPerformed

    private void jCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCategoryActionPerformed

    private void txtidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusGained
         // TODO add your handling code here:
    }//GEN-LAST:event_txtidFocusGained

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
         
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        
    }//GEN-LAST:event_txtnameFocusLost

    private void txtmanuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanuActionPerformed

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
            java.util.logging.Logger.getLogger(ManageStockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageStockPage().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ManageStockPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProd;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateProd;
    private javax.swing.JButton btnviewAll;
    private javax.swing.JButton jBtnHome;
    private javax.swing.JComboBox<String> jCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCloseWindow;
    private javax.swing.JLabel jLabelMinimizeWindow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jProductTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSearchField;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlotNum;
    private javax.swing.JTextField txtmanu;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquant;
    // End of variables declaration//GEN-END:variables
}
