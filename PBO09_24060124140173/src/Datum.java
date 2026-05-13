/* Nama File : Datum.java
 * Deskripsi : class datum
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
//datum bagaai mangkok/wadah
public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    public static void tampilkanAnabul(Anabul anabul) {
        anabul.Gerak();
        anabul.Bersuara();

        if (anabul instanceof Kucing) {
            ((Kucing) anabul).printBobot();
        }
    }
}
