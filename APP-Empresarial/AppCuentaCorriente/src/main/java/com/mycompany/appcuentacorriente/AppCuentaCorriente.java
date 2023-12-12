/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appcuentacorriente;

/**
 *
 * @author pmelo
 */

public class AppCuentaCorriente {

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    private String titular;
    private double saldo;
    private int numero;

    public AppCuentaCorriente(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public AppCuentaCorriente(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Métodos get, set, toString

    public void abonar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public void cargar(double cantidad) {
        if (cantidad > 0) {
            this.saldo = Math.max(0, this.saldo - cantidad);
        }
    }

    public static void main(String[] args) {
        AppCuentaCorriente cuenta = new AppCuentaCorriente("Juan Pérez", 123456, 1000.0);

        System.out.println("Información inicial de la cuenta:");
        System.out.println(cuenta);

        cuenta.abonar(500.0);
        System.out.println("Después de abonar 500.0:");
        System.out.println(cuenta);

        cuenta.cargar(2000.0);
        System.out.println("Después de cargar 2000.0:");
        System.out.println(cuenta);

        cuenta.cargar(300.0);
        System.out.println("Después de cargar 300.0:");
        System.out.println(cuenta);
    }
}

