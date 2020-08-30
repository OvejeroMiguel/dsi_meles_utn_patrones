package com.example.demo.patterns_meles_judit.builder.constructor;

import com.example.demo.patterns_meles_judit.builder.mensaje.MsjTextSinFirma;

public class ConstructorMsjSinFirma  extends ConstructorMsj{

    @Override
    public void construirMensaje() {
        setMsjTexto(new MsjTextSinFirma());
    }
}
