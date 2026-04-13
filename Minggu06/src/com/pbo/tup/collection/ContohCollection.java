package com.pbo.tup.collection;

import java.util.*;
import java.util.stream.*;

public class ContohCollection {
    // Method bantu untuk cetak pemisah
    static void printHeader(String judul) {
        System.out.println("\n========================================");
        System.out.println("  " + judul);
        System.out.println("========================================");
    }

    public static void main(String[] args) {

        // Data
        List<String> mahasiswa = new ArrayList<>(Arrays.asList(
                "Andi", "Budi", "Citra", "Dewi", "Eko"
        ));

        // ============================================================
        // 1. FOR LOOP BIASA (index-based)
        // ============================================================
        printHeader("1. FOR LOOP BIASA");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println("Index " + i + " : " + mahasiswa.get(i));
        }

        // ============================================================
        // 2. FOR EACH / ENHANCED FOR LOOP
        // ============================================================
        printHeader("2. FOR EACH (Enhanced For Loop)");
        for (String nama : mahasiswa) {
            System.out.println("Nama: " + nama);
        }

        // ============================================================
        // 3. ITERATOR
        // ============================================================
        printHeader("3. ITERATOR");
        Iterator<String> iterator = mahasiswa.iterator();
        while (iterator.hasNext()) {
            String nama = iterator.next();
            System.out.println("Nama: " + nama);
        }

        // Contoh Iterator untuk hapus elemen saat iterasi
        printHeader("3b. ITERATOR (dengan remove)");
        List<String> temp = new ArrayList<>(mahasiswa); // copy dulu
        Iterator<String> iteratorHapus = temp.iterator();
        while (iteratorHapus.hasNext()) {
            String nama = iteratorHapus.next();
            if (nama.equals("Budi")) {
                iteratorHapus.remove(); // aman digunakan saat iterasi
                System.out.println("'" + nama + "' dihapus dari list");
            } else {
                System.out.println("Nama: " + nama);
            }
        }

        // ============================================================
        // 4. LAMBDA (forEach dengan lambda expression)
        // ============================================================
        printHeader("4. LAMBDA");
        mahasiswa.forEach(nama -> System.out.println("Nama: " + nama));

        // Lambda dengan kondisi (filter pakai stream)
        printHeader("4b. LAMBDA + STREAM (filter nama > 4 huruf)");
        mahasiswa.stream()
                .filter(nama -> nama.length() > 4)
                .forEach(nama -> System.out.println("Nama panjang: " + nama));

        // ============================================================
        // 5. METHOD REFERENCE
        // ============================================================
        printHeader("5. METHOD REFERENCE");
        mahasiswa.forEach(System.out::println);

        // Method reference dengan stream dan sort
        printHeader("5b. METHOD REFERENCE + SORT");
        mahasiswa.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println("\n========================================");
        System.out.println("  Selesai!");
        System.out.println("========================================\n");
    }
}
