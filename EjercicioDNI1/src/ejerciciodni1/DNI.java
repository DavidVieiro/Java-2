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
public class DNI {
    
    private String dni;
    private final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    /**
     * 
     * @param dni
     * @throws ErrorLetraIncorrectaException
     * @throws ErrorSinDigitosException
     * @throws ErrorLongitudException 
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
     * Comprobamos si la longitud del DNI es de 8 o 9.
     * @param dni
     * @return 
     */
    private boolean controlTamano( String dni ) {
        
        this.dni = dni;
        
        if ( dni.length() == 9 ) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /**
     * 
     * @param dni
     * @return 
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
        
        if ( comprobarDigito == 8 && comprobarCeros < 8 ) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * 
     * @param dni
     * @return 
     */
    private boolean letraCorrecta( String dni ) {
        
        this.dni = dni;
        int comprobarLetra = 0;
        
        for ( int i = 0; i < this.LETRAS.length(); ++i  ) {
            if ( Character.toUpperCase( dni.charAt( 8 ) ) == this.LETRAS.charAt(i) ) {
                ++comprobarLetra;
            }
        }
        
        if ( comprobarLetra == 1 ) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String getDni() {
        return dni;
    }
    
}
