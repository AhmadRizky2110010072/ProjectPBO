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
    
    private ArrayList<Integer> ID_Reserv;
    private ArrayList<String> Reserv_code;
    private ArrayList<String> Reserv_at;
    private ArrayList<String> Reserv_date; 
    private ArrayList<String> Kursi;
    private ArrayList<String> Berangkat;
    private ArrayList<String> Harga;
    private ArrayList<Integer> ID_User;
    private ArrayList<Integer> ID_Customer; 
    private ArrayList<Integer> ID_Rute;
    private ArrayList<String> Status;

    public datasetReservasi() {
        ID_Reserv = new ArrayList<Integer>();
        Reserv_code = new ArrayList<String>();
        Reserv_at = new ArrayList<String>();
        Reserv_date = new ArrayList<String>();
        Kursi = new ArrayList<String>();
        Berangkat = new ArrayList<String>();
        Harga = new ArrayList<String>();
        ID_User = new ArrayList<Integer>();
        ID_Customer = new ArrayList<Integer>();
        ID_Rute = new ArrayList<Integer>();
        Status = new ArrayList<String>();
    }
    
    public void insertID_Reserv(int isi){
        this.ID_Reserv.add(isi);
    }
    public ArrayList<Integer> getRecordID_Reserv(){
        return this.ID_Reserv;
    }
    public void insertReserv_code(String isi){
        this.Reserv_code.add(isi);
    }
    public ArrayList<String> getRecordReserv_code(){
        return this.Reserv_code;
    }
    public void insertReserv_at(String isi){
        this.Reserv_at.add(isi);
    }
    public ArrayList<String> getRecordReserv_at(){
        return this.Reserv_at;
    }
    public void insertReserv_date(String isi){
        this.Reserv_date.add(isi);
    }
    public ArrayList<String> getRecordReserv_date(){
        return this.Reserv_date;
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
    public void insertID_User(int isi){
        this.ID_User.add(isi);
    }
    public ArrayList<Integer> getRecordID_User(){
        return this.ID_User;
    }
    public void insertID_Customer(int isi){
        this.ID_Customer.add(isi);
    }
    public ArrayList<Integer> getRecordID_Customer(){
        return this.ID_Customer;
    }
    public void insertID_Rute(int isi){
        this.ID_Rute.add(isi);
    }
    public ArrayList<Integer> getRecordID_Rute(){
        return this.ID_Rute;
    }
    public void insertStatus(String isi){
        this.Status.add(isi);
    }
    public ArrayList<String> getRecordStatus(){
        return this.Status;
    }
    
    public void insertReservasi(int ID_Reserv, String Reserv_code, String Reserv_at, String Reserv_date, 
            String Kursi, String Berangkat, String Harga, int ID_User, int ID_Customer, int ID_Rute, String Status ){
        this.ID_Reserv.add(ID_Reserv);
        this.Reserv_code.add(Reserv_code);
        this.Reserv_at.add(Reserv_at);
        this.Reserv_date.add(Reserv_date);
        this.Kursi.add(Kursi);
        this.Berangkat.add(Berangkat);
        this.Harga.add(Harga);
        this.ID_User.add(ID_User);
        this.ID_Customer.add(ID_Customer);
        this.ID_Rute.add(ID_Rute);
        this.Status.add(Status);
        }
    }
