
/* Nama File : Piaraan.java
 * Deskripsi : class piaraan, implementasi koleksi java
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 7 Mei 2026
 *
*/
import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private final LinkedList<Anabul> lanabul;

    // a. konstruktor Piaraan()
    public Piaraan() {
        lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // b. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // c. enqueueAnabul(anabul)
    public void enqueueAnabul(Anabul anabul) {
        lanabul.add(anabul);
        nbelm = nbelm + 1;
    }

    // d. isMember(anabul)
    public boolean isMember(Anabul anabul) {
        return lanabul.contains(anabul);
    }

    // e. getAnabul()
    public Anabul getAnabul() {
        return lanabul.peekFirst();
    }

    // f. dequeueAnabul(anabul)
    public Anabul dequeueAnabul() {
        Anabul temp = new Anabul(null);
        if (nbelm > 0) {
            temp = lanabul.peekFirst();
            lanabul.removeFirst();
            nbelm = nbelm - 1;
        }
        return temp;
    }

    // g. showAnabul() menampilkan panggilan semua
    public void showAnabul() {
        int i;
        for (i = 0; i <= this.getNbelm(); i++) {
            System.out.println(lanabul.indexOf(i));
        }
    }

    // h. countKucing() mengembalikan jumlah kucing yang ada di antrian
    // public int countKucing() {
    // int i;
    // for (i = 0; i <= this.getNbelm(); i++) {
    // // if()
    // }
    // }

    // i. bobotKucing() mengembalikan jumlah bobot semua kucing

    // j. showJenisAnabul menampilkan jenis objek spasi panggilan semua
}
