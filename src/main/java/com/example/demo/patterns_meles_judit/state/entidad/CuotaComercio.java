package com.example.demo.patterns_meles_judit.state.entidad;

import com.example.demo.patterns_meles_judit.state.estado.EstadoCuota;
import com.example.demo.patterns_meles_judit.state.estado.EstadoPendiente;

import java.util.Date;

public class CuotaComercio {
    private String nroCuota;
    private Double importe;
    private Date fechaPago;
    private Date fechaPrescripcion;
    private Cuota cuota;
    private EstadoCuota estadoCuota;

    public CuotaComercio(String nroCuota, Double importe, Date fechaPrescripcion) {
        this.nroCuota = nroCuota;
        this.importe = importe;
        this.fechaPrescripcion = fechaPrescripcion;
        this.estadoCuota = new EstadoPendiente();
        this.cuota = new Cuota(1D,10D);
    }

    public void tomarFechaPago(Date fecha){
        this.fechaPago = fecha;
    }

    public void tomarFechaPrescripcion(Date fechaPrescripcion){
        this.fechaPrescripcion = fechaPrescripcion;
    }

    public String mostrarFechaPago(){
        return fechaPago.toString();
    }

    public String mostrarEstado(){
        return estadoCuota.mostrarNombre();
    }

    public void tomarEstado(EstadoCuota estadoCuota){
        this.estadoCuota = estadoCuota;
    }

    public Double calcularRecargo(){
        return importe * 1.21D;
    }

    public String mostrarDatosPago(){
        return "Fecha de pago: " + fechaPago
                + "\n Importe: " + importe;
    }

    public void prescribir(){
        estadoCuota.registarPrescripcion(this);
    }

    public void asignarIntimacion(){
        estadoCuota.registarIntimacion(this);
    }

    public void pagar(){
        estadoCuota.registarPago(this);
    }

    public void intimar(){
        estadoCuota.registarIntimacion(this);
    }

}
