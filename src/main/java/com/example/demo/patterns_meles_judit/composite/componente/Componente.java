package com.example.demo.patterns_meles_judit.composite.componente;

import com.example.demo.patterns_meles_judit.composite.entidad.Marca;

import java.util.List;

public abstract class Componente {
    private String nombre;
    private Boolean hoja;
    private Marca marca;

    public abstract void agregarComponente(Componente componente);
    public abstract void removerComponente(Componente componente);
    public abstract Componente getComponente(Integer i);
    public abstract List<Componente> getComponentes();
    public abstract String mostrarNombre();
    public abstract Double mostrarPrecio();
    public abstract String mostrarMarca();
    public abstract Boolean esHoja();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getHoja() {
        return hoja;
    }

    public void setHoja(Boolean hoja) {
        this.hoja = hoja;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
