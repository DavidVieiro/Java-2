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
public class Barco1Casilla extends Barcos {
    
    // numero de casillas que ocupa el barco
    private final byte TIPO = 1;
    @SuppressWarnings("FieldMayBeFinal")
    private int coordX;
    @SuppressWarnings("FieldMayBeFinal")
    private int coordY;
    private final int MIN = 0;
    private final int MAX = 9;
    private boolean seguir;
    
    /**
     * Creamos un barco que ocupa 1 casilla en el tablero.
     */
    public Barco1Casilla() {
//        do {
            this.coordX = randomCoord( MIN, MAX );
            this.coordY = randomCoord( MIN, MAX );
            
//            if ( !"".equals( tablero[ this.coordX ][ this.coordY ] ) ) {
                tablero[ this.coordX ][ this.coordY ] = "B";
//                seguir = true;
//                
//            }
//            else {
//                seguir = false;
//            }
//
//        } while ( seguir == false );
        
        
    }
    
    /**
     * Obtiene el tipo de barco. Numero de casillas que ocupa.
     * @return 
     */
    public byte getTipo() {
        return TIPO;
    }
    
    /**
     * Devuelve la coordenada X.
     * @return Coordenada X.
     */
    public int getCoordX() {
        return coordX;
    }
    
    /**
     * Devuelve la coordenada Y.
     * @return Coordenada Y.
     */
    public int getCoordY() {
        return coordY;
    }
    
    /**
     * Genera un numero entero entre el MIN y MAX establecidos. Se usa como parte de las coordenadas.
     * @param min Numero minimo para generar. MIN = 0.
     * @param max Numero maximo para generar. MAX = 9.
     * @return Devuelve el numero aleatorio entre 0 y 9.
     */
    public static int randomCoord( int min, int max ) {

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
    private boolean crearBarco( int coordX, int coordY) {
        
        return "B".equals(tablero [ coordX ][ coordY ]);
    }
    
}
