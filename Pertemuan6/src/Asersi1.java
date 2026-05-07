/*
* Nama File : Asersi1.java
* Deskripsi : file class asersi, error handling
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 26 Maret 2026
*/

// digunakan jika harus benar

//javac asersi.jav\ javac -d bin src/* 
//java asrsi1
//java -enableassertions Asersi1 -> java -enableassertions -cp bin Asersi1
public class Asersi1 {
    public static void main(String[] args) {
        int x = 1;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
