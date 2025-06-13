
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nibalink
 */
public class testRecuParcial1 {
    public static void main(String[] args) {
        List<Viaje> viajes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU SISTEMA DE COBRO ===");
            System.out.println("1. Registrar nuevo viaje");
            System.out.println("2. Mostrar todos los viajes");
            System.out.println("3. Ordenar por costo");
            System.out.println("4. Ordenar por nombre de pasajero");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Salir");
            System.out.print("Elige opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    registrarViaje(sc, viajes);
                    break;
                case 2:
                    mostrarViajes(viajes);
                    break;
                case 3:
                    if (viajes.isEmpty()) {
                        System.out.println("No hay viajes para ordenar.");
                    } else {
                        Collections.sort(viajes);
                        System.out.println("-- Viajes ordenados por costo (ascendente) --");
                        mostrarViajes(viajes);
                    }
                    break;
                case 4:
                    if (viajes.isEmpty()) {
                        System.out.println("No hay viajes para ordenar.");
                    } else {
                        Collections.sort(viajes, new NombrePasajeroComparator());
                        System.out.println("-- Viajes ordenados por nombre de pasajero --");
                        mostrarViajes(viajes);
                    }
                    break;
                case 5:
                    mostrarTotal(viajes);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }

    private static void registrarViaje(Scanner sc, List<Viaje> viajes) {
        VehiculoTransporte vehiculo = null;
        while (vehiculo == null) {
            System.out.print("Tipo de vehiculo (colectivo/tren/subte): ");
            String tipo = sc.nextLine().trim().toLowerCase();
            System.out.print("Patente: ");
            String patente = sc.nextLine();
            System.out.print("Capacidad: ");
            int capacidad = sc.nextInt();
            sc.nextLine();
            System.out.print("Empresa: ");
            String empresa = sc.nextLine();

            switch (tipo) {
                case "colectivo":
                    vehiculo = new Colectivo(patente, capacidad, empresa);
                    break;
                case "tren":
                    vehiculo = new Tren(patente, capacidad, empresa);
                    break;
                case "subte":
                    vehiculo = new Subte(patente, capacidad, empresa);
                    break;
                default:
                    System.out.println("No se reconoce el tipo de vehiculo. Intenta de nuevo.");
            }
        }

        Pasaje pasaje = null;
        while (pasaje == null) {
            System.out.print("Tipo de pasaje (comun/estudiante/jubilado): ");
            String tipoPasaje = sc.nextLine().trim().toLowerCase();
            switch (tipoPasaje) {
                case "comun":
                    pasaje = new PasajeComun(vehiculo);
                    break;
                case "estudiante":
                    pasaje = new PasajeEstudiante(vehiculo);
                    break;
                case "jubilado":
                    pasaje = new PasajeJubilado(vehiculo);
                    break;
                default:
                    System.out.println("No se reconoce el tipo de pasaje. Intenta de nuevo.");
            }
        }

        System.out.print("Nombre del pasajero: ");
        String pasajero = sc.nextLine();
        viajes.add(new Viaje(vehiculo, pasajero, pasaje));
        System.out.println("Viaje registrado con exito.");
    }

    private static void mostrarViajes(List<Viaje> viajes) {
        if (viajes.isEmpty()) {
            System.out.println("No hay viajes registrados.");
        } else {
            viajes.forEach(System.out::println);
        }
    }

    private static void mostrarTotal(List<Viaje> viajes) {
        if (viajes.isEmpty()) {
            System.out.println("No hay viajes registrados.");
        } else {
            double total = viajes.stream()
                                  .mapToDouble(Viaje::getCostoFinal)
                                  .sum();
            System.out.printf("Total recaudado: %.2f%n", total);
        }
    }
}
