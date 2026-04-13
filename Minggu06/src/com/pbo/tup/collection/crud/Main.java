package com.pbo.tup.collection.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static ArrayList<Mahasiswa> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Data awal
        list.add(new Mahasiswa("001", "Andi", "Informatika", 3.85));
        list.add(new Mahasiswa("002", "Budi", "Sistem Informasi", 2.90));
        list.add(new Mahasiswa("003", "Citra", "Informatika", 3.60));

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua");
            System.out.println("2. Tambah");
            System.out.println("3. Cari by NIM");
            System.out.println("4. Update");
            System.out.println("5. Hapus");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1 -> tampilSemua();
                case 2 -> tambah();
                case 3 -> cari();
                case 4 -> update();
                case 5 -> hapus();
                case 0 -> System.out.println("Sampai jumpa!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    // CREATE
    static void tambah() {
        System.out.print("NIM     : "); String nim     = sc.nextLine();
        System.out.print("Nama    : "); String nama    = sc.nextLine();
        System.out.print("Jurusan : "); String jurusan = sc.nextLine();
        System.out.print("IPK     : "); double ipk     = Double.parseDouble(sc.nextLine());

        // Cek NIM duplikat
        for (Mahasiswa m : list) {
            if (m.nim.equals(nim)) {
                System.out.println("NIM sudah ada!");
                return;
            }
        }

        list.add(new Mahasiswa(nim, nama, jurusan, ipk));
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    // READ - tampil semua
    static void tampilSemua() {
        if (list.isEmpty()) {
            System.out.println("Data kosong.");
            return;
        }
        System.out.println("\n--- Daftar Mahasiswa ---");
        for (Mahasiswa m : list) {
            m.tampil();
        }
    }

    // READ - cari by NIM
    static void cari() {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        for (Mahasiswa m : list) {
            if (m.nim.equals(nim)) {
                m.tampil();
                return;
            }
        }
        System.out.println("Mahasiswa tidak ditemukan.");
    }

    // UPDATE
    static void update() {
        System.out.print("Masukkan NIM yang akan diupdate: ");
        String nim = sc.nextLine();

        for (Mahasiswa m : list) {
            if (m.nim.equals(nim)) {
                System.out.print("Nama baru    : "); m.nama    = sc.nextLine();
                System.out.print("Jurusan baru : "); m.jurusan = sc.nextLine();
                System.out.print("IPK baru     : "); m.ipk     = Double.parseDouble(sc.nextLine());
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("Mahasiswa tidak ditemukan.");
    }

    // DELETE
    static void hapus() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = sc.nextLine();

        Iterator<Mahasiswa> iterator = list.iterator();
        while (iterator.hasNext()) {
            Mahasiswa m = iterator.next();
            if (m.nim.equals(nim)) {
                iterator.remove();
                System.out.println("Mahasiswa berhasil dihapus!");
                return;
            }
        }
        System.out.println("Mahasiswa tidak ditemukan.");
    }
}
