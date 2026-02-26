/* Nama File : Titik.java 
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 26 Februari 2026
 * 
*/

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;

    /* STATIC ATRIBUT */
    static int counterTitik = 0;

    /* METHOD */
    // konstruktor untuk membuat titik (0,0)

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik = counterTitik + 1;
    }

    // method Overload

    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik = counterTitik + 1;
    }

    // mengembalikan nilai absis

    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat

    double getOrdinat() {
        return ordinat;
    }

    // mengembalikan nilai statis penghitung titik
    // harus ditambah "static"

    static int getCounterTitik() {
        return counterTitik;
    }

    // mengubah nilai absis

    void setAbsis(double x) {
        absis = x;
    }

    // mengubah nilai ordinat

    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak absis dan ordinat

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
