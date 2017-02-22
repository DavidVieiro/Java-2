/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasvalidador;

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
public class ValidadorTest {
    
    private static Validador instance;
    
    public ValidadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("-------------------------------------");
        System.out.println("-------- Ejercicio validador --------");
        System.out.println("-------------------------------------");
        System.out.println("Limite MAX: " + Integer.MAX_VALUE);
        System.out.println("Limite MIN: " + Integer.MIN_VALUE);
        System.out.println("-------------------------------------");
        
        instance = new Validador();
        assertNotNull( instance );
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("");
    }
    
    @After
    public void tearDown() {
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("");
    }
    
    @Test
    public void testMenorQue() {
        
        System.out.println("---> CORRECTOS <---");
        System.out.println("**** LIMITES ****");
        System.out.println("1- -2e31 menorQue 0 es true");
        
        int a = -2147483648;
        int b = 0;
        
        boolean expResult = true; // valor esperado
        boolean result = instance.menorQue(a, b);
        assertEquals( expResult, result);
        
        System.out.println("2- 2147483648 menorQue 0 es false");
        assertEquals(true, instance.menorQue(-2147483648, 0));
        
        System.out.println("**** NO LIMITES ****");
        System.out.println("3- 0 menorQue 11 es true");
        assertEquals(true, instance.menorQue(0, 11));
        
        System.out.println("4- 99 menorQue 2 es false");
        assertEquals(false, instance.menorQue(99, 2));
        
        System.out.println("5- -30 menorQue 2 es true");
        assertEquals(true, instance.menorQue(-30, 2));
        
        System.out.println("6- 5 menorQue -11 es false");
        assertEquals(false, instance.menorQue(5, -11));
        
        System.out.println("7- 3 igual a 3");
        assertEquals(false, instance.menorQue(3, 3));
        
        
    }
//    /**
//     * Test of menorQue method, of class Validador.
//     */
//    @Test
//    public void testMenorQue() {
//        int a = 0;
//        int b = 11;
//        System.out.println("menorQue - Probamos " + a + " < " + b);
//        Validador instance = new Validador();
//        boolean expResult = true;
//        boolean result = instance.menorQue(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of mayorQue method, of class Validador.
//     */
//    @Test
//    public void testMayorQue() {
//        int a = 11;
//        int b = 0;
//        System.out.println("mayorQue - Probamos " + a + " > " + b);
//        Validador instance = new Validador();
//        boolean expResult = true;
//        boolean result = instance.mayorQue(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of igualQue method, of class Validador.
//     */
//    @Test
//    public void testIgualQue() {
//        int a = 0;
//        int b = 0;
//        System.out.println("igualQue - Probamos " + a + " = " + b);
//        Validador instance = new Validador();
//        boolean expResult = true;
//        boolean result = instance.igualQue(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//    
}
