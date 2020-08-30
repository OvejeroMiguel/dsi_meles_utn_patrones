package com.example.demo.patterns_meles_judit.abstract_factory.fabrica;

import com.example.demo.patterns_meles_judit.abstract_factory.direccion.Direccion;
import com.example.demo.patterns_meles_judit.abstract_factory.direccion.DireccionExterior;
import com.example.demo.patterns_meles_judit.abstract_factory.telefono.NumeroTelefono;
import com.example.demo.patterns_meles_judit.abstract_factory.telefono.NumeroTelefonoArgentina;

public class FabricaDatosExterior extends FabricaDireccion{

    @Override
    public Direccion createDireccion() {
        return new DireccionExterior();
    }

    @Override
    public NumeroTelefono createNumeroTelefono() {
        return new NumeroTelefonoArgentina();
    }
}
