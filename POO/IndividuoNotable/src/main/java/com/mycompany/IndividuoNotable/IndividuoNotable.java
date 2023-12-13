/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.IndividuoNotable;
import java.util.Random;
/**
 *
 * @author pmelo
 */


public class IndividuoNotable {
    private String apodo;
    private double calificacion;

    public IndividuoNotable(String apodo) {
        this.apodo = apodo;
    }

    public String obtenerApodo() {
        return apodo;
    }

    public double obtenerCalificacion() {
        return calificacion;
    }

    public void generarCalificacionAlAzar() {
        Random random = new Random();
        calificacion = 1 + (10 - 1) * random.nextDouble();
    }
}

