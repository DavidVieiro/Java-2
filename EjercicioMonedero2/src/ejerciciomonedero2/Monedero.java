/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomonedero2;

/**
 *
 * @author dam132
 */
public class Monedero {
    
    private double cantidad;
    
    /**
     * Creamos un monedero con una cantidad por defecto, en nuestro caso 0.
     * @param cantidad Cantidad de dinero que hay en nuestro monedero.
     */
    public Monedero( double cantidad ) {
        if ( cantidad >= 0 ) {
            this.cantidad = cantidad;
        }
        else {
            System.out.println("\nERROR: No se puede abrir un monedero con cantidad negativa...");
        }
    }
    
    /**
     * Sacamos una cantidad de dinero del Monedero.
     * @param dinero_a_sacar Cantidad de dinero que nos disponemos a sacar. La cantidad tiene que ser mayor o igual a 0.
     * @throws ejerciciomonedero2.ErrorDineroException 
     */
    public void sacarDinero ( double dinero_a_sacar ) throws ErrorDineroException {
        if ( this.cantidad - dinero_a_sacar >= 0 ) {
            cantidad -= dinero_a_sacar;
        }
        else {
            throw new ErrorDineroException ("\nERROR: No se puede abrir un monedero con cantidad negativa...");
        }
    }
    
    /**
     * Consultamos la cantidad de dinero actual de nuestro monedero.
     * @return Dinero del monedero.
     */
    public double consultarDinero () {
        
        return cantidad;
    }
    
    /**
     * Ingresamos una cantidad de dinero en el Monedero.
     * @param cantidad_a_ingresar Cantidad a ingresar. No puede ser menor o igual a 0.
     */
    public void ingresarDinero ( double cantidad_a_ingresar ) {
        if ( cantidad_a_ingresar > 0 ) {
            cantidad += cantidad_a_ingresar;
        }
        else {
            System.out.println("\nERROR: No puede ingresar una cantidad igual o menor a 0.");
        }
        
        
    }
    
}
