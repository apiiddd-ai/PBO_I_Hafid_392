package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private String username = "Apid";
    private String password = "Apid392";
    private Scanner scanner = new Scanner(System.in); // Inisialisasi Scanner
    private List<String> laporanBarang = new ArrayList<>(); // Menyimpan laporan barang

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        System.out.println("Nama Admin: " + getNama());
        System.out.println("NIM Admin: " + getNim());
    }

    @Override
    public void manageItems() {
        System.out.println("===== Kelola Laporan Barang =====");
        if (laporanBarang.isEmpty()) {
            System.out.println("Tidak ada laporan barang.");
        } else {
            System.out.println("Daftar Laporan Barang:");
            for (String laporan : laporanBarang) {
                System.out.println("- " + laporan);
            }
        }
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }

    public void addLaporanBarang(String laporan) {
        laporanBarang.add(laporan);
    }

    public void displayAppMenu() {
        int pilihan;
        do {
            System.out.println("===== Menu Admin =====");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    manageItems(); // Memanggil method manageItems
                    break;
                case 2:
                    manageUsers(); // Memanggil method manageUsers
                    break;
                case 0:
                    System.out.println("Logout berhasil.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}