/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.Tablero;
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
        
        // Creamos el tablero con los barcos
        Tablero partida1 = new Tablero();
        
        System.out.println("\nSe han creado " + partida1.barcosRestantes() + " barcos." );
        System.out.println("2 Submarinos y 3 Buques");
        
        do {
            System.out.println("\n\n");
            Tablero.dibujarTablero ();

            Tablero.dispararCannon();
            
            System.out.println("\nBarcos restantes: " + partida1.barcosRestantes() );
        } while ( partida1.barcosRestantes() != 0 );
        
        if ( partida1.barcosRestantes() == 0 ) {
            System.out.println("\nENHORABUENA HAS DESTRUIDO TODOS LOS BARCOS DEL ENEMIGO!!!");
        }
    }
    
}
