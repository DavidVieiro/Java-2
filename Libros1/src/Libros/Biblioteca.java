/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

/**
 *
 * @author dam132
 */
public class Biblioteca {
    public static void main(String[] args) {
        
        Libros libro1 = new Libros("El Quijote","Cervantes");
        Libros libro2 = new Libros("Caperucita Roja", "Anonimo", "Otra");
        
        System.out.println("\n-- Libro 1 --");
        libro1.asignarEditorial("Alguna");
        libro1.asignarPublicacion( 1980 );
        libro1.asignarPrecio( 19.99F );
        libro1.mostrarLibro();
        
        System.out.println("\n-- Libro 2 --");
        libro2.asignarPublicacion( 1900 );
        libro2.asignarPrecio( 5.99F );
        libro2.mostrarLibro();
        
    }
}
