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
public class Madre {
    
    private String datoPrivate = "Private";
    protected String datoProtected;
    String datoPaquete;

    public String getDatoPrivate() {
        return datoPrivate;
    }

    public String getDatoProtected() {
        return datoProtected;
    }

    public String getDatoPaquete() {
        return datoPaquete;
    }
    
    
    
    
}
