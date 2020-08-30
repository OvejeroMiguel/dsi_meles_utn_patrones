package com.example.demo.patterns_meles_judit.builder.constructor;

import com.example.demo.patterns_meles_judit.builder.mensaje.MsjTextConFormato;

public class ConstructorMsjConFormato extends ConstructorMsj{

    @Override
    public void construirMensaje() {
        setMsjTexto( new MsjTextConFormato());
    }

}
