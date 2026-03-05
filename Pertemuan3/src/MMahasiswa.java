/*
* Nama File : MDosen.java
* Deskripsi :
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 5 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen D1;
        MataKuliah MK1;
        Kendaraan K1;

        MK1 = new MataKuliah();
        D1 = new Dosen();
        K1 = new Kendaraan();

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
        System.out.println("kembalikan idMatkul Matakuliah : " + MK1.getIdMatkul());
        System.out.println("kembalikan Nama Matakuliah : " + MK1.getNama());
        System.out.println("kembalikan Sks Matakuliah : " + MK1.getSks());

    }
}
