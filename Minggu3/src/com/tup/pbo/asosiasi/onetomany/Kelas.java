package com.tup.pbo.asosiasi.onetomany;

import java.util.LinkedList;

public class Kelas {

    private String namaKelas;

    private LinkedList<Mahasiswa> mahasiswa;

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public LinkedList<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(LinkedList<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
