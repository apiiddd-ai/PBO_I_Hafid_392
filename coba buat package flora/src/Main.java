import Flora.BungaMatahari;
import Flora.Tanaman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan warna bunga matahari: ");
        String warna = input.nextLine();

        System.out.print("Masukkan tinggi bunga matahari (cm): ");
        int tinggi = input.nextInt();

        //method yang dipanggil (tampilInfo() tetap mengikuti class asli objek (BungaMatahari), bukan class referensinya (Tanaman)
        //ini menunjukkan konsep dynamic polymorphism (runtime overriding).
        Tanaman tanaman = new BungaMatahari(warna, tinggi);//polymorphism: objek BungaMatahari disimpan dalam variabel bertipe Tanaman
        //variabel tanaman bertipe Tanaman, tetapi objek yang disimpan adalah BungaMatahari, ini adalah contoh polymorphism
        tanaman.tampilInfo();//saat method tampilInfo() dipanggil, yang muncul adalah versi dari subclass (BungaMatahari) bukan dari Tanaman
        //method yang dipanggil (tampilInfo() tetap mengikuti class asli objek (BungaMatahari), bukan class referensinya (Tanaman)
        //ini menunjukkan konsep dynamic polymorphism (runtime overriding).
        input.close();
    }
}
