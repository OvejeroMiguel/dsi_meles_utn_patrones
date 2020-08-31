package com.example.demo.patterns_meles_judit.strategy.calculo_interes;

import java.util.Date;

public class EstrategiaCalculoIntereseDiario implements IEstrategiaCalculoInteres {
    private Double interesDiario = 0.2;
    @Override
    public Double calcularRecargo(Double importe, Date fechaVto, Date fechaPago) {
        var cantidadDias = fechaPago.getDate() - fechaVto.getDate();
        var interes = 0D;
        if(cantidadDias > 0){
            interes = importe * interesDiario * cantidadDias;
        }
        return interes;
    }
}
