/*
* Nama File : MBangunDatar.java
* Deskripsi : file implenentasi bangun datar
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 12 Maret 2026
*/
public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Persegi Persegi1;
        Lingkaran Lingkaran1;
        Persegi1 = new Persegi();
        Lingkaran1 = new Lingkaran("merah", "hitam", 7.0);
        System.out.println(Persegi1.getJmlSisi());
        System.out.println(Lingkaran1.getLuas());
    }
}
