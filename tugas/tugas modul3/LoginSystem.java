import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Apid", "392");//pakai constructor
        Mahasiswa mahasiswa = new Mahasiswa("Hafid", "202410370110392");

        System.out.println("===== Sistem Login =====");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String user = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String pass = scanner.nextLine();

            if (admin.login(user, pass)) {//hasil override
                admin.displayInfo();
            } else {
                System.out.println("Login Admin gagal. Username atau password salah.");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Mahasiswa gagal. Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
