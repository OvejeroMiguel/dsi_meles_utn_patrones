package com.example.demo.patterns_meles_judit.bridge.sensor;

public class SensorSimple extends Sensor {
    private Float medicion = 100.02F;
    @Override
    public Float tomarValor() {
        return getImpSensor().transformarValor(medicion);
    }
}
