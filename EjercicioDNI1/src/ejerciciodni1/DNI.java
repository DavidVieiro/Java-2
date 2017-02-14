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
    
    public String getDni() {
        return dni;
    }
    
    public DNI( String dni ) {
        
        if ( controlTamano( dni ) ) {
            if ( todoDigitos( dni ) ) {
                if ( letraCorrecta ( dni ) ) {
                    this.dni = dni;
                    System.out.println("TODO CORRECTO");
                }
                else {
                    System.out.println("\nERROR: La letra no es correcta...");
                }
            }
            else {
                System.out.println("\nERROR: El DNI no empieza por digitos...");
            }
        }
        else {
            System.out.println("\nERROR: EL tamaño del DNI no es el correcto...");
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
    
    private boolean todoDigitos( String dni ) {
        
        this.dni = dni;
        int comprobarDigito = 0;
        
        for ( int j = 0; j < dni.length(); ++j ) {
            if ( Character.isDigit( dni.charAt( j ) ) ) {
                ++comprobarDigito;
            }
        }
        
        if ( comprobarDigito == 8 ) {
            return true;
        }
        else {
            return false;
        }
    }
    
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
    
}
