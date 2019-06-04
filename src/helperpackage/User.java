package helperpackage;

import java.io.Serializable;

/**
 *
 * @author Bryan/Ruan
 */
 public class User implements Serializable{

    private int userID;
    private String name;
    private String surname;
    private String birthDate;
    private String username;
    private String password;
    private String department;
    private String location;
    private String contact;
    private boolean isAdmin;

    public User(int userID,String name, String surname, String username, String password, String department, String location, String birthDate, String contact, boolean isAdmin) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.department = department;
        this.location = location;
        this.birthDate = birthDate;
        this.contact = contact;
        this.isAdmin = isAdmin;
    }

    public User() {
    }

    
    
    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "\t" + userID + "\t" + name + "\t" + surname + "\t" + birthDate + "\t" + username + "\t" + password + "\t" + department + "\t" + location + ", contact=" + contact + "\t" + isAdmin ;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
    
}
