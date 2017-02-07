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
public class AplicacionAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal migato = new Animal();
        Animal miperro = new Animal("Blanco");
        
        migato.nace();
        
        System.out.println("\n-- Gato --");
        //migato.nombre = "Batman";
        //migato.edad = 1;
        migato.setEdad(3);
        migato.setNombre("Micifu");
        
        System.out.println( migato.getNombre() );
        //migato.getNombre();
        migato.getEdad();
        
        
        System.out.println("\n-- Pajaro --");
        
        Pajaro unpajaro = new Pajaro();
        
        unpajaro.color = "Rojo";
        unpajaro.peso = 32;
        unpajaro.setNombre("Pio");
        unpajaro.setEdad(2);
        System.out.println("NOMBRE --> " + unpajaro.getNombre());
        System.out.print("EDAD --> ");
        unpajaro.getEdad();
        System.out.println("PESO --> " + unpajaro.peso);
        System.out.println("COLOR --> " + unpajaro.color);
        
        
        System.out.println("\n-- Perro --");
        
        Perro unperro = new Perro();
        
        unperro.nace();
        unperro.setNombre("Paco");
        unperro.setRaza("Palleiro");
        unperro.setEdad( 4 );
        System.out.println("Nombre: " + unperro.getNombre() );
        System.out.println("Raza: " + unperro.getRaza() );
        System.out.print("Edad: ");
        unperro.getEdad();
        
        System.out.println("\n-- Perro 2 --");
        
        Perro otroperro = new Perro ( 2 , "Lola");
        
        otroperro.setRaza("Palleiro");
        System.out.println("Nombre: " + otroperro.getNombre() );
        System.out.println("Raza: " + otroperro.getRaza() );
        System.out.print("Edad: ");
        otroperro.getEdad();
        
        System.out.println("\n\n------");
        System.out.println("Obteniendo Perro... " + otroperro.toString());
        
        System.out.println("\n\n--- Pajaro ---");
        Pajaro pio = new Pajaro ();
        
        pio.getTIPO();
        
    }
    
}