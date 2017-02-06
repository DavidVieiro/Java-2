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
public class AplicacionEuropeos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--- Europeo ---");
        
        Europeo europeo1 = new Europeo("Pepe", "10/02/1980");
        
        europeo1.mostrarDatos();
        
        System.out.println("\n--- Español ---");
        
        Espanol espanol1 =  new Espanol ("Juan", "05/02/1950", "12345678X", "3534543/435");
        
        espanol1.mostrarDatos();
        
        System.out.println("\n--- Frances ---");
        
        Frances frances1 = new Frances ("Pepe", "06/03/1940", "356F453F");
        
        frances1.mostrarDatos();
        
    }
    
}
