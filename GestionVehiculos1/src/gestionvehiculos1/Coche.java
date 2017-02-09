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
public class Coche extends Vehiculo {
    
    private String claveDocumento;
    private String nombreConductor;
    private int importancia;
    private int ingresos;
    
    /**
     * 
     */
    public Coche() {
    }
    
    /**
     * 
     * @param claveDocumento Clave del documento transportado en el Vehiculo.
     * @param nombreConductor Nombre del conductor del Vehiculo.
     * @param matricula Matricula del Vehiculo
     * @param anoCompra Año de Compra del Vehiculo
     * @param marca Marca del Vehiculo
     * @param importancia Importancia del documento con valores del 0 al 2.
     */
    public Coche( String claveDocumento, String nombreConductor, String matricula, int anoCompra, String marca, int importancia ) {
        super(matricula, anoCompra, marca);
        this.claveDocumento = claveDocumento;
        this.nombreConductor = nombreConductor;
        this.importancia = importancia;
        calcularIngreso();
    }
    
    /**
     * 
     * @return 
     */
    public String getClaveDocumento() {
        return claveDocumento;
    }
    
    /**
     * 
     * @return 
     */
    public String getNombreConductor() {
        return nombreConductor;
    }
    
    /**
     * 
     */
    public final void calcularIngreso () {
        
        switch ( importancia ) {
            case 0:
                ingresos = 30;
                break;
            case 1:
                ingresos = 60;
                break;
            case 2:
                ingresos = 120;
                break;
            default:
                System.out.println("ERROR: Ese nivel de importancia es incorrecto.");
        }
        
        super.calcularIngresoTotal();
    }
    
    /**
     * 
     * @return 
     */
    public int getIngresos() {
        return ingresos;
    }
    
    
}
