/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombreordenador1;

/**
 * Crear la clase NombreOrdenador
 * atributo: etiqueta
 * Constructor: argumento es la cadena nombre o identificación
 * => si correcta según formato asigna dato o atributo
 * En caso contrario emite mensaje si erronea
 * - Método:devuelve
 * "AULA xx NºEQUIPO=> xx"
 * 
 * Identificación de un ordenador del Instituto:
 * - Formato correcto: "PCXXDD":
 * - XX -> 5, 16, 18, 25, 20, 21. AULA
 * - DD -> 1-30. Nº Alumno
 * 
 * Crear una clase aplicación y probar la implementación de la clase
 * 
 * @author dam132
 */
public class NombreOrdenador {
    
    int aula;
    int equipo;
    
    /**
     * 
     * @param aula
     * @param equipo 
     */
    public NombreOrdenador(int aula, int equipo) {
        
        if ( comprobarAula( aula ) ) {
            if ( comprobarEquipo( equipo ) ) {
                this.aula = aula;
                this.equipo = equipo;
            }
            else {
                System.out.println("ERROR: El numero de equipo es incorrecto...");
            }
        }
        else {
            System.out.println("ERROR: El numero de aula es incorrecto...");
        }
        
        
    }
    
    /**
     * 
     * @return 
     */
    public int getAula() {
        return aula;
    }
    
    /**
     * 
     * @return 
     */
    public int getEquipo() {
        return equipo;
    }
    
    /**
     * 
     * @return 
     */
    public String obtenerOrdenador () {
        
        return "AULA " + getAula() + " Nº EQUIPO => " + getEquipo();
    }
    
    /**
     * 
     * @param aula
     * @return 
     */
    private boolean comprobarAula ( int aula ) {
        // 5, 16, 18, 25, 20, 21
        if ( aula == 5
          || aula == 16
          || aula == 18
          || aula == 25
          || aula == 20
          || aula == 21 ) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /**
     * 
     * @param equipo
     * @return 
     */
    private boolean comprobarEquipo ( int equipo ) {
        
        if ( equipo >= 1 && equipo <= 30 ) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
