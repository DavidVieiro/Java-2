/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconversion1;

/**
 *
 * @author dam132
 */
public class PruebaConversion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1  = "prueba";
        String cadena = "12da4";
        int i = 70;
        char []tabla = {'1','2','3','4','5'};
        int []numeros = {1,2,3};
        char []letras = {'h','o','1','a'};
        
        // Conversion de datos basico a cadenas
        s1 = String.valueOf(i);
        System.out.println("cadena " + s1);
        
        // Conversion de tabla a cadena
        s1 =  String.valueOf(letras);
        System.out.println("letras como cadena " + s1);
        
        // Conversion de cadena a tabla
        char []vector =  cadena.toCharArray();
        
        for ( i = 0; i < vector.length; i++ ) {
            System.out.println("elemento " + vector[i]);
        }
        
        // ++ solo un trozo para vector en posicion 1
        s1.getChars( 0, 3, vector, 1 );
        
        for ( i = 0; i < vector.length; i++ ) {
            System.out.println("nuevo elemento " + vector[i]);
        }
        
        // + Devuelve una cadena del objeto pasado
        s1 = String.valueOf(tabla);
        System.out.println(" la tabla como cadena " + s1);
        
        System.out.print("montar cadena con numeros: ");
        s1 =  new String();
        
        for ( i = 0; i < numeros.length; i++ ) {
            s1 = s1 + String.valueOf(numeros[i]);
        }
        
        System.out.println("cadena " + s1);
        
        
    }
    
}
