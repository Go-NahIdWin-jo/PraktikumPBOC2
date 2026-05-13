/* Nama File : MainTeman.java
 * Deskripsi : class main teman, aplikasi class teman
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 13 Mei 2026
 *
*/
public class MainTeman {
    public static void main(String[] args) {
        System.out.println("\nselamat datang, mulai\n");
        // kamus
        Teman nakama;

        // algoritma
        nakama = new Teman();

        // I. KOLEKSI KELAS DASAR
        // a. getNbelm()
        System.out.println("nakama.getNbelm() -> " + nakama.getNbelm());

        // b. getNama(indeks) dan d. addNama(nama)

        System.out.println("addNama(\"Yuji Itadori\")");
        nakama.addNama("Yuji Itadori");
        System.out.println("nakama.getNbelm() -> " + nakama.getNbelm());
        System.out.println("nakama.getNama(0) -> " + nakama.getNama(0));

        // c. setNama(indeks,nama)
        System.out.println("setNama(0,\"Naruto Uzumaki\")");
        nakama.setNama(0, "Naruto Uzumaki");

        System.out.println("nakama.getNama(0) -> " + nakama.getNama(0));

        // e. delNama(nama)
        System.out.println("addNama(\"Yuji Itadori\")");
        nakama.addNama("Yuji Itadori");
        System.out.println("addNama(\"Monkey D Luffy\")");
        nakama.addNama("Monkey D Luffy");
        nakama.delNama("Yuji Itadori");
        System.out.println("nakama.delNama(\"Yuji Itadori\")");
        // f. isMember(nama)

        System.out.println("nakama.isMember(\"Yuji Itadori\") -> " + nakama.isMember("Yuji Itadori"));

        System.out.println("nakama.isMember(\"Naruto Uzumaki\") -> " + nakama.isMember("Naruto Uzumaki"));

        // g. gantiNama(nama,namabaru)
        System.out.println("nakama.gantiNama(\"Monkey D Luffy\", \"Monkey D Dragon\")");
        nakama.gantiNama("Monkey D Luffy", "Monkey D Dragon");
        System.out.println("nakama.isMember(\"Monkey D Luffy\") -> " + nakama.isMember("Monkey D Luffy"));

        System.out.println("nakama.isMember(\"Monkey D Dragon\") -> " + nakama.isMember("Monkey D Dragon"));

        // e. countNama(nama)
        System.out.println("addNama(\"Yuji Itadori\")");
        nakama.addNama("Yuji Itadori");
        System.out.println("addNama(\"Yuji Itadori\")");
        nakama.addNama("Yuji Itadori");
        System.out.println("addNama(\"Yuji Itadori\")");
        nakama.addNama("Yuji Itadori");
        System.out.println("addNama(\"Yuji Itadori\")");
        nakama.addNama("Yuji Itadori");
        System.out.println("nakama.countNama(\"Yuji Itadori\") -> " + nakama.countNama("Yuji Itadori"));
    }

}
