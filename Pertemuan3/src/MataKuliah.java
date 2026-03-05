public class MataKuliah {
    /* ATRIBUT */
    private String idMatkul, nama;
    private int sks;

    /* METHOD */
    // konstruktor
    MataKuliah() {
        this("", "", 0);
    }

    MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // selektor
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // mutator
    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }
}
