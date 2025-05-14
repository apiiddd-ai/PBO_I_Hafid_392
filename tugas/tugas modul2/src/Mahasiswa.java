public class Mahasiswa {
    String nama = "Hapid";
    String nim = "202410370110392";

    public boolean login(String inputNama, String inputNIM) {
        return nama.equals(inputNama) && nim.equals(inputNIM);
    }

    public void displayInfo() {
        System.out.println("Login berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
