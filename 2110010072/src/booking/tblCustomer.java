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
    private int idCustomer;
    private String Nama;
    private String Alamat;
    private String Nmrhp; 
    private String Jeniskelamin;
    private String Username;
    
    public tblCustomer() {}
    
    public void setidCustomer (int idCustomer){
        this.idCustomer=idCustomer;
    }
    public int getidCustomer(){
        return this.idCustomer;
    }
    public void setNama (String Nama){
        this.Nama=Nama;
    }
    public String getNama(){
        return this.Nama;
    }   
    public void setAlamat (String Alamat){
        this.Alamat=Alamat;
    }
    public String getAlamat(){
        return this.Alamat;
    }
    public void setNmrhp (String Nmrhp){
        this.Nmrhp=Nmrhp;
    }
    public String getNmrhp(){
        return this.Nmrhp;
    }
    public void setJeniskelamin (String Jeniskelamin){
        this.Jeniskelamin=Jeniskelamin;
    }
    public String getJeniskelamin(){
        return this.Jeniskelamin;
    }
    public void setUsername (String Username){
        this.Username=Username;
    }
    public String getUsername(){
        return this.Username;
    }
}
