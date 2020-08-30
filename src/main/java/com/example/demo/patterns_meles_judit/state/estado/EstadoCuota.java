package com.example.demo.patterns_meles_judit.state.estado;

import com.example.demo.patterns_meles_judit.state.entidad.CuotaComercio;

public interface EstadoCuota {
    String mostrarNombre();
    void registarPago(CuotaComercio cuotaComercio);
    void registarPrescripcion(CuotaComercio cuotaComercio);
    void registarIntimacion(CuotaComercio cuotaComercio);
    Boolean estaPendiente();
    Boolean estaPagada();
    Boolean estaPrescripta();
    Boolean estaIntimada();
}
