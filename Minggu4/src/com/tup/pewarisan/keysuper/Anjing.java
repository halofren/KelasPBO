package com.tup.pewarisan.keysuper;


public class Anjing extends Hewan {

    @Override
    public void bersuara(){
        System.out.println("guk guk guk");
    }

    @Override
    public void makan() {
        super.makan();
        System.out.println("Aku suka daging dan tulang");
    }


}
