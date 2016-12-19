/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecgrados1;

/**
 *
 * @author dam132
 */
public class CGrados {
    private float gradosC; // Grados centigrados
    
    public void centigradosAsignar ( float gC ) {
        gradosC = gC; // Establecer el atributo grados centigrados
    }
    
    public float farenheitObtener() {
        // controlar division
        return 9F/5F * gradosC + 32; // Retornar los grados Farenheit
    }
    
    public float centigradosObtener () {
        return gradosC; // Retornar los grados centigrados
    }
}
