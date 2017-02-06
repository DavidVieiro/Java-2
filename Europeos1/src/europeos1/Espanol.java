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
public class Espanol extends Europeo {
    
    String numeroSS;
    String nif;
    
    /**
     * 
     * @param nombre
     * @param fechaNac 
     * @param numeroSS 
     * @param nif 
     */
    public Espanol(String nombre, String fechaNac, String nif, String numeroSS) {
        super(nombre, fechaNac);
        this.numeroSS = numeroSS;
        this.nif = nif;
    }
    
    /**
     * 
     */
    public void verNif() {
        System.out.println("NIF: " + nif );
    }
    
    /**
     * 
     */
    public void verNumeroSS () {
        System.out.println("Numero SS: " + numeroSS );
    }
    
    /**
     * 
     */
    @Override
    public void mostrarDatos () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha Nac: " + fechaNac);
        System.out.println("NIF: " + nif );
        System.out.println("Numero SS: " + numeroSS );
    }
    
    
    
}
