/* Nama File : Anjing.java
 * Deskripsi : class anjing
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 30 April 2026
 *
*/
public class Anjing extends Anabul {

    public Anjing(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi guk-guk.");
    }
}