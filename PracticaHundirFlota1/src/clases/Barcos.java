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
    
    /**
     * Dibujamos el tablero donde se esconderan los barcos.
     */
    public static void dibujarTablero () {
        for ( int i = 0; i < Barcos.tablero.length; ++i ) {
            for ( int j = 0; j < Barcos.tablero.length; ++j ) {
                if ( "B".equals( Barcos.tablero[i][j] ) ) {
                    System.out.println("Barco en Coordenadas: X = " + i + " Y = " + j );
                }
            }
        }
        
        // Dibujamos el tablero 
        // No mostramos nada si no se ha disparado en esa posicion
        // Mostramos una X si se ha disparado en una posicion pero se ha fallado
        // mostramos una O si se ha disparado en una posicion y se ha acertado.
        // "B".equals( Barcos.tablero[i][j] ) ||
        System.out.println("\n\n--------------------------------------------");
        System.out.println("|  | A | B | C | D | E | F | G | H | I | J |");
        System.out.println("--------------------------------------------");
            
        for ( int i = 0; i < Barcos.tablero.length; ++i ) {
            for ( int j = 0; j < Barcos.tablero.length; ++j ) {
                if ( "".equals( Barcos.tablero[i][j] ) ) {
                    System.out.print("|   ");
                }
                else if ( "B".equals( Barcos.tablero[i][j] ) ) {
                    System.out.print("| B ");
                }
                else if ( "X".equals( Barcos.tablero[i][j] ) ) {
                    System.out.print("| X ");
                }
                else if ( "O".equals( Barcos.tablero[i][j] ) ) {
                    System.out.print("| O ");
                }
                else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|\n--------------------------------------------");
        }
        
    }
    
}
