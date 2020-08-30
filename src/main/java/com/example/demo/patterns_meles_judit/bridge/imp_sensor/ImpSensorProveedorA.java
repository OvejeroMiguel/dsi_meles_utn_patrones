package com.example.demo.patterns_meles_judit.bridge.imp_sensor;

public class ImpSensorProveedorA implements ImpSensor {
    @Override
    public Float transformarValor(Float valor) {
        return valor*1.21F;
    }
}
