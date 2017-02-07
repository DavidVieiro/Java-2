/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionvehiculos1;

/**
 *
 * @author dam132
 */
public class AplicacionGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--- Vehiculo 1 ---");
        // Furgoneta(int dinero, int vigilantes, String matricula, int anoCompra, String marca)
        Furgoneta furgon1 = new Furgoneta ( 30000, 4, "45645-DFG", 2010, "Opel" );
        System.out.println("Año: " +  furgon1.getAnoCompra() );
        System.out.println("Marca: " +  furgon1.getMarca() );
        System.out.println("Matricula: " +  furgon1.getMatricula() );
        System.out.println("Dinero: " +  furgon1.getDinero() );
        System.out.println("Num Vigilantes: " + furgon1.getVigilantes() );
        System.out.println("Total Vehiculos: " + furgon1.getTotalVehiculos() );
        System.out.println("Ingresos: " + furgon1.calcularIngreso() );
        
        System.out.println("\n\n--- Vehiculo 2 ---");
        // Furgoneta(int dinero, int vigilantes, String matricula, int anoCompra, String marca)
        Furgoneta furgon2 = new Furgoneta ( 2000, 3, "54654-RRG", 2011, "Renault" );
        System.out.println("Año: " +  furgon2.getAnoCompra() );
        System.out.println("Marca: " +  furgon2.getMarca() );
        System.out.println("Matricula: " +  furgon2.getMatricula() );
        System.out.println("Dinero: " +  furgon2.getDinero() );
        System.out.println("Num Vigilantes: " + furgon2.getVigilantes() );
        System.out.println("Total Vehiculos: " + furgon2.getTotalVehiculos() );
        System.out.println("Ingresos: " + furgon2.calcularIngreso() );
        
        System.out.println("\n\n--- Vehiculo 3 ---");
        // Coche(String claveDocumento, String nombreConductor, String matricula, int anoCompra, String marca, int importancia)
        Coche coche1 = new Coche ( "ADS456GFD-65", "Carlos", "45654-FDG", 2014, "Ford", 0);
        System.out.println("Año: " +  coche1.getAnoCompra() );
        System.out.println("Marca: " +  coche1.getMarca() );
        System.out.println("Matricula: " +  coche1.getMatricula() );
        System.out.println("Documento: " + coche1.getClaveDocumento() );
        System.out.println("Conductor: " + coche1.getNombreConductor() );
        System.out.println("Total Vehiculos: " + coche1.getTotalVehiculos() );
        System.out.println("Ingresos: " + coche1.calcularIngreso() );
        
        System.out.println("\n\n--- Vehiculo 4 ---");
        // Coche(String claveDocumento, String nombreConductor, String matricula, int anoCompra, String marca, int importancia)
        Coche coche2 = new Coche ( "ADS456GFD-44", "Manuel", "67876-HGJ", 2012, "Ford", 2);
        System.out.println("Año: " +  coche2.getAnoCompra() );
        System.out.println("Marca: " +  coche2.getMarca() );
        System.out.println("Matricula: " +  coche2.getMatricula() );
        System.out.println("Documento: " + coche2.getClaveDocumento() );
        System.out.println("Conductor: " + coche2.getNombreConductor() );
        System.out.println("Total Vehiculos: " + coche2.getTotalVehiculos() );
        System.out.println("Ingresos: " + coche2.calcularIngreso() );
        
        System.out.println("\n\n--- Ingresos Totales");
        Vehiculo ingresos = new Vehiculo();
        System.out.println("Ingresos: " + ingresos.verIngresos() );
        
    }
    
}
