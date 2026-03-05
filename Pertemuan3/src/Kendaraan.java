public class Kendaraan {
    /* ATRIBUT */
    private String noPlat, jenis;

    /* METHOD */
    // konstruktor
    Kendaraan() {
        this("", "");
    }

    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // selektor
    public String getJenis() {
        return jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    // mutator
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
}
