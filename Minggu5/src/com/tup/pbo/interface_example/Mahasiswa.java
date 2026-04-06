/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.interface_example;

/**
 *
 * @author Dany
 */
public class Mahasiswa extends Orang implements KegiatanKampus{
    
    String nim;

    @Override
    public void presensi() {
        System.out.println("Saya Mahasiswa Presensi dengan nim "+nim+" setaiap ada jadwal kuliah");
    }
    @Override
    public void bekerja() {

        System.out.println("Saya bekerja dengan belajar dan berorganisasi di TUP");
    }

    @Override
    public void menyapa() {
        System.out.println("Saya adalah "+nama+" seorang mahasiswa");
    }

   
    
}
