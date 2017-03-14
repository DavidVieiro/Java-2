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
public abstract class Barcos {
    
    // true = hundido / false = no hundido
    @SuppressWarnings("FieldMayBeFinal")
    private boolean estado;
    protected final int MIN = 0;
    protected final int MAX = 9;
    
    /**
     * Creamos un barco con los parametros comunes a todos los barcos.
     */
    public Barcos() {
        this.estado = false;
    }
    
    /**
     * Comprobamos el estado actual del barco.
     * @return Estado del barco.
     */
    public boolean isEstado() {
        return estado;
    }
    
    
    /**
     * Genera un numero entero entre el MIN y MAX establecidos. Se usa como parte de las coordenadas.
     * @param min Numero minimo para generar. MIN = 0.
     * @param max Numero maximo para generar. MAX = 9.
     * @return Devuelve el numero aleatorio entre 0 y 9.
     */
    protected static int randomCoord( int min, int max ) {

        Random numero = new Random();
        
        int randomNum;
        randomNum = numero.nextInt( ( max - min ) + 1 ) + min;

        return randomNum;
    }
    
}
