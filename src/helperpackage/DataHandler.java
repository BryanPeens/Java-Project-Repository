package helperpackage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import milestone1.ClientConnectionManager;
import sun.security.util.Password;

/**
 *
 * @author Bryan/Ruan
 */
public final class DataHandler extends UnicastRemoteObject implements dbInterface{
    
    public final String db_url = "jdbc:mysql://localhost:3306/db_data";
    public Connection conn = null  ;
    public Statement st;
    public ResultSet rs = null;
    public String Qry ;
    public ClientConnectionManager serverComunication = new ClientConnectionManager();
    //@Override
    public void connect() throws SQLException{
        try{
            conn = DriverManager.getConnection(db_url,"root","");
        }
        catch(RuntimeException e){// output a sql error message
              JOptionPane.showMessageDialog(null, "Error", "InfoBox: " + e, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * no clue 
     * 
     */
    public DataHandler() {
       try {
        connect();
       }
       catch(SQLException e ){
           System.out.println(e); 
       }
       }
    
    @Override
    public boolean loginsearch(String Uname , String pword) throws SQLException , RemoteException{
        
        Qry = "SELECT * FROM `tbluser` WHERE `Username` LIKE '"+Uname+"' AND `password` LIKE '"+pword+"'";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        String msg = Uname+" user has conected";
        serverComunication 
        .ServerMessage(Uname+" user has conected");
        return rs.next();
    }
    
    @Override
    public boolean checkAdmin(String Uname)throws SQLException , RemoteException {
        Qry = "SELECT * FROM `tbluser` WHERE `Username` LIKE '"+Uname+"' AND `isAdmin` = (1)";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        String msg = "admin ="+Uname+" connected";
        serverComunication 
        .ServerMessage(msg);
        return rs.next();
    }
               
    @Override
    public List<Product> getProduct () throws SQLException , RemoteException{
        List<Product> pducts = new ArrayList<>();
        
        Qry = "select * from tblproduct";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        while (rs.next()) {            
            pducts.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getString(8)));
        }
        return pducts;
    }
    
    @Override
    public boolean InsertUser(String name,String surname,String departId, String location,String contact,boolean isAdmin,String pass, String DoB,String username) throws SQLException , RemoteException {                
        String query = "INSERT INTO `tbluser` (`name`, `surname`, `dept_id`, `location`, `contact`,`isAdmin`,`password`, `birthDate`,`username` " + " ) VALUES(?,?,?,?,?,?,?,?,?)";
        
        int admin = 0;
        if (isAdmin == true)
        {
          admin = 1;   
        }
        
        PreparedStatement insertStatement = conn.prepareStatement(query);
        insertStatement.setString(1, name);
        insertStatement.setString(2, surname);
        insertStatement.setString(3, departId);
        insertStatement.setString(4, location);
        insertStatement.setString(5, contact);
        insertStatement.setInt(6, admin);
        insertStatement.setString(7, pass);
        insertStatement.setString(8, DoB);
        insertStatement.setString(9, username);
        
        insertStatement.executeUpdate();
        
        return true;
    }
    
    @Override
    public List<User> userList() throws SQLException , RemoteException{
        List<User> users = new ArrayList<User>();
        Qry = "SELECT * FROM `tbluser`";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        
        while(rs.next()) {
            users.add(new User(
                    rs.getInt("U_ID"),
                    rs.getString("name"),
                    rs.getString("surname"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("dept_id"),
                    rs.getString("location"),
                    rs.getString("birthDate"),
                    rs.getString("contact"),
                    rs.getBoolean("isAdmin")));
        }
        return users;
    }
     
    @Override
    public void AddOrder(int ProductID,int userID,int Quantity) throws SQLException , RemoteException{
        Qry = "INSERT INTO `tblorders` (`orderID`, `date`, `userId`, `productID`, `quantity`) VALUES (NULL, ?, ?, ?, ? );";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        //System.out.println(); //2016/11/16 12:08:43
        PreparedStatement insertStatement = conn.prepareStatement(Qry);
        insertStatement.setString(1,dateFormat.format(date));
        insertStatement.setInt(2, userID);
        insertStatement.setInt(3, ProductID);
        insertStatement.setInt(4, Quantity);
        
        insertStatement.executeUpdate();
        
        
    }
    
    @Override
    public User GetUserInfo(String Uname) throws SQLException , RemoteException{
        User u = new  User();
        Qry = "SELECT * FROM `tbluser` WHERE username LIKE '"+Uname+"' "  ;
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        
        while(rs.next()) {
            u = new User(
                    rs.getInt("U_ID"),
                    rs.getString("name"),
                    rs.getString("surname"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("dept_id"),
                    rs.getString("location"),
                    rs.getString("birthDate"),
                    rs.getString("contact"),
                    rs.getBoolean("isAdmin"));
        }
        return u;
    } 
    
    @Override
    public List<Product> productList() throws SQLException , RemoteException{
        List<Product> product = new ArrayList<Product>();
        Qry = "SELECT * FROM `tblproduct`";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        
        while(rs.next()) {
            product.add(new Product(rs.getInt("productid"),
                                    rs.getString("productName"),
                                    rs.getString("productDescription"),
                                    rs.getInt("productNumber"),
                                    rs.getString("productManufacturer"),
                                    rs.getInt("productQuantity"),
                                    rs.getInt("productPrice"),
                                    rs.getString("category")));
        }
        return product;
    }
    
    @Override
    public List<Product> searchProduct(String searchWord) throws SQLException , RemoteException{
        searchWord = searchWord.toLowerCase();
        List<Product> searchList = new ArrayList<Product>();
        Qry = "SELECT * FROM `tblproduct` WHERE LOWER(`productName`) LIKE '%"+ searchWord +"%' OR LOWER(`category`) LIKE '%"+ searchWord +"%' ";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        
        while(rs.next()) {
            searchList.add(new Product(rs.getInt("productid"),
                                    rs.getString("productName"),
                                    rs.getString("productDescription"),
                                    rs.getInt("productNumber"),
                                    rs.getString("productManufacturer"),
                                    rs.getInt("productQuantity"),
                                    rs.getInt("productPrice"),
                                    rs.getString("category")));
        }
        
        return searchList;
    }
    
    @Override
    public boolean DeleteProduct(int productid) throws SQLException  , RemoteException {
        try 
        {
            Qry = "DELETE FROM `tblproduct` WHERE `productid` = '"+productid+"'";
            PreparedStatement deleteStatement = conn.prepareStatement(Qry);
            deleteStatement.executeUpdate();
            return true;
        } 
        catch (SQLException e)
        {
            return false;
        }
        
        
    }
    
    @Override
    public boolean UpdateProduct(int id,String pName,String pDesc,int plotNumber,String pManufact,int pQuant,double pPrice,String prodCategory) throws SQLException , RemoteException {
        try {
            Qry = "UPDATE `tblproduct` SET `productName` = ?,`productDescription` = ?,`productNumber` = ?,`productManufacturer` = "
                    + "?,`productQuantity` = ?,`productPrice` = ?,`category` = ? WHERE `productid` = ?";
            
            PreparedStatement updateStatement = conn.prepareStatement(Qry);
            updateStatement.setString(1, pName);
            updateStatement.setString(2, pDesc);
            updateStatement.setInt(3, plotNumber);
            updateStatement.setString(4, pManufact);
            updateStatement.setInt(5, pQuant);
            updateStatement.setDouble(6, pPrice);
            updateStatement.setString(7, prodCategory);
            updateStatement.setDouble(8, id);
            System.out.println("No Update");
            updateStatement.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            return false;
        }      
    }
    
    @Override
    public boolean InsertProduct(String pName,String pDesc,int plotNumber,String pManufact,int pQuant,double pPrice, String category ) throws SQLException  , RemoteException {     
        try 
        {
            String query = "INSERT INTO `tblproduct` (`productName`, `productDescription`, `productNumber`, `productManufacturer`,`productQuantity`,`productPrice`, `category`" + " )"
                                                    + " VALUES(?,?,?,?,?,?,?)";
            PreparedStatement insertProdStatement = conn.prepareStatement(query);
            insertProdStatement.setString(1, pName);
            insertProdStatement.setString(2, pDesc);
            insertProdStatement.setInt(3, plotNumber);
            insertProdStatement.setString(4, pManufact);
            insertProdStatement.setInt(5, pQuant);
            insertProdStatement.setDouble(6, pPrice);
            insertProdStatement.setString(7, category);
            System.out.println("Totally Just Inserted");
            insertProdStatement.executeUpdate();
            return true;
        } 
        catch (SQLException e)
        {
            return false;
        }
    }
    
    @Override
    public boolean DeleteUser(int userID) throws SQLException  , RemoteException {
        try 
        {
            Qry = "DELETE FROM `tbluser` WHERE `U_ID` = '"+userID+"'";
            PreparedStatement deleteStatement = conn.prepareStatement(Qry);
            deleteStatement.executeUpdate();
            return true;
        } 
        catch (SQLException e)
        {
            return false;
        }
    }
    
    @Override
    public boolean InsertUser(String uName,String uSurname,String uDepartment,String uLocation,int uContact,int isAdmin,int uPassword,String dateOfBirth,String username ) throws SQLException , RemoteException   {     
        try 
        {
            String query = "INSERT INTO `tblproduct` (`name`, `surname`, `dept_id`, `location`,`contact`,`isAdmin`,`password`,`birthDate`,`username`" + " )"
                                                    + " VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement insertProdStatement = conn.prepareStatement(query);
            insertProdStatement.setString(1, uName);
            insertProdStatement.setString(2, uSurname);
            insertProdStatement.setString(3, uDepartment);
            insertProdStatement.setString(4, uLocation);
            insertProdStatement.setInt(5, uContact);
            insertProdStatement.setInt(6, isAdmin);
            insertProdStatement.setInt(7, uPassword);
            insertProdStatement.setString(8, dateOfBirth);
            insertProdStatement.setString(9, username);
            System.out.println("Totally Just Inserted");
            insertProdStatement.executeUpdate();
            return true;
        } 
        catch (SQLException e)
        {
            return false;
        }
    }
    
    @Override 
    public boolean UpdateUser(int id,String uName,String uSurname,String uDepartment,String uLocation,int uContact,boolean isAdmin,String uPassword,String dateOfBirth,String username ) throws SQLException , RemoteException {
        try {
            Qry = "UPDATE `tbluser` SET `name` = ?, `surname` = ?, `dept_id` = ?, `location` = ?,`contact` = ?,`isAdmin` = ?,`password` = ?,`birthDate` = ?,`username` = ?"
                    + " WHERE `U_ID` = ?";
            
            PreparedStatement updateUsersStatement = conn.prepareStatement(Qry);
            updateUsersStatement.setString(1, uName);
            updateUsersStatement.setString(2, uSurname);
            updateUsersStatement.setString(3, uDepartment);
            updateUsersStatement.setString(4, uLocation);
            updateUsersStatement.setInt(5, uContact);
            updateUsersStatement.setBoolean(6, isAdmin);
            updateUsersStatement.setString(7, uPassword);
            updateUsersStatement.setString(8, dateOfBirth);
            updateUsersStatement.setString(9, username);
            updateUsersStatement.setInt(10, id);

            updateUsersStatement.executeUpdate();
            System.out.println("Totally Just Updated" + updateUsersStatement);
            return true;
        } 
        catch (SQLException e) 
        {
            return false;
        }      
    }
    
    @Override
    public boolean saveOrder(int userId, HashMap<Integer, Integer> productAndQuantity) throws RemoteException {

        String query = "INSERT INTO `tblorders`" +
                "(`date`,`userId`)" +
                "VALUES (?,?);";

        try {
            PreparedStatement insertOrderStatement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            insertOrderStatement.setDate(1, new java.sql.Date(new Date().getTime()));
            insertOrderStatement.setInt(2, userId);
            insertOrderStatement.executeUpdate();

            int newOrderId = 0;

            try (ResultSet generatedKeys = insertOrderStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    newOrderId = generatedKeys.getInt(1);
                }
                else {
                    throw new SQLException("insertOrderStatement failed");
                }
            }

            if(newOrderId > 0) {
                String newQuery = "INSERT INTO `tblOrderAndProduct`" +
                        "(`orderId`,`productId`, `quantity`)" +
                        "VALUES (?,?,?);";

                for (Integer productId : productAndQuantity.keySet()) {
                    int quantity = productAndQuantity.get(productId);

                    PreparedStatement insertProductStatement = conn.prepareStatement(newQuery);

                    insertProductStatement.setInt(1, newOrderId);
                    insertProductStatement.setInt(2, productId);
                    insertProductStatement.setInt(3, quantity);
                    insertProductStatement.executeUpdate();
                }
            }

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    @Override
    public List<Product> getProductsForOrder(int orderId) throws RemoteException {
        String query = "SELECT p.*, oap.orderId, oap.orderAndProductId "
                + "FROM tblOrderAndProduct as oap INNER JOIN tblproduct as p "
                + "ON p.productId = oap.productId WHERE oap.orderId = ?;";

        List<Product> productList = new ArrayList<>();

        try {
            PreparedStatement getOrdersStatement = conn.prepareStatement(query);
            getOrdersStatement.setInt(1, orderId);

            rs = getOrdersStatement.executeQuery();

            while(rs.next()) {
                productList.add(new Product(rs.getInt("productid"),
                                    rs.getString("productName"),
                                    rs.getString("productDescription"),
                                    rs.getInt("productNumber"),
                                    rs.getString("productManufacturer"),
                                    rs.getInt("productQuantity"),
                                    rs.getInt("productPrice"),
                                    rs.getString("category")));
            }

            return productList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    @Override
    public User finedByUsername(String usersName) throws SQLException , RemoteException   {
        Qry = "SELECT * FROM `tbluser` WHERE `username` = '"+usersName+"' ";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        User pietie = null;
        while(rs.next()) 
        {
            pietie = new User(
                    rs.getInt("U_ID"),
                    rs.getString("name"),
                    rs.getString("surname"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("dept_id"),
                    rs.getString("location"),
                    rs.getString("birthDate"),
                    rs.getString("contact"),
                    rs.getBoolean("isAdmin"));
        }
        return pietie;
    }
    
    @Override
    public List<orderRequest> GetRequests() throws SQLException , RemoteException{
        Qry = "SELECT * FROM `v_ordersd`";
        st = conn.createStatement();
        rs = st.executeQuery(Qry);
        List<orderRequest> requests = new ArrayList<>();
        while(rs.next()) 
        {
            requests.add(new orderRequest(
                    rs.getInt("orderID"),
                    rs.getString("product"),
                    rs.getInt("quantity"),
                    rs.getString("requestedby")));
                    
        }
        return requests;
        
    }
    
    @Override
    public void AcceptOrder(int Id, int adminID) throws SQLException , RemoteException{
        Qry =  "INSERT INTO `order_d` (`orderid`, `adminid`) VALUES ('"+Id+"', '"+adminID+"')";
        PreparedStatement ps = conn.prepareStatement(Qry);
        ps.executeUpdate();
        String sQry = "DELETE FROM `tblorders` WHERE `tblorders`.`orderID` = "+Id;
        PreparedStatement ps2 = conn.prepareStatement(sQry);
        ps2.executeUpdate();
        
    }
}

    
/*
    public List<Order> getOrdersByUser(int userId) {
        String query = "SELECT `orderID`,`date`,`userId` FROM `tblorders` WHERE `userId` = ?;";

        List<Order> orderList = new ArrayList<>();

        try {
            PreparedStatement getOrdersStatement = conn.prepareStatement(query);
            getOrdersStatement.setInt(1, userId);

            rs = getOrdersStatement.executeQuery();

            while(rs.next()) {
                orderList.add(new Order(rs.getInt("orderID"), rs.getDate("date"), rs.getInt("userId")));
            }

            return orderList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
*/
    