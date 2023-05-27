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
    private int ID_Rute;
    private String Berangkat;
    private String Rute_from;
    private String Rute_to; 
    private String Harga;
    private String ID_Trans;
    
    public tblRute() {}
    
    public void setID_Rute (String NOP){
        this.ID_Rute=ID_Rute;
    }
    public int getID_Rute(){
        return this.ID_Rute;
    }
    public void setBerangkat (String NOP){
        this.Berangkat=Berangkat;
    }
    public String getBerangkat(){
        return this.Berangkat;
    }
    public void setRute_from (String NOP){
        this.Rute_from=Rute_from;
    }
    public String getRute_from(){
        return this.Rute_from;
    }
    public void setRute_to (String NOP){
        this.Rute_to=Rute_to;
    }
    public String getRute_to(){
        return this.Rute_to;
    }
    public void setHarga (String NOP){
        this.Harga=Harga;
    }
    public String getHarga(){
        return this.Harga;
    }
    public void setID_Trans(String NOP){
        this.ID_Trans=ID_Trans;
    }
    public String getID_Trans(){
        return this.ID_Trans;
    }
}
