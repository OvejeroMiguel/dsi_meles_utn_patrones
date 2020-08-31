package com.example.demo;

import com.example.demo.patterns_meles_judit.bridge.GestorMediciones;
import com.example.demo.patterns_meles_judit.composite.GestorRegistrarElemento;
import com.example.demo.patterns_meles_judit.strategy.GestorCalcularInteres;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //ejecutarEjemploBridge();
        ejecutarEjemploComposite();

    }

    private static void ejecutarEjemploStrategy(){
        GestorCalcularInteres gestorCalcularInteres = new GestorCalcularInteres();
        gestorCalcularInteres.calcularInteresDiarios();
        gestorCalcularInteres.calcularInteresMensuales();
    }

    private static void ejecutarEjemploComposite(){
        //EL EJEMPLO DE LADO DEL GESTOR ES MEDIO MALO, NO ME QUEDO CLARO DE LA FILMINA COMO ES ROL Q JUEGA EL GESTOR,
        // ASIQUE CREE MI PROPIA AVENTURA. Lo importante es que la logica del composite esta.
        GestorRegistrarElemento gestorRegistrarElemento = new GestorRegistrarElemento();
        gestorRegistrarElemento.crearElemento();
        var montoTotal = gestorRegistrarElemento.mostrarPrecio();
        System.out.println(gestorRegistrarElemento.mostrarNombreProductos());
        System.out.println("El monto total de super combo es de: " + montoTotal + " USD");
    }

    private static void ejecutarEjemploBridge(){
        GestorMediciones gestorMediciones = new GestorMediciones();
        Float medicion = gestorMediciones.medirValorSensor("SENSOR SIMPLE", "PROVEEDOR A");
        System.out.println("El valor de la medicion es de: " + medicion);

        medicion = gestorMediciones.medirValorSensor("SENSOR PROMEDIO", "PROVEEDOR A");
        System.out.println("El valor de la medicion es de: " + medicion);
    }

}
