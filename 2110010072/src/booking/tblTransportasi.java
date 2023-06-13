/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author user
 */
public class tblTransportasi {
    private int idTrans;
    private String Code;
    private String Deskripsi;
    private String Kursi; 
    private String idTranstype;
    
    public tblTransportasi() {}
    
    public void setidTrans(int idTrans){
        this.idTrans=idTrans;
    }
    public int getidrans(){
        return this.idTrans;
    }
    public void setCode (String Code){
        this.Code=Code;
    }
    public String getCode(){
        return this.Code;
    }
    public void setDeskripsi (String Deskripsi){
        this.Deskripsi=Deskripsi;
    }
    public String getDeskripsi(){
        return this.Deskripsi;
    }
    public void setKursi (String Kursi){
        this.Kursi=Kursi;
    }
    public String getKursi(){
        return this.Kursi;
    }
    public void setidTranstype (String idTranstype){
        this.idTranstype=idTranstype;
    }
    public String getidTranstype (){
        return this.idTranstype ;
    }
}

  
