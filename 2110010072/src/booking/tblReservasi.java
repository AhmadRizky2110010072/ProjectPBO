/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
public class tblReservasi {
    private int idReserv;
    private String Reservcode;
    private String Reservat;
    private String Reservdate; 
    private String Kursi;
    private String Berangkat;
    private String Harga;
    private int idUser;
    private int idCustomer; 
    private int idRute;
    private String Status;
    
    public tblReservasi() {}
    
    public void setidReserv (int idReserv){
        this.idReserv=idReserv;
    }
    public int getidReserv(){
        return this.idReserv;
    }
    public void setReservcode (String Reservcode){
        this.Reservcode=Reservcode;
    }
     public String getReservcode(){
        return this.Reservcode;
    }
    public void setReservat (String Reservat){
        this.Reservat=Reservat;
    }
    public String getReservat(){
        return this.Reservat;
    }   
    public void setReservdate(String Reservdate){
        this.Reservdate=Reservdate;
    }
    public String getReservdate(){
        return this.Reservdate;
    }
    public void setKursi (String Kursi){
        this.Kursi=Kursi;
    }
    public String getKursi(){
        return this.Kursi;
    }
    public void setBerangkat (String Berangkat){
        this.Berangkat=Berangkat;
    }
    public String getBerangkat(){
        return this.Berangkat;
    }
    public void setHarga (String Harga){
        this.Harga=Harga;
    }
    public String getHarga(){
        return this.Harga;
    }
    public void setidUser(int idUser){
        this.idUser=idUser;
    }
    public int getidUser(){
        return this.idUser;
    }
    public void setidCustomer (int idCustomer){
        this.idCustomer=idCustomer;
    }
    public int getidCustomer(){
        return this.idCustomer;
    }
    public void setidRute (int idRute){
        this.idRute=idRute;
    }
    public int getidRute(){
        return this.idRute;
    }
    public void setStatus (String Status){
        this.Status=Status;
    }
    public String getStatus(){
        return this.Status;
    }
}
