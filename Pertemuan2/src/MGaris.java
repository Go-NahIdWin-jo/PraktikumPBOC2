/*
 * Nama File : MTitik.java
 * Deskripsi : file main garis berisi realisasi
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 26 Februari 2026
 * 
 */

public class MGaris {
    public static void main(String[] args) {
        // kamus
        Titik P = new Titik();
        Titik Q = new Titik();
        Garis L = new Garis();
        Garis L2 = new Garis();
        // algoritma
        // tes getters

        L.getAwal().printTitik();

        // tes setters
        Q.geser(3, 4);
        L.setAwal(Q);
        L.getAwal().printTitik();
        L.setAwal(new Titik());
        L.getAwal().printTitik();
        L.setAkhir(Q);
        L.getAkhir().printTitik();

        // tes panjang garis
        System.out.println(L.getPanjangGaris());

        // tes gradien
        System.out.println(L.getGradien());

        // tes titik tengah
        L.getTitikTengah().printTitik();

        // tes sejajar
        P.geser(3, 2);
        L2.setAkhir(P);
        L2.setAwal(new Titik(0, -2));
        System.out.println(L2.getGradien());
        System.out.println(L.isSejajar(L2));

        // tees tegak lurus

    }
}