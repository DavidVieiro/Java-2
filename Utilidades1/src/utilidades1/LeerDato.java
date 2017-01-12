/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String, byte, int, Float, Double.
 * @author dam132
 */
public class LeerDato {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    // Definimos variables
    String texto, cadena;
    byte numByte;
    int numEntero;
    float numFloat;
    double numDouble;
    
    // Creamos el constructor
    LeerDato () {
        
    }
    
    /**
     * 
     * @return 
     * @throws IOException 
     */
    public String leerString () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce texto");
                this.texto = teclado.readLine();
                sw = true;
            }
            catch ( NumberFormatException ex1) {
                System.out.println("\nERROR: Vuelve a introducir el dato.\n");
                sw = false;
            }
        } while ( !sw );
        
        return texto;
    }
    
    /**
     * 
     * @return 
     * @throws IOException 
     */
    public byte leerByte () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce numero byte");
                this.cadena = teclado.readLine();
                this.numByte = Byte.parseByte(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1) {
                System.out.println("\nERROR: Vuelve a introducir el dato.\n");
                sw = false;
            }
        } while ( !sw );

        return numByte;
    }
    
    /**
     * 
     * @return 
     * @throws IOException 
     */
    public int leerInteger() throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce numero entero");
                cadena = teclado.readLine();
                numEntero = Integer.parseInt(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1) {
                System.out.println("\nERROR: Vuelve a introducir el dato.\n");
                sw = false;
            }
        } while ( !sw );
        
        return numEntero;
    }
    
    /**
     * 
     * @return 
     * @throws IOException 
     */
    public float leerFloat() throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce numero float");
                this.cadena = teclado.readLine();
                this.numFloat = Float.parseFloat(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1) {
                System.out.println("\nERROR: Vuelve a introducir el dato.\n");
                sw = false;
            }
        } while ( !sw );
        
        return numFloat;
    }
    
    /**
     * 
     * @throws IOException 
     */
    public double leerDouble () throws IOException {
        
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce numero double");
                this.cadena = teclado.readLine();
                this.numDouble = Double.parseDouble(cadena);
                sw = true;
            }
            catch ( NumberFormatException ex1) {
                System.out.println("\nERROR: Vuelve a introducir el dato.\n");
                sw = false;
            }
        } while ( !sw );
        
        return numDouble;
    }
    
}
