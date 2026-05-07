/* Nama File : KembangTelon.java
 * Deskripsi : class kembang telon
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 7 Mei 2026
 *
*/
public class KembangTelon extends Kucing {
    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(getPanggilan() + " lincah melompat!");
    }

    @Override
    public void Bersuara() {
        System.out.println(getPanggilan() + " berbunyi nyaa");
    }
}
