
/* Nama File : Anabul.java
 * Deskripsi : class anabul
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 13 Mei 2026
 *
*/
public class Anabul {
    private String panggilan;

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getNama() {
        return this.panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public void Gerak() {
        System.out.println(this.panggilan + " bergerak...");
    }

    public void Bersuara() {
        System.out.println(this.panggilan + " bersuara...");
    }

}