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
public class Europeo {
    
    String nombre;
    String fechaNac;
    
    /**
     * 
     * @param nombre
     * @param fechaNac 
     */
    public Europeo(String nombre, String fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    /**
     * 
     */
    public void mostrarDatos() {
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha Nac: " + fechaNac);
    }
    
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @return 
     */
    public String getFechaNac() {
        return fechaNac;
    }
    
    
    
}
