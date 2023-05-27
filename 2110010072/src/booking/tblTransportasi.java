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
    private int ID_Trans;
    private String Code;
    private String Deskripsi;
    private String Kursi; 
    private String ID_Trans_type;
    
    public tblTransportasi() {}
    
    public void setID_Trans(String NOP){
        this.ID_Trans=ID_Trans;
    }
    public int getID_Trans(){
        return this.ID_Trans;
    }
    public void setCode (String NOP){
        this.Code=Code;
    }
    public String getCode(){
        return this.Code;
    }
    public void setDeskripsi (String NOP){
        this.Deskripsi=Deskripsi;
    }
    public String getDeskripsi(){
        return this.Deskripsi;
    }
    public void setKursi (String NOP){
        this.Kursi=Kursi;
    }
    public String getKursi(){
        return this.Kursi;
    }
    public void setID_Trans_type (String NOP){
        this.ID_Trans_type=ID_Trans_type;
    }
    public String getID_Trans_type (){
        return this.ID_Trans_type ;
    }
}

  
