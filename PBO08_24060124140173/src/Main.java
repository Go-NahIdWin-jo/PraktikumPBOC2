/* Nama File : Main.java
 * Deskripsi : class main
 * Pembuat : Adel Rayyan Hakim 24060124140173
 * Tanggal : 7 Mei 2026
 *
*/
public class Main {
    public static void main(String[] args) {
        // realisasi operator generik
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Kitty", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Danny"));

        OperatorGenerik.Tukar(hewan1, hewan2);
        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());

        // tukar integer
        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);

        OperatorGenerik.Tukar(angka1, angka2);
        System.out.println(angka1.getIsi());
        System.out.println(angka2.getIsi());

        // 3. class data
        // a.

        // b.
        // .c

        // tukar string
        Datum<String> string1 = new Datum<String>("gedagdei");
        Datum<String> string2 = new Datum<String>("gedagedao");
        OperatorGenerik.Tukar(string1, string2);
        System.out.println(string1.getIsi());
        System.out.println(string2.getIsi());

        // tukar anabul
        Datum<Anabul> anabul3 = new Datum<>(new Kucing("Johnny", 4.5));
        Datum<Anabul> anabul4 = new Datum<>(new Anjing("Gooney"));

        OperatorGenerik.Tukar(anabul3, anabul4);
        anabul3.tampilkanAnabul(anabul3.getIsi());
        anabul4.tampilkanAnabul(anabul4.getIsi());

        // fungsi generik Bobot2

        Kucing car1 = new Kucing("Gege Akutami", 5.0);
        Anggora car2 = new Anggora("JoJo", 3.5);
        KembangTelon car3 = new KembangTelon("Hitam", 4.3);

        System.out.println(OperatorGenerik.Bobot2(car1, car2));
        System.out.println(OperatorGenerik.Bobot2(car2, car3));
        // larik generik

    }
}
