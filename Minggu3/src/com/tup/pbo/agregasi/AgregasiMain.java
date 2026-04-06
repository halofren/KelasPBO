package com.tup.pbo.agregasi;

import java.util.ArrayList;
import java.util.List;

public class AgregasiMain {

    public static void main(String[] args) {

        Dosen dany=new Dosen("Dany");
        Dosen rudy=new Dosen("Rudy");
        Dosen denis=new Dosen("Denis");

        ProgramStudi informatika=new ProgramStudi("Program Studi Informatika");

        List<Dosen> dosenList=new ArrayList<>();
        dosenList.add(dany);
        dosenList.add(rudy);

        informatika.setDosens(dosenList);

        System.out.println("Daftar Dosen "+informatika.getNamaProgramStudi());
        for (Dosen d: informatika.getDosens()){
            System.out.println(d.getNamaDosen());
        }
    }
}
