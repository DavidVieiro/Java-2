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
    private static int totalVehiculos; // tiene que ser static
    private static int ingresos;
    private static int ingresosTotales;
    
    /**
     * 
     */
    public Vehiculo() {
    }
    
    /**
     * 
     * @param matricula
     * @param anoCompra
     * @param marca 
     */
    public Vehiculo( String matricula, int anoCompra, String marca ) {
        this.matricula = matricula;
        this.anoCompra = anoCompra;
        this.marca = marca;
        ++totalVehiculos;
    }
    
    /**
     * 
     * @return 
     */
    public String getMatricula() {
        return matricula;
    }
    
    /**
     * 
     * @return 
     */
    public int getAnoCompra() {
        return anoCompra;
    }
    
    /**
     * 
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * 
     * @return 
     */
    public int getTotalVehiculos() {
        return totalVehiculos;
    }
    
    /**
     * 
     * @return 
     */
    public int verIngresos() {
        return ingresos;
    }
    
    /**
     * 
     */
    static public void calcularIngresoTotal() {
        
        ingresosTotales += ingresos;
        
    }
    
    /**
     * 
     * @return 
     */
    public int getIngresosTotales() {
        return ingresosTotales;
    }
    
}
