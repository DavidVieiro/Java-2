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
public class ErrorLongitudException extends Exception {
    
    public ErrorLongitudException () {
    }
    
    @Override
    public String getMessage() {

        return "\nERROR: La longitud del DNI no es la correcta...";
    }
}
