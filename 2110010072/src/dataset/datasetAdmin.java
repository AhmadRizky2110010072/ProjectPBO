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
public class datasetAdmin {
   
    private ArrayList<String> Username;
    private ArrayList<String> Password;
    
    public datasetAdmin() {
        Username = new ArrayList<String>();
        Password = new ArrayList<String>();
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
    
    public void insertAdmin(String Username, String Password) {
        this.Username.add(Username);
        this.Password.add(Password);
    }
}
