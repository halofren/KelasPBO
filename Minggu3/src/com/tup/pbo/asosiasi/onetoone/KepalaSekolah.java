package com.tup.pbo.asosiasi.onetoone;

public class KepalaSekolah {

    private String nama;

    private Sekolah sekolah;

    public KepalaSekolah(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Sekolah getSekolah() {
        return sekolah;
    }

    public void setSekolah(Sekolah sekolah) {
        this.sekolah = sekolah;
    }
}
