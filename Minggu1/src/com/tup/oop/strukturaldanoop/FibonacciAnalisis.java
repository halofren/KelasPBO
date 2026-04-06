package com.tup.oop.strukturaldanoop;

import java.util.Scanner;

public class FibonacciAnalisis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
            return;
        }

        long a = 0;
        long b = 1;
        long total = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        System.out.println("\nDeret Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            total += a;

            if (a > max) {
                max = a;
            }

            if (a < min) {
                min = a;
            }

            if (a % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }

            long next = a + b;
            a = b;
            b = next;
        }

        double rataRata = (double) total / n;

        System.out.println("\n\nTotal             : " + total);
        System.out.println("Rata-rata         : " + rataRata);
        System.out.println("Nilai terbesar    : " + max);
        System.out.println("Nilai terkecil    : " + min);
        System.out.println("Jumlah genap      : " + jumlahGenap);
        System.out.println("Jumlah ganjil     : " + jumlahGanjil);

        input.close();
    }
}
