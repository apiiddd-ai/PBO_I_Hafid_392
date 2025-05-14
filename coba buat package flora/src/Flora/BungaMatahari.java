package Flora;

public class BungaMatahari extends Tanaman {
    public String warna;
    public int tinggi;

    //terdapat dua constructor dengan nama sama tapi parameter berbeda
    //ini disebut method overloading yang berguna untuk memberi fleksibilitas saat membuat objek

    //constructor tanpa parameter
    public BungaMatahari() {
        this.warna = "Kuning";
        this.tinggi = 100;
    }

    //constructor dengan parameter(overloading)
    public BungaMatahari(String warna, int tinggi) {
        this.warna = warna;
        this.tinggi = tinggi;
    }
//overriding method dari Tanaman
    @Override
    public void tampilInfo() {
        System.out.println("Bunga Matahari berwarna " + warna + " dengan tinggi " + tinggi + " cm.");
    }
}
