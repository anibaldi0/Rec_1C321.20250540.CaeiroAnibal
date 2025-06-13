/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class PasajeJubilado implements Pasaje {
    private final VehiculoTransporte vehiculo;

    public PasajeJubilado(VehiculoTransporte vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase() * 0.25;
    }

    @Override
    public String toString() {
        return "PasajJubilado{costo=" + calcularCostoFinal() + "}";
    }
}
