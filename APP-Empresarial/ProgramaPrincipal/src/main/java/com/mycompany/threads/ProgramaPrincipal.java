/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threads;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author pmelo
 */

class Carro {

    public Carro(String numeroChasis, String tipo, int anioFabricacion) {
        this.numeroChasis = numeroChasis;
        this.tipo = tipo;
        this.anioFabricacion = anioFabricacion;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    private String numeroChasis;
    private String tipo;
    private int anioFabricacion;

    // Constructor, getters, setters, etc.
}

class Concesionario {
    private final List<Carro> carrosEnInventario;
    private final List<Carro> carrosVendidos;

    public Concesionario() {/**/
        carrosEnInventario = new CopyOnWriteArrayList<>();
        carrosVendidos = new CopyOnWriteArrayList<>();
    }

    public void agregarCarroAlInventario(Carro carro) {
        carrosEnInventario.add(carro);
    }

    public List<Carro> listarCarrosPorAnio() {
        // Implementa la lógica para ordenar por año
        return new ArrayList<>(carrosEnInventario);
    }

    public List<Carro> listarCarrosPorTipo(String tipo) {
        // Implementa la lógica para filtrar por tipo y ordenar por año
        List<Carro> carrosFiltrados = new ArrayList<>();
        for (Carro carro : carrosEnInventario) {
            if (carro.getTipo().equalsIgnoreCase(tipo)) {
                carrosFiltrados.add(carro);
            }
        }
        return carrosFiltrados;
    }

    public Carro buscarPorNumeroChasis(String numeroChasis) {
        // Implementa la lógica para buscar por número de chasis en ambas listas
        for (Carro carro : carrosEnInventario) {
            if (carro.getNumeroChasis().equalsIgnoreCase(numeroChasis)) {
                return carro;
            }
        }

        for (Carro carro : carrosVendidos) {
            if (carro.getNumeroChasis().equalsIgnoreCase(numeroChasis)) {
                return carro;
            }
        }

        return null; // No se encontró el carro
    }
}

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        // Agrega algunos carros al inventario
        concesionario.agregarCarroAlInventario(new Carro("ABC123", "Auto", 2022));
        concesionario.agregarCarroAlInventario(new Carro("XYZ789", "Camioneta", 2021));

        // Utiliza Threads para mejorar la eficiencia al realizar operaciones en paralelo
        Thread thread1 = new Thread(() -> {
            List<Carro> carrosPorAnio = concesionario.listarCarrosPorAnio();
            // Realiza acciones con la lista...
        });

        Thread thread2 = new Thread(() -> {
            List<Carro> carrosPorTipo = concesionario.listarCarrosPorTipo("Auto");
            // Realiza acciones con la lista...
        });

        Thread thread3 = new Thread(() -> {
            Carro carro = concesionario.buscarPorNumeroChasis("ABC123");
            // Realiza acciones con el carro encontrado...
        });

        // Inicia los threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Espera a que todos los threads terminen antes de continuar
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

