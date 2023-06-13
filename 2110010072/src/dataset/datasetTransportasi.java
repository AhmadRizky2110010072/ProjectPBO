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
    
    private ArrayList<Integer> idTrans;
    private ArrayList<String> Code;
    private ArrayList<String> Deskripsi; 
    private ArrayList<String> Kursi;
    private ArrayList<String> Berangkat;
    private ArrayList<String> idTranstype;

    public datasetTransportasi() {
        idTrans = new ArrayList<Integer>();
        Code = new ArrayList<String>();
        Deskripsi = new ArrayList<String>();
        Kursi = new ArrayList<String>();
        Berangkat = new ArrayList<String>();
        idTranstype = new ArrayList<String>();
    }
    public void insertidTrans(int isi){
        this.idTrans.add(isi);
    }
    public ArrayList<Integer> getRecordidTrans(){
        return this.idTrans;
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
    public void insertidTranstype(String isi){
        this.idTranstype.add(isi);
    }
    public ArrayList<String> getRecordidTranstype(){
        return this.idTranstype;
    }
    
    public void insertTransportasi(int idTrans, String Code, String Deskripsi, String Kursi, 
            String Berangkat, String idTranstype ){
        this.idTrans.add(idTrans);
        this.Code.add(Code);
        this.Deskripsi.add(Deskripsi);
        this.Kursi.add(Kursi);
        this.Berangkat.add(Berangkat);
        this.idTranstype.add(idTranstype);
        }
    }
