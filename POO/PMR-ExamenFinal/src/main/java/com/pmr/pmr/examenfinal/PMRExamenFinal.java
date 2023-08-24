/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pmr.pmr.examenfinal;
import java.util.Scanner;
/**
 *
 * @author lyvra
 */
public class PMRExamenFinal {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de colaboradores: ");
        int numColaboradores = scanner.nextInt();

        double[][] datosColaboradores = new double[numColaboradores][2];

        for (int i = 0; i < numColaboradores; i++) {
            System.out.print("Ingrese el sueldo bruto del colaborador " + (i + 1) + ": ");
            datosColaboradores[i][0] = scanner.nextDouble();

            System.out.print("Ingrese las horas trabajadas del colaborador " + (i + 1) + ": ");
            datosColaboradores[i][1] = scanner.nextDouble();
        }

        calcularRemuneraciones(datosColaboradores);

        for (int i = 0; i < numColaboradores; i++) {
            System.out.println("Colaborador " + (i + 1) + ":");
            System.out.println("Sueldo bruto: $" + datosColaboradores[i][0]);
            System.out.println("Horas trabajadas: " + datosColaboradores[i][1] + " horas");
            System.out.println("Remuneración líquida: $" + (datosColaboradores[i][0] - datosColaboradores[i][1]));
            System.out.println("----------------------------");
        }
    }

    public static void calcularRemuneraciones(double[][] colaboradores) {
        for (int i = 0; i < colaboradores.length; i++) {
            double sueldoBruto = colaboradores[i][0];
            double horasTrabajadas = colaboradores[i][1];

            double descuentoAFP = sueldoBruto * 0.12;
            double descuentoIsapre = sueldoBruto * 0.07;

            double sueldoDespuesDescuentos = sueldoBruto - descuentoAFP - descuentoIsapre;

            double impuesto = calcularImpuesto(sueldoDespuesDescuentos);

            double bono = calcularBono(horasTrabajadas);

            double sueldoLiquido = sueldoDespuesDescuentos - impuesto + bono;

            colaboradores[i][0] = sueldoLiquido;
            colaboradores[i][1] = bono;
        }
    }

    public static double calcularImpuesto(double sueldoDespuesDescuentos) {
        if (sueldoDespuesDescuentos <= 300000) {
            return 0;
        } else if (sueldoDespuesDescuentos <= 500000) {
            return sueldoDespuesDescuentos * 0.03;
        } else if (sueldoDespuesDescuentos <= 1000000) {
            return sueldoDespuesDescuentos * 0.05;
        } else if (sueldoDespuesDescuentos <= 2000000) {
            return sueldoDespuesDescuentos * 0.10;
        } else {
            return sueldoDespuesDescuentos * 0.15;
        }
    }

    public static double calcularBono(double horasTrabajadas) {
        if (horasTrabajadas > 180) {
            int horasExtra = (int) (horasTrabajadas - 180);
            int bonos = horasExtra / 5;
            return bonos * (0.02 * horasTrabajadas);
        }
        return 0;
    }

}
