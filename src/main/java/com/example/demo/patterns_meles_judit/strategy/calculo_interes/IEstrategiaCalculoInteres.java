package com.example.demo.patterns_meles_judit.strategy.calculo_interes;

import java.util.Date;

public interface IEstrategiaCalculoInteres {
    Double calcularRecargo(Double importe, Date fechaVto, Date fechaPago);
}
