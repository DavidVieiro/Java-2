/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo1;

import java.io.IOException;

/**
 * Implementar la clase ProgramaCirculo con un atributo llamado radio.
 * Para manejar objetos de esta clase, crear los metodos siguientes:
 * - calcularArea() y calcularLongitud() que devuelven el resultado del calculo
 * - otro que asigne el valor del radio: setRadio()
 * 
 * a) Crear dos contructores, con y sin datos
 * Probar una aplicacion de consola donde se pruebe el manejo
 * de objetos de clase definida.
 * 
 * b) Un metodo al que se le pasa un objeto de la clase
 * Circulo y que muestre el valor del radio.
 * 
 * c) Otro metodo de la clase que recibe dos objetos Circulo y que calcule
 * y retorne el mayor de los dos.
 * 
 * @author dam132
 */
public class ProgramaCirculo {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int radio2;
        
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo();
        
        System.out.println("\n--- Circulo 1 ---");
        System.out.println( "El area es: " + circulo1.calcularArea() );
        System.out.println( "La longitud es: " + circulo1.calcularLongitud() );
        
        
        System.out.println("\n--- Circulo 2 ---");
        radio2 = circulo2.setRadio();
        circulo2.calcularArea( );
        circulo2.calcularLongitud( );
        
        System.out.println("\n--- Circulo mas grande ---");
        
        //Circulo.mayorCirculo(circulo1, circulo2);
        
        System.out.println( (Circulo.mayorCirculo(circulo1, circulo2)).calcularArea() );
        
    }
    
}
