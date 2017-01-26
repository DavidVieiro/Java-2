/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizerprueba1;

import java.util.StringTokenizer;

/**
 *
 * @author dam132
 */
public class TokenizerPrueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringTokenizer st1, st2;
        
        String quote1 = "VIZY 3 -1/16";
        
        st1 =  new StringTokenizer( quote1 );
        System.out.println("Token 1: " + st1.nextToken() );
        System.out.println("Token 2: " + st1.nextToken() );
        System.out.println("Token 3: " + st1.nextToken() );
        System.out.println("==> " + quote1 );
        
        String quote2 = "NPLI@9 27/32@3/32";
        st2 =  new StringTokenizer( quote2, "@" );
        System.out.println("\nToken 1: " + st2.nextToken() );
        System.out.println("Token 2: " + st2.nextToken() );
        System.out.println("Token 3: " + st2.nextToken() );
        // varios
        String quote3 = "NPLI@9 27/32@3/32";
        st2 =  new StringTokenizer( quote2, "@" );
        System.out.println("\nToken 1: " + st2.nextToken() );
        System.out.println("Token 2: " + st2.nextToken() );
        System.out.println("Token 3: " + st2.nextToken() );
        
        // Varios delimitadores
        String cadena = "NPLI@9 27/32@3/32";
        StringTokenizer st = new StringTokenizer( cadena, "@/" );
        
        while ( st.hasMoreTokens() ) {
            System.out.println("cachos del bucle " + st.nextToken() );
        }
        cadena.toString();
        
    }
    
}
