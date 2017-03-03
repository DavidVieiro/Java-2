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
public class Tablero {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    static int[][] tablero = new int[10][10];
    
    /**
     * Creamos los barcos en el tablero.
     */
    public Tablero() {
        // Creamos los 5 barcos
        Barco1Casilla barco1 = new Barco1Casilla();
        Barco1Casilla barco2 = new Barco1Casilla();
        Barco1Casilla barco3 = new Barco1Casilla();
        Barco1Casilla barco4 = new Barco1Casilla();
        Barco1Casilla barco5 = new Barco1Casilla();
    }
    
    /**
     * Dibujamos el tablero donde se esconderan los barcos.
     * Mostramos una X si se ha disparado en una posicion pero se ha fallado.
     * Mostramos una O si se ha disparado en una posicion y se ha acertado.
     * No mostramos nada si no se ha disparado en esa posicion.
     */
    @SuppressWarnings("ConvertToStringSwitch")
    public static void dibujarTablero () {

        // Dibujamos el tablero
        System.out.println("    -----------------------------------------");
        System.out.println("    | A | B | C | D | E | F | G | H | I | J |");
        System.out.println("---------------------------------------------");
            
        for ( int i = 0; i < tablero.length; ++i ) {
            System.out.print("| " + i + " ");
            for ( int j = 0; j < tablero.length; ++j ) {
                if ( tablero[i][j] == 0 ) {
                    System.out.print("|   ");
                }
                else if ( tablero[i][j] == 1 ) {
                    System.out.print("|   ");
                    //System.out.print("| " + tablero[i][j] + " " );
                }
                else if ( tablero[i][j] == -2 ) {
                    System.out.print("| X ");
                }
                else if (  tablero[i][j] == -1 ) {
                    System.out.print("| O ");
                }
                else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|\n---------------------------------------------");
        }
        
    }
    
    /**
     * El jugador elige una posicion donde cree que esta el barco.
     * @throws java.io.IOException
     */
    public static void dispararCannon() throws IOException {
        
        String disparoOrdenado;
        
        System.out.println("\nElige las coordenadas donde crees que hay un barco:");
        String disparo = teclado.readLine();
        
        if (comprobarDisparo( disparo ) ) {
//            System.out.println("Disparo correcto. continua");
            disparoOrdenado = ordenarCoordenadas( disparo );
            realizarDisparo( disparoOrdenado );
        }
        else {
            System.out.println("\nERROR: Coordenadas INCORRECTAS. Prueba otra vez.");
        }
        
    }
    
    /**
     * Comprobamos que las coordenadas de disparo estan dentro de los parametros correctos.
     * @param disparo Coordenadas del disparo al tablero.
     * @return Verdadero si las coordenadas son correctas.
     */
    private static boolean comprobarDisparo( String disparo ) {
        
        int comprobar = 0;
        // Comprobamos que la longitud del String es 2
        if ( disparo.length() == 2) {
            // Comprobamos primer caracter.
            if ( Character.isDigit( disparo.charAt( 0 ) ) ) {
                // Si el primer caracter es numero el segundo deberia de ser letra.
                if ( Character.toUpperCase( disparo.charAt( 1 ) ) >= 65
                   && Character.toUpperCase( disparo.charAt( 1 ) ) <= 74 ) {
                    ++comprobar;
                }
                ++comprobar;
            }
            // 65 = A | 74 = J
            else if ( Character.toUpperCase( disparo.charAt( 0 ) ) >= 65
                   && Character.toUpperCase( disparo.charAt( 0 ) ) <= 74 ) {
                // Si el primer caracter es letra el segundo deberia de ser un numero.
                if ( Character.isDigit( disparo.charAt( 1 ) ) ) {
                    ++comprobar;
                }
                ++comprobar;
            }
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
            // 65 = A | 74 = J
            if ( Character.toUpperCase( disparo.charAt( 1 ) ) >= 65
              && Character.toUpperCase( disparo.charAt( 1 ) ) <= 74 ) {
                disparoY = "" + Character.toUpperCase( disparo.charAt( 1 ) );
            }
            disparoX = "" + Character.toUpperCase( disparo.charAt( 0 ) );
        }
        // 65 = A | 74 = J
        else if ( Character.toUpperCase( disparo.charAt( 0 ) ) >= 65
               && Character.toUpperCase( disparo.charAt( 0 ) ) <= 74 ) {
            if ( Character.isDigit( disparo.charAt( 1 ) ) ) {
                disparoY = "" + Character.toUpperCase( disparo.charAt( 0 ) );
            }
            disparoX = "" + Character.toUpperCase( disparo.charAt( 1 ) );
        }
        
        return disparoX + disparoY;
    }
    
    /**
     * Comprobamos el tablero y guardamos el valor correspondiente del disparo.
     * -2 = falla, -1 = acierto, 0 = Agua. Enviamos un mensaje correspondiente al jugador.
     */
    private static void realizarDisparo( String disparoOrdenado ) {
        
        // Le restamos 48 que es el valor de 0 en ASCII
        int disparoX = disparoOrdenado.charAt( 0 ) - 48;
        // Le restamos 65 que es el valor de A en ASCII
        int disparoY = disparoOrdenado.charAt( 1 ) - 65;
        
        if ( tablero[ disparoX ][ disparoY ] == 0 ) {
            tablero[ disparoX ][ disparoY ] = -2;
            System.out.println("\nHas fallado, mas suerte en el proximo disparo...");
        }
        else if ( tablero[ disparoX ][ disparoY ] == -2 | tablero[ disparoX ][ disparoY ] == -1 ) {
            System.out.println("\nYa has disparado en esa posicion, elige otra.");
        }
        else {
            tablero[ disparoX ][ disparoY ] = -1;
            System.out.println("\nHas acertado!! Acaba con ellos!!");
        }
        
        
    }
    
    /**
     * Comprobamos el numero de barcos que quedan en juego.
     * @return Numero de barcos restantes.
     */
    public int barcosRestantes() {
        
        int barcosRestantes = 0;
        
        for ( int i = 0; i < tablero.length; ++i ) {
            for ( int j = 0; j < tablero.length; ++j ) {
                if (  tablero[i][j] == Barco1Casilla.getTipo() ) {
                    ++barcosRestantes;
                }
            }
        }
        
        return barcosRestantes;
    }
}
