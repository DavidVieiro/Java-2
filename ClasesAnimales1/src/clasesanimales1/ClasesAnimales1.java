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
public class ClasesAnimales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal migato = new Animal();
        migato.nace();
        
        migato.nombre = "Batman";
        migato.edad = 1;
        
        migato.getNombre();
        migato.getEdad();
        
    }
    
}