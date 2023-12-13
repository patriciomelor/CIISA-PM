/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoracompleja;
import java.util.Scanner;
/**
 *
 * @author pmelo
 */

class NumeroComplejo {
    private double parteReal;
    private double parteImaginaria;

    // Constructor por defecto
    public NumeroComplejo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    // Constructor con parámetros
    public NumeroComplejo(double real, double imaginario) {
        this.parteReal = real;
        this.parteImaginaria = imaginario;
    }

    // Métodos de instancia para operaciones
    public NumeroComplejo realizarSuma(NumeroComplejo otro) {
        return new NumeroComplejo(this.parteReal + otro.parteReal, this.parteImaginaria + otro.parteImaginaria);
    }

    public NumeroComplejo efectuarResta(NumeroComplejo otro) {
        return new NumeroComplejo(this.parteReal - otro.parteReal, this.parteImaginaria - otro.parteImaginaria);
    }

    public NumeroComplejo hacerProducto(NumeroComplejo otro) {
        double nuevaParteReal = this.parteReal * otro.parteReal - this.parteImaginaria * otro.parteImaginaria;
        double nuevaParteImaginaria = this.parteReal * otro.parteImaginaria + this.parteImaginaria * otro.parteReal;
        return new NumeroComplejo(nuevaParteReal, nuevaParteImaginaria);
    }

    public NumeroComplejo realizarDivision(NumeroComplejo otro) {
        double denominador = Math.pow(otro.parteReal, 2) + Math.pow(otro.parteImaginaria, 2);
        double nuevaParteReal = (this.parteReal * otro.parteReal + this.parteImaginaria * otro.parteImaginaria) / denominador;
        double nuevaParteImaginaria = (this.parteImaginaria * otro.parteReal - this.parteReal * otro.parteImaginaria) / denominador;
        return new NumeroComplejo(nuevaParteReal, nuevaParteImaginaria);
    }

    // Método toString para imprimir de manera más natural
    @Override
    public String toString() {
        return "(" + parteReal + ", " + parteImaginaria + ")";
    }
}

public class CalculadoraCompleja {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Solicitar al usuario los valores para los números complejos
        System.out.println("Ingrese los valores para el primer número complejo:");
        System.out.print("Parte Real: ");
        double real1 = lector.nextDouble();
        System.out.print("Parte Imaginaria: ");
        double imaginario1 = lector.nextDouble();

        System.out.println("Ingrese los valores para el segundo número complejo:");
        System.out.print("Parte Real: ");
        double real2 = lector.nextDouble();
        System.out.print("Parte Imaginaria: ");
        double imaginario2 = lector.nextDouble();

        // Crear objetos NumeroComplejo
        NumeroComplejo complejo1 = new NumeroComplejo(real1, imaginario1);
        NumeroComplejo complejo2 = new NumeroComplejo(real2, imaginario2);

        // Menú de operaciones
        int opcion;
        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la suma: " + complejo1.realizarSuma(complejo2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + complejo1.efectuarResta(complejo2));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + complejo1.hacerProducto(complejo2));
                    break;
                case 4:
                    System.out.println("Resultado de la división: " + complejo1.realizarDivision(complejo2));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        lector.close();
    }
}
