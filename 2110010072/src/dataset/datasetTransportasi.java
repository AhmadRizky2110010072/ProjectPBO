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
public class datasetTransportasi {
    
    private ArrayList<Integer> ID_Trans;
    private ArrayList<String> Code;
    private ArrayList<String> Deskripsi; 
    private ArrayList<String> Kursi;
    private ArrayList<String> Berangkat;
    private ArrayList<String> ID_Trans_type;

    public datasetTransportasi() {
        ID_Trans = new ArrayList<Integer>();
        Code = new ArrayList<String>();
        Deskripsi = new ArrayList<String>();
        Kursi = new ArrayList<String>();
        Berangkat = new ArrayList<String>();
        ID_Trans_type = new ArrayList<String>();
    }
    public void insertID_Trans(int isi){
        this.ID_Trans.add(isi);
    }
    public ArrayList<Integer> getRecordID_Trans(){
        return this.ID_Trans;
    }
    public void insertCode(String isi){
        this.Code.add(isi);
    }
    public ArrayList<String> getRecordCode(){
        return this.Code;
    }
    public void insertDeskripsi(String isi){
        this.Deskripsi.add(isi);
    }
    public ArrayList<String> getRecordDeskripsi(){
        return this.Deskripsi;
    }
    public void insertKursi(String isi){
        this.Kursi.add(isi);
    }
    public ArrayList<String> getRecordKursi(){
        return this.Kursi;
    }
    public void insertBerangkat(String isi){
        this.Berangkat.add(isi);
    }
    public ArrayList<String> getRecordBerangkat(){
        return this.Berangkat;
    }
    public void insertId_Trans_type(String isi){
        this.ID_Trans_type.add(isi);
    }
    public ArrayList<String> getRecordID_Trans_type(){
        return this.ID_Trans_type;
    }
    
    public void insertTransportasi(int ID_Trans, String Code, String Deskripsi, String Kursi, 
            String Berangkat, String ID_Trans_type ){
        this.ID_Trans.add(ID_Trans);
        this.Code.add(Code);
        this.Deskripsi.add(Deskripsi);
        this.Kursi.add(Kursi);
        this.Berangkat.add(Berangkat);
        this.ID_Trans_type.add(ID_Trans_type);
        }
    }
