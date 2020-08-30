package com.example.demo.patterns_meles_judit.abstract_factory.direccion;

public class DireccionArgentina extends Direccion{

    private String codigoPostal;

    public void crear(String codigoPostal, String calle, String numero, String ciudad, String provincia){
        setCalle(calle);
        setNumero(numero);
        setCiudad(ciudad);
        setProvincia(provincia);
        this.codigoPostal = codigoPostal;
    }

    public String mostrarCP(){
        return codigoPostal;
    }

    @Override
    public String mostrarDireccionCompleta() {
        return "Direccion: " + codigoPostal + ", "
                + getProvincia() + ", "
                + getCiudad() + ", "
                + getCalle() + " "
                + getNumero();
    }
}
