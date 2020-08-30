package com.example.demo.patterns_meles_judit.builder.constructor;

import com.example.demo.patterns_meles_judit.builder.mensaje.MsjTexto;

public abstract class ConstructorMsj {
    private MsjTexto msjTexto;

    public abstract void construirMensaje();

    public void crearCabecera(String cabecera) {
        msjTexto.agregarCabecera(cabecera);
    }

    public void crearCuerpo(String cuerpo) {
        msjTexto.agregarCuerpo(cuerpo);
    }

    public void crearAnexos(String anexos) {
        msjTexto.agregarAnexo(anexos);
    }

    public void crearFirma(String firma) {
        msjTexto.agregarFirma(firma);
    }

    public String obtenerMensaje(){
        return msjTexto.toString();
    }

    public MsjTexto getMsjTexto() {
        return msjTexto;
    }

    public void setMsjTexto(MsjTexto msjTexto) {
        this.msjTexto = msjTexto;
    }
}
