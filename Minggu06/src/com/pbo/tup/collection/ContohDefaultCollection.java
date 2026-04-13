package com.pbo.tup.collection;


import java.util.ArrayList;

public class ContohDefaultCollection {

    public static void main(String[] args) {

        ArrayList<String> nama=new ArrayList();
        nama.add("Dany");
        nama.add("Daniel");
        nama.add("Denis");

        nama.remove("Daniel");

        System.out.println(nama.contains("Dudung"));



    }
}
