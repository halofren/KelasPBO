/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.interface_example;

/**
 *
 * @author Dany
 */
public class Dosen extends Orang implements KegiatanKampus {
    
    String nidn;

    @Override
    public void menyapa() {
        System.out.println("Saya adalah "+nama+" seorang dosen");
    }

    @Override
    public void presensi() {
        System.out.println("Saya presensi setiap jam 8 pagi di TUP");
    }
    @Override
    public void bekerja() {
        System.out.println("Saya bekerja dengan melaksanakan Tri Dharma di TUP");
    }

    
    
}
