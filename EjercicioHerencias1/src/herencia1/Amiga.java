/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author dam132
 */
public class Amiga {
    
    String datoAmiga;

    public String getDatoAmiga() {
        return datoAmiga;
    }
    
    public void Calculos() {
        
        Madre madre = new Madre();
        
        madre.datoPaquete   = "soy amiga datoPaquete";
        madre.datoProtected = "soy amiga datoProtected";
        
    }
    
}
