/*
* Nama File : Persegi.java
* Deskripsi : file class Persegi
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 12 Maret 2026
*/
public class Persegi extends BangunDatar {
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
}
