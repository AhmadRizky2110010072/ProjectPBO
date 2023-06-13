/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
public class tblUser {
    private int idUser;
    private String Username;
    private String Password;
    private String Fullname; 
    
    public tblUser() {}
    
    public void setidUser(int idUser){
        this.idUser=idUser;
    }
    public int getidUser(){
        return this.idUser;
    }
    public void setUsername (String Username){
        this.Username=Username;
    }
    public String getUsername(){
        return this.Username;
    }
    public void setPassword (String Password){
        this.Password=Password;
    }
    public String getPassword(){
        return this.Password;
    }
    public void setFullname (String Fullname){
        this.Fullname=Fullname;
    }
    public String getFullname(){
        return this.Fullname;
    }
}
