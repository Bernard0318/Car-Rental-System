/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

/**
 *
 * @author User
 */
public class Admin extends User {
    public static int initID = 100;
    private int adminID;
    public boolean toString;

    public Admin(String Username, String Password, int Age, String Gender, String PhoneNo, String Email) {
        super(Username, Password, Age, Gender, PhoneNo, Email);
        this.adminID = getNextID();
    }

    public static int getNextID() {
        return initID += 1;
    }

    public static void setInitID(int initID) {
        Admin.initID = initID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return super.toString() + "Admin{" + "adminID=" + adminID + '}';
    }

    

    
    
    
    
    
}
