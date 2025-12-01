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
    
    public void tambahBuku(String judul) {
        bukuList.add(new Buku(judul));
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

        perpustakaan.tambahBuku("Bumi");
        perpustakaan.tambahBuku("Bulan");
        perpustakaan.tambahBuku("Matahari");

        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.infoPerpustakaan();
    }
}
