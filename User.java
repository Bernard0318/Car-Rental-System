/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

/**
 *
 * @author User
 */
public abstract class User {
    private String Username;
    private String Password;
    private int Age;
    private String Gender;
    private String PhoneNo;
    private String Email;
    
    public User(String Username, String Password, int Age, String Gender, String PhoneNo, String Email){
        this.Username = Username;
        this.Password = Password;
        this.Age = Age;
        this.Gender = Gender;
        this.PhoneNo = PhoneNo;
        this.Email = Email;
    }
    
    public String getName(){
        return Username;
    }
    public void setName(String Username){
        this.Username = Username;
    }
    
    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    
    public String getGender(){
        return Gender;
    }
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    
    public String getPhoneNo(){
        return PhoneNo;
    }
    public void setPhoneNo(String PhoneNo){
        this.PhoneNo = PhoneNo;
    }
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "User{" + "Username=" + Username + ", Password=" + Password + ", Age=" + Age + ", Gender=" + Gender + ", PhoneNo=" + PhoneNo + ", Email=" + Email + '}';
    }
    
    
}
