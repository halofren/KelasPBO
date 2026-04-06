package com.tup.pbo.asosiasi.onetomany;

import java.util.LinkedList;

public class OneToManyMain {

    public static void main(String[] args) {

        // objek mahasiswa
        Mahasiswa dany=new Mahasiswa("2345566");
        Mahasiswa candra=new Mahasiswa("2345567");
        Mahasiswa carisa=new Mahasiswa("2345678");
        Mahasiswa casa=new Mahasiswa("2345679");

        // objek kelas
        Kelas if04=new Kelas("IF04");

        dany.setKelas(if04);
        candra.setKelas(if04);
        carisa.setKelas(if04);
        casa.setKelas(if04);

        LinkedList<Mahasiswa> mahasiswas=new LinkedList<Mahasiswa>();
        mahasiswas.add(candra);
        mahasiswas.add(carisa);
        mahasiswas.add(casa);
        mahasiswas.add(dany);

        if04.setMahasiswa(mahasiswas);

        System.out.println("Mahasiswa Kelas "+if04.getNamaKelas());
        System.out.println("===========================");
        for(Mahasiswa mahasiswa : mahasiswas) {
            System.out.println(mahasiswa.getNim());
        }
    }



}
