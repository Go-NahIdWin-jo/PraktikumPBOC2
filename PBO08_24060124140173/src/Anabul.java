
/* Nama File : Anabul.java
 * Deskripsi : class anabul
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
public class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void Gerak() {
        System.out.println(this.nama + " bergerak...");
    }

    public void Bersuara() {
        System.out.println(this.nama + " bersuara...");
    }
}