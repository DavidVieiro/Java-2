/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomonedero3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class EjercicioMonedero {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     * @throws ejerciciomonedero3.ErrorSacarDineroException
     * @throws ejerciciomonedero3.ErrorCrearMonederoException
     * @throws ejerciciomonedero3.ErrorIngresarDineroException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ErrorSacarDineroException, ErrorCrearMonederoException, ErrorIngresarDineroException, IOException {
        
        byte menu = 0;
        double dinero, dinero_ingresar, dinero_retirar;
        
//        do {
//            try {
                
                System.out.println("Introduce una cantidad de dinero para crear tu monedero:");
                dinero = Double.valueOf( teclado.readLine() );
                // Constructor
                Monedero dinero1 =  new Monedero ( dinero );
//
//            }
//            catch ( ErrorCrearMonederoException error1 ) {
//                System.out.println( error1.getMessage() );
//            }
//            catch ( NumberFormatException | IOException ex1) {
//                System.out.println("ERROR: " + ex1);
//            }
//        } while ( dinero >= 0);
        
        do {
            try {
                System.out.println("\n1 - Ingresar dinero");
                System.out.println("2 - Consultar saldo");
                System.out.println("3 - Sacar dinero");
                System.out.println("4 - Salir");
                menu = Byte.parseByte( teclado.readLine() );

                switch ( menu ) {
                    case 1:
                        System.out.println("\nIntroduce la cantidad que quieres ingresar:");
                        dinero_ingresar = Double.valueOf( teclado.readLine() );
                        dinero1.ingresarDinero( dinero_ingresar );
                        break;
                    case 2: 
                        System.out.println("\nConsultando saldo actual...");
                        System.out.println( dinero1.consultarDinero() + " Euros" );
                        break;
                    case 3:
                        System.out.println("\nIntroduce la cantida de dinero que quieres retirar:");
                        dinero_retirar = Double.valueOf( teclado.readLine() );
                        dinero1.sacarDinero( dinero_retirar );
                        break;
                    case 4:
                        System.out.println("\n\nSaliendo del programa...\n");
                        break;
                    default:
                        System.out.println("\nERROR: Introduce una opcion de menu valida...");
                }
            }
            catch ( ErrorSacarDineroException | ErrorIngresarDineroException error1 ) {
                System.out.println( error1.getMessage() );
            }
            catch ( NumberFormatException | IOException ex1) {
                System.out.println("ERROR: " + ex1);
            }
        } while ( menu != 4 );
            
        
    }
    
}
