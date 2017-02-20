/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

import herencia2.OtraHija;

/**
 *
 * @author dam132
 */
public class EjercicioHerencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Madre madre = new Madre();
        
        // no podemos acceder a ningun dato que tenga private
        madre.datoPaquete   = "el dato de paquete";
        madre.datoProtected = "el dato protegido";
        
        Hija hija = new Hija();
        
        hija.dato = "un dato por defecto";
        hija.datoPaquete   = "un dato de paquete";
        hija.datoProtected = "un dato protegido";
        
        Amiga amiga = new Amiga();
        
        amiga.datoAmiga = "un dato por defecto";
        
        OtraHija otraHija = new OtraHija();
        
        otraHija.datoProtected = "dato protegido";
        otraHija.datoPublico   = "dato publico";
        // no podemos acceder a datoOtraHija
        
    }
    
}
