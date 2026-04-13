package com.pbo.tup.collection.crud;

public class Mahasiswa {
    String nim;
    String nama;
    String jurusan;
    double ipk;

    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Jurusan: " + jurusan + " | IPK: " + ipk);
    }
}
