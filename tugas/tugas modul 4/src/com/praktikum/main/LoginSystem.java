package com.praktikum.main;

import java.util.Scanner;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User; // Pastikan import User

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("Apid", "392");
        Mahasiswa mahasiswa = new Mahasiswa("Hafid", "202410370110392");

        System.out.println("===== Sistem Login =====");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        User user = null; // Variable to hold the logged-in user

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String userInput = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String pass = scanner.nextLine();

            if (admin.login(userInput, pass)) {
                user = admin; // Assign admin to user variable
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
                user = mahasiswa; // Assign mahasiswa to user variable
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Mahasiswa gagal. Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        // Call displayAppMenu() if login is successful
        if (user != null) {
            if (user instanceof Admin) {
                ((Admin) user).displayAppMenu(); // Memanggil menu Admin
            } else if (user instanceof Mahasiswa) {
                ((Mahasiswa) user).displayAppMenu(); // Memanggil menu Mahasiswa
            }
        }

        scanner.close();
    }
}