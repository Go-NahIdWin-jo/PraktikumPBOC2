
/* Nama File : Teman.java
 * Deskripsi : class teman, implementsi ArrayList java
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 13 Mei 2026
 *
*/
import java.util.ArrayList;

public class Teman {
    // atribut
    private int nbelm;
    private ArrayList<String> Lnama;

    // konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama(indeks)
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // c. setNama(indeks,nama)
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // d. addNama(nama)
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = nbelm + 1;
    }

    // e. delNama(nama)

    public void delNama(String nama) {
        Lnama.remove(nama);
        if (nbelm > 0) {
            nbelm = nbelm - 1;
        }
    }

    // f. isMember(nama)

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama,namabaru)
    public void gantiNama(String nama, String namabaru) {
        int i;
        for (i = 0; i < this.nbelm; i++) {
            if (nama == Lnama.get(i)) {
                setNama(i, namabaru);
            }
        }
    }

    // e. countNama(nama)
    public int countNama(String nama) {
        int i;
        int count = 0;
        for (i = 0; i < this.nbelm; i++) {
            if (nama == Lnama.get(i)) {
                count = count + 1;
            }
        }
        return count;
    }
}