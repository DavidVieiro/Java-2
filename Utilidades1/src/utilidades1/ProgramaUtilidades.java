/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades1;

import java.io.IOException;

/**
 * Crear: LeerDato
 * Clase Utilidades que maneja la entrada de datos por teclado
 * Definir metodos que leen y devuelven los diferentes tipos de datos:
 * String, byte, int, Float, Double.
 * 
 * @author dam132
 */
public class ProgramaUtilidades {
    
    public static void main(String[] args) throws IOException {
        
        LeerDato datos1 = new LeerDato();
        
        System.out.println("El entero es : " + datos1.leerInteger() );
        
    }
}
