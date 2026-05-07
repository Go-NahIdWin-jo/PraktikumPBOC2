/* Nama File : Burung.java
 * Deskripsi : class burung
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getPanggilan() + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getPanggilan() + " berbunyi cuit.");
    }
}