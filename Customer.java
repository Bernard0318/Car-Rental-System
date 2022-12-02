package Customer;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Customer extends User {
    public static int initID = 1000;
    private int custID;
    public boolean toString;

    public Customer(String Username, String Password, int Age, String Gender, String PhoneNo, String Email) {
        super(Username, Password, Age, Gender, PhoneNo, Email);
        this.custID = getNextID();
    }
    
    
    public static int getNextID() {
        return initID += 1;
    }

    public static void setInitID(int initID) {
        Customer.initID = initID;
    }

    public int getcustID() {
        return custID;
    }

    public void setcustID(int custID) {
        this.custID = custID;
    }
    
    
    public void Writefile()
    {//Add the coding to write to a file - UserData 
        File fh = new File("CarRentalCust.txt");
        try{
        FileWriter fw = new FileWriter(fh,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String CustInfo = custID + "," + Username + "," + Password + "," + Age + "," + Gender + "," + PhoneNo + "," + Email + "\n";
        pw.write(CustInfo);
        pw.close();
        }
        catch(IOException Ex)
        {
            
        }
}

}
