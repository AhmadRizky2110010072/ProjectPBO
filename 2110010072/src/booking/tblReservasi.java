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
    private int ID_Reserv;
    private String Reserv_code;
    private String Reserv_at;
    private String Reserv_date; 
    private String Kursi;
    private String Berangkat;
    private String Harga;
    private String ID_User;
    private String ID_Customer; 
    private String ID_Rute;
    private String Status;
    
    public tblReservasi() {}
    
    public void setID_Reserv (String NOP){
        this.ID_Reserv=ID_Reserv;
    }
    public int getID_Reserv(){
        return this.ID_Reserv;
    }
    public void setReserv_code (String NOP){
        this.Reserv_code=Reserv_code;
    }
    public String getReserv_at(){
        return this.Reserv_at;
    }   
    public void setReserv_date(String NOP){
        this.Reserv_date=Reserv_date;
    }
    public String getReserv_date(){
        return this.Reserv_date;
    }
    public void setKursi (String NOP){
        this.Kursi=Kursi;
    }
    public String getKursi(){
        return this.Kursi;
    }
    public void setBerangkat (String NOP){
        this.Berangkat=Berangkat;
    }
    public String getBerangkat(){
        return this.Berangkat;
    }
    public void setHarga (String NOP){
        this.Harga=Harga;
    }
    public String getHarga(){
        return this.Harga;
    }
    public void setID_User(String NOP){
        this.ID_User=ID_User;
    }
    public String getID_User(){
        return this.ID_User;
    }
    public void setID_Customer (String NOP){
        this.ID_Customer=ID_Customer;
    }
    public String getID_Customer(){
        return this.ID_Customer;
    }
    public void setID_Rute (String NOP){
        this.ID_Rute=ID_Rute;
    }
    public String getID_Rute(){
        return this.ID_Rute;
    }
    public void setStatus (String NOP){
        this.Status=Status;
    }
    public String getStatus(){
        return this.Status;
    }
}
