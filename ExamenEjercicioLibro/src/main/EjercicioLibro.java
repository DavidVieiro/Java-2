/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.Libro;

/**
 *
 * @author Amanda Prieto Almeida
 */
public class EjercicioLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Creación de 2 libros de forma diferente
            Libro l1 = new Libro("Anna Karenina", "León Tólstoi", "123abc", "Frida");
            Libro l2 = new Libro("Mujeres", 1970, "abc123", "Universal");

            //Asignar el precio a un libro
            l1.setPrecio(20.95F);

            //Asigno un autor a l2 para poder compararlo 
            l2.setAutor("Charles Bukowski");
            //Comparar 2 libros
            System.out.println("Comparando 2 libros: ");
            if (l1.equals(l2)) {
                System.out.println("Los dos libros SON iguales.\n");
            } else {
                System.out.println("Los dos libros NO son iguales.\n");
            }

            //Mostrar datos de un libro usando verLibro()
            System.out.println("Datos:\n" + Libro.verLibro(l1));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
