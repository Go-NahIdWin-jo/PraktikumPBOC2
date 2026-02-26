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

    // Titik() {
    // absis = 0;
    // ordinat = 0;
    // counterTitik = counterTitik + 1;
    // }

    // saat ada overload, bisa buat "this", this ini memanggil dirinya yang lain.
    // memanggil dirinya yang overload? atau ada definisi lain? karena bergantung
    // dari parameter...

    Titik() {
        this(0, 0);
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

    // mencetak counter titik (dengan this)

    static void printCounterTitik() {
        System.out.print(Titik.counterTitik);
    }

    // mengembalikan kuadran dari titik

    int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else {
            if (getAbsis() > 0 && getOrdinat() < 0) {
                return 2;
            } else {
                if (getAbsis() < 0 && getOrdinat() < 0) {
                    return 3;
                } else {
                    if (getAbsis() < 0 && getOrdinat() > 0) {
                        return 4;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }

    // set refleksi X

    void refleksiX() {
        ordinat = -getOrdinat();
    }
    // set refleksi Y

    // mengembalikan Titik refleksi X

    Titik getRefleksiX() {
        return new Titik(getAbsis(), -getOrdinat());
    }
    // mengembalikan Titik refleksi Y

    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}
