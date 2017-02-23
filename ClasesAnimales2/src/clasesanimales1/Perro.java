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
        super( nombre, edad );
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
    
    /**
     * Sobreescribimos la funcion toString.
     * @return 
     */
    @Override
    public String toString () {
        
        return "Perro( ";
    }
    
    // un metodo de clase que recibe como parametro un objeto
    // y muestra los datos de ese objeto.
    static void verDatos ( Perro dogo ) {
        
        System.out.println("datos: " + dogo.getRaza() );
        dogo.getNombre();
    }
    
    // Comparar perro
    @Override
    public boolean equals( Object obj ) {
        
        if ( obj == null ) {
            return false;
        }
        if ( this.getClass() != obj.getClass() ) {
            return false;
        }
        
        // convertimos
        final Perro otro = ( Perro ) obj;
        
        //true / false
        return otro.getRaza().equalsIgnoreCase( this.raza );
    }
}
