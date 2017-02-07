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
// abstract class Animal {
class Animal {
    
    private int edad;
    private String nombre;
    
    /**
     * Si queremos crear de dos formas diferentes tenemos que poner dos
     * Constructores diferentes.
     */
    Animal () {
        this( "(sin dato)", 0);
    }
    
    /**
     * 
     * @param n 
     */
    Animal ( String nombre ){
        this.nombre = nombre;
    }
    
    /**
     * 
     * @param edad
     * @param nombre 
     */
    public Animal( String nombre, int edad ) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    
    /**
     * 
     */
    public void nace() {
        System.out.println("Hola Mundo");
    }
    
    /**
     * 
     * @return 
     */
    public String getNombre() {
        //System.out.println( nombre );
        
        return nombre;
    }
    
    /**
     * 
     * @param n 
     */
    public void setNombre ( String n ) {
        nombre = n;
    }
    
    /**
     * 
     */
    public void getEdad() {
        System.out.println( edad );
    }
    
    /**
     * 
     * @param e 
     */
    public void setEdad ( int e ) {
        edad = e;
    }
    
    
    
    
}
