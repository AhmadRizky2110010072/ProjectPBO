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
   
    private ArrayList<Integer> idCustomer;
    private ArrayList<String> Nama;
    private ArrayList<String> Alamat;
    private ArrayList<String> Nmrhp;
    private ArrayList<String> Jeniskelamin;
    private ArrayList<String> Username;

    public datasetCustomer() {
        idCustomer = new ArrayList<Integer>();
        Nama = new ArrayList<String>();
        Alamat = new ArrayList<String>();
        Nmrhp = new ArrayList<String>();
        Jeniskelamin = new ArrayList<String>();
        Username = new ArrayList<String>();
    }
     
    public void insertidCustomer(int isi){
        this.idCustomer.add(isi);
    }
    public ArrayList<Integer> getRecordidCustomer(){
        return this.idCustomer;
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
    
    public void insertNmrhp(String isi){
        this.Nmrhp.add(isi);
    }
    public ArrayList<String> getRecordNmrhp(){
        return this.Nmrhp;
    }
    
    public void insertJeniskelamin(String isi){
        this.Jeniskelamin.add(isi);
    }
    public ArrayList<String> getRecordJeniskelamin(){
        return this.Jeniskelamin;
    }
    
    public void insertUsername(String isi){
        this.Username.add(isi);
    }
    public ArrayList<String> getRecordUsername(){
        return this.Username;
    }
    
    public void insertCustomer(int idCustomer, String Nama, String Alamat, String Nmrhp, 
            String Jeniskelamin, String Username ){
        this.idCustomer.add(idCustomer);
        this.Nama.add(Nama);
        this.Alamat.add(Alamat);
        this.Nmrhp.add(Nmrhp);
        this.Jeniskelamin.add(Jeniskelamin);
        this.Username.add(Username);
    }
}

