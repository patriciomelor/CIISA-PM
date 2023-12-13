/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionfuncionarios;

/**
 *
 * @author pmelo
 */
class ProfesorAdjunto extends Trabajador {
    private String asignatura;
    private int horasTrabajadas;
    private double valorPorHora;

    public ProfesorAdjunto(String apodo, String documento, int aniosExperiencia, String asignatura, int horasTrabajadas, double valorPorHora) {
        super(apodo, documento, aniosExperiencia);
        this.asignatura = asignatura;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAsignatura: " + asignatura + "\nHoras Trabajadas: " + horasTrabajadas + "\nValor por Hora: " + valorPorHora;
    }
}

