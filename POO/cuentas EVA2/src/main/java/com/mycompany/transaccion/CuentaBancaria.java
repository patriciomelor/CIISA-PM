/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transaccion;

import java.util.Date;

/**
 *
 * @author pmelo
 */
public class CuentaBancaria {
    private double saldoActual;
    private final Transaccion[] ultimasTransacciones; // Array para almacenar las últimas 10 transacciones

    public CuentaBancaria() {
        saldoActual = 0.0;
        ultimasTransacciones = new Transaccion[10];
    }

    // Getter y setter para saldoActual
    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void realizarAbono(double monto) {
        try {
            validarMonto(monto);
            saldoActual += monto;
            registrarTransaccion("abono", new Date(), monto);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al realizar abono: " + e.getMessage());
        }
    }

    public void realizarCargo(double monto) {
        try {
            validarMonto(monto);
            if (monto > saldoActual) {
                throw new IllegalArgumentException("Fondos insuficientes para realizar el cargo");
            }
            saldoActual -= monto;
            registrarTransaccion("cargo", new Date(), monto);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al realizar cargo: " + e.getMessage());
        }
    }

    private void validarMonto(double monto) throws IllegalArgumentException {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero");
        }
    }

    private void registrarTransaccion(String tipoMovimiento, Date fechaTransaccion, double montoTransaccion) {
        // Registra la transacción en el array de últimas transacciones
        Transaccion transaccion = new Transaccion(tipoMovimiento, fechaTransaccion, montoTransaccion);
        for (int i = ultimasTransacciones.length - 1; i > 0; i--) {
            ultimasTransacciones[i] = ultimasTransacciones[i - 1];
        }
        ultimasTransacciones[0] = transaccion;
    }

    // Getter para ultimasTransacciones
    public Transaccion[] getUltimasTransacciones() {
        return ultimasTransacciones;
    }

    public static void main(String[] args) {
        // Ejemplo de uso en el método main
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.realizarAbono(1000);
        cuenta.realizarCargo(500);
        cuenta.realizarAbono(200);

        // Mostrar las últimas transacciones
        for (Transaccion transaccion : cuenta.getUltimasTransacciones()) {
            if (transaccion != null) {
                System.out.println("Tipo de Movimiento: " + transaccion.getTipoMovimiento() +
                        ", Fecha de Transacción: " + transaccion.getFechaTransaccion() +
                        ", Monto de Transacción: " + transaccion.getMontoTransaccion());
            }
        }
    }
}
