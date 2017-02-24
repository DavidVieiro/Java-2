/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public abstract class Barcos {
    
    // true = hundido / false = no hundido
    @SuppressWarnings("FieldMayBeFinal")
    private boolean estado;
    static String[][] tablero = new String[10][10];
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    
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
//        for ( int i = 0; i < Barcos.tablero.length; ++i ) {
//            for ( int j = 0; j < Barcos.tablero.length; ++j ) {
//                if ( "B".equals( Barcos.tablero[i][j] ) ) {
//                    System.out.println("Barco en Coordenadas: X = " + i + " Y = " + j );
//                }
//            }
//        }
        
        // Dibujamos el tablero 
        // No mostramos nada si no se ha disparado en esa posicion
        // Mostramos una X si se ha disparado en una posicion pero se ha fallado
        // mostramos una O si se ha disparado en una posicion y se ha acertado.
        // "B".equals( Barcos.tablero[i][j] ) ||
        System.out.println("\n\n    -----------------------------------------");
        System.out.println("    | A | B | C | D | E | F | G | H | I | J |");
        System.out.println("--------------------------------------------");
            
        for ( int i = 0; i < Barcos.tablero.length; ++i ) {
            System.out.print("| " + i + " ");
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
    
    /**
     * El jugador elige una posicion donde cree que esta el barco.
     * @throws java.io.IOException
     */
    public static void dispararCannon() throws IOException {
        
        System.out.println("\nElige las coordenadas donde crees que hay un barco:");
        String disparo = teclado.readLine();
        
        if (comprobarDisparo( disparo ) ) {
            System.out.println("Disparo correcto. continua");
            ordenarCoordenadas( disparo );
        }
        else {
            System.out.println("Coordenadas INCORRECTAS");
        }
        
    }
    
    /**
     * Comprobamos que las coordenadas de disparo estan dentro de los parametros correctos.
     * @param disparo Coordenadas del disparo al tablero.
     * @return Verdadero si las coordenadas son correctas.
     */
    private static boolean comprobarDisparo( String disparo ) {
        
        int comprobar = 0;
        
        // comprobamos primer caracter.
        if ( Character.isDigit( disparo.charAt( 0 ) ) ) {
            // si el primer caracter es numero el segundo deberia de ser letra.
            if ( Character.toUpperCase( disparo.charAt( 1 ) ) >= 65
               && Character.toUpperCase( disparo.charAt( 1 ) ) <= 74 ) {
                ++comprobar;
            }
            ++comprobar;
        }
        // 65 = A | 74 = J
        else if ( Character.toUpperCase( disparo.charAt( 0 ) ) >= 65
               && Character.toUpperCase( disparo.charAt( 0 ) ) <= 74 ) {
            // si el primer caracter es letra el segundo deberia de ser un numero.
            if ( Character.isDigit( disparo.charAt( 1 ) ) ) {
                ++comprobar;
            }
            ++comprobar;
        }
        
        return comprobar == 2;
    }
    
    /**
     * Pasamos las coordenadas para ordenarlas correctamente antes de comprobar el disparo.
     * @param disparo Coordenadas del disparo al tablero.
     */
    private static String ordenarCoordenadas( String disparo ) {
        
        String disparoX = "";
        String disparoY = "";
        
        if ( Character.isDigit( disparo.charAt( 0 ) ) ) {
            
            if ( Character.toUpperCase( disparo.charAt( 1 ) ) >= 65
               && Character.toUpperCase( disparo.charAt( 1 ) ) <= 74 ) {
                disparoX = "" + disparo.charAt( 1 );
            }
            disparoX = "" + disparo.charAt( 0 );
        }
        // 65 = A | 74 = J
        else if ( Character.toUpperCase( disparo.charAt( 0 ) ) >= 65
               && Character.toUpperCase( disparo.charAt( 0 ) ) <= 74 ) {
            if ( Character.isDigit( disparo.charAt( 1 ) ) ) {
                disparoX = "" + disparo.charAt( 0 );
            }
            disparoX = "" + disparo.charAt( 1 );
        }
        
        return disparoX + disparoY;
    }
    
    /**
     * Comprobamos el tablero y guardamos el valor correspondiente del disparo.
     * X = falla, O = acierto. Enviamos un mensaje correspondiente al jugador.
     */
    private void realizarDisparo() {
        
        
        
        
    }
    
    /**
     * Comprobamos el numero de barcos que quedan en juego.
     * @return 
     */
    public static int barcosRestantes() {
        
        int barcosRestantes = 0;
        
        for ( int i = 0; i < Barcos.tablero.length; ++i ) {
            for ( int j = 0; j < Barcos.tablero.length; ++j ) {
                if ( "B".equals( Barcos.tablero[i][j] ) ) {
                    ++barcosRestantes;
                }
            }
        }
        
        return barcosRestantes;
    }
}
