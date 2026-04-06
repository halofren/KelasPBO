package com.tup.pbo.komposisi;

public class PC {

    private String namaPC;

    private Motherboard motherboardPC;

    public PC(String namaPC, Motherboard motherboardPC) {
        this.namaPC = namaPC;
        this.motherboardPC = motherboardPC;
    }

    public String getNamaPC() {
        return namaPC;
    }

    public void setNamaPC(String namaPC) {
        this.namaPC = namaPC;
    }

    public Motherboard getMotherboardPC() {
        return motherboardPC;
    }

    public void setMotherboardPC(Motherboard motherboardPC) {
        this.motherboardPC = motherboardPC;
    }
}
