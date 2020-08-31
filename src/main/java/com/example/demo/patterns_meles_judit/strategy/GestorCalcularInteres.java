package com.example.demo.patterns_meles_judit.strategy;


import com.example.demo.patterns_meles_judit.strategy.calculo_interes.EstrategiaCalculoIntereseDiario;

import java.util.Date;

public class GestorCalcularInteres {
    private cuotaComercio cuotaComercio;

    public GestorCalcularInteres() {
        cuotaComercio = new cuotaComercio(3000D);
    }

    public Double calcularInteresDiarios(){
        cuotaComercio.asignarCalculoIntereses("CALCULO DIARIO");
        return cuotaComercio.calcularMontoRecargo(new Date());
    }

    public Double calcularInteresMensuales(){
        cuotaComercio.asignarCalculoIntereses("CALCULO MENSUAL");
        return cuotaComercio.calcularMontoRecargo(new Date());
    }
}
