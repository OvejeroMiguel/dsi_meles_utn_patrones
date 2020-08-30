package com.example.demo.patterns_meles_judit.composite.componente;

import com.example.demo.patterns_meles_judit.composite.entidad.Marca;

import java.util.List;

public class Pieza extends Componente {
    private Double precio;

    public Pieza(Double precio, String nombre) {
        this.precio = precio;
        setNombre(nombre);
    }

    @Override
    public String mostrarNombre() {
        return getNombre();
    }

    @Override
    public Double mostrarPrecio() {
        return precio;
    }

    @Override
    public String mostrarMarca() {
        return getMarca().getMarca();
    }

    @Override
    public Boolean esHoja() {
        return true;
    }

    @Override
    public void agregarComponente(Componente componente) {
        System.out.println("soy hoja no se puede agregar componentes");
    }

    @Override
    public void removerComponente(Componente componente) {
        System.out.println("soy hoja no se puede remover componentes");
    }

    @Override
    public Componente getComponente(Integer i) {
        System.out.println("Soy hoja no se puede devolver componentes");
        return this;
    }

    @Override
    public List<Componente> getComponentes() {
        return null;
    }
}
