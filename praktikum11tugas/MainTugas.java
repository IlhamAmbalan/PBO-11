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
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Pengarang: " + namaPengarang);
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
        if (pengarang != null) {
            pengarang.infoPengarang();
        }
    }
}


class Perpustakaan {
    private List<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("===== Daftar Buku di Perpustakaan =====");
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

        Buku b1 = new Buku("Matahari Minor", p1);
        Buku b2 = new Buku("Laskar Pelangi", p2);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);

        perpus.infoPerpustakaan();
    }
}

