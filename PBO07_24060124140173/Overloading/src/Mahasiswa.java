public class Mahasiswa {
    // atribut
    private String NIM;
    private String nama;
    private String Programstudi;

    // method
    // getters
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramstudi() {
        return Programstudi;
    }

    // setters atau implementasi polimorifisime overloading
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String P) {
        this.Programstudi = P;
    }

    public void setProgramStudi(Mahasiswa M) {
        this.Programstudi = M.getProgramstudi();
    }

}
