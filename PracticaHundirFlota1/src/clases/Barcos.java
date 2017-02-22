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
    private boolean estado;
    
    /**
     * 
     */
    public Barcos() {
        this.estado = false;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEstado() {
        return estado;
    }
    
    
    
}
