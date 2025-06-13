/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class PasajeComun implements Pasaje {
    private final VehiculoTransporte vehiculo;

    public PasajeComun(VehiculoTransporte vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase();
    }

    @Override
    public String toString() {
        return "PasajeComun{costo=" + calcularCostoFinal() + "}";
    }
    
}
