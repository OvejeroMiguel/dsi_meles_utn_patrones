package com.example.demo.patterns_meles_judit.state.estado;

import com.example.demo.patterns_meles_judit.state.entidad.CuotaComercio;

import java.time.LocalDate;
import java.util.Date;

public class EstadoPendiente implements EstadoCuota {

    private String nombre = "Pendiente";

    @Override
    public String mostrarNombre() {
        return nombre;
    }

    @Override
    public void registarPago(CuotaComercio cuotaComercio) {
        var nuevoEstado = new EstadoPagado();
        cuotaComercio.tomarEstado(nuevoEstado);
        cuotaComercio.tomarFechaPago(new Date());
    }

    @Override
    public void registarPrescripcion(CuotaComercio cuotaComercio) {
        var nuevoEstado = new EstadoPrescripto();
        cuotaComercio.tomarEstado(nuevoEstado);
        cuotaComercio.tomarFechaPago(new Date());
    }

    @Override
    public void registarIntimacion(CuotaComercio cuotaComercio) {
        var nuevoEstado = new EstadoIntimado();
        cuotaComercio.tomarEstado(nuevoEstado);
    }

    @Override
    public Boolean estaPendiente() {
        return true;
    }

    @Override
    public Boolean estaPagada() {
        return false;
    }

    @Override
    public Boolean estaPrescripta() {
        return false;
    }

    @Override
    public Boolean estaIntimada() {
        return false;
    }
}
