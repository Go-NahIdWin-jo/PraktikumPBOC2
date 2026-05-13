
/* Nama File : Piaraan.java
 * Deskripsi : class piaraan, implementasi koleksi java
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 13 Mei 2026
 *
*/
import java.util.LinkedList;

public class Piaraan {

    // II. KOLEKSI KELAS BENTUKAN

    private int nbelm;
    private final LinkedList<Anabul> lanabul;

    // konstruktor Piaraan()
    public Piaraan() {
        lanabul = new LinkedList<>();
        nbelm = 0;
    }
    //
    // i. getNbelm()

    public int getNbelm() {
        return nbelm;
    }

    // ii. enqueueAnabul(anabul)
    public void enqueueAnabul(Anabul anabul) {
        lanabul.add(anabul);
        nbelm = nbelm + 1;
    }

    // iii. isMember(anabul)
    public boolean isMember(Anabul anabul) {
        return lanabul.contains(anabul);
    }

    // iv. getAnabul()
    public Anabul getAnabul() {
        return lanabul.peekFirst();
    }

    // v. dequeueAnabul(anabul)
    public Anabul dequeueAnabul() {
        Anabul temp = new Anabul(null);
        if (nbelm > 0) {
            temp = lanabul.peekFirst();
            lanabul.removeFirst();
            nbelm = nbelm - 1;
        }
        return temp;
    }

    // c. showAnabul() menampilkan panggilan semua
    public void showAnabul() {
        int i;
        for (i = 0; i < this.getNbelm(); i++) {
            System.out.println(lanabul.get(i).getNama());
        }
    }

    // d. countKucing() mengembalikan jumlah kucing yang ada di antrian
    public int countKucing() {
        int i;
        int count = 0;
        for (i = 0; i < this.getNbelm(); i++) {
            if (lanabul.get(i) instanceof Kucing) {
                count = count + 1;
            }
        }
        return count;
    }

    // e. bobotKucing() mengembalikan jumlah bobot semua kucing
    public double bobotKucing() {
        int i;
        double count = 0;
        for (i = 0; i < this.getNbelm(); i++) {
            if (lanabul.get(i) instanceof Kucing) {
                Kucing c = (Kucing) lanabul.get(i);
                count = count + c.getBobot();
            }
        }
        return count;
    }

    // f. showJenisAnabul menampilkan jenis objek spasi panggilan semua
    public void showJenisAnabul() {
        int i;
        for (i = 0; i < this.getNbelm(); i++) {
            System.out.println(lanabul.get(i).getClass() + " " + lanabul.get(i).getNama());
        }
    }
}
