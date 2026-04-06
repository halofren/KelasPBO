package com.tup.pbo.visibility;

public class Rekening {

    public String nomorRekening;
    public String namaPemilik;
    private double saldo;

    public Rekening(String nomorRekening,
                    String namaPemilik,
                    double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;

        if (saldo < 0) {
            System.out.println("Saldo tidak boleh minus");
            this.saldo = Math.abs(saldo);
        } else {
            this.saldo = saldo;
        }
    }

    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo = saldo - jumlah;
        }
        else {
            System.out.println("saldomu kurang");
        }
    }

    public void setorUang(double jumlah) {
        if (jumlah >= 0) {
            saldo = saldo + jumlah;
        } else {
            System.out.println("Setoran tidak boleh negatif");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

