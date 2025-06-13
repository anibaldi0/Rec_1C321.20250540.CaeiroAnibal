/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class PasajeEstudiante implements Pasaje {
    private final VehiculoTransporte vehiculo;

    public PasajeEstudiante(VehiculoTransporte vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase() * 0.5;
    }

    @Override
    public String toString() {
        return "PasajeEstudiante{costo=" + calcularCostoFinal() + "}";
    }
}
