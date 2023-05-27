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
public class datasetCustomer {
   
    private ArrayList<Integer> ID_Customer;
    private ArrayList<String> Nama;
    private ArrayList<String> Alamat;
    private ArrayList<String> HP;
    private ArrayList<String> JenisKelamin;
    private ArrayList<String> Username;

    public datasetCustomer() {
        ID_Customer = new ArrayList<Integer>();
        Nama = new ArrayList<String>();
        Alamat = new ArrayList<String>();
        HP = new ArrayList<String>();
        JenisKelamin = new ArrayList<String>();
        Username = new ArrayList<String>();
    }
     
    public void insertID_Customer(int isi){
        this.ID_Customer.add(isi);
    }
    public ArrayList<Integer> getRecordID_Customer(){
        return this.ID_Customer;
    }
    
    public void insertNama(String isi){
        this.Nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.Nama;
    }
    
    public void insertAlamat(String isi){
        this.Alamat.add(isi);
    }
    public ArrayList<String> getRecordAlamat(){
        return this.Alamat;
    }
    
    public void insertHp(String isi){
        this.HP.add(isi);
    }
    public ArrayList<String> getRecordHp(){
        return this.HP;
    }
    
    public void insertJenisKelamin(String isi){
        this.JenisKelamin.add(isi);
    }
    public ArrayList<String> getRecordJenisKelamin(){
        return this.JenisKelamin;
    }
    
    public void insertUsername(String isi){
        this.Username.add(isi);
    }
    public ArrayList<String> getRecordUsername(){
        return this.Username;
    }
    
    public void insertCustomer(int ID_Customer, String Nama, String Alamat, String HP, 
            String Jeniskelamin, String Username ){
        this.ID_Customer.add(ID_Customer);
        this.Nama.add(Nama);
        this.Alamat.add(Alamat);
        this.HP.add(HP);
        this.JenisKelamin.add(Jeniskelamin);
        this.Username.add(Username);
    }
}

