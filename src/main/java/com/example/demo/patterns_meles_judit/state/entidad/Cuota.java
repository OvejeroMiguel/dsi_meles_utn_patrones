package com.example.demo.patterns_meles_judit.state.entidad;

public class Cuota {
    private Double id;
    private Double nroCuota;

    public Cuota(Double id, Double nroCuota) {
        this.id = id;
        this.nroCuota = nroCuota;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(Double nroCuota) {
        this.nroCuota = nroCuota;
    }
}
