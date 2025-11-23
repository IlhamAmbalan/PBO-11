/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Asus
 */
import java.util.List;
import java.util.ArrayList;

class Anggota {
    private String nama;
    
    public Anggota(String nama) {
        this.nama = nama;
    }
    
    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}

class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;
    
    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }
    
    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }
    
    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}


public class MainKlub {
    public static void main(String[] args) {
        
        Klub klub = new Klub("Klub Pemrograman Java");
        
        Anggota a1 = new Anggota("Nopal Jarkom");
        Anggota a2 = new Anggota("Pedrong Big Data");
        Anggota a3 = new Anggota("Tio Cipunk");
        
        klub.tambahAnggota(a1);
        klub.tambahAnggota(a2);
        klub.tambahAnggota(a3);
        
        klub.infoKlub();
    }
}
