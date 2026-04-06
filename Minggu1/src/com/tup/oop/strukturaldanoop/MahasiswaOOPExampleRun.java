package com.tup.oop.strukturaldanoop;

public class MahasiswaOOPExampleRun {

    public static void main(String[] args) {

        MahasiswaOOPExample dany=new MahasiswaOOPExample();
        dany.nama="Dany";
        dany.umur=20;
        dany.hello();

        MahasiswaOOPExample candra=new MahasiswaOOPExample();
        candra.nama="Candra";
        candra.umur=21;
        candra.hello();
        candra.pulang();

        MahasiswaRantau denis=new MahasiswaRantau();
        denis.nama="Denis";
        denis.umur=21;
        denis.alamatKost="Teluk";
        denis.hello();
        denis.pulang();

        MahasiswaOOPExample andi=new MahasiswaOOPExample();
        andi.pulang();

    }
}
