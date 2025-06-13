/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public abstract class VehiculoTransporte {
    private String patente;
    private int capacidad;
    private String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        if (patente == null || patente.isBlank()) {
            throw new IllegalArgumentException("La patente no puede esta vacia");
        }
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        if (empresa == null || empresa.isBlank()) {
            throw new IllegalArgumentException("Debe colocar la empresa");
        }
        this.patente = patente;
        this.capacidad = capacidad;
        this.empresa = empresa;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.isBlank()) {
            throw new IllegalArgumentException("La patente no puede ser vacia");
        }
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        this.capacidad = capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        if (empresa == null || empresa.isBlank()) {
            throw new IllegalArgumentException("La empresa no puede ser vacia");
        }
        this.empresa = empresa;
    }

    public abstract double calcularCostoBase();

    @Override
    public String toString() {
        return "VehiculoTransporte{" + "patente=" + patente + ", capacidad=" + capacidad + ", empresa=" + empresa + '}';
    }


}
