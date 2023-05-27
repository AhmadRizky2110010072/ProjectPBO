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
public class datasetRute {

    private ArrayList<Integer> ID_Rute;
    private ArrayList<String> Berangkat;
    private ArrayList<String> Rute_from;
    private ArrayList<String> Rute_to;
    private ArrayList<String> Harga;
    private ArrayList<String> ID_Trans;

    public datasetRute() {
        ID_Rute = new ArrayList<Integer>();
        Berangkat = new ArrayList<String>();
        Rute_from = new ArrayList<String>();
        Rute_to = new ArrayList<String>();
        Harga = new ArrayList<String>();
        ID_Trans = new ArrayList<String>();
    }
      public void insertID_Rute(int isi){
        this.ID_Rute.add(isi);
    }
    public ArrayList<Integer> getRecordID_Rute(){
        return this.ID_Rute;
    }
    public void insertBerangkat(String isi){
        this.Berangkat.add(isi);
    }
    public ArrayList<String> getRecordBerangkat(){
        return this.Berangkat;
    }
    public void insertRute_from(String isi){
        this.Rute_from.add(isi);
    }
    public ArrayList<String> getRecordRute_from(){
        return this.Rute_from;
    }
    public void insertRute_to(String isi){
        this.Rute_to.add(isi);
    }
    public ArrayList<String> getRecordRute_to(){
        return this.Rute_to;
    }
    public void insertHarga(String isi){
        this.Harga.add(isi);
    }
    public ArrayList<String> getRecordHarga(){
        return this.Harga;
    }
    public void insertID_Trans(String isi){
        this.ID_Trans.add(isi);
    }
    public ArrayList<String> getRecordID_Trans(){
        return this.ID_Trans;
    }
 
    public void insertRute(int ID_Rute, String Berangkat, String Rute_from, String Rute_to,
            String Harga, String ID_Trans ){
        this.ID_Rute.add(ID_Rute);
        this.Berangkat.add(Berangkat);
        this.Rute_from.add(Rute_from);
        this.Rute_to.add(Rute_to);
        this.Harga.add(Harga);
        this.ID_Trans.add(ID_Trans);
        }
}