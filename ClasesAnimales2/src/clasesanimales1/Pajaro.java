/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesanimales1;

/**
 *
 * @author dam132
 */
public class Pajaro extends Animal {
    
    // Se hereda todo menos los constructores.
    int peso;
    String color;
    private static final String TIPO = "plumas";

    public Pajaro() {
    }

    public Pajaro( String nombre, int peso, String color, int edad ) {
        super( nombre, edad );
        this.peso = peso;
        this.color = color;
    }
    
//    @Override
//    public String getNombre () {
//        
//        return super(nombre);
//    }
//    public void verNombre () {
//        System.out.println("Nombre: " + super( nombre ) );
//    }

    public static String getTIPO() {
        return TIPO;
    }
}
