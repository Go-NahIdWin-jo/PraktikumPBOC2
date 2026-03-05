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
    }

    // output layar
    void printAwalAkhir() {
        System.out.print("\nawal : ");
        getAwal().printTitik();
        System.out.print("\nakhir : ");
        getAkhir().printTitik();
    }

    // tampilkan dalam bentuk fungsi persamaan linear
    void printFungsiPersamaanLinear() {
        double x1, x2, y1, y2;
        x1 = getAwal().getAbsis();
        x2 = getAkhir().getAbsis();
        y1 = getAwal().getOrdinat();
        y2 = getAkhir().getOrdinat();
        // mtkkk we are so backkk
        // (y - y1)(x2-x1) = (x - x1)(y2-y1)
        // y*x2-y*x1 -y1*x2 + y1*x1 = x*y2 - x*y1 -x1*y2 + x1*y1
        // y(x2-x1) = x(y2-y1) + y1*x2 - y1*x1 -x1*y2 + x1*y1
        // y(x2-x1) = x(y2-y1) + y1*x2 -x1*y2
        // y = (x(y2-y1) + y1*x2 - x1*y2)/(x2-x1)
        double a = x2 - x1;
        double m = y2 - y1;
        double c = (y1 * x2) - (x1 * y2);
        if (m == 0 && a == 0) {
            System.out.println("error : titik awal dan akhir tidak membentuk garis");
        } else {
            if (a == 0) {
                System.out.println("x = " + c / m * -1);
            } else {
                System.out.print("y = ");

                if (a != 1) {
                    // System.out.println("tes ;" + c + " " + a + "\n");
                    m = m / a;
                    c = c / a;
                }
                if (m != 1 && m != 0 && m != -1) {
                    System.out.print(m);
                }
                if (m == -1) {
                    System.out.print("-");
                }
                if (m != 0) {
                    System.out.print("x");
                }
                if (c != 0) {
                    if (m != 0) {
                        System.out.print(" + ");
                    }
                    // System.out.println((y1 * x2) - (x1 * y2));
                    System.out.print(c);
                }
                System.out.print("\n");
            }
        }
    }
}
