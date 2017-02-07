/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionvehiculos1;

/**
 *
 * @author dam132
 */
public class Furgoneta extends Vehiculo {
    
    private int dinero;
    private int vigilantes;
    private int ingresos;

    public Furgoneta() {
    }
    
    public Furgoneta( int dinero, int vigilantes, String matricula, int anoCompra, String marca ) {
        super(matricula, anoCompra, marca);
        this.dinero = dinero;
        this.vigilantes = vigilantes;
    }

    public int getDinero() {
        return dinero;
    }

    public int getVigilantes() {
        return vigilantes;
    }
    
    public int calcularIngreso () {
        
        if ( dinero >= 6000 ) {
            ingresos = 120;
        }
        else {
            ingresos = 60;
        }
        return ingresos;
    }
    
}
