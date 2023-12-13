/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.IndividuoNotable;

/**
 *
 * @author pmelo
 */
public class Principal {
    public static void main(String[] args) {
        int cantidadIndividuos = 5;
        GrupoEstudiantil grupoExcepcional = new GrupoEstudiantil(cantidadIndividuos);

        grupoExcepcional.mostrarDetallesExcepcionales();
        grupoExcepcional.calcularNivelDeExcepcion();
    }
}

