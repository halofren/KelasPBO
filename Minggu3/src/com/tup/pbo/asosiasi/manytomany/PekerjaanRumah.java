package com.tup.pbo.asosiasi.manytomany;

import java.util.Stack;

public class PekerjaanRumah {

    Stack<Pekerjaan> pekerjaan = new Stack<>();
    Stack<AnggotaKeluarga> anggotaKeluarga = new Stack<>();

    public void addPekerjaanRumah(String namaPekerjaan) {
        pekerjaan.add(new Pekerjaan(namaPekerjaan));
    }
    public void addAnggotaKeluarga(String namaAnggotaKeluarga) {
        anggotaKeluarga.add(new AnggotaKeluarga(namaAnggotaKeluarga));
    }

    public void mappingKerjaanRumah() {
        System.out.println(anggotaKeluarga.pop().getNama());
        System.out.println(" ");
        System.out.println(pekerjaan.pop().getNamaPekerjaan());
    }
}
