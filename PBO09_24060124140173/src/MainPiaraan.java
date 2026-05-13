/* Nama File : MainPiaraan.java
 * Deskripsi : aplikasi class piaraan
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 13 Mei 2026
 *
*/
public class MainPiaraan {
    public static void main(String[] args) {
        // I. KOLEKSI KELAS DASAR

        // II. KOLEKSI KELAS BENTUKAN
        // kamus
        Piaraan tesPiaraan;

        // algoritma
        tesPiaraan = new Piaraan();

        System.out.println("\nselamat datang\n");
        // i. getNbelm()
        System.out.println("tesPiaraan.getNbelm() -> " + tesPiaraan.getNbelm());

        // ii. enqueueAnabul(anabul)
        System.out.println("tesPiaraan.enqueueAnabul(new Anabul(\"Conquest\"))");
        tesPiaraan.enqueueAnabul(new Anabul("Conquest"));
        System.out.println("tesPiaraan.enqueueAnabul(new Anabul(\"Mahito\"))");
        tesPiaraan.enqueueAnabul(new Anabul("Mahito"));
        System.out.println("tesPiaraan.getNbelm() -> " + tesPiaraan.getNbelm());

        // iii. isMember(anabul)
        Anabul Griffith = new Anabul("Griffith");
        System.out.println("tesPiaraan.isMember(Griffith) -> " + tesPiaraan.isMember(Griffith));

        // iv. getAnabul()
        System.out.println("tesPiaraan.getAnabul().getNama() -> " + tesPiaraan.getAnabul().getNama());

        // v. dequeueAnabul(anabul)
        System.out.println("tesPiaraan.getNbelm() -> " + tesPiaraan.getNbelm());
        Anabul keluaran = tesPiaraan.dequeueAnabul();
        System.out.println("Anabul keluaran = tesPiaraan.dequeueAnabul()");

        System.out.println("keluaran.getNama() -> " + keluaran.getNama());
        System.out.println("tesPiaraan.getNbelm() -> " + tesPiaraan.getNbelm());

        // c. showAnabul()
        System.out.println("tesPiaraan.showAnabul()");
        tesPiaraan.showAnabul();

        // d. countKucing()
        Kucing neko = new Kucing("neko", 5.0);
        Anjing guguk = new Anjing("guguk");
        Anggora kuroneko = new Anggora("kuroneko", 3.0);
        tesPiaraan.enqueueAnabul(kuroneko);
        tesPiaraan.enqueueAnabul(neko);
        tesPiaraan.enqueueAnabul(guguk);
        System.out.println("tesPiaraan.enqueueAnabul(kuroneko);\r\n" + //
                "tesPiaraan.enqueueAnabul(neko);\r\n" + //
                "tesPiaraan.enqueueAnabul(guguk);");
        System.out.println("tesPiaraan.countKucing -> " + tesPiaraan.countKucing());

        // e. bobotKucing()
        System.out.println("tesPiaraan.bobotKucing() -> " + tesPiaraan.bobotKucing());

        // f. showJenisAnabul()
        System.out.println("tesPiaraan.showJenisAnabul()");
        tesPiaraan.showJenisAnabul();

    }
}
