/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Crea una clase aplicacion que lea una cadena y nos diga:
 * - Por cada caracter si es o no letra
 * - Cuantos Digitos
 * - Cuantos Espacios
 * - Longitud
 * - Convertir primer caracter a cadena y mostrar longitud
 * 
 * @author dam132
 */
public class Character2 {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String cadena, aux;
        char c;
        int numDigitos = 0, numEspacios = 0;
        
        System.out.println("Introduce un String");
        cadena = teclado.readLine();
        
        StringBuffer cad;
        cad = new StringBuffer( cadena );
        
        for ( int i = 0; i <= cad.length()-1; ++i ) {
            c = cad.charAt(i);
            if ( Character.isLetter( c ) ) {
                System.out.println("El caracter en la posicion " + i + " ES LETRA ( " + c + " )" );
            }
            else {
                System.out.println("El caracter en la posicion " + i + " NO ES LETRA ( " + c + " )" );
                if ( Character.isDigit( c ) ) {
                    ++numDigitos;
                }
                else if ( Character.isSpaceChar( c ) ) {
                    ++numEspacios;
                }
            }
        }
        
        System.out.println("\nLa cantidad de DIGITOS en la cadena es " + numDigitos );
        System.out.println("La cantidad de ESPACIOS en la cadena es " + numEspacios );
        System.out.println("La longitud de la cadena es: " + cad.length() );
        
        aux = Character.toString( cad.charAt(0) );
        System.out.println("El String es: " + aux);
        
        System.out.println("La longitud es " + aux.length() );
    }
    
}
