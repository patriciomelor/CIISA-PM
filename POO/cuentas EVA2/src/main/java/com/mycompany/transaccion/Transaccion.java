/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transaccion;

/**
 *
 * @author pmelo
 */

import java.util.Date;

public class Transaccion {
    private String tipoMovimiento; // "abono" o "cargo"
    private Date fechaTransaccion;
    private double montoTransaccion;

    public Transaccion(String tipoMovimiento, Date fechaTransaccion, double montoTransaccion) {
        this.tipoMovimiento = tipoMovimiento;
        this.fechaTransaccion = fechaTransaccion;
        this.montoTransaccion = montoTransaccion;
    }

    // Getter y setter para tipoMovimiento
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    // Getter y setter para fechaTransaccion
    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    // Getter y setter para montoTransaccion
    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }
}



