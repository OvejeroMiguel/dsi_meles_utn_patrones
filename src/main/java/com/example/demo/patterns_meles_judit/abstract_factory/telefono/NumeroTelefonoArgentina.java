package com.example.demo.patterns_meles_judit.abstract_factory.telefono;

public class NumeroTelefonoArgentina extends NumeroTelefono {

    public void crear(String codigoArea, String numeroTelefono){
        setCodigoArea(codigoArea);
        setNumeroTelefono(numeroTelefono);
    }

    @Override
    public String tomarNumeroTelefono() {
        return getNumeroTelefono();
    }

    @Override
    public String mostrarNumeroTelefonoCompleto() {
        return getCodigoArea() + getNumeroTelefono();
    }
}
