package com.tup.pbo.asosiasi.onetoone;

public class OneToOneMain {

    public static void main(String[] args) {

        Sekolah sma5=new Sekolah("SMA Negeri 5");
        KepalaSekolah dany=new KepalaSekolah("Dany");

        sma5.setKepalaSekolah(dany);
        dany.setSekolah(sma5);

        System.out.println("Sekolah "+sma5.getNamaSekolah()+" dipimpin oleh "+sma5.getKepalaSekolah().getNama());

        System.out.println("Bapak "+dany.getNama()+" memimpin sekolah "+dany.getSekolah().getNamaSekolah());

    }
}
