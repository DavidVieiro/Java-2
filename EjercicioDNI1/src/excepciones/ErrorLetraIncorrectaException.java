/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author dam132
 */
public class ErrorLetraIncorrectaException extends Exception {
    
    public ErrorLetraIncorrectaException () {
    }
    
    @Override
    public String getMessage() {

        return "\nERROR: La letra no es correcta...";
    }
}
