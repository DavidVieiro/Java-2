/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomonedero1;

/**
 *
 * @author dam132
 */
public class Monedero {
    
    private double cantidad;
    
    /**
     * 
     */
    public Monedero() {
    }
    
    /**
     * 
     * @param cantidad 
     */
    public Monedero( double cantidad ) {
        if ( cantidad >= 0 ) {
            this.cantidad = cantidad;
        }
        else {
            System.out.println("No se puede abrir un monedero con cantidad negativa...");
        }
    }
    
    /**
     * 
     * @param dinero_a_sacar 
     */
    public void sacarDinero ( double dinero_a_sacar ) {
        if ( this.cantidad - dinero_a_sacar >= 0 ) {
            cantidad -= dinero_a_sacar;
        }
        else {
            System.out.println("No puedes sacar esa cantidad, tu saldo seria negativo...");
        }
    }
    
    /**
     * 
     * @return 
     */
    public double consultarDinero () {
        
        return cantidad;
    }
    
    public void ingresarDinero ( double cantidad_a_ingresar ) {
        
        cantidad += cantidad_a_ingresar;
        
    }
    
}
