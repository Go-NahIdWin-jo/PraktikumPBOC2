/*
 * Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 26 Februari 2026
 * 
 */

public class Garis {
    // variables
    Titik awal;
    Titik akhir;
    static int counterGaris;

    // methods
    // konstruktor
    Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris = counterGaris + 1;
    }

    // selektor
    Titik getAwal() {
        return awal;
    }

    Titik getAkhir() {
        return akhir;
    }

    int getCounterGaris() {
        return counterGaris;
    }
    // mutator

    void setAwal(Titik awal) {
        this.awal = awal;
    }

    void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    // lainnya
    // dapatkan panjang garis
    double getPanjangGaris() {
        return getAwal().getJarak(getAkhir());
    }

    // selekto gradien
    double getGradien() {
        return (getAkhir().getOrdinat() - getAwal().getOrdinat()) / (getAkhir().getAbsis() - getAwal().getAbsis());
    }

    // selekto titik tengah
    Titik getTitikTengah() {
        double x1, x2, y1, y2;
        x1 = getAwal().getAbsis();
        x2 = getAkhir().getAbsis();
        y1 = getAwal().getOrdinat();
        y2 = getAkhir().getOrdinat();
        return new Titik((x1 + x2) / 2, (y1 + y2) / 2);
    }

    // predikat
    boolean isSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G) {
        if (Double.isInfinite(getGradien()) || Double.isInfinite(G.getGradien())) {
            if (getGradien() == 0 || G.getGradien() == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return getGradien() * G.getGradien() == -1;
        }

        // output
    }
}
