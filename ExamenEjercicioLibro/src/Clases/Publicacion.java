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
public abstract class Publicacion { //Está codificada como abstract para que no se puedan crear objetos de esta clase

    private String codigo, editorial;
    private float precio;

    public Publicacion(String codigo, String editorial) {
        this.codigo = codigo;
        this.editorial = editorial;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
