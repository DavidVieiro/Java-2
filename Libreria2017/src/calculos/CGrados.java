/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author dam132
 */
public class CGrados {
    
    private float gradosC; // Grados centigrados
    
    /**
     * Constructor del conversor sin parametros
     */
    public CGrados() {
    }
    
    /**
     * Establecemos el atributo Grados Centigrados.
     * @param gC Grados Centigrados.
     */
    public void centigradosAsignar ( float gC ) {
        gradosC = gC; // Establecer el atributo grados centigrados
    }
    
    /**
     * Convertimos los Grados Centigrados a los Grados Farenheit.
     * @return Grados Farenheit
     */
    public float farenheitObtener() {
        // controlar division
        return 9F/5F * gradosC + 32; // Retornar los grados Farenheit.
    }
    
    /**
     * Obtenemos los Grados Centigrados.
     * @return Grados Centigrados
     */
    public float centigradosObtener () {
        return gradosC; // Retornar los grados centigrados
    }
}
