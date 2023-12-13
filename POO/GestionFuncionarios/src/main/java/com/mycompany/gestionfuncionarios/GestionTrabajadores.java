/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionfuncionarios;

/**
 *
 * @author pmelo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestionTrabajadores {
    private List<Trabajador> trabajadores = new ArrayList<>();

    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public void eliminarTrabajador(String documento) {
        trabajadores.removeIf(t -> t.getDocumento().equals(documento));
    }

    public Trabajador buscarTrabajadorPorDocumento(String documento) {
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getDocumento().equals(documento)) {
                return trabajador;
            }
        }
        return null;
    }

    public void mostrarListaTrabajadores() {
        trabajadores.forEach(trabajador -> System.out.println(trabajador));
    }

    public void mostrarProfesoresPorAsignatura(String asignatura) {
        System.out.println("Profesores que enseñan " + asignatura + ":");
        trabajadores.forEach(trabajador -> {
            if (trabajador instanceof ProfesorPrincipal) {
                ProfesorPrincipal profesor = (ProfesorPrincipal) trabajador;
                if (profesor.getMateria().equals(asignatura)) {
                    System.out.println(profesor.getApodo());
                }
            } else if (trabajador instanceof ProfesorAdjunto) {
                ProfesorAdjunto profesor = (ProfesorAdjunto) trabajador;
                if (profesor.getAsignatura().equals(asignatura)) {
                    System.out.println(profesor.getApodo());
                }
            }
        });
    }

    public static void main(String[] args) {
        GestionTrabajadores gestion = new GestionTrabajadores();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar Trabajador");
            System.out.println("2. Eliminar Trabajador");
            System.out.println("3. Ver datos de un Trabajador");
            System.out.println("4. Mostrar Lista de trabajadores");
            System.out.println("5. Mostrar profesores por asignatura");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la línea en blanco

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el apodo: ");
                    String apodo = scanner.nextLine();
                    System.out.print("Ingrese el documento: ");
                    String documento = scanner.nextLine();
                    System.out.print("Ingrese los años de experiencia: ");
                    int aniosExperiencia = scanner.nextInt();
                    System.out.print("Seleccione el tipo de trabajador (1: Profesor Principal, 2: Profesor Adjunto, 3: Otro): ");
                    int tipoTrabajador = scanner.nextInt();
                    scanner.nextLine(); // Consume la línea en blanco

                    if (tipoTrabajador == 1) {
                        System.out.print("Ingrese la materia: ");
                        String materia = scanner.nextLine();
                        System.out.print("Ingrese el salario fijo: ");
                        double salarioFijo = scanner.nextDouble();
                        gestion.agregarTrabajador(new ProfesorPrincipal(apodo, documento, aniosExperiencia, materia, salarioFijo));
                    } else if (tipoTrabajador == 2) {
                        System.out.print("Ingrese la asignatura: ");
                        String asignatura = scanner.nextLine();
                        System.out.print("Ingrese las horas trabajadas: ");
                        int horasTrabajadas = scanner.nextInt();
                        System.out.print("Ingrese el valor por hora: ");
                        double valorPorHora = scanner.nextDouble();
                        gestion.agregarTrabajador(new ProfesorAdjunto(apodo, documento, aniosExperiencia, asignatura, horasTrabajadas, valorPorHora));
                    } else {
                        gestion.agregarTrabajador(new Trabajador(apodo, documento, aniosExperiencia));
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el documento del trabajador a eliminar: ");
                    String documentoEliminar = scanner.nextLine();
                    gestion.eliminarTrabajador(documentoEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el documento del trabajador a ver: ");
                    String documentoVer = scanner.nextLine();
                    Trabajador trabajador = gestion.buscarTrabajadorPorDocumento(documentoVer);
                    if (trabajador != null) {
                        System.out.println(trabajador);
                    } else {
                        System.out.println("Trabajador no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de trabajadores:");
                    gestion.mostrarListaTrabajadores();
                    break;
                case 5:
                    System.out.print("Ingrese la asignatura a buscar: ");
                    String asignaturaBuscar = scanner.nextLine();
                    gestion.mostrarProfesoresPorAsignatura(asignaturaBuscar);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

