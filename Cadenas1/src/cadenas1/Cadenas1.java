/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Montar  Nombre
 * 
 * 1 - Leer 3 cadenas: nombre, ape1, ape2.
 * Comprobar no vacíos y todo letras
 * 2 - Montar todos los datos en una cadena.
 * 3 - Montar cadena con las iniciales: "I.S.A."
 * 4 - Poner nombre, ape1, ape2 en minúsculas y la primera letra mayúscula.
 * 
 * @author dam132
 */
public class Cadenas1 {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String nombre, ape1, ape2;
        char c1, c2, c3;
        boolean hayDig = false, hayEsp =  false, hayCharEsp = false;
        int hayLet1 = 0, hayLet2 = 0, hayLet3 = 0;
        
        System.out.println("Introduce un nombre:");
        nombre = teclado.readLine();
        System.out.println("Introduce el primer apellido:");
        ape1 = teclado.readLine();
        System.out.println("Introduce el segundo apellido");
        ape2 = teclado.readLine();
        
        StringBuffer cadNombre;
        StringBuffer cadApe1;
        StringBuffer cadApe2;
        cadNombre = new StringBuffer( nombre );
        cadApe1 = new StringBuffer( ape1 );
        cadApe2 = new StringBuffer( ape2 );
        
        // Comprobamos que los datos introducidos sean todo letras
        for ( int i = 0; i < cadNombre.length(); ++i ) {
            c1 = cadNombre.charAt(i);
            if ( Character.isLetter( c1 ) ) {
                ++hayLet1;
            }
            else if ( Character.isDigit( c1 ) ) {
                hayDig =  true;
            }
            else if ( Character.isSpaceChar( c1 ) ) {
                hayEsp =  true;
            }
            else {
                hayCharEsp = true;
            }
        }
        
        for ( int i = 0; i < cadApe1.length(); ++i ) {
            c2 = cadApe1.charAt(i);
            if ( Character.isLetter( c2 ) ) {
                ++hayLet2;
            }
            else if ( Character.isDigit( c2 ) ) {
                hayDig =  true;
            }
            else if ( Character.isSpaceChar( c2 ) ) {
                hayEsp =  true;
            }
            else {
                hayCharEsp = true;
            }
        }
        
        for ( int i = 0; i < cadApe2.length(); ++i ) {
            c3 = cadApe2.charAt(i);
            if ( Character.isLetter( c3 ) ) {
                ++hayLet3;
            }
            else if ( Character.isDigit( c3 ) ) {
                hayDig =  true;
            }
            else if ( Character.isSpaceChar( c3 ) ) {
                hayEsp =  true;
            }
            else {
                hayCharEsp = true;
            }
        }
        // Mostramos un mensaje en el caso de que no sean todo letras
        if ( hayLet1 < cadNombre.length() | hayLet2 < cadApe1.length() | hayLet3 < cadApe2.length() ) {
            if ( hayDig ) {
                System.out.println("\nHay numeros en los datos introducidos...\n");
            }
            if ( hayEsp ) {
                System.out.println("\nLos datos introducidos contienen espacios...\n");
            }
            if ( hayCharEsp ) {
                System.out.println("\nExisten caracteres especiales en los datos introducidos...\n");
            }
        }
        else {
            // Todos los datos en una cadena
            System.out.println(nombre + " " + ape1 + " " + ape2);

            // Cadena con las iniciales en mayuscula
            System.out.print( Character.toUpperCase( cadNombre.charAt(0) ) + "." );
            System.out.print( Character.toUpperCase( cadApe1.charAt(0) )   + "." );
            System.out.println( Character.toUpperCase( cadApe2.charAt(0) ) );

            // Nombre y Apellidos con la primera letra en mayuscula

            System.out.print( Character.toUpperCase( cadNombre.charAt(0) ) );
            for ( int i = 1; i < cadNombre.length(); ++i ) {
                System.out.print( Character.toLowerCase( cadNombre.charAt(i) ) );
            }
            
            System.out.print( " " +  Character.toUpperCase( cadApe1.charAt(0) ) );
            for ( int i = 1; i < cadApe1.length(); ++i ) {
                System.out.print( Character.toLowerCase( cadApe1.charAt(i) ) );
            }
            
            System.out.print(" " + Character.toUpperCase( cadApe2.charAt(0) ) );
            for ( int i = 1; i < cadApe2.length(); ++i ) {
                System.out.print( Character.toLowerCase( cadApe2.charAt(i) ) );
            }
            // Salto de linea por si acaso
            System.out.println("");
        }
        
    }
    
}
