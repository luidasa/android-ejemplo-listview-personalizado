package com.crenx.hola.models;

import java.math.BigDecimal;
import java.util.Date;

public class Credito {

    /**
     * Nombre del producto
     */
    private String nombre;

    /**
     * Fecha de compra
     */
    private Date fechaInicio;


    /**
     * Fecha de vencimiento
     */
    private Date fechaVencimiento;

    /**
     * Saldo a la fecha actual.
     */
    private BigDecimal saldo;

    public Credito(String nombre, Date fechaInicio, Date fechaVencimiento, BigDecimal saldo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
