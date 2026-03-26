/*
* Nama File : BangunDatar.java
* Deskripsi : file class BangunDatar, parent
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 26 Maret 2026
*/

//mau coba final
public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // konstruktor

    public BangunDatar() {
        // this(0, "", ""); cuma model? objek tidk bisa dibuat? polymotphism itu apa
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // static method, tidak boleh di override. nanti method hiding

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }

    // setter

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // getter

    public String getBorder() {
        return border;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    // abstract class test, hubungan pewarisan, subclass dipaksa

    public abstract double getLuas();

    public abstract double getKeliling();

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna " + warna);
        System.out.println("Border " + border);
    }

    // baru
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

}
