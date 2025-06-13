/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class Tren extends VehiculoTransporte{

    public Tren(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }
    
    @Override
    public double calcularCostoBase(){
        return 80 + 1.5 * getCapacidad();
    }
    
}
