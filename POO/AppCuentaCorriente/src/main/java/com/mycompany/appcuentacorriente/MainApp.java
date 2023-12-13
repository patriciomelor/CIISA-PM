/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcuentacorriente;

/**
 *
 * @author pmelo
 */
public class MainApp {
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
