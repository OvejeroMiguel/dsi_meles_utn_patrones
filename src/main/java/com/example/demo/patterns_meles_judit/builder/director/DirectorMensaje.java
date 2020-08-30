package com.example.demo.patterns_meles_judit.builder.director;

import com.example.demo.patterns_meles_judit.builder.constructor.ConstructorMsj;

public class DirectorMensaje {
    private ConstructorMsj constructorMsj;

    public DirectorMensaje(ConstructorMsj constructorMsj) {
        this.constructorMsj = constructorMsj;
    }

    public void construirMensaje(String cabecera, String cuerpo, String anexos, String firma){
        constructorMsj.construirMensaje();
        constructorMsj.crearCabecera(cabecera);
        constructorMsj.crearCuerpo(cuerpo);
        constructorMsj.crearAnexos(anexos);
        constructorMsj.crearFirma(firma);
    }
}
