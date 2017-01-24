/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionombre1;

/**
 * Diseñar clase Nombre.
 * - atributos :  nombre, ape1, ape2- 
 * Constructor  : recibe  los 3 datos
 * Si datos no vacíos y todo letras asignamos valor,
 * si error =>  emitimos mensaje
 * - crear  Métodos: 
 * nombreYApellidos () devuelve cadena montada
 * inicialesNombre () devuelve  cadena con las  iniciales 
 * nombreMinusculas () devuelve la cadena con el nombre completo en minúsculas y   
 * primera letra en mayúscula.
 * Crear la Aplicación donde creamos  un objeto y  probamos clase implementada.
 * 
 * @author dam132
 */
public class Nombre {
    
    String nombre, ape1, ape2;
    
    /**
     * Creamos el constructor pasandole las 3 variables.
     * @param nombre
     * @param ape1
     * @param ape2 
     */
    public Nombre( String nombre, String ape1, String ape2 ) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }
    
    /**
     * Obtenemos el Nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establecemos el Nombre
     * @param nombre 
     */
    public void setNombre( String nombre ) {
        
        char c1;
        int hayLet1 = 0;
        
        // Comprobamos que los datos introducidos sean todo letras
        for ( int i = 0; i < nombre.length(); ++i ) {
            c1 = nombre.charAt(i);
            if ( Character.isLetter( c1 ) ) {
                ++hayLet1;
            }
        }
        
        if ( hayLet1 == nombre.length() ) {
            this.nombre = nombre;
        }
        else {
            System.out.println("El nombre contiene errores, usa solo letras...");
        }
        
    }
    
    /**
     * Obtenemos el Primer apellido
     * @return 
     */
    public String getApe1() {
        return ape1;
    }
    
    /**
     * Establecemos el Primer apellido
     * @param ape1 
     */
    public void setApe1( String ape1 ) {
        
        char c2;
        int hayLet2 = 0;
            
        // Comprobamos que los datos introducidos sean todo letras
        for ( int i = 0; i < ape1.length(); ++i ) {
            c2 = ape1.charAt(i);
            if ( Character.isLetter( c2 ) ) {
                ++hayLet2;
            }
        }
        
        if ( hayLet2 == ape1.length() ) {
            this.ape1 = ape1;
        }
        else {
            System.out.println("El primer apellido contiene errores, usa solo letras...");
        }
    }
    
    /**
     * Obtenemos el Segundo apellido
     * @return 
     */
    public String getApe2() {
        return ape2;
    }
    
    /**
     * Establecemos el Segundo apellido
     * @param ape2 
     */
    public void setApe2( String ape2 ) {
        
        char c3;
        int hayLet3 = 0;
            
        // Comprobamos que los datos introducidos sean todo letras
        for ( int i = 0; i < ape2.length(); ++i ) {
            c3 = ape2.charAt(i);
            if ( Character.isLetter( c3 ) ) {
                ++hayLet3;
            }
        }
        
        if ( hayLet3 == ape2.length() ) {
            this.ape2 = ape2;
        }
        else {
            System.out.println("El segundo apellido contiene errores, usa solo letras...");
        }
    }
    
    /**
     * Nombre y Apellidos con la primera letra en mayuscula 
     * @return 
     */
    public String nombreYApellidos () {
        
        String nombreMinus = "", ape1Minus = "", ape2Minus = "", nombreCompleto;
        
        try {
            // Mombre
            nombreMinus = "" + Character.toUpperCase( nombre.charAt(0) ) ;
            for ( int i = 1; i < nombre.length(); ++i ) {
                nombreMinus = nombreMinus + Character.toLowerCase( nombre.charAt( i ) );
            }
            // Primer Apellido
            ape1Minus = "" + Character.toUpperCase( ape1.charAt(0) ) ;
            for ( int i = 1; i < ape1.length(); ++i ) {
                ape1Minus = ape1Minus + Character.toLowerCase( ape1.charAt( i ) );
            }
            // Segundo Apellido
            ape2Minus = "" + Character.toUpperCase( ape2.charAt(0) ) ;
            for ( int i = 1; i < ape2.length(); ++i ) {
                ape2Minus = ape2Minus + Character.toLowerCase( ape2.charAt( i ) );
            }
        }
        catch ( StringIndexOutOfBoundsException ex1 ){
            System.out.println("\n\nERROR: Indice fuera de rango...");
            System.out.println(ex1);
        }
        
        
        
        // Concatenamos el nombre completo
        nombreCompleto = nombreMinus + " " + ape1Minus + " " + ape2Minus;
        
        return nombreCompleto;
    }
    
    /**
     * Cadena con las iniciales en mayuscula
     * @return 
     */
    public String inicialesNombre () {
        
        String iniciales = "";
        
        try {
            iniciales = Character.toUpperCase( nombre.charAt(0) ) + "." +
            Character.toUpperCase( ape1.charAt(0) ) + "." +
            Character.toUpperCase( ape2.charAt(0) );
        }
        catch ( StringIndexOutOfBoundsException ex1 ){
            System.out.println("\n\nERROR: Indice fuera de rango...");
            System.out.println(ex1);
        }
        
        return iniciales;
    }
    
    /**
     * Devolvemos el nombre en minusculas con la primera letra en mayusculas.
     * @return 
     */
    public String nombreMinusculas () {
        
        String nombreMinus = "";
        
        try {
            nombreMinus = "" + Character.toUpperCase( nombre.charAt(0) ) ;
            for ( int i = 1; i < nombre.length(); ++i ) {
                nombreMinus = nombreMinus + Character.toLowerCase( nombre.charAt( i ) );
            }
        }
        catch ( StringIndexOutOfBoundsException ex1 ){
            System.out.println("\n\nERROR: Indice fuera de rango...");
            System.out.println(ex1);
        }
        
        return nombreMinus;
    }
}
