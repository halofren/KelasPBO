package com.tup.pbo.asosiasi.manytomany;

public class ManyToManyMain {

    public static void main(String[] args) {

        PekerjaanRumah pekerjaanRumah=new PekerjaanRumah();

        pekerjaanRumah.addAnggotaKeluarga("Ayah");
        pekerjaanRumah.addPekerjaanRumah("Potong Rumput");

        pekerjaanRumah.mappingKerjaanRumah();
    }


}
