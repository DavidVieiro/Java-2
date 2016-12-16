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
class Animal {
    
    int edad;
    String nombre;
    
    // Si queremos crear de dos formas diferentes tenemos que poner dos
    // Constructores diferentes.
    Animal () {
        
    }
    
    Animal ( String n ){
        nombre = n;
    }
    
    public void nace() {
        System.out.println("Hola Mundo");
    }
    
    public void getNombre() {
        System.out.println( nombre );
    }
    
    public void getEdad() {
        System.out.println( edad );
    }
}
