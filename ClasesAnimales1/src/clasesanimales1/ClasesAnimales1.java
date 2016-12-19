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
        Animal miperro = new Animal("Blanco");
        
        migato.nace();
        
        System.out.println("\n-- Gato --");
        //migato.nombre = "Batman";
        migato.edad = 1;
        migato.setEdad(3);
        migato.setNombre("Micifu");
        
        System.out.println( migato.getNombre() );
        //migato.getNombre();
        migato.getEdad();
        
        Pajaro unpajaro = new Pajaro();
        
        unpajaro.color = "Rojo";
        unpajaro.peso = 32;
        unpajaro.setNombre("Pio");
        unpajaro.setEdad(2);
        
        System.out.println("\n-- Pajaro --");
        System.out.println("NOMBRE --> " + unpajaro.getNombre());
        System.out.print("EDAD --> ");
        unpajaro.getEdad();
        System.out.println("PESO --> " + unpajaro.peso);
        System.out.println("COLOR --> " + unpajaro.color);
        
    }
    
}