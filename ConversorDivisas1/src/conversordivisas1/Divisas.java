/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordivisas1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class Divisas {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    // Variables
    
    double eurosLibras = 0.86628;
    double librasEuros = 1.15436;
    double eurosDolares = 1.06557;
    double dolaresEuros = 0.93846;
    String cadena;
    byte opcion;
    
    // Constructores
    Divisas () {
        
    }
    
    /**
     * 
     * @throws java.io.IOException
     */
    public void menu () throws IOException {
        
        boolean continuar = true;
        
        do {
            
            System.out.println("Elige una opcion del menu:");
            System.out.println("1 - Consultar las divisas actuales");
            System.out.println("2 - Realizar conversiones de divisas");
            System.out.println("3 - SALIR");
            
            try {
                this.opcion = Byte.parseByte(teclado.readLine());
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Introduce un valor numerico correcto...");
            }
            
            switch (opcion) {
            case 1:
                System.out.println("OPCION1");
                break;
            case 2:
                System.out.println("OPCION2");
                break;
            case 3:
                System.out.println("\n\nSaliendo del programa...");
                break;
            default:
                System.out.println("\nERROR: Introduce una opcion de menu correcta...");
                continuar = false;
            }
            
        } while ( !continuar );
        
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Euros a Libras
     * @throws java.io.IOException 
     */
    public double eurosLibras () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce valor en Euros para convertirlo a Libras");
                this.cadena = teclado.readLine();
                this.eurosLibras *= Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        return eurosLibras;
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Libras a Euros
     * @throws java.io.IOException 
     */
    public double librasEuros () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce valor en Libras para convertirlo a Euros");
                this.cadena = teclado.readLine();
                this.librasEuros *= Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        return librasEuros;
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Euros a Dolares
     * @throws java.io.IOException 
     */
    public double eurosDolares () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce valor en Euros para convertirlo a Dolares");
                this.cadena = teclado.readLine();
                this.eurosDolares *= Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        return eurosDolares;
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Dolares a Euros
     * @throws java.io.IOException 
     */
    public double dolaresEuros () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce valor en Dolares para convertirlo a Euros");
                this.cadena = teclado.readLine();
                this.dolaresEuros *= Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        return dolaresEuros;
    }
    
    
    
}
