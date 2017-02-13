/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomonedero3;

/**
 *
 * @author dam132
 */
public class Monedero {
    
    private double cantidad;
    
    /**
     * Creamos un monedero con una cantidad por defecto, en nuestro caso 0.
     * @param cantidad Cantidad de dinero que hay en nuestro monedero.
     * @throws ejerciciomonedero3.ErrorCrearMonederoException
     */
    public Monedero( double cantidad ) throws ErrorCrearMonederoException {
        if ( cantidad >= 0 ) {
            this.cantidad = cantidad;
        }
        else {
            throw new ErrorCrearMonederoException ("\nERROR: No se puede abrir un monedero con cantidad negativa...");
        }
    }
    
    /**
     * Sacamos una cantidad de dinero del Monedero.
     * @param dinero_a_sacar Cantidad de dinero que nos disponemos a sacar. La cantidad tiene que ser mayor o igual a 0.
     * @throws ejerciciomonedero3.ErrorSacarDineroException 
     */
    public void sacarDinero ( double dinero_a_sacar ) throws ErrorSacarDineroException {
        if ( dinero_a_sacar >= 0 ) {
            this.cantidad -= dinero_a_sacar;
        }
        else {
            throw new ErrorSacarDineroException ("\nERROR: No se puede retirar una cantidad de dinero negativa...");
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
     * @throws ejerciciomonedero3.ErrorIngresarDineroException
     */
    public void ingresarDinero ( double cantidad_a_ingresar ) throws ErrorIngresarDineroException {
        if ( cantidad_a_ingresar > 0 ) {
            this.cantidad += cantidad_a_ingresar;
        }
        else {
            throw new ErrorIngresarDineroException ("\nERROR: No puede ingresar una cantidad igual o menor a 0.");
        }
        
        
    }
    
}
