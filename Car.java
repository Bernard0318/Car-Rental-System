/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

import java.io.*;


/**
 *
 * @author User
 */
public class Car {
    public static int initID = 1000;
    private int CarID;
    private String Brand;
    private String Model;
    private String Seats;
    private String Transmissions;
    private String Price;
    private String Available;

    public Car(int CarID, String Brand, String Model, String Seats, String Transmissions, String Price, String Available) {
        this.CarID = getNextID();
        this.Brand = Brand;
        this.Model = Model;
        this.Seats = Seats;
        this.Transmissions = Transmissions;
        this.Price = Price;
        this.Available = Available;
    }
    
    public static int getNextID() {
        return initID += 1;
    }

    public static void setInitID(int initID) {
        Car.initID = initID;
    }
   
    public void setCarID(int CarID) {
        this.CarID = CarID;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setSeats(String Seats) {
        this.Seats = Seats;
    }

    public void setTransmissions(String Transmissions) {
        this.Transmissions = Transmissions;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public void setAvailable(String Available) {
        this.Available = Available;
    }
    
    public int getCarID(){
        return this.CarID;
    }
    
    public String getBrand(){
        return this.Brand;
    }
    
    public String getModel(){
        return this.Model;
    }
    
    public String getSeats(){
        return this.Seats;
    }
    
    public String getTransmissions(){
        return this.Transmissions;
    }
    
    public String getPrice(){
        return this.Price;
    }
    
    public String getAvailable(){
        return this.Available;
    }

    @Override
    public String toString() {
        return "CarInfo{" + "CarID=" + CarID + ", Brand=" + Brand + ", Model=" + Model + ", Seats=" + Seats + ", Transmissions=" + Transmissions + ", Price=" + Price + ", Available=" + Available + '}';
    }
     
     // Add the CarInfo to write into a text file-CarInformation
     public void Write2File()
    {
        File fp = new File("CarInformation.txt");
    try
    {
        FileWriter fw = new FileWriter(fp,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String CustomerData= CarID + " " + Brand + " " + Model + " " + Seats + " " + Transmissions + " " + Price + " " + Available + " " + "\n";
        pw.write(CustomerData);
        pw.close();
    }
    catch(IOException Ex)
    {
        
    } 
    }
}
