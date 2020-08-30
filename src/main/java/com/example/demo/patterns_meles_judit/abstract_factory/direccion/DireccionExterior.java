package com.example.demo.patterns_meles_judit.abstract_factory.direccion;

public class DireccionExterior extends Direccion {

    private String pais;

    public void crear(String pais, String calle, String numero, String ciudad, String provincia){
        setCalle(calle);
        setNumero(numero);
        setCiudad(ciudad);
        setProvincia(provincia);
        this.pais = pais;
    }

    public String mostrartPais(){
        return pais;
    }

    @Override
    public String mostrarDireccionCompleta() {
        return "Direccion: " + pais + ", "
                + getProvincia() + ", "
                + getCiudad() + ", "
                + getCalle() + " "
                + getNumero();
    }
}
