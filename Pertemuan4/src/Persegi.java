public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(String warna, String border, double sisi) {
        setWarna(warna);
        setBorder(border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
