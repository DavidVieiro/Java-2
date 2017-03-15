/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturakelvin1;

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
public class TemperaturaKelvinTest {
    
    public TemperaturaKelvinTest() {
        // Aqui no se escribe nada.
        // Repite por cada ejecucion.
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
    
//    @Test
//    public void testTemperaturaKelvin() {
//        
//        System.out.println(" ** constructor ** ");
//        System.out.println("1- Prueba contructor ==> sin datos");
//        TemperaturaKelvin sindato = new TemperaturaKelvin();
//        assertNotNull( sindato );
//        
//        // Otra forma
//        System.out.println(" prueba getTemperaturaKelvin()");
//        assertEquals( 0, sindato.getTemperaturaKelvin(), 0.0 );
//        
//        System.out.println("2- Prueba constructor ==> con dato");
//        TemperaturaKelvin condato = new TemperaturaKelvin( 50 );
//        assertEquals( 50, condato.getTemperaturaKelvin(), 0.0 );
//        
//    }
//    
//    @Test
//    public void testSetTemperaturaKelvin() {
//        
//        System.out.println("Prueba setTemperaturaKelvin");
//        TemperaturaKelvin instance = new TemperaturaKelvin( 5 );
//        
//        // Asignar valor
//        instance.setTemperaturaKelvin( 5 );
//        assertEquals( 5, instance.getTemperaturaKelvin(), 0.0 );
//        
//    }
    
    /**
     * Test of getTemperaturaCelsius method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaCelsius() {
        System.out.println("getTemperaturaCelsius");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = -273.15;
        double result = instance.getTemperaturaCelsius();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemperaturaFahrenheit method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaFahrenheit() {
        System.out.println("getTemperaturaFahrenheit");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = -459.66999999999996;
        double result = instance.getTemperaturaFahrenheit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemperaturaKelvin method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaKelvin() {
        System.out.println("getTemperaturaKelvin");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = 0.0;
        double result = instance.getTemperaturaKelvin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperaturaKelvin method, of class TemperaturaKelvin.
     */
    @Test
    public void testSetTemperaturaKelvin() {
        System.out.println("setTemperaturaKelvin");
        double temperaturaKelvin = 0.0;
        TemperaturaKelvin instance = new TemperaturaKelvin();
        instance.setTemperaturaKelvin(temperaturaKelvin);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test ( expected  = Exception.class)
    public void testGetTemperaturaFarenheit2() throws Exception {
        System.out.println("--- Prueba getTemperaturaFahrenheit 3 ---");
        System.out.println("1. Prueba valor MAX_DOUBLE -> MAX_DOUBLE * 9 / 5 + 32");
        TemperaturaKelvin objeto = new TemperaturaKelvin( Double.MAX_VALUE );
        double result = objeto.getTemperaturaFahrenheit();
        
        if ( Double.isFinite( result )) {
            System.out.println("Efectivamente el resultado es infinito...");
            throw new Exception("Desbordamieno de dato.");
        }
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
