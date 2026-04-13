package com.pbo.tup.polymorph.overriding;

public class Mahasiswa extends Orang{

    String nim;

    @Override
    void sayHallo() {
        super.sayHallo();
        System.out.println("Ini prosedur sayHallo(): "
                + "yang berasal dari kelas mahasiswa");
    }
}
