public class overloadingMain {
    public static void main(String[] args) {
        // kamus
        Mahasiswa M1;
        Mahasiswa M2;

        // algoritma
        M1 = new Mahasiswa(); // objek mahasiswa baru
        M2 = new Mahasiswa(); // objek mahasiswa baru
        M1.setProgramStudi("informatika");
        M2.setProgramStudi(M1);
        

    }
}
