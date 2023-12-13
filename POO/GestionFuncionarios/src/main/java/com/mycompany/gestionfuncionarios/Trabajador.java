/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionfuncionarios;

/**
 *
 * @author pmelo
 */
class Trabajador {
    private String apodo;
    private String documento;
    private int aniosExperiencia;

    public Trabajador(String apodo, String documento, int aniosExperiencia) {
        this.apodo = apodo;
        this.documento = documento;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Apodo: " + apodo + "\nDocumento: " + documento + "\nAños de Experiencia: " + aniosExperiencia;
    }
}
