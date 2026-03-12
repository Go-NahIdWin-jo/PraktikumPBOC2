/*
* Nama File : MDosen.java
* Deskripsi :
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 5 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen D1;
        MataKuliah MK1, MK2;
        Kendaraan K1;
        Mahasiswa Mhs1;

        MK1 = new MataKuliah();
        MK2 = new MataKuliah();
        D1 = new Dosen();
        K1 = new Kendaraan();
        Mhs1 = new Mahasiswa();

        System.out.println("kembalikan nama dosen : " + D1.getNama());
        System.out.println("kembalikan Nip dosen : " + D1.getNip());
        System.out.println("kembalikan Prodi dosen : " + D1.getProdi());

        D1.setNama("joko");
        D1.setNip("D001");
        D1.setProdi("informatika");

        System.out.println("kembalikan nama dosen : " + D1.getNama());
        System.out.println("kembalikan Nip dosen : " + D1.getNip());
        System.out.println("kembalikan Prodi dosen : " + D1.getProdi());

        System.out.println("kembalikan idMatkul Matakuliah : " + MK1.getIdMatkul());
        System.out.println("kembalikan Nama Matakuliah : " + MK1.getNama());
        System.out.println("kembalikan Sks Matakuliah : " + MK1.getSks());

        MK1.setIdMatkul("IF001");
        MK1.setNama("PBO");
        MK1.setSks(3);
        MK2.setIdMatkul("IF002");
        MK2.setNama("ASA");
        MK2.setSks(3);
        System.out.println("kembalikan idMatkul Matakuliah : " + MK1.getIdMatkul());
        System.out.println("kembalikan Nama Matakuliah : " + MK1.getNama());
        System.out.println("kembalikan Sks Matakuliah : " + MK1.getSks());

        K1.setJenis("Tank");
        K1.setNoPlat("JohnJujutsu001");
        Mhs1.setNama("John Kaisen");
        Mhs1.setNim("NIM001");
        Mhs1.setProdi("Informatika");
        Mhs1.setDosenWali(D1);
        Mhs1.setKendaraan(K1);

        System.out.println(Mhs1.getNama());
        System.out.println(Mhs1.getNim());
        System.out.println(Mhs1.getProdi());

        Mhs1.printMhs();
        Mhs1.addMatkul(MK1);
        Mhs1.addMatkul(MK2);
        Mhs1.printDetailMhs();
    }
}
