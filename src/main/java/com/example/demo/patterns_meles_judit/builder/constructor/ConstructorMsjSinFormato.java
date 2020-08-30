package com.example.demo.patterns_meles_judit.builder.constructor;

import com.example.demo.patterns_meles_judit.builder.mensaje.MsjTextSinFormato;

public class ConstructorMsjSinFormato extends ConstructorMsj {

    @Override
    public void construirMensaje() {
        setMsjTexto(new MsjTextSinFormato());
    }
}
