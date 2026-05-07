/*
* Nama File : AngkaSial.java
* Deskripsi : program penggunaan exeption
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 26 Maret 2026
*/
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 67) {
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(65);
            as.cobaAngka(66);
            // as.cobaAngka(67);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println();
        }
    }
}
