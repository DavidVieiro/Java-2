
package Principal;

import clases.DNI;
import excepciones.ContidoBaleiroException;


public class PrincipalDNI {

    
    public static void main(String[] args) throws ContidoBaleiroException {

        

        try {
            DNI nuevoDNI = new DNI ("david","ordoñez valiña","47374708k");
            System.out.println("El nombre completo es: "+nuevoDNI.nombreCompleto());
            
            nuevoDNI.generarContraseña("buenos Dias amigo");
        } catch (Exception excep) {
            System.out.println(excep.getMessage());
        }
        
        
        
        
        
    }
    
}
