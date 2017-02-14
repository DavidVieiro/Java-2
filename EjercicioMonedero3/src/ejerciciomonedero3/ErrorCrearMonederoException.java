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
public class ErrorCrearMonederoException extends Exception {
    
    public ErrorCrearMonederoException ( String msg ) {
        
        super ( msg );
    }
    
//    public ErrorCrearMonederoException () {
//    }
//    
//    @Override
//    public String getMessage() {
//
//        return "\nERROR: No se puede abrir un monedero con cantidad negativa...";
//    }
    
}
