/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
public class tblCustomer {
    private int ID_Customer;
    private String Name;
    private String Alamat;
    private String Hp; 
    private String Jeniskelamin;
    private String Username;
    
    public tblCustomer() {}
    
    public void setID_Customer (String NOP){
        this.ID_Customer=ID_Customer;
    }
    public int getID_Customer(){
        return this.ID_Customer;
    }
    public void setName (String NOP){
        this.Name=Name;
    }
    public String getName(){
        return this.Name;
    }   
    public void setAlamat (String NOP){
        this.Alamat=Alamat;
    }
    public String getAlamat(){
        return this.Alamat;
    }
    public void setHp (String NOP){
        this.Hp=Hp;
    }
    public String getHp(){
        return this.Hp;
    }
    public void setJeniskelamin (String NOP){
        this.Jeniskelamin=Jeniskelamin;
    }
    public String getJeniskelamin(){
        return this.Jeniskelamin;
    }
    public void setUsername (String NOP){
        this.Username=Username;
    }
    public String getUsername(){
        return this.Username;
    }
}
