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
 
 Identificación de un etiqueta del Instituto:
 - Formato correcto: "PCXXDD":
 - XX -> 5, 16, 18, 25, 20, 21. AULA
 * - DD -> 1-30. Nº Alumno
 * 
 * Crear una clase aplicación y probar la implementación de la clase
 * 
 * @author dam132
 */
public class NombreOrdenador {
    
    String aula;
    String equipo;
    String etiqueta;
    
    /**
     * 
     * @param etiqueta 
     */
    public NombreOrdenador( String etiqueta ) {
        if ( comprobarInicio( etiqueta ) ) {
            
            if ( comprobarAula( etiqueta ) ) {
                
                if ( comprobarEquipo( etiqueta ) ) {
                    this.etiqueta = etiqueta;
                }
                else {
                    System.out.println("ERROR: El equipo introducido no existe... (01 - 30)");
                }
            }
            else {
                System.out.println("ERROR: El aula introducida no existe... (05, 16, 18, 25, 20, 21)");
            }
        }
        else {
            System.out.println("ERROR: La etiqueta tiene que empezar por 'PC'");
        }
        
        
    }
    
    /**
     * 
     * @return 
     */
    public String obtenerOrdenador () {
        if ( aula != null && equipo != null ) {
            
            return "AULA " + aula + " Nº EQUIPO => " + equipo;
        }
        return "";
        
    }
    
    /**
     * 
     * @param etiqueta
     * @return 
     */
    private boolean comprobarInicio ( String etiqueta ) {
        
        char c0, c1;
        
        c0 = Character.toUpperCase( etiqueta.charAt( 0 ) );
        c1 = Character.toUpperCase( etiqueta.charAt( 1 ) );
        
        if( c0 == 'P' && c1 == 'C' ) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /**
     * 
     * @param etiqueta
     * @return 
     */
    private boolean comprobarAula ( String etiqueta ) {
        
        this.aula = "" + etiqueta.charAt( 2 ) + etiqueta.charAt( 3 );
        
        // 05, 16, 18, 25, 20, 21
        if ( "05".equals( aula )
          || "16".equals( aula )
          || "18".equals( aula )
          || "25".equals( aula )
          || "20".equals( aula )
          || "21".equals( aula ) ) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /**
     * 
     * @param etiqueta
     * @return 
     */
    public boolean comprobarEquipo ( String etiqueta ) {
        
        this.equipo = "" + etiqueta.charAt( 4 ) + etiqueta.charAt( 5 );
        
        int c4, c5;
        
        c4 = etiqueta.charAt( 4 );
        c5 = etiqueta.charAt( 5 );
        // Comprobamos que el caracter este dentro de su valor en decimal
        if ( c4 == 48 && c5 == 48) {
            return false;
        }
        else if ( c4 >= 48 && c4 <= 50  ) {
            if ( c5 >= 48 && c5 <= 57 ) {
                return true;
            }
            else {
                return false;
            }
        }
        else if ( c4 == 51 && c5 == 48) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
}
