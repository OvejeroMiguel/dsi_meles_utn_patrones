package com.example.demo.patterns_meles_judit.abstract_factory.direccion;

public abstract class Direccion {
    private String calle;
    private String numero;
    private String ciudad;
    private String provincia;

    public abstract String mostrarDireccionCompleta();

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
