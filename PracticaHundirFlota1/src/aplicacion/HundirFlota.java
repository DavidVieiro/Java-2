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
        
        Barco1Casilla barco1 = new Barco1Casilla();
//        
//        System.out.println("\n--- Informacion del barco 1 ---");
//        System.out.println("Tipo: " + barco1.getTipo() );
//        System.out.println("Coordenadas: X = " + barco1.getCoordX() + " | Y = " + barco1.getCoordY() );
//        System.out.println("Estado: " + barco1.isEstado() );
        
        Barco1Casilla barco2 = new Barco1Casilla();
//        
//        System.out.println("\n--- Informacion del barco 2 ---");
//        System.out.println("Tipo: " + barco2.getTipo() );
//        System.out.println("Coordenadas: X = " + barco2.getCoordX() + " | Y = " + barco2.getCoordY() );
//        System.out.println("Estado: " + barco2.isEstado() );
        
        Barco1Casilla barco3 = new Barco1Casilla();
//        
//        System.out.println("\n--- Informacion del barco 3 ---");
//        System.out.println("Tipo: " + barco3.getTipo() );
//        System.out.println("Coordenadas: X = " + barco3.getCoordX() + " | Y = " + barco3.getCoordY() );
//        System.out.println("Estado: " + barco3.isEstado() );
        
        Barco1Casilla barco4 = new Barco1Casilla();
//        
//        System.out.println("\n--- Informacion del barco 4 ---");
//        System.out.println("Tipo: " + barco4.getTipo() );
//        System.out.println("Coordenadas: X = " + barco4.getCoordX() + " | Y = " + barco4.getCoordY() );
//        System.out.println("Estado: " + barco4.isEstado() );
        
        Barco1Casilla barco5 = new Barco1Casilla();
//        
//        System.out.println("\n--- Informacion del barco 5 ---");
//        System.out.println("Tipo: " + barco5.getTipo() );
//        System.out.println("Coordenadas: X = " + barco5.getCoordX() + " | Y = " + barco5.getCoordY() );
//        System.out.println("Estado: " + barco5.isEstado() );
        
        do {
            System.out.println("\n\n");
            Barcos.dibujarTablero ();

            Barcos.dispararCannon();
            
            System.out.println("\n\nBarcos restantes: " + Barcos.barcosRestantes() );
        } while ( Barcos.barcosRestantes() != 0 );
        
    }
    
}
