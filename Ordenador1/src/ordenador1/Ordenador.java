/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador1;

/**
 * a) Atributos private
 * b) Crear constructor: marca , procesador
 * c) Método asignarPantalla()
 * d) Crear con estado : apagado
 * @author dam132
 */
public class Ordenador {
    // Variables.
    private String marca;
    private String procesador;
    private String pantalla;
    boolean estado = false; // Encendido / apagado
    
    // Constructores
    Ordenador ( String m, String pr ) {
        marca = m;
        procesador = pr;
    }
    Ordenador () {
        
    }
    
    // Metodos
    // Si esta apagado lo enciende, sino emite mensaje
    public void encenderOrdenador(){ 
        if ( !estado ) {
            System.out.println("\n*beep* ENCENDIENDO EQUIPO...\n");
            estado = true;
        }
        else {
            System.out.println("\nEl ordenador esta encendido.");
        }
    }
    
    // Si esta encendido lo apaga, sino emite mensaje
    public void apagarOrdenador() { 
        if ( estado ) {
            System.out.println("\nAPAGANDO EQUIPO...\n");
            estado = false;
        }
        else {
            System.out.println("\nEl ordenador esta apagado.");
        }
    }
    
    // Encendido / apagado
    public void mostrarEstado() {
        if ( estado ) {
            System.out.println("\nEl ordenador esta encendido.");
        }
        else {
            System.out.println("\nEl ordenador esta apagado.");
        }
    }
    
    // Muestra todos los datos
    public void mostrarDatos() {
        System.out.println("MARCA: " + marca);
        System.out.println("PROCESADOR: " + procesador);
        System.out.println("PANTALLA: " + pantalla);
        mostrarEstado();
    }
    
    public void asignarPantalla( String p ) {
        pantalla = p;
    }
}
