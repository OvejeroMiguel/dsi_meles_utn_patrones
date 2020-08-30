package com.example.demo.patterns_meles_judit.abstract_factory.fabrica;

import com.example.demo.patterns_meles_judit.abstract_factory.direccion.Direccion;
import com.example.demo.patterns_meles_judit.abstract_factory.direccion.DireccionArgentina;
import com.example.demo.patterns_meles_judit.abstract_factory.telefono.NumeroTelefono;
import com.example.demo.patterns_meles_judit.abstract_factory.telefono.NumeroTelefonoArgentina;

public class FabricaDatosArgentina extends FabricaDireccion{

    @Override
    public Direccion createDireccion() {
        return new DireccionArgentina();
    }

    @Override
    public NumeroTelefono createNumeroTelefono() {
        return new NumeroTelefonoArgentina();
    }
}
