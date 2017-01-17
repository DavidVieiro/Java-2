/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1string;

/**
 *
 * @author dam132
 */
public class Prueba1String {

    /**
     * @param s
     */
    public static void main(String[] s) {
        String cad = new String ("Cadena fija");
        System.out.println("Ejemplo de String: '" + cad + "'");
        System.out.println("Su longitud es: " + cad.length() );
        System.out.println("Su tercer caracter es: " + cad.charAt(2) );
        System.out.println("Su subcadena del 3 al 6 es: " + cad.substring(2, 6));
        
        char[] vectorcad =  cad.toCharArray();
        
        System.out.print("Creado un vector de elemento 3: ");
        System.out.println(vectorcad[2]);
        
        String subcad = new String("ena");
        
        System.out.print("La subcadena '" + subcad + "'");
        System.out.print("Aparece en la posicion: ");
        System.out.println( cad.indexOf(subcad) );
        
        String cadcomp = new String("CADENA fija");
        
        System.out.print("La cadena '" + cadcomp + "'" );
        if ( cad.equalsIgnoreCase( cadcomp ))
            System.out.println(" ES igual 'Insensitive'");
        else
            System.out.println(" NO = 'Insensitive'");
        
        System.out.print("Cadena derivada en minusculas: ");
        System.out.println( cadcomp.toLowerCase());
        System.out.println("\n***" + cad );
        
        cad = cad.toLowerCase();
        System.out.println("\n***" + cad);
        // clase StringBuffer :  cadena modificable
        StringBuffer cadenabu = new StringBuffer ( cad );
        cadenabu.append(" hola");
        System.out.println("\n***" + cadenabu);
        cad = cad.concat(" hola");
        System.out.println("\n***" + cad);
    }
    
}
