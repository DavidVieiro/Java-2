/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomonedero3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam132
 */
public class MonederoTest {
    
    public MonederoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sacarDinero method, of class Monedero.
     * @throws java.lang.Exception
     */
    @Test
    public void testSacarDineroValido() throws Exception {
        System.out.println("\n--- Prueba sacarDinero Datos Valido ---");
        
        double dinero_a_sacar1 = 0.0;
        System.out.println("Dinero1 = " + dinero_a_sacar1);
        Monedero instance1 = new Monedero( 800 );
        instance1.sacarDinero(dinero_a_sacar1);
        
        double dinero_a_sacar2 = 20.0;
        System.out.println("Dinero2 = " + dinero_a_sacar2);
        Monedero instance2 = new Monedero( 800 );
        instance2.sacarDinero(dinero_a_sacar2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test ( expected = ErrorSacarDineroException.class)
    public void testSacarDineroNoValido1() throws ErrorSacarDineroException, ErrorCrearMonederoException {
        System.out.println("\n--- Prueba sacarDinero Datos No Valido 1 ---");
        double dinero_a_sacar = -8.0; // Provocamos la excepcion...
        System.out.println("Dinero1 = " + dinero_a_sacar);
        Monedero instance = new Monedero( 800 );
        instance.sacarDinero(dinero_a_sacar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarDinero method, of class Monedero.
     * @throws ejerciciomonedero3.ErrorCrearMonederoException
     */
    @Test
    public void testConsultarDineroValido() throws ErrorCrearMonederoException {
        System.out.println("\n--- Prueba consultarDinero Valido ---");
        double expResult = 0.0;
        Monedero instance = new Monedero( 800 );
        double result = instance.consultarDinero();
        assertEquals(expResult, result, 800.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarDinero method, of class Monedero.
     * @throws java.lang.Exception
     */
    @Test
    public void testIngresarDineroValido() throws Exception {
        System.out.println("\n--- Prueba ingresarDinero Valido ---");
        double cantidad_a_ingresar = 10.0;
        Monedero instance = new Monedero( 800 );
        instance.ingresarDinero(cantidad_a_ingresar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test ( expected = ErrorIngresarDineroException.class )
    public void testIngresarDineroNoValido1() throws ErrorIngresarDineroException, ErrorCrearMonederoException {
        System.out.println("\n--- Prueba ingresarDinero No Valido 1 ---");
        double cantidad_a_ingresar = -8.0;
        Monedero instance = new Monedero( 800 );
        instance.ingresarDinero(cantidad_a_ingresar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
