/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11tugas;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.List;


class Pengarang {
    private String nama;

    public Pengarang(String nama) {
        this.nama = nama;
    }

    public void infoPengarang() {
        System.out.println("Pengarang: " + nama);
    }
}

class Buku {
    private String judul;
    private Pengarang pengarang; 

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("\nJudul Buku : " + judul);
        pengarang.infoPengarang();
    }
}


class Perpustakaan {
    private List<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul, Pengarang pengarang) {
        Buku bukuBaru = new Buku(judul, pengarang); 
        daftarBuku.add(bukuBaru);
    }

    public void infoPerpustakaan() {
        System.out.println("\nDaftar Buku di Perpustakaan:");
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }
}


public class MainTugas {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        Pengarang p1 = new Pengarang("Tere Liye");
        Pengarang p2 = new Pengarang("Andrea Hirata");

        perpus.tambahBuku("Bumi", p1);
        perpus.tambahBuku("Laskar Pelangi", p2);

        perpus.infoPerpustakaan();
    }
}
