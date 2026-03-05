/*
 * Nama File : Dosen.java
 * Deskripsi :
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 5 Maret 2026
 */

public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;

    /* METHOD */

    // konstruktor
    Dosen() {
        this("", "", "");
    }

    Dosen(String nip, String nama, String prodi) {
        // nip = nip gabisa, pake this untuk membedakan parameter dengan atribut
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getProdi() {
        return prodi;
    }

    // mutator

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}
