package com.example.demo.patterns_meles_judit.abstract_factory.telefono;

public class NumeroTelefonoExterior extends NumeroTelefono {

    private String codigoPais;

    public void crear(String codigoArea, String numeroTelefono, String codigoPais){
        setCodigoArea(codigoArea);
        setNumeroTelefono(numeroTelefono);
        this.codigoPais = codigoPais;
    }

    @Override
    public String tomarNumeroTelefono() {
        return getNumeroTelefono();
    }

    @Override
    public String mostrarNumeroTelefonoCompleto(){
        return codigoPais + getCodigoArea() + getNumeroTelefono();
    }
}
