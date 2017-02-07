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
public class Vehiculo {
    
    private String matricula;
    private int anoCompra;
    private String marca;
    private static int totalVehiculos;
    private int ingresos;
    
    public Vehiculo() {
        ++totalVehiculos;
    }
    
    public Vehiculo( String matricula, int anoCompra, String marca ) {
        this.matricula = matricula;
        this.anoCompra = anoCompra;
        this.marca = marca;
        ++totalVehiculos;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnoCompra() {
        return anoCompra;
    }

    public String getMarca() {
        return marca;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }
    
    public int verIngresos() {
        return ingresos;
    }
    
    public void calcularIngresoTotal ( Furgoneta furgo, Coche buga ) {
        
        ingresos += furgo.verIngresos();
        ingresos += buga.verIngresos();
        
    }
    
}
