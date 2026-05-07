
/* Nama File : Teman.java
 * Deskripsi : class teman, implementsi ArrayList java
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 7 Mei 2026
 *
*/
import java.util.ArrayList;

public class Teman {
    private int nbelm;

    private ArrayList<String> Lnama;

    // konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getnbelm()
    public int getnbelm() {
        return nbelm;
    }

    // b. getNama(indeks)
    public String getNama (int indeks){

    // c. setNama(indeks,nama)
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // d. addNama(nama) 

     

    }

}
