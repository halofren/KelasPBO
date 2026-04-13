package com.pbo.tup.static_key;

public class AppMain {

    public static void main(String[] args) {

       // memanggil variabel static
        System.out.println(Application.APP_NAME);

        // memanggil method static
        System.out.println(Application.sum(1,2,3,4,5,6));

        // memanggil static block
        System.out.println(Application.PROCESSORS);

    }
}
