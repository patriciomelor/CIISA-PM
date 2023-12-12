/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.IndividuoNotable;

/**
 *
 * @author pmelo
 */
public class GrupoEstudiantil extends IndividuoNotable {
    private int cantidadIndividuos;
    private IndividuoNotable[] individuosNotables;

    public GrupoEstudiantil(int cantidadIndividuos) {
        super("Grupo Notable");
        this.cantidadIndividuos = cantidadIndividuos;
        individuosNotables = new IndividuoNotable[cantidadIndividuos];

        for (int i = 0; i < cantidadIndividuos; i++) {
            individuosNotables[i] = new IndividuoNotable("Notable" + (i + 1));
            individuosNotables[i].generarCalificacionAlAzar();
        }
    }

    public void mostrarDetallesExcepcionales() {
        System.out.println("Detalles de las calificaciones excepcionales:");

        for (IndividuoNotable individuo : individuosNotables) {
            System.out.println(individuo.obtenerApodo() + ": " + individuo.obtenerCalificacion());
        }
    }

    public void calcularNivelDeExcepcion() {
        double sumaCalificaciones = 0;

        for (IndividuoNotable individuo : individuosNotables) {
            sumaCalificaciones += individuo.obtenerCalificacion();
        }

        double nivelDeExcepcion = sumaCalificaciones / cantidadIndividuos;
        System.out.println("Nivel de excepción: " + nivelDeExcepcion);
    }
}

