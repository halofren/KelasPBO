package com.tup.pbo.visibility;

public class AccountBank {

    private String nama;
    private String pin;
    private double saldo;

    public AccountBank(String nama) {
        if (nama.equals("Jono")){
            System.out.println("usir dia dari bank");
        }else{
        this.nama = nama;
        }
    }

    public AccountBank(String nama, String pin) {
        this.nama = nama;
        this.pin = pin;
    }

    public AccountBank(String nama, String pin, double saldo) {
        this.nama = nama;
        this.pin = pin;
        this.saldo = saldo;
        System.out.println("cieee banyak duit nih "+nama);
    }

    public double cekSaldo(String pin){
        if (pin.equals(this.pin)) {
            return saldo;
        }else {System.out.println("Invalid pin");}
        return 0;
    }
}
