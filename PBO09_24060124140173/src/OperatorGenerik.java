/* Nama File : OperatorGenerik.java
 * Deskripsi : class operator generik
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 7 Mei 2026
 *
*/
public class OperatorGenerik {

    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T kucingA, T kucingB) {
        return kucingA.getBobot() + kucingB.getBobot();
    }
}
