class Hewan {

    String nama;//attribute
    String jenis;
    String suara;

    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;//constructor ngisi attribut dengan nilai
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkanInfo() {//method
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Miiaaawwww!!!");//objek
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Pinjam seratus nanti dikembaliin");

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}
