/*
* Nama File : MBangunDatar.java
* Deskripsi : file implenentasi bangun datar
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 26 Maret 2026
*/
public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi("hitam", "putih", 2);
        Persegi P2 = new Persegi("nova", "hijau", 2);
        BangunDatar L1 = new Lingkaran(null, null, 2);
        Lingkaran L2 = new Lingkaran(null, null, 2);

        System.out.println("Luas P1 == L1? :" + P1.isEqualLuas(L1));
        System.out.println("luas P1 = " + P1.getLuas());
        System.out.println("luas L1 = " + L1.getLuas());
        P2.zoomIn();
        System.out.println("luas P2 yang dizoomin = " + P2.getLuas());
        L2.zoomIn();
        System.out.println("luas L2 yang dizoomin = " + L2.getLuas());
        ((Persegi) P1).zoomIn();
        System.out.println("luas P1 yang dizoomin = " + P1.getLuas());
        System.out.println("sisi baru P1 = " + ((Persegi) P1).getSisi());
    };
}
