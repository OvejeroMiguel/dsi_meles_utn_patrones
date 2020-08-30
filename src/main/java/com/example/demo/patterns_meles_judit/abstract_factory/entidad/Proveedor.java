package com.example.demo.patterns_meles_judit.abstract_factory.entidad;

import com.example.demo.patterns_meles_judit.abstract_factory.direccion.Direccion;
import com.example.demo.patterns_meles_judit.abstract_factory.telefono.NumeroTelefono;

public class Proveedor {
    private Long nroProveedor;
    private String razonSocial;
    private Direccion direccion;
    private NumeroTelefono numeroTelefono;

    public Proveedor(Long nroProveedor, String razonSocial, Direccion direccion, NumeroTelefono numeroTelefono) {
        this.nroProveedor = nroProveedor;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public NumeroTelefono getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(NumeroTelefono numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
