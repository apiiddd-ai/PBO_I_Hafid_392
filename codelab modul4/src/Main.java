import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Polymorphism
        Buku buku1 = new Fiksi("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new NonFiksi("Atomic Habits", "James Clear");

        buku1.displayInfo();
        buku2.displayInfo();


        Anggota anggota1 = new Anggota("Hafid", "I392");
        Anggota anggota2 = new Anggota("Mario", "I399");

        anggota1.pinjamBuku("Laskar Pelangi");
        anggota2.pinjamBuku("Atomic Habits", 7);

        anggota1.kembalikanBuku("Laskar Pelangi");
        anggota2.kembalikanBuku("Atomic Habits");
}
}