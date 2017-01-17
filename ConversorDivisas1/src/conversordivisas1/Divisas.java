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
    
    // Llamamos a la clase LeerDato
    LeerDato leerDato1 = new LeerDato();
    
    // Variables
    
    double eurosLibras  = 0.86628;
    double librasEuros  = 1.15436;
    double eurosDolares = 1.06557;
    double dolaresEuros = 0.93846;
    
    String cadena;
    byte opcion, subOpcion;
    
    // Constructores
    Divisas () {
        
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Euros a Libras
     * @throws java.io.IOException 
     */
    public double eurosLibras () throws IOException {
        
        double aux;
        
        System.out.println("Introduce valor en Euros para convertirlo a Libras");
        aux = leerDato1.leerDouble();
        aux *= this.eurosLibras;
        
        return aux;
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Libras a Euros
     * @throws java.io.IOException 
     */
    public double librasEuros () throws IOException {
        
        boolean sw;
        double aux = 0;
        
        do {
            try {
                System.out.println("Introduce valor en Libras para convertirlo a Euros");
                this.cadena = teclado.readLine();
                aux = this.librasEuros;
                aux *= Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        return aux;
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Euros a Dolares
     * @throws java.io.IOException 
     */
    public double eurosDolares () throws IOException {
        
        boolean sw;
        double aux = 0;
        
        do {
            try {
                System.out.println("Introduce valor en Euros para convertirlo a Dolares");
                this.cadena = teclado.readLine();
                aux = this.eurosDolares;
                aux *= Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        return aux;
    }
    
    /**
     * 
     * @return Convierte el valor introducido en Dolares a Euros
     * @throws java.io.IOException 
     */
    public double dolaresEuros () throws IOException {
        
        boolean sw;
        double aux = 0;
        
        do {
            try {
                System.out.println("Introduce valor en Dolares para convertirlo a Euros");
                this.cadena = teclado.readLine();
                aux = this.dolaresEuros;
                aux *= Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        return aux;
    }
    
    /**
     * 
     */
    public void getDivisas () {
        
        System.out.println("\nEl valor actual de las divisas es:");
        System.out.println("Euros   --> Libras:  " + eurosLibras );
        System.out.println("Libras  --> Euros:   " + librasEuros );
        System.out.println("Euros   --> Dolares: " + eurosDolares );
        System.out.println("Dolares --> Euros:   " + dolaresEuros);
    }
    
    /**
     * 
     * @throws IOException 
     */
    public void setDivisas () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce valor de la Libra con respecto al Euro");
                this.cadena = teclado.readLine();
                this.eurosLibras = Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        
        do {
            try {
                System.out.println("Introduce valor del Euro con respecto a la Libra");
                this.cadena = teclado.readLine();
                this.librasEuros = Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        
        do {
            try {
                System.out.println("Introduce valor del Dolar respecto al Euro");
                this.cadena = teclado.readLine();
                this.eurosDolares = Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        
        do {
            try {
                System.out.println("Introduce valor del Euro respecto al Dolar");
                this.cadena = teclado.readLine();
                this.dolaresEuros = Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Vuelve a introducir el valor.\n");
                sw = false;
            }
        } while ( !sw );
        
        System.out.println("\nValores cambiados...");
    }
    
}
