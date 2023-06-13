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

    private ArrayList<Integer> idRute;
    private ArrayList<String> Berangkat;
    private ArrayList<String> Dari;
    private ArrayList<String> Tujuan;
    private ArrayList<String> Harga;
    private ArrayList<Integer> idTrans;

    public datasetRute() {
        idRute = new ArrayList<Integer>();
        Berangkat = new ArrayList<String>();
        Dari = new ArrayList<String>();
        Tujuan = new ArrayList<String>();
        Harga = new ArrayList<String>();
        idTrans = new ArrayList<Integer>();
    }
      public void insertidRute(int isi){
        this.idRute.add(isi);
    }
    public ArrayList<Integer> getRecordidRute(){
        return this.idRute;
    }
    public void insertBerangkat(String isi){
        this.Berangkat.add(isi);
    }
    public ArrayList<String> getRecordBerangkat(){
        return this.Berangkat;
    }
    public void insertDari(String isi){
        this.Dari.add(isi);
    }
    public ArrayList<String> getRecordDari(){
        return this.Dari;
    }
    public void insertTujuan(String isi){
        this.Tujuan.add(isi);
    }
    public ArrayList<String> getRecordTujuan(){
        return this.Tujuan;
    }
    public void insertHarga(String isi){
        this.Harga.add(isi);
    }
    public ArrayList<String> getRecordHarga(){
        return this.Harga;
    }
    public void insertidTrans(int isi){
        this.idTrans.add(isi);
    }
    public ArrayList<Integer> getRecordidTrans(){
        return this.idTrans;
    }
 
    public void insertRute(int idRute, String Berangkat, String Dari, String Tujuan,
            String Harga, int idTrans ){
        this.idRute.add(idRute);
        this.Berangkat.add(Berangkat);
        this.Dari.add(Dari);
        this.Tujuan.add(Tujuan);
        this.Harga.add(Harga);
        this.idTrans.add(idTrans);
        }

}