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
    
    private ArrayList<Integer> idUser;
    private ArrayList<String> Username;
    private ArrayList<String> Password;
    private ArrayList<String> Fullname;

    public datasetUser() {
        idUser = new ArrayList<Integer>();
        Username = new ArrayList<String>();
        Password = new ArrayList<String>();
        Fullname = new ArrayList<String>();
    }
    public void insertidUser(int isi){
        this.idUser.add(isi);
    }
    public ArrayList<Integer> getRecordidUser(){
        return this.idUser;
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
     public void insertUser(int idUser, String Username, String Password, String Fullname ){
        this.idUser.add(idUser);
        this.Username.add(Username);
        this.Password.add(Password);
        this.Fullname.add(Fullname);
        }
}
