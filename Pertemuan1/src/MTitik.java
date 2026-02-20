/* Nama File : MTitik.java 
 * Deskripsi : file main titik berisi realisasi
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 19 Februari 2026
 * 
*/

/* git checkout -b Pertemuan1  bikin branch baru */
/* git branch cek yang udah ada */
/* git checkout Pertemuan1 pindah */

/* javac -d bin src/*.java */
/* java -cp bin MTitik */

/* git add . */
/* git commit -m "n" */

/*checkoyt dulu, absitu push all *

/* git push -u origin main */
/* git push --all origin */
/* git merge Pertemuan1 (bisa merge conflict)*/

/* jangan pernah ubah main ? */

public class MTitik {
	public static void main(String[] args) {
		Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
		System.out.println("Hello");
		System.out.println(T1.absis);
		System.out.println(T1.getAbsis());
		System.out.println(T1.getOrdinat());		
	}
}
