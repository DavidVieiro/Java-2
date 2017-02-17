/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodni1;

import excepciones.ErrorSinDigitosException;
import excepciones.ErrorLongitudException;
import excepciones.ErrorLetraIncorrectaException;

/**
 *
 * @author dam132
 */
public class DNI {
    
    private String dni;
    private final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    /**
     * Creamos el DNI haciendo las comprobaciones pertinentes primero.
     * @param dni Variable del DNI.
     * @throws ErrorLetraIncorrectaException Comprueba si la letra es correcta.
     * @throws ErrorSinDigitosException Comprueba si hay digitos en el DNI.
     * @throws ErrorLongitudException Comprueba que el DNI tenga una longitud correcta.
     */
    public DNI( String dni ) throws ErrorLetraIncorrectaException, ErrorSinDigitosException, ErrorLongitudException {
        
        if ( controlTamano( dni ) ) {
            if ( todoDigitos( dni ) ) {
                if ( letraCorrecta ( dni ) ) {
                    this.dni = dni;
                }
                else {
                    throw new ErrorLetraIncorrectaException ();
                }
            }
            else {
                throw new ErrorSinDigitosException ();
            }
        }
        else {
            throw new ErrorLongitudException ();
        }
    }
    
    /**
     * Comprobamos si la longitud del DNI es de 9.
     * @param dni Variable del DNI.
     * @return Devuelve si la longitud es correcta o incorrecta
     */
    private boolean controlTamano( String dni ) {
        
        this.dni = dni;
        
        return dni.length() == 9;
        
    }
    
    /**
     * Comprueba que los primeros 8 caracteres sean numeros. Tambien comprobamos que no sean todo ceros.
     * @param dni Variable del DNI.
     * @return Devuelve si son todo numeros y no son todo ceros.
     */
    private boolean todoDigitos( String dni ) {
        
        this.dni = dni;
        int comprobarDigito = 0;
        int comprobarCeros = 0;
        
        for ( int j = 0; j < dni.length(); ++j ) {
            if ( Character.isDigit( dni.charAt( j ) ) ) {
                
                ++comprobarDigito;
                // El cero representado en entero es el 48 segun la tabla ASCII
                if ( dni.charAt( j ) == 48  ) {
                    ++comprobarCeros;
                }
            }
        }
        
        return comprobarDigito == 8 && comprobarCeros < 8;
    }
    
    /**
     * Comprueba que la letra del DNI sea correcta.
     * @param dni Variable del DNI.
     * @return Devuelve si contiene una letra correcta.
     */
    private boolean letraCorrecta( String dni ) {
        
        this.dni = dni;
        int comprobarLetra = 0;
        
        for ( int i = 0; i < this.LETRAS.length(); ++i  ) {
            if ( Character.toUpperCase( dni.charAt( 8 ) ) == this.LETRAS.charAt(i) ) {
                ++comprobarLetra;
            }
        }
        
        return comprobarLetra == 1;
    }
    
    /**
     * Obtenemos el DNI almacenado en la variable.
     * @return Variable del DNI.
     */
    public String getDni() {
        return dni;
    }
    
}
