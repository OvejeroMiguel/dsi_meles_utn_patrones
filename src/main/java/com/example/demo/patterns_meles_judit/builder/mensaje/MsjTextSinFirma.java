package com.example.demo.patterns_meles_judit.builder.mensaje;

public class MsjTextSinFirma extends MsjTexto{
    @Override
    public void agregarCabecera(String cabecera) {
        setCabecera(cabecera);
    }

    @Override
    public void agregarCuerpo(String cuerpo) {
        setCuerpo(cuerpo);
    }

    @Override
    public void agregarAnexo(String anexos) {
        setAnexos(anexos);
    }

    @Override
    public void agregarFirma(String firma) {}
}
