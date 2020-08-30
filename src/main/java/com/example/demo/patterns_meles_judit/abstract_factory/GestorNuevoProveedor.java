package com.example.demo.patterns_meles_judit.abstract_factory;

import com.example.demo.patterns_meles_judit.abstract_factory.direccion.Direccion;
import com.example.demo.patterns_meles_judit.abstract_factory.entidad.Proveedor;
import com.example.demo.patterns_meles_judit.abstract_factory.fabrica.FabricaDatosArgentina;
import com.example.demo.patterns_meles_judit.abstract_factory.fabrica.FabricaDatosExterior;
import com.example.demo.patterns_meles_judit.abstract_factory.fabrica.FabricaDireccion;
import com.example.demo.patterns_meles_judit.abstract_factory.telefono.NumeroTelefono;

public class GestorNuevoProveedor {
    private FabricaDireccion fabricaDireccion;
    private Direccion direccion;
    private NumeroTelefono numeroTelefono;

    public GestorNuevoProveedor() {}

    public void crearProveedor(Boolean esNacional) {
        crearFabricaDireccion(esNacional);
        direccion = fabricaDireccion.createDireccion();
        numeroTelefono = fabricaDireccion.createNumeroTelefono();
        new Proveedor(12L, "Tumbler-SA",direccion, numeroTelefono);
    }
    //Como se puede ver, usamos un solo if. La reduccion de este tipo de elementos ayuda a disminuir la complegidad del codigo
    // Tambien es mucho mas facil usar, una vez que definimos el tipo de fabrica usamos indistintamente.
    // Si es verdad que direccion ni telefono tiene valores, pero la idea aca es mostrar como manejar de manera ordenada
    // la creacion de objetos. Respetando todos los principios grasp -> cohesion, acoplamiento, sustitucion de liskov, creador,
    private void crearFabricaDireccion(Boolean esNacional){
        if(esNacional){
            fabricaDireccion = new FabricaDatosArgentina();
        } else {
            fabricaDireccion = new FabricaDatosExterior();
        }
    }
}
