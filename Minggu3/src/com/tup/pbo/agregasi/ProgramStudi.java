package com.tup.pbo.agregasi;

import java.util.List;

public class ProgramStudi {

    private String namaProgramStudi;
    private List<Dosen> dosens;

    public ProgramStudi(String namaProgramStudi) {
        this.namaProgramStudi = namaProgramStudi;
    }

    public String getNamaProgramStudi() {
        return namaProgramStudi;
    }

    public void setNamaProgramStudi(String namaProgramStudi) {
        this.namaProgramStudi = namaProgramStudi;
    }

    public List<Dosen> getDosens() {
        return dosens;
    }

    public void setDosens(List<Dosen> dosens) {
        this.dosens = dosens;
    }
}
