package com.tup.pbo.asosiasi;

public class Dokter {

    private String nama;

    public Dokter(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //hubungan asosiasi
    public void merawat(Pasien pasien, String diagnosa){
        pasien.setDiagnosa(diagnosa);
        System.out.println("Merawat diagnosa: " + diagnosa);
    }
}
