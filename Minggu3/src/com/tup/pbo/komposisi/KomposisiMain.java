package com.tup.pbo.komposisi;

public class KomposisiMain {

    public static void main(String[] args) {

        Motherboard b770=new Motherboard("B770");

        PC pcKu=new PC("PC Asus ROG",b770);

        System.out.println("PC "+pcKu.getNamaPC()+" pakai motherboard "+b770.getTipeMotherboard());

    }
}
