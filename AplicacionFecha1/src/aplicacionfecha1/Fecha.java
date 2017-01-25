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
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha( int dia, int mes, int anio ) {
        if ( valida(dia, mes, anio) ) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 0;
            this.mes = 0;
            this.anio = 0;
        }
    }

    public boolean valida(int dia, int mes, int anio) {
        if ( dia < 1 || dia > 31 ) {
            return false;
        }
        if ( mes < 1 || mes > 12 ) {
            return false;
        }
        // determinamos la cantidad de días del mes:
        int diasMes = 0;
        switch ( mes ) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2: // verificación de año bisiesto
                if ( ( anio % 400 == 0 )
                        || ( ( anio % 4 == 0 ) && ( anio % 100 != 0 ) ) ) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
        }
        if ( dia > diasMes ) {
            return false;
        } else {
            return true;
        }
    }
    // … más métodos

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
}

//Una pregunta que tal vez quede rondando en las cabezas 
//de los lectores. ¿Por qué declaré los métodos bisiesto y 
//diasMes como privados?
