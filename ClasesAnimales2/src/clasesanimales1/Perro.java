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
public class Perro extends Animal {
    
    private String raza;
    
    /**
     * 
     */
    Perro () {
        
        System.out.println( "2 - Perro nombre " + this.getNombre() );
    }
    
    /**
     * Super llama a un contructor de la clase superior.
     * @param edad
     * @param nombre 
     */
    public Perro( int edad, String nombre ) {
        super( edad, nombre );
        //this.setEdad( edad );
        //this.setNombre( nombre );
        
    }
    
    /**
     * 
     * @param raza 
     */
    public void setRaza ( String raza ) {
        this.raza = raza;
    }
    
    /**
     * 
     * @return 
     */
    public String getRaza() {
        return raza;
    }
    
}
