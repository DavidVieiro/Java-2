/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Leer una cadena:
 * Decir el tamaño de la cadena.
 * Decir de cada caracter si es digito o letra.
 * En caso de ser letra decir si es vocal o consonante, mayuscula o minuscula 
 * otro caracter
 * 
 * @author dam132
 */
public class Character1 {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String cadena;
        char c;
        
        System.out.println("Introduce un String");
        cadena = teclado.readLine();
        
        StringBuffer cad;
        cad = new StringBuffer( cadena );
        
        System.out.println("\n--- La longitud de la cadena es: " + cad.length() + " ---" );
        // isDigit() isLetter() isSpaceChar()
        for ( int i = 0; i <= cad.length()-1; ++i ) {
            c = cad.charAt(i);
            if ( Character.isDigit( c ) ) {
                System.out.println("El caracter en la posicion " + i + " es el NUMERO: " + c );
            }
            else if ( Character.isLetter( c ) ) {
                System.out.print("El caracter en la posicion " + i + " es");
                if ( Character.toLowerCase( c ) == 'a'
                  || Character.toLowerCase( c ) == 'e'
                  || Character.toLowerCase( c ) == 'i'
                  || Character.toLowerCase( c ) == 'o'
                  || Character.toLowerCase( c ) == 'u' ) {
                    System.out.print(" una VOCAL y ");
                }
                else {
                    System.out.print(" una CONSONANTE y ");
                }
                if ( Character.isLowerCase( c ) ) {
                   System.out.println("LETRA MINUSCULA: " + c ); 
                }
                else {
                    System.out.println("LETRA MAYUSCULA: " + c );
                }
                
            }
            else if ( Character.isSpaceChar( c ) ) {
                System.out.println("El caracter en la posicion " + i + " es un ESPACIO");
            }
            else {
                System.out.println("El caracter en la posicion " + i + " es el CARACTER ESPACIAL: " + c );
            }
        }
    }
    
}
