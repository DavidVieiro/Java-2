/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador1;

/**
 *
 * @author dam132
 */
public class Programa {
    public static void main(String[] args) {
        
        Ordenador maquina1 = new Ordenador( "Clonico", "Intel i5" );
        Ordenador maquina2 = new Ordenador( "HP", "Intel i7" );
        Ordenador maquina3 = new Ordenador( "Lenovo", "AMD A10" );
        
//        Ordenador pc = new Ordenador();
        
//        pc.marca = "Clonico";
//        pc.pantalla = "Samsung";
//        pc.procesador = "Intel";
        System.out.println("\n\n-- Ordenador 1 --");
        maquina1.asignarPantalla("Samsung");
        maquina1.mostrarEstado();
        maquina1.encenderOrdenador();
        maquina1.mostrarDatos();
        maquina1.apagarOrdenador();
        
        System.out.println("\n\n-- Ordenador 2 --");
        maquina2.asignarPantalla("HP");
        maquina2.mostrarEstado();
        maquina2.encenderOrdenador();
        maquina2.mostrarDatos();
        maquina2.apagarOrdenador();
        
        System.out.println("\n\n-- Ordenador 3 --");
        maquina3.asignarPantalla("Dell");
        maquina3.mostrarEstado();
        maquina3.encenderOrdenador();
        maquina3.mostrarDatos();
        maquina3.apagarOrdenador();
        
    }
}
