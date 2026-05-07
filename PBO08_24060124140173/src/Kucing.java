/* Nama File : Kucing.java
 * Deskripsi : class kucing
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 7 Mei 2026
 *
*/
public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama) {
        super(nama);
    }

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // getter
    public double getBobot() {
        return this.bobot;
    }

    // setter
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi meong.");
    }

    public void printBobot() {
        System.out.println(bobot);
    }
}