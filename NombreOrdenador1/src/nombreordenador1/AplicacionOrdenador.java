/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombreordenador1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Crear la clase NombreOrdenador
 * atributo: etiqueta
 * Constructor: argumento es la cadena nombre o identificación
 * => si correcta según formato asigna dato o atributo
 * En caso contrario emite mensaje si erronea
 * - Método:devuelve
 * "AULA xx NºEQUIPO=> xx"
 * 
 * Identificación de un ordenador del Instituto:
 * - Formato correcto: "PCXXDD":
 * - XX -> 5, 16, 18, 25, 20, 21. AULA
 * - DD -> 1-30. Nº Alumno
 * 
 * Crear una clase aplicación y probar la implementación de la clase
 * 
 * @author dam132
 */
public class AplicacionOrdenador {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int aula, equipo;
        
        System.out.println("Introduce el numero de aula:");
        aula = Integer.parseInt( teclado.readLine() );
        System.out.println("Introduce el numero de equipo:");
        equipo = Integer.parseInt( teclado.readLine() );
        
        NombreOrdenador equipo1 =  new NombreOrdenador( aula, equipo );
        
        System.out.println("\n\nPC" + equipo1.getAula() + equipo1.getEquipo() );
        System.out.println( equipo1.obtenerOrdenador() );
        
        
    }
    
}
