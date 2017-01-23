/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiondivisas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1 - Leer CANTIDAD y tipo de moneda, convertir a diferentes
 * controlar que los datos sean correctos
 * MONEDA -> "EUROS" || "LIBRAS" || "DOLARES"
 MOSTRAR cantidad xx "## Euros son ## Dolares ## Libras"
 convertir
 Montar la cantidad "## Euros son ## Dolares ## Libras"
 * 
 * @author dam132
 */
public class ConversionDivisas2 {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int cantidad;
        byte opcion;
        double dolar = 1.07406, auxDolar;
        double libra = 0.86251, auxLibra;
        double auxEuro;
        
        System.out.println("Introduce una cantidad para ser convertida: ");
        cantidad = Integer.parseInt( teclado.readLine() );
        
        System.out.println("Elige la moneda de la cantidad introducida: ");
        System.out.println(" 1 - EUROS");
        System.out.println(" 2 - LIBRAS");
        System.out.println(" 3 - DOLARES");
        opcion = Byte.parseByte( teclado.readLine() );
        
        switch ( opcion ) {
            case 1:
                auxDolar = cantidad * dolar;
                auxLibra = cantidad * libra;
                System.out.println(cantidad + " Euros son " + auxDolar + " Dolares o  " + auxLibra + " Libras");
                
                break;
            case 2:
                auxDolar = ( cantidad * dolar ) / libra;
                auxEuro = cantidad / libra;
                System.out.println(cantidad + " Libras son " + auxDolar + " Dolares o  " + auxEuro + " Euros");
                break;
            case 3:
                auxEuro = cantidad / dolar;
                auxLibra = ( cantidad * libra ) / dolar;
                System.out.println(cantidad + " Dolares son " + auxLibra + " Libras o  " + auxEuro + " Euros");
                break;
            default:
                System.out.println("Valor introducido incorrecto...");
        }
        
        
    }
    
}
