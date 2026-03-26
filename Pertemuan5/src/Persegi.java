/*
* Nama File : Persegi.java
* Deskripsi : file class Persegi
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 26 Maret 2026
*/
public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(String warna, String border, double sisi) {
        super(4, warna, border);
        // setWarna(warna);
        // setBorder(border);
        this.sisi = sisi;
        // setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // operasi

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return sisi * 4;
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    // Iresize mewajibkan class ini untuk mengimpelementasikan Iresize
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }
}
