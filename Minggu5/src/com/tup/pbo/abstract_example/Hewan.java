/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.abstract_example;

/**
 *
 * @author dany
 */
public abstract class Hewan {
    
    int berat;

    public Hewan(int berat) {
        this.berat = berat;
    }
    
    public void bernafas(){
        System.out.println("Bernafas menggunakan Oksigen");
    }
    
    public abstract void bergerak();
    
}
