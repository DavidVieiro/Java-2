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
public class Furgoneta extends Vehiculo {
    
    private int dinero;
    private int vigilantes;
    private int ingresos;
    
    /**
     * 
     */
    public Furgoneta() {
    }
    
    /**
     * 
     * @param dinero Cantidad de dinero transportado en el Vehiculo.
     * @param vigilantes Numero de vigilantes que van en el vehiculo.
     * @param matricula Matricula del Vehiculo
     * @param anoCompra Año de compra del Vehiculo
     * @param marca  Marca del Vehiculo.
     */
    public Furgoneta( int dinero, int vigilantes, String matricula, int anoCompra, String marca ) {
        super(matricula, anoCompra, marca);
        this.dinero = dinero;
        this.vigilantes = vigilantes;
        calcularIngreso();
    }
    
    /**
     * 
     * @return 
     */
    public int getDinero() {
        return dinero;
    }
    
    /**
     * 
     * @return 
     */
    public int getVigilantes() {
        return vigilantes;
    }
    
    /**
     * 
     */
    public final void calcularIngreso () {
        
        if ( dinero >= 6000 ) {
            ingresos = 120;
        }
        else {
            ingresos = 60;
        }
        
        super.calcularIngresoTotal();
    }
    
    /**
     * 
     * @return 
     */
    public int getIngresos() {
        return ingresos;
    }
    
}
