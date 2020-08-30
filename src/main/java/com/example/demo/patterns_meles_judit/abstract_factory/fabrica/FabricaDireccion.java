package com.example.demo.patterns_meles_judit.abstract_factory.fabrica;

import com.example.demo.patterns_meles_judit.abstract_factory.direccion.Direccion;
import com.example.demo.patterns_meles_judit.abstract_factory.telefono.NumeroTelefono;

public abstract class FabricaDireccion {

    public abstract Direccion createDireccion();

    public abstract NumeroTelefono createNumeroTelefono();
}
