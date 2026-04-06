package com.tup.pewarisan.override;

public class Main {

    public static void main(String[] args) {

        Hewan hewan = new Hewan();
        hewan.bersuara(); // spesialisasi
        hewan.makan(); // genelasisasi

        Kucing kucing = new Kucing();
        kucing.bersuara();
        kucing.makan();
    }
}
