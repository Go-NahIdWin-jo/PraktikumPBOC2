
/* Nama File : Data.java
 * Deskripsi : class data
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
import java.util.Arrays;

public class Data<T> {
    private static final int KAPASITAS = 100;
    private final T[] ruang;
    private int banyak;

    public Data(T[] contohRuang) {
        this.ruang = Arrays.copyOf(contohRuang, KAPASITAS);
        this.banyak = 0;
    }

    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T objek) {
        if (ruang[posisi] == null) {
            banyak = banyak + 1;
        }
        ruang[posisi - 1] = objek;
    }

    public int getSize() {
        return banyak;
    }
}
