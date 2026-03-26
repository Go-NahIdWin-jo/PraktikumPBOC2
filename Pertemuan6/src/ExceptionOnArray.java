
/*
* Nama File : ExceptionOnArray.java
* Deskripsi : file class exception debugging
* Pembuat : Adel Rayyan Hakim 24060124140173
* Tanggal : 26 Maret 2026
*/
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4]; // krn
        try {
            arrayInteger[2] = 11;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }

    }
}
