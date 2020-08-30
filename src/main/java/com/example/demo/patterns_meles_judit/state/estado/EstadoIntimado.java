package com.example.demo.patterns_meles_judit.state.estado;

import com.example.demo.patterns_meles_judit.state.entidad.CuotaComercio;

import java.util.Date;

public class EstadoIntimado implements EstadoCuota {

    private String nombre = "Intimado";

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
        //No es implementa, no hay transicion posible.
    }

    @Override
    public void registarIntimacion(CuotaComercio cuotaComercio) {
        //No es implementa, no hay transicion posible.
    }

    @Override
    public Boolean estaPendiente() {
        return false;
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
        return true;
    }
}
