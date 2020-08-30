package com.example.demo.patterns_meles_judit.abstract_factory.telefono;

public abstract class NumeroTelefono {
    private String codigoArea;
    private String numeroTelefono;

    public abstract String tomarNumeroTelefono();

    public abstract String mostrarNumeroTelefonoCompleto();

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
