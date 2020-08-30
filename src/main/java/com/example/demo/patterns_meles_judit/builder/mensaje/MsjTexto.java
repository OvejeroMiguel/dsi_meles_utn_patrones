package com.example.demo.patterns_meles_judit.builder.mensaje;

public abstract class MsjTexto {
    private String cabecera;
    private String cuerpo;
    private String anexos;
    private String firma;

    public abstract void agregarCabecera(String cabecera);

    public abstract void agregarCuerpo(String cuerpo);

    public abstract void agregarAnexo(String anexos);

    public abstract void agregarFirma(String firma);

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getAnexos() {
        return anexos;
    }

    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return cabecera + " "
                + cuerpo + " "
                + anexos + " "
                + firma;
    }
}
