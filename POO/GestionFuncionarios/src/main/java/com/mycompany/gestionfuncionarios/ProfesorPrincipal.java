/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionfuncionarios;

/**
 *
 * @author pmelo
 */
class ProfesorPrincipal extends Trabajador {
    private String materia;
    private double salarioFijo;

    public ProfesorPrincipal(String apodo, String documento, int aniosExperiencia, String materia, double salarioFijo) {
        super(apodo, documento, aniosExperiencia);
        this.materia = materia;
        this.salarioFijo = salarioFijo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMateria: " + materia + "\nSalario Fijo: " + salarioFijo;
    }
}