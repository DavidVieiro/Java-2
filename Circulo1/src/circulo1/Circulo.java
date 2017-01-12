/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class Circulo {
    
    // Variables
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    private int radio;
    private double area;
    private double longitud;
    
    // Constructores
    Circulo () {
        
    }
    
    Circulo ( int radio) {
        this.radio = radio;
    }
    
    // Metodos / Funciones
    
    /**
     * Devuelve la longitud de la circunferencia 2 * PI * r
     * @return Devuelve la longitud de la circunferencia
     */
    public double calcularLongitud( ) {
        
        longitud = 2 * Math.PI * radio;
        
        return longitud;
    }
    
    /**
     * Devuelve el area de la circunferencia PI * r ^ 2
     * @return Devuelve el area de la circunferencia
     */
    public double calcularArea( ) {
        
        area = Math.PI * Math.pow( radio, 2 );
        
        return area;
    }
    
    /**
     * 
     * @return Devuelve el valor del radio de la circunferencia.
     * @throws java.io.IOException
     */
    public int setRadio() throws IOException {
        
        String texto;
        int r = 0;
        boolean sw;
        
        do {
            try {
                System.out.println("Introduce el radio del circulo: ");
                texto = teclado.readLine();
                r = Integer.valueOf(texto);
                sw = true;
                
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("Introduce un numero correcto");
                sw = false;
            }
        } while ( !sw );
        
        return r;
        
    }
    
//    public void getRadio ( ) {
//        
//        this.radio = radio;
//        
//    }
//    
//    public void mostrarRadio ( Circulo circulo ) {
//        System.out.println("\nEl radio es: " + circulo.getRadio() );
//    }
    
    static Circulo mayorCirculo ( Circulo circulo1, Circulo circulo2 ) {
        
        if ( circulo1.calcularArea() > circulo2.calcularArea() ) {
            
            return circulo1;
        }
        else {
            
            return circulo2;
        }
    }
    
}
