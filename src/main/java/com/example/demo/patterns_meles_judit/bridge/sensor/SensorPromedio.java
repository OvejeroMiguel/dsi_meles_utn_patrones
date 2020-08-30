package com.example.demo.patterns_meles_judit.bridge.sensor;

public class SensorPromedio extends Sensor {
    private float medicion = 2F;
    @Override
    public Float tomarValor() {
        return getImpSensor().transformarValor(medicion);
    }
}
