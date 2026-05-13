/* Nama File : Burung.java
 * Deskripsi : class burung
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
public class Burung extends Anabul {
    public Burung(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi cuit.");
    }
}