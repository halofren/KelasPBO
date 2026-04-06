package com.tup.pbo.asosiasi;

public class AsosiasiMain {

    public static void main(String[] args) {

        // membuat objek
        Dokter andi=new Dokter("Andi");
        Pasien dany=new Pasien("Dany");
        // proses asosiasi
        andi.merawat(dany,"Flu");
    }



}
