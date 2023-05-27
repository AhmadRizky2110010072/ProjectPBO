/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class datasetUser {
    
    private ArrayList<Integer> ID_User;
    private ArrayList<String> Username;
    private ArrayList<String> Password;
    private ArrayList<String> Fullname;

    public datasetUser() {
        ID_User = new ArrayList<Integer>();
        Username = new ArrayList<String>();
        Password = new ArrayList<String>();
        Fullname = new ArrayList<String>();
    }
    public void insertID_User(int isi){
        this.ID_User.add(isi);
    }
    public ArrayList<Integer> getRecordID_User(){
        return this.ID_User;
    }
    public void insertUsername(String isi){
        this.Username.add(isi);
    }
    public ArrayList<String> getRecordUsername(){
        return this.Username;
    }
    public void insertPassword(String isi){
        this.Password.add(isi);
    }
    public ArrayList<String> getRecordPassword(){
        return this.Password;
    }
    public void insertFullname(String isi){
        this.Fullname.add(isi);
    }
    public ArrayList<String> getRecordFullname(){
        return this.Fullname;
    }
    
     public void insertUser(int ID_User, String Username, String Password, String Fullname ){
        this.ID_User.add(ID_User);
        this.Username.add(Username);
        this.Password.add(Password);
        this.Fullname.add(Fullname);
        }
}
