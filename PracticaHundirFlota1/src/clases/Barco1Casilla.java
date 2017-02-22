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
    private int coordX;
    private int coordY;
    private final int MIN = 0;
    private final int MAX = 9;
    
    /**
     * 
     */
    public Barco1Casilla() {
        this.coordX = randomCoord( MIN, MAX );
        this.coordY = randomCoord( MIN, MAX );
    }
    
    /**
     * Obtiene el tipo de barco. AKA numero de casillas que ocupa.
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

        Random num1 = new Random();
        
        int randomNum;
        randomNum = num1.nextInt( ( max - min ) + 1 ) + min;

        return randomNum;
    }
    
    
    
    
    
}
