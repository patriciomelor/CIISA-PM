/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concesionaria;

/**
 *
 * @author pmelo
 */
import java.util.ArrayList;
import java.util.Date;

class Vehiculo {
    private int codigoVehiculo;
    private String marcaVehiculo;
    private String tipoVehiculo;
    private String modeloVehiculo;
    private int añoVehiculo;
    private double kilometrajeVehiculo;
    private String patenteVehiculo;

    public Vehiculo(int codigoVehiculo, String marcaVehiculo, String tipoVehiculo, String modeloVehiculo,
            int añoVehiculo, double kilometrajeVehiculo, String patenteVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.añoVehiculo = añoVehiculo;
        this.kilometrajeVehiculo = kilometrajeVehiculo;
        this.patenteVehiculo = patenteVehiculo;
    }

    // Getters y Setters más elaborados
    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public int getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(int añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }

    public double getKilometrajeVehiculo() {
        return kilometrajeVehiculo;
    }

    public void setKilometrajeVehiculo(double kilometrajeVehiculo) {
        this.kilometrajeVehiculo = kilometrajeVehiculo;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    @Override
    public String toString() {
        return "Vehículo [Código: " + codigoVehiculo + ", Marca: " + marcaVehiculo + ", Tipo: " + tipoVehiculo
                + ", Modelo: " + modeloVehiculo + ", Año: " + añoVehiculo + ", Kilometraje: " + kilometrajeVehiculo
                + ", Patente: " + patenteVehiculo + "]";
    }
}

class Venta {
    private double montoVenta;
    private Date fechaTransaccion;
    private Vehiculo vehiculoVendido;
    private String nombreComprador;
    private String rutComprador;

    public Venta(double montoVenta, Date fechaTransaccion, Vehiculo vehiculoVendido, String nombreComprador,
            String rutComprador) {
        this.montoVenta = montoVenta;
        this.fechaTransaccion = fechaTransaccion;
        this.vehiculoVendido = vehiculoVendido;
        this.nombreComprador = nombreComprador;
        this.rutComprador = rutComprador;
    }

    // Getters y Setters más elaborados
    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public Vehiculo getVehiculoVendido() {
        return vehiculoVendido;
    }

    public void setVehiculoVendido(Vehiculo vehiculoVendido) {
        this.vehiculoVendido = vehiculoVendido;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getRutComprador() {
        return rutComprador;
    }

    public void setRutComprador(String rutComprador) {
        this.rutComprador = rutComprador;
    }

    @Override
    public String toString() {
        return "Venta [Monto: " + montoVenta + ", Fecha: " + fechaTransaccion + ", Vehículo Vendido: "
                + vehiculoVendido.toString() + ", Comprador: " + nombreComprador + ", Rut: " + rutComprador + "]";
    }
}

class Concesionaria {
    private ArrayList<Vehiculo> inventario;
    private ArrayList<Venta> registrosVentas;

    public Concesionaria() {
        this.inventario = new ArrayList<>();
        this.registrosVentas = new ArrayList<>();
    }

    // Métodos para agregar vehículos al inventario
    public void agregarVehiculo(Vehiculo vehiculo) {
        inventario.add(vehiculo);
    }

    // Método para realizar una venta
    public void realizarVenta(double montoVenta, Date fechaTransaccion, int codigoVehiculo, String nombreComprador,
            String rutComprador) {
        try {
            Vehiculo vehiculoVendido = buscarVehiculoPorCodigo(codigoVehiculo);
            if (vehiculoVendido != null) {
                Venta venta = new Venta(montoVenta, fechaTransaccion, vehiculoVendido, nombreComprador, rutComprador);
                registrosVentas.add(venta);
                System.out.println("Venta realizada con éxito:\n" + venta.toString());
            } else {
                throw new Exception("Vehículo no encontrado en el inventario");
            }
        } catch (Exception e) {
            System.err.println("Error al realizar la venta: " + e.getMessage());
        }
    }

    // Método para buscar un vehículo por su código
     private Vehiculo buscarVehiculoPorCodigo(int codigo) {
        for (Vehiculo vehiculo : inventario) {
            if (vehiculo.getCodigoVehiculo() == codigo) {
                return vehiculo;
            }
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear algunos vehículos
        Vehiculo auto1 = new Vehiculo(1, "Toyota", "Auto", "Corolla", 2022, 15000, "ABC123");
        Vehiculo camioneta1 = new Vehiculo(2, "Ford", "Camioneta", "Explorer", 2021, 20000, "XYZ789");

        // Crear la concesionaria
        Concesionaria concesionaria = new Concesionaria();

        // Agregar vehículos al inventario
        concesionaria.agregarVehiculo(auto1);
        concesionaria.agregarVehiculo(camioneta1);

        // Realizar una venta
        concesionaria.realizarVenta(25000, new Date(), 1, "Juan Perez", "12345678-9");
    }
}