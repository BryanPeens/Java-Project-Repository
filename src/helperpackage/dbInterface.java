/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helperpackage;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Ruan
 */
public interface dbInterface extends Remote{

    
        //public void connect() throws RemoteException;
        public boolean loginsearch(String Uname , String pword) throws SQLException,RemoteException;
        public boolean checkAdmin(String Uname)throws SQLException,RemoteException;
        public List<Product> getProduct () throws SQLException,RemoteException;
        public boolean InsertUser(String name,String surname,String departId, String location,String contact,boolean isAdmin,String pass, String DoB,String username) throws SQLException,RemoteException;
        public List<User> userList() throws SQLException,RemoteException;
        public void AddOrder(int ProductID,int userID,int Quantity) throws SQLException,RemoteException;
        public User GetUserInfo(String Uname) throws SQLException,RemoteException;
        public List<Product> productList() throws SQLException,RemoteException;
        public List<Product> searchProduct(String searchWord) throws SQLException,RemoteException;
        public boolean DeleteProduct(int productid) throws SQLException,RemoteException;
        public boolean UpdateProduct(int id,String pName,String pDesc,int plotNumber,String pManufact,int pQuant,double pPrice,String prodCategory) throws SQLException,RemoteException;
        public boolean InsertProduct(String pName,String pDesc,int plotNumber,String pManufact,int pQuant,double pPrice, String category ) throws SQLException,RemoteException;
        public boolean DeleteUser(int userID) throws SQLException,RemoteException;
        public boolean InsertUser(String uName,String uSurname,String uDepartment,String uLocation,int uContact,int isAdmin,int uPassword,String dateOfBirth,String username ) throws SQLException,RemoteException;
        public boolean UpdateUser(int id,String uName,String uSurname,String uDepartment,String uLocation,int uContact,boolean isAdmin,String uPassword,String dateOfBirth,String username ) throws SQLException,RemoteException;
        public boolean saveOrder(int userId, HashMap<Integer, Integer> productAndQuantity) throws RemoteException;
        public List<Product> getProductsForOrder(int orderId) throws RemoteException;
        public User finedByUsername(String usersName) throws SQLException,RemoteException ;
        public List<orderRequest> GetRequests() throws SQLException,RemoteException;
        public void AcceptOrder(int Id, int adminID) throws SQLException,RemoteException;
        
        
}
