/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfecha1;

/**
 *
 * @author dam132
 */
public class AplicacionFecha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia = 1, mes = 1, anio = 1970;
        
        Fecha fecha1 =  new Fecha ( dia, mes, anio );
        
        boolean validacion = fecha1.valida( dia, mes, anio );
        
        if ( validacion ) {
            System.out.println("La fecha es correcta.");
            System.out.println("Dia " + fecha1.getDia() );
            System.out.println("Mes " + fecha1.getMes() );
            System.out.println("Año " + fecha1.getAnio() );
        }
        else {
            System.out.println("La fecha introducida es incorrecta...");
        }
        
        
    }
    
}
