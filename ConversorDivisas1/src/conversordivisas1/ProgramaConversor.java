/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordivisas1;

import static conversordivisas1.Divisas.teclado;
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
    
    Divisas cambio1 = new Divisas();
    
    /**
     * 
     * @return 
     * @throws java.io.IOException
     */
    public boolean menu() throws IOException {
        
        // LOS MENUS Y SUBMENUS MEJOR EN EL "PROGRAMA EJECUTABLE"
        
        
        
        boolean continuar = true;
        byte opcion = 0;
        
        System.out.println("\nElige una opcion del menu:");
        System.out.println("1 - Consultar las divisas actuales");
        System.out.println("2 - Realizar conversiones de divisas");
        System.out.println("3 - Cambiar el valor de las divisas");
        System.out.println("4 - SALIR");

        try {
            opcion = Byte.parseByte(teclado.readLine());
        }
        catch ( NumberFormatException ex1 ) {
            System.out.println("\nERROR: Introduce un valor numerico correcto...");
        }

        switch (opcion) {
            case 1:
                cambio1.getDivisas();
                break;
            case 2:
                subMenu();
                break;
            case 3:
                cambio1.setDivisas();
                break;
            case 4:
                System.out.println("\n\nSaliendo del programa...");
                continuar = false;
                break;
            default:
                System.out.println("\nERROR: Introduce una opcion de menu correcta...");
        }
        
        return continuar;
    }
    
    /**
     * 
     * @throws java.io.IOException
     */
    public void subMenu() throws IOException {
        
        boolean atras = false;
        byte subOpcion = 0;
        
        do {
            System.out.println("\nElige una opcion del submenu:");
            System.out.println("1 - Convertir de Euros a Libras"); 
            System.out.println("2 - Convertir de Libras a Euros");
            System.out.println("3 - Convertir de Euros a Dolares");
            System.out.println("4 - Convertir de Dolares a Euros");
            System.out.println("5 - VOLVER ATRAS");
            
            try {
                subOpcion = Byte.parseByte(teclado.readLine());
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Introduce un valor numerico correcto...");
            }
            
            switch ( subOpcion ) {
                case 1:
                    System.out.println("Cambio de Euros a Libras: "  + cambio1.eurosLibras()  + " Libras" );
                    break;
                case 2:
                    System.out.println("Cambio de Libras a Euros: "  + cambio1.librasEuros()  + " Euros" );
                    break;
                case 3:
                    System.out.println("Cambio de Euros a Dolares: " + cambio1.eurosDolares() + " Dolares" );
                    break;
                case 4:
                    System.out.println("Cambio de Dolares a Euros: " + cambio1.dolaresEuros() + " Euros" );
                    break;
                case 5:
                    System.out.println("Volviendo atras...");
                    atras = true;
                    break;
                default:
                    System.out.println("\nERROR: Introduce una opcion de menu correcta...");
            }
        } while ( !atras );
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        
        System.out.println(menu());
            
        
        
    }
    
}
