/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.Barco1Casilla;

/**
 *
 * @author dam132
 */
public class HundirFlota {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Barco1Casilla(int coordX, int coordY, boolean estado)
        Barco1Casilla barco1 = new Barco1Casilla();
        
        System.out.println("--- Informacion del barco ---");
        System.out.println("Tipo: " + barco1.getTipo() );
        System.out.println("Coordenadas: X = " + barco1.getCoordX() + " | Y = " + barco1.getCoordY() );
        System.out.println("Estado: " + barco1.isEstado() );
    }
    
}
