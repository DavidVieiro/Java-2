/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordivisas1;

import java.io.IOException;

/**
 * Crear la clase Conversor para convertir una cantidad entre diferentes monedas.
 * Se implementarán métodos de clase, a los que pasamos una cantidad en una 
 * determinada moneda y nos calcularán y mostrarán la cantidad correspondiente en
 * otra moneda.
 * 
 * Monedas: euros , libras, dólares.
 * 
 * eurosALibras()
 * librasAEuros ()
 * eurosADolares()
 * dolaresAEuros()
 * 
 * La aplicación mostrará menú de opciones de conversión y aceptará una cantidad a convertir.
 * 
 * a) Crear métodos para poder establecer en el programa los valores de conversión
 * 
 * TIP: ( Reutilizar la clase LeerDato del projecto Utilidades1 )
 * 
 * @author dam132
 */
public class ProgramaConversor {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        boolean menu;
        
        Divisas cambio1 = new Divisas();
        
        do {
            
            menu = cambio1.menu();
            
        } while ( menu );
        
    }
    
}
