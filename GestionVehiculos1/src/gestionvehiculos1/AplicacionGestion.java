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
        // Furgoneta( int dinero, int vigilantes, String matricula, int anoCompra, String marca )
        Furgoneta furgon1 = new Furgoneta ( 30000, 4, "4645-DFG", 2010, "Opel" );
        System.out.println("Año: "            + furgon1.getAnoCompra() );
        System.out.println("Marca: "          + furgon1.getMarca() );
        System.out.println("Matricula: "      + furgon1.getMatricula() );
        System.out.println("Dinero: "         + furgon1.getDinero() );
        System.out.println("Num Vigilantes: " + furgon1.getVigilantes() );
        System.out.println("Ingresos: "       + furgon1.getIngresos() );
        
        System.out.println("\n\n--- Vehiculo 2 ---");
        // Furgoneta( int dinero, int vigilantes, String matricula, int anoCompra, String marca )
        Furgoneta furgon2 = new Furgoneta ( 2000, 3, "5465-RRG", 2011, "Renault" );
        System.out.println("Año: "            + furgon2.getAnoCompra() );
        System.out.println("Marca: "          + furgon2.getMarca() );
        System.out.println("Matricula: "      + furgon2.getMatricula() );
        System.out.println("Dinero: "         + furgon2.getDinero() );
        System.out.println("Num Vigilantes: " + furgon2.getVigilantes() );
        System.out.println("Ingresos: "       + furgon2.getIngresos() );
        
        System.out.println("\n\n--- Vehiculo 3 ---");
        // Coche( String claveDocumento, String nombreConductor, String matricula, int anoCompra, String marca, int importancia )
        Coche coche1 = new Coche ( "ADS456GFD-65", "Carlos", "4565-FDG", 2014, "Ford", 0);
        System.out.println("Año: "       + coche1.getAnoCompra() );
        System.out.println("Marca: "     + coche1.getMarca() );
        System.out.println("Matricula: " + coche1.getMatricula() );
        System.out.println("Documento: " + coche1.getClaveDocumento() );
        System.out.println("Conductor: " + coche1.getNombreConductor() );
        System.out.println("Ingresos: "  + coche1.getIngresos() );
        
        System.out.println("\n\n--- Vehiculo 4 ---");
        // Coche( String claveDocumento, String nombreConductor, String matricula, int anoCompra, String marca, int importancia )
        Coche coche2 = new Coche ( "ADS456GFD-44", "Manuel", "6787-HGJ", 2012, "Ford", 2);
        System.out.println("Año: "       + coche2.getAnoCompra() );
        System.out.println("Marca: "     + coche2.getMarca() );
        System.out.println("Matricula: " + coche2.getMatricula() );
        System.out.println("Documento: " + coche2.getClaveDocumento() );
        System.out.println("Conductor: " + coche2.getNombreConductor() );
        System.out.println("Ingresos: "  + coche2.getIngresos() );
        
        System.out.println("\n\n--- Datos Adicionales ---");
        System.out.println("Vechiculos Totales: " + Vehiculo.getTotalVehiculos() );
        System.out.println("Ingresos Totales: "   + Vehiculo.getIngresosTotales() );
        
    }
    
}
