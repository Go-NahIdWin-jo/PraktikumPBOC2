/*
* Nama File : Lingkaran.java
* Deskripsi : file class lingkaran
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 12 Maret 2026
*/
public class Lingkaran extends BangunDatar {
    private double jari;

    // konstruktor
    Lingkaran() {
        setJmlSisi(0);
    }

    Lingkaran(String warna, String border, double jari) {
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    // setter

    public void setJari(double jari) {
        this.jari = jari;
    }

    // getter

    public double getJari() {
        return jari;
    }

    // operasi

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return Math.PI * 2 * jari;
    }
}
