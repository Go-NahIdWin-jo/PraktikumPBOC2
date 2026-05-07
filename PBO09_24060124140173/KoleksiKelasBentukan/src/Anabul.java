
/* Nama File : Anabul.java
 * Deskripsi : class anabul
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
public class Anabul {
    private String panggilan; // anggap panggilan

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getPanggilan() {
        return this.panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    public void Gerak() {
        System.out.println(this.panggilan + " bergerak...");
    }

    public void Bersuara() {
        System.out.println(this.panggilan + " bersuara...");
    }
}