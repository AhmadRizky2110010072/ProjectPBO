/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
public class tblRute {
    private int idRute;
    private String Berangkat;
    private String Dari;
    private String Tujuan; 
    private String Harga;
    private int idTrans;
    
    public tblRute() {}
    
    public void setidRute (int idRute){
        this.idRute=idRute;
    }
    public int getidute(){
        return this.idRute;
    }
    public void setBerangkat (String Berangkat){
        this.Berangkat=Berangkat;
    }
    public String getBerangkat(){
        return this.Berangkat;
    }
    public void setDari (String Dari){
        this.Dari=Dari;
    }
    public String getDari(){
        return this.Dari;
    }
    public void setTujuan (String Tujuan){
        this.Tujuan=Tujuan;
    }
    public String getTujuan(){
        return this.Tujuan;
    }
    public void setHarga (String Harga){
        this.Harga=Harga;
    }
    public String getHarga(){
        return this.Harga;
    }
    public void setidTrans(int idTrans){
        this.idTrans=idTrans;
    }
    public int getidTrans(){
        return this.idTrans;
    }
}
