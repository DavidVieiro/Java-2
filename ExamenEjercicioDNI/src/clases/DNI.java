
package clases;

import excepciones.ContidoBaleiroException;
import excepciones.LetraIncorrectaException;
import excepciones.NumerosIncorrectosException;
import excepciones.TamañoIncorrectoException;
import java.util.StringTokenizer;

public class DNI {
   private String nombre, apellidos, dni;

    public DNI(String nombre, String apellidos, String dni) throws ContidoBaleiroException, TamañoIncorrectoException, LetraIncorrectaException, NumerosIncorrectosException {
        
        if (nombre.length()==0) {
            throw new ContidoBaleiroException("Error! El nombre no puede estar vacío");
            
        }
        else {
            if (apellidos.length()==0) {
                throw new ContidoBaleiroException("Error! Los apellidos no pueden estar vacíos");
                
            }
            else {
                if (comprobarDNI(dni)) {
                    
                    this.nombre=nombre;
                    this.apellidos=apellidos;
                    this.dni=dni;
                    System.out.println("Creado nuevo usuario correctamente");
                }
            }
            
        }
        
    }

    public String nombreCompleto() {
        return (Character.toUpperCase(nombre.charAt(0))+nombre.substring(1,nombre.length())+" "+Character.toUpperCase(apellidos.charAt(0))+apellidos.substring(1,apellidos.length()));
        
    }

    private boolean comprobarDNI(String dni) throws TamañoIncorrectoException, LetraIncorrectaException, NumerosIncorrectosException {
        if (dni.length()!=9) {
            throw new TamañoIncorrectoException("Error! El tamaño del DNI debe ser 9");
        }
        else {
            if (!(Character.isLetter(dni.charAt(8)))) {
                throw new LetraIncorrectaException("Error! la última debe ser letra");
            }
            else {
               
                if (!(comprobarNumerosDNI(dni))) {
                     throw new NumerosIncorrectosException("Error! No son numeros todos los 8 primeros");
                }
                
                
            }
        }
        return true;
    }

    public String generarContraseña(String palabra) throws ContidoBaleiroException {
        String todo = "";
        int cont=0;
        int sum=0;
        if (palabra.length()==0) {
            throw new ContidoBaleiroException("Error! La palabra no puede tener tamaño cero");
        }
        else  {
            
            StringTokenizer st = new StringTokenizer(palabra);
            
                 while (st.hasMoreTokens()) {
                        cont++;
                        todo=todo+Character.toLowerCase(st.nextToken().charAt(0));
                }
                 todo=todo+cont+this.nombre.toUpperCase();
                 for (int i = 0; i < 8; i++) {

                     sum+=this.dni.charAt(i)-48;
                
            }
                 
        }
        todo=todo+sum;
        System.out.println("todo = "+todo);
        return todo;
    }

    private boolean comprobarNumerosDNI(String dni) {
        
        boolean bandera=true;
        for (int i = 0; i < 8 && bandera; i++) {
            
           
            if (!(Character.isDigit(dni.charAt(i)))) {
                bandera=false;
            }
            
        }
       return bandera;
        
    }
    
}