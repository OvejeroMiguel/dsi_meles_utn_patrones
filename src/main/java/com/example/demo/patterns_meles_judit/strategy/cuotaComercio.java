package com.example.demo.patterns_meles_judit.strategy;

import com.example.demo.patterns_meles_judit.state.entidad.Cuota;
import com.example.demo.patterns_meles_judit.state.estado.EstadoCuota;
import com.example.demo.patterns_meles_judit.strategy.calculo_interes.EstrategiaCalculoInteresMensual;
import com.example.demo.patterns_meles_judit.strategy.calculo_interes.EstrategiaCalculoIntereseDiario;
import com.example.demo.patterns_meles_judit.strategy.calculo_interes.IEstrategiaCalculoInteres;

import java.util.Date;

public class cuotaComercio {
    private Cuota cuota;
    private Date fechaGeneracion;
    private Double importe;
    private EstadoCuota estadoCuota;
    private String cedulon;
    private IEstrategiaCalculoInteres iEstrategiaCalculoInteres;

    public cuotaComercio(Double importe) {
        this.importe = importe;
    }

    public Double calcularMontoRecargo(Date fechaPago){
        return this.iEstrategiaCalculoInteres.calcularRecargo(
                120D,
                new Date(2020,8,10),
                new Date(2020,8,30));
    }

    public void asignarCalculoIntereses(String tipoEstrategia){
        if("CALCULO DIARIO".equals(tipoEstrategia)){
            this.iEstrategiaCalculoInteres = new EstrategiaCalculoIntereseDiario();
        } else if("CALCULO MENSUAL".equals(tipoEstrategia)) {
            this.iEstrategiaCalculoInteres = new EstrategiaCalculoInteresMensual();
        }
    }
}
