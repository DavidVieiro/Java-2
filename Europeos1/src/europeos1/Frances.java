/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package europeos1;

/**
 *
 * @author dam132
 */
public class Frances extends Europeo {
    
    // numeroIR , vernumeroIR ( ) , mostrarDatos( ) Crear gets()
    
    String numeroIR;
    
    /**
     * 
     * @param nombre
     * @param fechaNac 
     * @param numeroIR 
     */
    public Frances( String nombre, String fechaNac, String numeroIR ) {
        super(nombre, fechaNac);
        this.numeroIR = numeroIR;
    }
    
    /**
     * 
     */
    public void verNumeroIR () {
        System.out.println("Numero IR: " + numeroIR );
    }
    
    /**
     * 
     */
    @Override
    public void mostrarDatos () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha Nac: " + fechaNac);
        System.out.println("Numero IR: " + numeroIR);
    }
    
    /**
     * 
     * @return 
     */
    public String getNumeroIR() {
        return numeroIR;
    }
    
    
}
