/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.abstract_example;

/**
 *
 * @author dany
 */
public class Main {
    
    public static void main(String[] args) {

        Harimau harimau=new Harimau(120);
        harimau.bergerak();

        Ikan ikan=new Ikan("Nemo", 20);
        ikan.bergerak();
    }
    
}
