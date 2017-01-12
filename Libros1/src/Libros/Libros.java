/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros;

/**
 * Defina una clase libro que pueda ser utilizada para representar
 * los libros que hay en una biblioteca. Suponga que cada libro
 * tiene los siguientes atributos:
 * 
 * - Título
 * - Autor
 * - Año de publicación
 * - Editorial
 * - Precio
 * 
 * Se puede crear libro con título, autor y editorial ,o con los datos titulo y autor.
 * Necesitamos métodos para asignar cada dato y mostrarlos.
 * Escriba una aplicación donde creará dos objetos de la clase libro, y ejecute todos los métodos.
 * 
 * @author dam132
 */
public class Libros {
    // Variables
    private String titulo;
    private String autor;
    private String editorial;
    private int anoPublicacion;
    private float precio;
    
    // Constructores
    Libros ( String titulo, String autor, String editorial ){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    Libros ( String titulo, String autor ) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void asignarEditorial ( String editorial ){
        this.editorial = editorial;
    }
    
    public void asignarPublicacion ( int anoPublicacion ) {
        this.anoPublicacion = anoPublicacion;
    }
    
    public void asignarPrecio ( float precio ) {
        this.precio = precio;
    }
    
    public void mostrarLibro () {
        System.out.println("Titulo: "           + titulo);
        System.out.println("Autor: "            + autor);
        System.out.println("Editorial: "        + editorial);
        System.out.println("Año Publicacion: "  + anoPublicacion);
        System.out.println("Precio: "           + precio + " €");
    }
}
