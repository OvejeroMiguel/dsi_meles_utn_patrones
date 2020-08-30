package com.example.demo.patterns_meles_judit.composite;

import com.example.demo.patterns_meles_judit.composite.componente.Componente;
import com.example.demo.patterns_meles_judit.composite.componente.Pieza;
import com.example.demo.patterns_meles_judit.composite.componente.Producto;

import javax.xml.parsers.DocumentBuilder;
import java.util.List;

public class GestorRegistrarElemento {
    private Componente componente;

    public void crearElemento(){
        componente = new Producto();
        componente.setNombre("Combo compu");
        crearPiezas();
        agregarComponente();
    }

    public Double mostrarPrecio(){
        return componente.mostrarPrecio();
    }

    public String mostrarNombreProductos(){
        String lista;
        lista = componente.getNombre();

        if(!componente.esHoja()){
            lista += ": ";
            var x = componente.getComponentes();
            lista += " " + obtenerNombreProducto(x);
        }

        return lista;
    }

    private String obtenerNombreProducto(List<Componente> componente){
        String listaNombres = "";
        for (Componente cmp: componente) {
            listaNombres += "\n";
            listaNombres += cmp.getNombre();
            if(!cmp.esHoja()){
                listaNombres += ": ";
                listaNombres += obtenerNombreProducto(cmp.getComponentes());
            }
        }
        return listaNombres;
    }

    public void crearPiezas(){
        var pc = new Pieza(100D,"pc");
        var monitor = new Pieza(200D,"monitor");
        componente.agregarComponente(pc);
        componente.agregarComponente(monitor);
    }

    public void agregarComponente(){
        var gabinete = new Producto();
        gabinete.setNombre("Gabinete");

        var unidadDvd = new Pieza(120D, "unidadDvd");
        var hardDisk = new Pieza(23D, "hardDisk");
        var fuente = new Pieza(320D, "fuente");

        gabinete.agregarComponente(unidadDvd);
        gabinete.agregarComponente(hardDisk);
        gabinete.agregarComponente(fuente);

        componente.agregarComponente(gabinete);
    }
}
