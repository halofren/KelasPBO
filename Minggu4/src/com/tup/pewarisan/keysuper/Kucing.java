package com.tup.pewarisan.keysuper;

public class Kucing extends Hewan {

    @Override
    public void bersuara() {
        System.out.println("meaw meaw meaw");
    }

    @Override
    public void makan() {
        super.makan();
        System.out.println("Aku suka ikan");
    }


}
