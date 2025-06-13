
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class NombrePasajeroComparator implements Comparator<Viaje> {
    @Override
    public int compare(Viaje v1, Viaje v2) {
        return v1.getNombrePasajero().compareToIgnoreCase(v2.getNombrePasajero());
    }
}
