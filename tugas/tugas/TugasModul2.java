import java.util.Scanner;

class Admin {
  private String username = "admin";
  private String password = "12345";

  boolean login(String user, String pass) {
    return username.equals(user) && password.equals(pass);
  }
}

class Mahasiswa {
  private String nama;
  private String nim;

  Mahasiswa(String nama, String nim) {
    this.nama = nama;
    this.nim = nim;
  }

  boolean login(String inputNama, String inputNim) {
    return this.nama.equals(inputNama) && this.nim.equals(inputNim);
  }

  void displayInfo() {
    System.out.println("Login berhasil!");
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
  }
}


public class TugasModul2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Admin admin = new Admin();
    Mahasiswa mahasiswa = new Mahasiswa("Muhammad Hafidzal Rahmadi", "202410370110392");

    System.out.println("Pilih login:");
    System.out.println("1. Admin");
    System.out.println("2. Mahasiswa");
    System.out.print("Masukkan pilihan: ");
    int pilihan = scanner.nextInt();
    scanner.nextLine();

    if (pilihan == 1) {
      System.out.print("Masukkan Username: ");
      String user = scanner.nextLine();
      System.out.print("Masukkan Password: ");
      String pass = scanner.nextLine();

      if (admin.login(user, pass)) {
        System.out.println("Login Admin berhasil!");
      } else {
        System.out.println("Login gagal!");
      }
    } else if (pilihan == 2) {
      System.out.print("Masukkan Nama: ");
      String nama = scanner.nextLine();
      System.out.print("Masukkan NIM: ");
      String nim = scanner.nextLine();

      if (mahasiswa.login(nama, nim)) {
        mahasiswa.displayInfo();
      } else {
        System.out.println("Login gagal!");
      }
    } else {
      System.out.println("Pilihan tidak valid!");
    }

    scanner.close();
  }
}
