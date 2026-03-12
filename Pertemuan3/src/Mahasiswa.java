import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String nim, nama, prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* METHOD */
    // konstruktor
    Mahasiswa() {
        this("", "", "");
        this.listMatKul = new ArrayList<>();
    }

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // mutator

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void addMatkul(MataKuliah newMatkul) {
        listMatKul.add(newMatkul);
    }

    public int getJumlahMatkul() {
        return listMatKul.size();
    }

    public int getJumlahSKS() {
        int i;
        int jumlahSKS;
        jumlahSKS = 0;
        for (i = 0; i < listMatKul.size(); i++) {
            jumlahSKS = jumlahSKS + listMatKul.get(i).getSks();
        }
        return jumlahSKS;
    }

    public void printMhs() {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        int i;
        System.out.println("Daftar Matkul : ");
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("end");
        System.out.println("Nama Dosen Wali : " + dosenWali.getNama());
        System.out.println("Nip Dosen Wali : " + dosenWali.getNip());
        System.out.println("Prodi Dosen Wali : " + dosenWali.getProdi());
        System.out.println("Kendaraan Mahasiswa : " + kendaraan.getJenis());
        System.out.println("Plat Nomor Kendaraan Mahasiswa : " + kendaraan.getNoPlat());
    }

}
