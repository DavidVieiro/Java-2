/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionombre1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Diseñar clase Nombre.
 * - atributos :  nombre, ape1, ape2- 
 * Constructor  : recibe  los 3 datos
 * Si datos no vacíos y todo letras asignamos valor,
 * si error =>  emitimos mensaje
 * - crear  Métodos: 
 * nombreYApellidos () devuelve cadena montada
 * inicialesNombre () devuelve  cadena con las  iniciales 
 * nombreMinusculas () devuelve la cadena con el nombre completo en minúsculas y   
 * primera letra en mayúscula.
 * Crear la Aplicación donde creamos  un objeto y  probamos clase implementada.
 * 
 * @author dam132
 */
public class AplicacionNombre {

    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String nombre = null, ape1 = null, ape2 = null;
        
        try {
            System.out.println("Introduce un nombre:");
            nombre = teclado.readLine();
            System.out.println("Introduce el primer apellido:");
            ape1 = teclado.readLine();
            System.out.println("Introduce el segundo apellido");
            ape2 = teclado.readLine();
        }
        catch ( Exception ex1) {
            System.out.println("\n\nERROR: Se ha producido un error al introducir los datos... " + ex1);
        }
        
        
        Nombre nombre1 =  new Nombre ( nombre, ape1, ape2 );
        
        nombre1.setNombre( nombre );
        nombre1.setApe1( ape1 );
        nombre1.setApe2( ape2 );
        
        System.out.println("\nNombre y Apellidos");
        System.out.println( nombre1.nombreYApellidos() );
        
        System.out.println("\nIniciales en mayusculas");
        System.out.println( nombre1.inicialesNombre() );
        
        System.out.println("\nNombre en minuscula");
        System.out.println( nombre1.nombreMinusculas() );
        
    }
    
}
