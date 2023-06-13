/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010072;
import booking.*;
import dataset.*;
import forms.*;


/**
 *
 * @author user
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
       tblAdmin admin = new tblAdmin();
       tblCustomer customer = new tblCustomer();
       tblReservasi reservasi = new tblReservasi();
       tblRute rute = new tblRute();
       tblTransportasi transportasi = new tblTransportasi();
       tblUser user= new tblUser();
        
       //Set
       admin.setUsername("admin");
       admin.setPassword("admin");
       
       customer.setidCustomer(10);
       customer.setNama("Ahmad Rizky");
       customer.setAlamat("Kayu Tangi");
       customer.setNmrhp("082208027181");
       customer.setJeniskelamin("Laki-laki");
       customer.setUsername("Rizky");
       
       //Get
       System.out.println("Username Admin : " + admin.getUsername());
       System.out.println("Password Admin : " + admin.getPassword());
       
       System.out.println("ID Customer : " + customer.getidCustomer());
       System.out.println("Nama Customer : " + customer.getNama());
       System.out.println("Alamat : " + customer.getAlamat());
       System.out.println("Nomor HP: " + customer.getNmrhp());
       System.out.println("Jenis Kelamin: " + customer.getJeniskelamin());
       System.out.println("Username Customer: " + customer.getUsername());
       
       //Memasukkan Array List kedalam Object
       datasetAdmin Admin = new datasetAdmin();
       datasetCustomer Customer = new datasetCustomer();
       datasetReservasi Reservasi = new datasetReservasi();
       datasetRute Rute = new datasetRute();
       datasetTransportasi Transportasi = new datasetTransportasi();
       datasetUser User= new datasetUser();
       
       //Menginput data ArrayList pada masing masing tabel
       Admin.insertUsername("Admin");
       Admin.insertPassword("Admin123");
       Admin.insertAdmin("Admin","Admin123");
       
       Customer.insertidCustomer(10);
       Customer.insertNama("Rizky");
       Customer.insertAlamat("Kayu Tangi");
       Customer.insertNmrhp("085335533553");
       Customer.insertJeniskelamin("Pria");
       Customer.insertUsername("Rizky");
       Customer.insertCustomer(10 ,"Rizky","Kayu Tangi","085335533553",
               "Pria","Rizky");
       
       Reservasi.insertidReserv(02);
       Reservasi.insertReservcode("MK");
       Reservasi.insertReservat("JP");
       Reservasi.insertReservdate("Sembilan"); 
       Reservasi.insertKursi("Belakang");
       Reservasi.insertBerangkat("Satu Juli");
       Reservasi.insertHarga("Lima Juta Rupiah");
       Reservasi.insertidUser(05);
       Reservasi.insertidCustomer(10); 
       Reservasi.insertidRute(3);
       Reservasi.insertStatus("Selesai");
       Reservasi.insertReservasi(02,"MK", "JP", "Sembilan",
               "Belakang", "Satu Juli", "Lima Juta Rupiah", 
               05, 10,3, "Selesai");
      
       Rute.insertidRute(3);
       Rute.insertBerangkat("Pagi");
       Rute.insertDari("Banjarmasin");
       Rute.insertTujuan("Balikpapan"); 
       Rute.insertHarga("Satu Juta");
       Rute.insertidTrans(01);
       Rute.insertRute(3, "Pagi", "Banjarmasin", "Balikpapan", "Satu Juuta", 01);
       
       Transportasi.insertidTrans(1);
       Transportasi.insertCode("Mk");
       Transportasi.insertDeskripsi("Garuda Indonesia Akan Berangkat Pagi Ini");
       Transportasi.insertKursi("Belakang");
       Transportasi.insertBerangkat("Pagi");
       Transportasi.insertidTranstype("Satu");
       Transportasi.insertTransportasi(1, "MK", "Garuda Indonesia Akan Berangkat Pagi ini"
               , "Belakang", "Pagi", "Satu");
       
       User.insertidUser(1);
       User.insertUsername("Bagas");
       User.insertPassword("Bagas123");
       User.insertFullname("Bagas Maulana");
       User.insertUser(1, "Bagas", "Bagas123", "Bagas Maulana");
       
        //Menampilkan data ArrayList
        System.out.println("===============DATA ADMIN==============");
        System.out.println(Admin.getRecordUsername());
        System.out.println(Admin.getRecordPassword());
        
        System.out.println("\t");
        System.out.println("===============DATA CUSTOMER==============");
        System.out.println(Customer.getRecordidCustomer());
        System.out.println(Customer.getRecordNama());
        System.out.println(Customer.getRecordAlamat());
        System.out.println(Customer.getRecordNmrhp());
        System.out.println(Customer.getRecordJeniskelamin());
        System.out.println(Customer.getRecordUsername());
        
        System.out.println("\t");
        System.out.println("===============DATA RESERVASI==============");
        System.out.println(Reservasi.getRecordidReserv());
        System.out.println(Reservasi.getRecordReservcode());
        System.out.println(Reservasi.getRecordReservat());
        System.out.println(Reservasi.getRecordReservdate());
        System.out.println(Reservasi.getRecordKursi());
        System.out.println(Reservasi.getRecordBerangkat());
        System.out.println(Reservasi.getRecordHarga());
        System.out.println(Reservasi.getRecordidUser());
        System.out.println(Reservasi.getRecordidCustomer());
        System.out.println(Reservasi.getRecordidRute());
        System.out.println(Reservasi.getRecordStatus());
                
        System.out.println("\t");
        System.out.println("===============DATA RUTE==============");
        System.out.println(Rute.getRecordidRute());
        System.out.println(Rute.getRecordBerangkat());
        System.out.println(Rute.getRecordDari());
        System.out.println(Rute.getRecordTujuan());
        System.out.println(Rute.getRecordHarga());
        System.out.println(Rute.getRecordidTrans());
        
        System.out.println("\t");
        System.out.println("===============DATA TRANSPORTASI==============");
        System.out.println(Transportasi.getRecordidTrans());
        System.out.println(Transportasi.getRecordCode());
        System.out.println(Transportasi.getRecordDeskripsi());
        System.out.println(Transportasi.getRecordKursi());
        System.out.println(Transportasi.getRecordidTranstype());
        
        System.out.println("\t");
        System.out.println("===============DATA USER==============");
        System.out.println(User.getRecordidUser());
        System.out.println(User.getRecordUsername());
        System.out.println(User.getRecordPassword());
        System.out.println(User.getRecordFullname());
        
        
        new frameUtama().setVisible(true);
    }
}
