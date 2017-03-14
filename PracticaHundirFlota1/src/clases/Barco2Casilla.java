/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
    private int barcosCreados = 0;
    
    /**
     * Creamos un barco que ocupa 2 casillas en el tablero. Almacenamos el tipo de barco en el "tablero".
     */
    public Barco2Casilla() {
        do {
                
            generarCoord();
            
            if ( crearBarco( this.coordX0, this.coordY0, this.coordX1, this.coordY1 ) ) {
                Tablero.tablero[ this.coordX0 ][ this.coordY0 ] = TIPO;
                Tablero.tablero[ this.coordX1 ][ this.coordY1 ] = TIPO;
                ++barcosCreados;
            }
            if ( Tablero.DEBUG ) {
                debugCoord();
            }
            

        } while ( barcosCreados == 0 );
        
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
     * Comprobamos que el barco que se crea no exista ya en el tablero.
     * @param coordX0 Coordenada X inicial.
     * @param coordY0 Coordenada Y inicial.
     * @param coordX1 Coordenada X final.
     * @param coordY1 Coordenada Y final.
     * @return Verdadero si el barco no existe en esa posicion.
     */
    private boolean crearBarco( int coordX0, int coordY0, int coordX1, int coordY1) {
        
        try {
            if ( Tablero.tablero [ coordX0 ][ coordY0 ] == 0
              && Tablero.tablero [ coordX1 ][ coordY1 ] == 0 ) {
                return true;
            }
        } catch ( ArrayIndexOutOfBoundsException ex1 ) {
            System.out.println("ERROR: " + ex1);
        }
        return false;
        
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
        
        if ( this.coordY0 >= 0 | this.coordY0 < 9 && this.coordX0 >= 0 | this.coordX0 < 9 ) {
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
    
    /**
     * Funcion para mostrar las coordenadas de los barcos creados.
     * Se muestra solo en modo DEBUG.
     */
    private void debugCoord() {
        
        System.out.println("\n--- Coordenadas Barco ---");
        System.out.println(" X0: " + getCoordX0() + " Y0: " + getCoordY0() );
        System.out.println(" X1: " + getCoordX1() + " Y1: " + getCoordY1() );
        System.out.println("--------------------------");
        
    }
}
