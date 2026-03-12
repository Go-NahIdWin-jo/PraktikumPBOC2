public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    // konstruktor

    public BangunDatar() {
        this(0, "", "");
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;

    }

    // setter

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // getter

    public String getBorder() {
        return border;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

}
