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
     */
    public static void main(String[] args) throws ErrorSacarDineroException, ErrorCrearMonederoException, ErrorIngresarDineroException {
        
        boolean continuar = true;
        byte menu;
        double dinero = 0, dinero_ingresar, dinero_retirar;
        
        Monedero dinero1 =  new Monedero ( dinero );
        
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
                        if ( dinero_retirar >= 0 ) {
                            dinero1.sacarDinero( dinero_retirar );
                        }
                        else {
                            System.out.println("ERROR: Introduce un valor positivo.");
                        }
                        break;
                    case 4:
                        System.out.println("\n\nSaliendo del programa...\n");
                        continuar =  false;
                        
                        break;
                    default:
                        System.out.println("\nERROR: Introduce una opcion de menu valida...");
                }
            } catch ( ErrorSacarDineroException | ErrorIngresarDineroException error1 ) {
                
                System.out.println( error1.getMessage() );
                
            }
            catch ( NumberFormatException | IOException ex1) {
                System.out.println("ERROR: " + ex1);
            }
        } while ( continuar == true);
        
        
    }
    
}
