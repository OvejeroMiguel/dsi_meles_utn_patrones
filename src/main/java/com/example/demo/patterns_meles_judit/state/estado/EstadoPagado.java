package com.example.demo.patterns_meles_judit.state.estado;

import com.example.demo.patterns_meles_judit.state.entidad.CuotaComercio;

public class EstadoPagado implements EstadoCuota {

    private String nombre = "Pagado";

    @Override
    public String mostrarNombre() {
        return nombre;
    }

    @Override
    public void registarPago(CuotaComercio cuotaComercio) {
        //No es implementa, no hay transicion posible.
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
        return true;
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
