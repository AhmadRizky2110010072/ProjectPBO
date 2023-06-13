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
public class datasetReservasi {
    
    private ArrayList<Integer> idReserv;
    private ArrayList<String> Reservcode;
    private ArrayList<String> Reservat;
    private ArrayList<String> Reservdate; 
    private ArrayList<String> Kursi;
    private ArrayList<String> Berangkat;
    private ArrayList<String> Harga;
    private ArrayList<Integer> idUser;
    private ArrayList<Integer> idCustomer; 
    private ArrayList<Integer> idRute;
    private ArrayList<String> Status;

    public datasetReservasi() {
        idReserv = new ArrayList<Integer>();
        Reservcode = new ArrayList<String>();
        Reservat = new ArrayList<String>();
        Reservdate = new ArrayList<String>();
        Kursi = new ArrayList<String>();
        Berangkat = new ArrayList<String>();
        Harga = new ArrayList<String>();
        idUser = new ArrayList<Integer>();
        idCustomer = new ArrayList<Integer>();
        idRute = new ArrayList<Integer>();
        Status = new ArrayList<String>();
    }
    
    public void insertidReserv(int isi){
        this.idReserv.add(isi);
    }
    public ArrayList<Integer> getRecordidReserv(){
        return this.idReserv;
    }
    public void insertReservcode(String isi){
        this.Reservcode.add(isi);
    }
    public ArrayList<String> getRecordReservcode(){
        return this.Reservcode;
    }
    public void insertReservat(String isi){
        this.Reservat.add(isi);
    }
    public ArrayList<String> getRecordReservat(){
        return this.Reservat;
    }
    public void insertReservdate(String isi){
        this.Reservdate.add(isi);
    }
    public ArrayList<String> getRecordReservdate(){
        return this.Reservdate;
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
    public void insertHarga(String isi){
        this.Harga.add(isi);
    }
    public ArrayList<String> getRecordHarga(){
        return this.Harga;
    }
    public void insertidUser(int isi){
        this.idUser.add(isi);
    }
    public ArrayList<Integer> getRecordidUser(){
        return this.idUser;
    }
    public void insertidCustomer(int isi){
        this.idCustomer.add(isi);
    }
    public ArrayList<Integer> getRecordidCustomer(){
        return this.idCustomer;
    }
    public void insertidRute(int isi){
        this.idRute.add(isi);
    }
    public ArrayList<Integer> getRecordidRute(){
        return this.idRute;
    }
    public void insertStatus(String isi){
        this.Status.add(isi);
    }
    public ArrayList<String> getRecordStatus(){
        return this.Status;
    }
    
    public void insertReservasi(int idReserv, String Reservcode, String Reservat, String Reservdate, 
            String Kursi, String Berangkat, String Harga, int idUser, int idCustomer, int idRute, String Status ){
        this.idReserv.add(idReserv);
        this.Reservcode.add(Reservcode);
        this.Reservat.add(Reservat);
        this.Reservdate.add(Reservdate);
        this.Kursi.add(Kursi);
        this.Berangkat.add(Berangkat);
        this.Harga.add(Harga);
        this.idUser.add(idUser);
        this.idCustomer.add(idCustomer);
        this.idRute.add(idRute);
        this.Status.add(Status);
        }
}
