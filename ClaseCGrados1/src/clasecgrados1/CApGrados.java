/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecgrados1;

/**
 *
 * @author dam132
 */
public class CApGrados {
    final static int LIMINFERIOR = -30; // Definicion de constantes
    final static int LIMSUPERIOR = 100;
    final static int INCREMENTO = 6;
    
    public static void main ( String[] args ) {
        
        CGrados grados = new CGrados(); // Crea objeto de la clase CGrados
        CGrados otroObjeto = new CGrados();
        
        int gradosCent = LIMINFERIOR; // Declaracion de variables.
        float gradosFahr = 0;
        
        while ( gradosCent <= LIMSUPERIOR ) {
            // Asignar el objeto grados el valor en grados cenrigrados
            otroObjeto.centigradosAsignar(gradosCent);
            // Obtener del objeto los grados centigrados.
            gradosFahr = otroObjeto.farenheitObtener();
            System.out.println(gradosCent + "\t" + gradosFahr + " F");
            gradosCent += INCREMENTO; // Siguiente valor
        }
    }
}
