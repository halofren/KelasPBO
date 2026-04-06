package com.tup.pbo.visibility;

public class RekeningMain {

    public static void main(String[] args) {

        Rekening r = new Rekening("12345",
                "Budi", -1000000);
        System.out.println(r.getSaldo());

    }
}
