/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class Viaje implements Comparable<Viaje> {
    private final VehiculoTransporte vehiculo;
    private final String nombrePasajero;
    private final Pasaje pasaje;
    private final double costoFinal;

    public Viaje(VehiculoTransporte vehiculo, String nombrePasajero, Pasaje pasaje) {
        if (nombrePasajero == null || nombrePasajero.isBlank()) {
            throw new IllegalArgumentException("Nombre de pasajero no puede ser vacio");
        }
        this.vehiculo = vehiculo;
        this.nombrePasajero = nombrePasajero;
        this.pasaje = pasaje;
        this.costoFinal = pasaje.calcularCostoFinal();
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    @Override
    public int compareTo(Viaje otro) {
        return Double.compare(this.costoFinal, otro.costoFinal);
    }

    @Override
    public String toString() {
        return "Viaje{" + "vehiculo=" + vehiculo + ", nombrePasajero=" + nombrePasajero + ", pasajero=" + pasaje + ", costoFinal=" + costoFinal + '}';
    }
    
}
