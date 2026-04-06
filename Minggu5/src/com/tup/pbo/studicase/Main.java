/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tup.pbo.studicase;

import java.util.Scanner;

/**
 *
 * @author dany
 */
public class Main {

    public static void main(String[] args) {

        Samsung samsung=new Samsung();

        // membuat objek user
        User dian = new User(samsung);

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== Remote TV ===");
            System.out.println("[1] Nyalakan TV");
            System.out.println("[2] Matikan TV");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                dian.turnOnTV();
            } else if (aksi.equalsIgnoreCase("2")) {
                dian.turnOffTV();
            } else if (aksi.equalsIgnoreCase("3")) {
                dian.makeTVLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                dian.makeTVSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}
