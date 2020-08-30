package com.example.demo.patterns_meles_judit.composite.componente;

import java.util.ArrayList;
import java.util.List;

public class Producto extends Componente {

    private List<Componente> componenteList;

    public Producto() {
        this.componenteList = new ArrayList<>();
    }

    @Override
    public void agregarComponente(Componente componente){
        componenteList.add(componente);
    }

    @Override
    public void removerComponente(Componente componente){
        componenteList.remove(componente);
    }

    @Override
    public Componente getComponente(Integer i){
        return componenteList.get(i);
    }

    @Override
    public List<Componente> getComponentes(){
        return componenteList;
    }

    @Override
    public String mostrarNombre() {
        return getNombre();
    }

    @Override
    public Double mostrarPrecio() {
        Double precioTotal = 0D;
        for (Componente componente: componenteList) {
            precioTotal += componente.mostrarPrecio();
        }
        return precioTotal;
    }

    @Override
    public String mostrarMarca() {
        return getMarca().getMarca();
    }

    @Override
    public Boolean esHoja() {
        return false;
    }
}
