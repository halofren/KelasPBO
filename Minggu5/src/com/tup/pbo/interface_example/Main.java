/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.interface_example;

/**
 *
 * @author Dany
 */
public class Main {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa=new Mahasiswa();
        mahasiswa.nama="Candra";
        mahasiswa.nim="2020201";
        mahasiswa.menyapa();
        mahasiswa.presensi();
        mahasiswa.bekerja();
        
        
        Dosen dosen=new Dosen();
        dosen.nama="Dany";
        dosen.nidn="202022";
        dosen.menyapa();
        dosen.presensi();
        dosen.bekerja();
    }
    
}
