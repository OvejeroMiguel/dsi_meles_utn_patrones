package com.example.demo.patterns_meles_judit.bridge;

import com.example.demo.patterns_meles_judit.bridge.imp_sensor.ImpSensor;
import com.example.demo.patterns_meles_judit.bridge.imp_sensor.ImpSensorProveedorA;
import com.example.demo.patterns_meles_judit.bridge.imp_sensor.ImpSensorProveedorB;
import com.example.demo.patterns_meles_judit.bridge.sensor.Sensor;
import com.example.demo.patterns_meles_judit.bridge.sensor.SensorFlujo;
import com.example.demo.patterns_meles_judit.bridge.sensor.SensorPromedio;
import com.example.demo.patterns_meles_judit.bridge.sensor.SensorSimple;

public class GestorMediciones {

    private Sensor sensor;
    private ImpSensor impSensor;

    public Float medirValorSensor(String tipoSensor, String proveedor){
        validarTipoSensor(tipoSensor);
        validarTipoProveedor(proveedor);
        sensor.setImpSensor(impSensor);
        return sensor.tomarValor();
    }

    private void validarTipoSensor(String tipoSensor){
        if("SENSOR SIMPLE".equals(tipoSensor)){
            sensor = new SensorSimple();
        }
        else if("SENSOR PROMEDIO".equals(tipoSensor)){
            sensor = new SensorPromedio();
        }
        else {
            sensor = new SensorFlujo();
        }
    }

    private void validarTipoProveedor(String proveedor){
        if("PROVEEDOR A".equals(proveedor)){
            impSensor = new ImpSensorProveedorA();
        } else {
            impSensor = new ImpSensorProveedorB();
        }
    }

}
