/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodni1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class EjercicioDNI {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String dni;
        
        System.out.println("Introduce un DNI: ");
        System.out.println("|| Recuerda que son 8 numeros y 1 letra al final ||");
        dni = teclado.readLine();
        
        DNI nuevo1 = new DNI( dni );
        
    }
    
}
