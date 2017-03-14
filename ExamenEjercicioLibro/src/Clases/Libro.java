/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Amanda Prieto Almeida
 */
public class Libro extends Publicacion {

    private String titulo, autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, String codigo, String editorial) {
        super(codigo, editorial);
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, int añoPublicacion, String codigo, String editorial) {
        super(codigo, editorial);
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void verDatos() {
        System.out.println("Título: " + this.titulo + "\nAutor: " + this.autor
        + "\nAño de publicación: " + this.añoPublicacion + "\nCódigo: " + this.getCodigo()
        + "\nEditorial: " + this.getEditorial() + "\nPrecio: " + this.getPrecio());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) { //Si el objeto que se le pasa es nulo..
            return false; //..no existe (false)
        } else if (o instanceof Libro) { //Si el objeto que se le pasa es un Libro sigue comparando y sino devuelve false
            Libro l = (Libro) o; //Convierte el objeto que se la ha pasado a tipo Libro y lo guarda en l
            //Comprueba que los atributos de l sean iguales a los de o y si es así devuelve true y sino false
            if (l.getAutor().equalsIgnoreCase(this.autor) && l.getTitulo().equalsIgnoreCase(this.titulo)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static String verLibro(Libro l) {
        String cadena = "";
        cadena = cadena.concat(l.getTitulo() + " " + l.getAutor() + " " + l.getCodigo() + " ");
        return cadena;
    }
}
