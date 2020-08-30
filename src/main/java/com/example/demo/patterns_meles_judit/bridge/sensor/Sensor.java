package com.example.demo.patterns_meles_judit.bridge.sensor;

import com.example.demo.patterns_meles_judit.bridge.imp_sensor.ImpSensor;

public abstract class Sensor {
    private ImpSensor impSensor;

    public abstract Float tomarValor();

    public ImpSensor getImpSensor() {
        return impSensor;
    }

    public void setImpSensor(ImpSensor impSensor) {
        this.impSensor = impSensor;
    }

}
