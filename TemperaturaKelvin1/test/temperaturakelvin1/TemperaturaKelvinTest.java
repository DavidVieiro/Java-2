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
     * Test of getTemperaturaCelsius method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaCelsius() {
        System.out.println("getTemperaturaCelsius");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = 0.0;
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
        double expResult = 0.0;
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
    
}
