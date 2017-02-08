/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

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
    /**
     * Constructor del circulo sin parametros.
     */
    public Circulo () {
        
    }
    
    /**
     * Creamos el circulo estableciendo un radio al circulo.
     * @param radio Radio del circulo
     */
    public Circulo ( int radio) {
        this.radio = radio;
    }
    
    // Metodos / Funciones
    
    /**
     * Devuelve la longitud de la circunferencia 2 * PI * r
     * @return Longitud de la circunferencia
     */
    public double calcularLongitud( ) {
        
        longitud = 2 * Math.PI * radio;
        
        return longitud;
    }
    
    /**
     * Devuelve el area de la circunferencia PI * r ^ 2
     * @return Area de la circunferencia
     */
    public double calcularArea( ) {
        
        area = Math.PI * Math.pow( radio, 2 );
        
        return area;
    }
    
    /**
     * Devuelve el valor del radio de la circunferencia.
     * @return Radio de la circunferencia.
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
    
    /**
     * Calcula que area es mayor entre 2 circulos.
     * @param circulo1 Area del primer circulo
     * @param circulo2 Area del segundo circulo
     * @return Area del circulo que es mas grande.
     */
    static Circulo mayorCirculo ( Circulo circulo1, Circulo circulo2 ) {
        
        if ( circulo1.calcularArea() > circulo2.calcularArea() ) {
            
            return circulo1;
        }
        else {
            
            return circulo2;
        }
    }
    
}
