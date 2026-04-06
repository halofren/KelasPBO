/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.abstract_example;

/**
 *
 * @author dany
 */
public class Ikan extends Hewan{
    
    String nama;

    public Ikan(String nama, int berat) {
        super(berat);
        this.nama = nama;
    }

    @Override
    public void bergerak() {
        System.out.println("Ikan  bergerak dengan cara berenang");
    }
    
    
    
}
