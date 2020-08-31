package com.example.demo.patterns_meles_judit.strategy.calculo_interes;

import java.util.Date;

public class EstrategiaCalculoInteresMensual implements IEstrategiaCalculoInteres {
    private Double interesDiario = 0.9D;
    @Override
    public Double calcularRecargo(Double importe, Date fechaVto, Date fechaPago) {
        var cantidadDias = fechaPago.getDate() - fechaVto.getDate();
        var interes = 0D;
        var cantidadMeses = (Integer) cantidadDias / 30;
        if(cantidadDias > 0){
            interes = importe * interesDiario *  cantidadMeses;
        }
        return interes;
    }
}
