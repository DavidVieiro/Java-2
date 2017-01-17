/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebastringb;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class PruebaStringB {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce cadena ");
        
        try {
            String cadena = teclado.readLine(); //si que funciona
            StringBuffer delreves =  new StringBuffer( cadena );
            System.out.println("Cadena invertida: " + delreves.reverse() );
            
            StringBuffer cad =  new StringBuffer("Cadena Variable");
            System.out.println("Ejemplo de StringBuffer: '" + cad + "'");
            cad.delete(0, 7);
            System.out.println("Borrados 6 primeros caracteres: " + cad );
            cad.append("cadena");
            System.out.println("Apendizada con 'cadena': " + cad );
            System.out.println("Tiene capacidad de : " + cad.capacity() );
            cad.ensureCapacity(32);
            System.out.println("Capacidad sobre 2: " + cad.capacity() );
            System.out.println("Cadena invertida: " + cad.reverse() );
            System.out.println("Muestra el carácter 6: " + cad.charAt(6) );
        }
        catch ( Exception e) {
            
        }
    }
    
}
