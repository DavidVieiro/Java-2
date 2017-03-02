/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.Barco1Casilla;
import clases.Barcos;
import java.io.IOException;

/**
 *
 * @author dam132
 */
public class HundirFlota {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        // Creamos los 5 barcos
        Barco1Casilla barco1 = new Barco1Casilla();
        Barco1Casilla barco2 = new Barco1Casilla();
        Barco1Casilla barco3 = new Barco1Casilla();
        Barco1Casilla barco4 = new Barco1Casilla();
        Barco1Casilla barco5 = new Barco1Casilla();
        
        System.out.println("\nSe han creado " + Barcos.barcosRestantes() + " barcos." );
        
        do {
            System.out.println("\n\n");
            Barcos.dibujarTablero ();

            Barcos.dispararCannon();
            
            System.out.println("\nBarcos restantes: " + Barcos.barcosRestantes() );
        } while ( Barcos.barcosRestantes() != 0 );
        
        if ( Barcos.barcosRestantes() == 0 ) {
            System.out.println("\nENHORABUENA HAS DESTRUIDO TODOS LOS BARCOS DEL ENEMIGO!!!");
        }
    }
    
}
