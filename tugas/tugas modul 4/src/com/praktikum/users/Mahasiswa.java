package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private Scanner scanner = new Scanner(System.in); // Inisialisasi Scanner
    private List<String> laporanBarang = new ArrayList<>(); // Menyimpan laporan barang

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }

    @Override
    public void reportItem() {
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan Deskripsi Barang: ");
        String deskripsiBarang = scanner.nextLine();
        System.out.print("Masukkan Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        String laporan = "Nama Barang: " + namaBarang + ", Deskripsi: " + deskripsiBarang + ", Lokasi: " + lokasi;
        laporanBarang.add(laporan); // Menyimpan laporan barang
        System.out.println("Laporan Barang berhasil! Detail:");
        System.out.println(laporan);
    }

    @Override
    public void viewReportedItems() {
        System.out.println("===== Daftar Laporan =====");
        if (laporanBarang.isEmpty()) {
            System.out.println("Tidak ada laporan barang.");
        } else {
            for (String laporan : laporanBarang) {
                System.out.println("- " + laporan);
            }
        }
    }

    public void displayAppMenu() {
        int pilihan;
        do {
            System.out.println("===== Menu Mahasiswa =====");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    reportItem(); // Memanggil method reportItem
                    break;
                case 2:
                    viewReportedItems(); // Memanggil method viewReportedItems
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