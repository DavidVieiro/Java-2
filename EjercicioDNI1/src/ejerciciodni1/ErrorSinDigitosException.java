/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodni1;

/**
 *
 * @author dam132
 */
public class ErrorSinDigitosException extends Exception {
    
    public ErrorSinDigitosException () {
    }
    
    @Override
    public String getMessage() {

        return "\nERROR: El DNI no empieza por digitos...";
    }
}
