/*
* Nama File : Lingkaran.java
* Deskripsi : file class lingkaran
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 26 Maret 2026
*/
public class Lingkaran extends BangunDatar implements IResize {
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

    // Iresize mewajibkan class ini untuk mengimpelementasikan Iresize
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}
