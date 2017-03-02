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
public abstract class Barcos {
    
    // true = hundido / false = no hundido
    @SuppressWarnings("FieldMayBeFinal")
    private boolean estado;
    static String[][] tablero = new String[10][10];
    
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
    
}
