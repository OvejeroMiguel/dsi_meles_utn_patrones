package com.example.demo.patterns_meles_judit.bridge.sensor;

public class SensorFlujo extends Sensor {
    private Float medicion = 3.5F;
    @Override
    public Float tomarValor() {
        return getImpSensor().transformarValor(medicion);
    }
}
