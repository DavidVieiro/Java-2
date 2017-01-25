/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import figuras.Circulo;

/**
 *
 * @author dam132
 */
public class AplicacionCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo();
        
        // Seleccionar las dos lineas de salida de datos y crear un metodo
        // Refactor / Introduce / Method
        // Se crea el metodo y la llamada al metodo
        circulo1.setRadio( 28 );
        mostrar( circulo1 );
                
    }
    /**
     * Seleccionar las dos lineas de salida de datos y crear un metodo
     * Refactor / Introduce / Method
     * Se crea el metodo y la llamada al metodo
     * @param circulo1 
     */
    private static void mostrar( Circulo circulo1 ) {
        System.out.println("El área del círculo1 es " + circulo1.calcularArea() );
        System.out.println("La longitud del círculo1 es " + circulo1.calcularLongitud() );
    }
    
}
