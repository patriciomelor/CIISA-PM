/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pmr.act.eva3;

import java.util.Scanner;

/**
 *
 * @author lyvra
 */
public class ACTEVA3 {

    public static void main(String[] args) {
       
         Scanner Scann = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de trabajadores: ");
        int numTrabajadores = Scann.nextInt();

        String[][] trabajadores = new String[numTrabajadores][5]; // Nombre, Edad, Horas por día, Sueldo por hora, Total horas

        for (int i = 0; i < numTrabajadores; i++) {
            System.out.println("Ingrese los datos del trabajador " + (i + 1) + ":");
            Scann.nextLine(); // Consumir el salto de línea pendiente

            System.out.print("Nombre: ");
            trabajadores[i][0] = Scann.nextLine();

            System.out.print("Edad: ");
            trabajadores[i][1] = Scann.nextLine();

            System.out.print("Horas por día: ");
            int horasPorDia = Scann.nextInt();
            trabajadores[i][2] = String.valueOf(horasPorDia);

            System.out.print("Sueldo por hora: ");
            double sueldoPorHora = Scann.nextDouble();
            trabajadores[i][3] = String.valueOf(sueldoPorHora);

            trabajadores[i][4] = String.valueOf(horasPorDia * 6); // Total horas a la semana
        }

        double totalPagar = 0.0;

        System.out.println("\nDatos finales de cada trabajador:");

        for (int i = 0; i < numTrabajadores; i++) {
            double sueldoSemanal = Double.parseDouble(trabajadores[i][2]) * Double.parseDouble(trabajadores[i][3]) * 6;
            totalPagar += sueldoSemanal;

            System.out.println(trabajadores[i][0] + " - Horas Semana: " + trabajadores[i][4] + " - Sueldo Semanal: " + sueldoSemanal);
        }

        System.out.println("\nTotal a pagar por la empresa: " + totalPagar);

        Scann.close();
    }
}
