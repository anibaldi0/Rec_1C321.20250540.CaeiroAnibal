/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class Colectivo extends VehiculoTransporte{

    public Colectivo(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }
    
    @Override
    public double calcularCostoBase(){
        return 50 + 2 * getCapacidad();
    }
    
}
