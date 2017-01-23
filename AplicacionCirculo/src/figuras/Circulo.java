/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author dam132
 */
public class Circulo {
    
    private float radio;
    String color="";

    public Circulo(String color) {
        this.color = color;
    }

    public Circulo(String color, float radio) {
        this.radio = radio;
        this.color = color;
    }

    
    
    /**
     * 
     * @return devolvemos el area del circulo
     */
    public float areaCirculo() {
        float area = 0;
        
        return area;
    }
    /**
     * 
     * @return Devolvemos la longitud del circulo
     */
    public float longitudCirculo() {
        float longitud = 0;
        
        return longitud;
    }
    /**
     * Source / Insert code... / Getters and Setters...
     * Se crean el getRadiazo y el setRadiado automaticamente.
     * @return Devuelve el valor del radio.
     */
    public float getRadio() {
        return radio;
    }
    /**
     * 
     * @param radio Establecemos el radio del circulo
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    /**
     * Source / Insert code... / Constructor...
     * Si marcas la casilla se crea el constructor con parametros.
     * Si no se marca la casilla se crea sin parametros.
     * @param radiazo 
     */
    public Circulo(float radiazo) {
        this.radio = radiazo;
    }
    /**
     * 
     */
    public Circulo() {
    }
    
}
