/* Nama File : Anjing.java
 * Deskripsi : class anjing
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getPanggilan() + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getPanggilan() + " berbunyi guk-guk.");
    }
}