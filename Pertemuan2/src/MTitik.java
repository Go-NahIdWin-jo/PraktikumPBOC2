/* Nama File : MTitik.java 
 * Deskripsi : file main titik berisi realisasi
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 26 Februari 2026
 * 
*/

public class MTitik {
	public static void main(String[] args) {
		Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
		System.out.println("Hello");
		System.out.println(T1.absis);
		System.out.println(T1.getAbsis());
		System.out.println(T1.getOrdinat());
		T1.setAbsis(6);
		System.out.println(T1.getAbsis());
		T1.setOrdinat(7);
		System.out.println(T1.getOrdinat());
		T1.geser(1, 1);
		System.out.println(T1.getAbsis());
		System.out.println(T1.getOrdinat());
		T1.printTitik();

		Titik T2 = T1;
		T2.printTitik();
		T1.setAbsis(3);
		T1.setOrdinat(4);
		T2.printTitik();

		// overload, lihat parameter
		Titik T3 = new Titik(8, 9);
		System.out.println("\noverload\n");
		T3.printTitik();
		System.out.println("current jumlah titik : " + Titik.getCounterTitik()); // kepemilikan kelas

		// this

	}
}
