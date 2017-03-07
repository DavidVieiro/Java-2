/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

/**
 *
 * @author dam132
 */
public class Barco2Casilla extends Barcos {
    
    // numero de casillas que ocupa el barco
    private static final byte TIPO = 2;
    private int coordX0;
    private int coordY0;
    private int coordX1;
    private int coordY1;
    private final int MIN = 0;
    private final int MAX = 9;
    private int barcosCreados = 0;
    
    /**
     * Creamos un barco que ocupa 2 casillas en el tablero. Almacenamos el tipo de barco en el "tablero".
     */
    public Barco2Casilla() {
        do {
                
            generarCoord();
            
            if ( crearBarco(this.coordX0, this.coordY0 ) ) {
                Tablero.tablero[ this.coordX0 ][ this.coordY0 ] = TIPO;
                if ( crearBarco(this.coordX1, this.coordY1 ) ) {
                    try {
                        Tablero.tablero[ this.coordX1 ][ this.coordY1 ] = TIPO;
                        ++barcosCreados;
                    } catch ( ArrayIndexOutOfBoundsException ex1 ) {
                        
                    }
                }
            }
            if ( Tablero.DEBUG ) {
                debugCoord();
            }
            

        } while ( barcosCreados == 0);
        
    }
    
    /**
     * Obtiene el tipo de barco. Numero de casillas que ocupa.
     * @return Numero de casillas que ocupa el barco.
     */
    public static byte getTipo() {
        return TIPO;
    }
    
    /**
     * Devuelve la coordenada X de la primera posicion.
     * @return Coordenada X de la primera posicion.
     */
    public int getCoordX0() {
        return coordX0;
    }
    
    /**
     * Devuelve la coordenada Y de la primera posicion.
     * @return Coordenada Y de la primera posicion.
     */
    public int getCoordY0() {
        return coordY0;
    }
    
    /**
     * Devuelve la coordenada X de la segunda posicion.
     * @return Coordenada X de la segunda posicion.
     */
    public int getCoordX1() {
        return coordX1;
    }
    
    /**
     * Devuelve la coordenada Y de la segunda posicion.
     * @return Coordenada Y de la segunda posicion. 
     */
    public int getCoordY1() {
        return coordY1;
    }
    
    /**
     * Genera un numero entero entre el MIN y MAX establecidos. Se usa como parte de las coordenadas.
     * @param min Numero minimo para generar. MIN = 0.
     * @param max Numero maximo para generar. MAX = 9.
     * @return Devuelve el numero aleatorio entre 0 y 9.
     */
    private static int randomCoord( int min, int max ) {

        Random numero = new Random();
        
        int randomNum;
        randomNum = numero.nextInt( ( max - min ) + 1 ) + min;

        return randomNum;
    }
    
    /**
     * Comprobamos que el barco que se crea no exista ya en el tablero.
     * @param coordX Coordenada X.
     * @param coordY Coordenada Y.
     * @return Verdadero si el barco no existe en esa posicion.
     */
    private boolean crearBarco( int coordX, int coordY ) {
        
        return Tablero.tablero [ coordX ][ coordY ] == 0;
    }
    
    /**
     * Generamos un numero aleatorio para crear el barco en vertical o horizontal ( vertical ).
     * Generamos un numero aleatorio para crear el barco antes o despues de la pimera parte ( delante ).
     */
    private void generarCoord() throws ArrayIndexOutOfBoundsException {
        
        int vertical = randomCoord( 0, 1 );
        this.coordX0 = randomCoord( MIN, MAX );
        this.coordY0 = randomCoord( MIN, MAX );
        int delante;
        
        if ( this.coordY0 == 0 | this.coordY0 == 9 && this.coordX0 == 0 | this.coordX0 == 9 ) {
            delante = 0;
        }
        else {
            delante = 1;
        }
        
        // Vertical
        if ( vertical == 0 ) {
            if ( delante == 0 ) {

                this.coordX1 = coordX0 + 1;
                this.coordY1 = coordY0;

            }
            else {
                this.coordX1 = coordX0 - 1;
                this.coordY1 = coordY0;
            }
        }
        // Horizontal
        else {   
            if ( delante == 0 ) {

                this.coordX1 = coordX0;
                this.coordY1 = coordY0 + 1;

            }
            else {
                this.coordX1 = coordX0;
                this.coordY1 = coordY0 - 1;
            }
        }
        
    }
    
    private void debugCoord() {
        
        System.out.println("\n--- Coordenadas Barco ---");
        System.out.println(" X0: " + getCoordX0() + " Y0: " + getCoordY0() );
        System.out.println(" X1: " + getCoordX1() + " Y1: " + getCoordY1() );
        System.out.println("--------------------------");
        
    }
}
