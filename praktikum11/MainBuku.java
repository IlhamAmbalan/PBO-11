/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum11;

/**
 *
 * @author Asus
 */
import java.util.List;
import java.util.ArrayList;

class Buku {
    private String judul;
    
    public Buku(String judul) {
        this.judul = judul;
    }
    
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}

class Perpustakaan {
    private List<Buku> bukuList;
    
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
    
    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}

public class MainBuku {
    public static void main(String[] args) {

        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Bumi");
        Buku buku2 = new Buku("Bulan");
        Buku buku3 = new Buku("Matahari");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.infoPerpustakaan();
    }
}
