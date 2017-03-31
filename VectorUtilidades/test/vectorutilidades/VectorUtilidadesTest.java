/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorutilidades;

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
public class VectorUtilidadesTest {
    
    public VectorUtilidadesTest() {
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
        System.out.println("\n\n-------------------------------------------");
    }
    
    @Test
    public void testLlenarVectorValido () throws Exception {
        System.out.println("llenarVector - Valido");
        int vector[] = new int [99];
        VectorUtilidades instance = new VectorUtilidades();
        instance.llenarVector(vector);
        
    }
    
    @Test (expected = Exception.class)
    public void testLlenarVectorNoValido1 () throws Exception {
        System.out.println("llenarVector - No valido");
        int vector[] = new int [111];
        VectorUtilidades instance = new VectorUtilidades();
        instance.llenarVector( vector );
        
    }
    
    /**
     * Test of elMayor method, of class VectorUtilidades.
     */
    @Test
    public void testElMayor() {
        System.out.println("elMayor - Valido");
        int[] vector = {Integer.MIN_VALUE, 50, 100, Integer.MAX_VALUE};
        int expResult = Integer.MAX_VALUE;
        int result = VectorUtilidades.elMayor(vector);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sumaTotal method, of class VectorUtilidades.
     */
    @Test
    public void testSumaTotal() {
        System.out.println("sumaTotal - Valido");
        int[] vector = {1,100};
        long expResult = 101L;
        long result = VectorUtilidades.sumaTotal(vector);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of equals method, of class VectorUtilidades.
     */
    @Test
    public void testEqualsValido() {
        System.out.println("equals - Valido");
        int[] a = {1,100,4};
        int[] b = {1,100,4};
        boolean expResult = true;
        boolean result = VectorUtilidades.equals(a, b);
        assertEquals(expResult, result);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testEqualsNoValido1() throws IllegalArgumentException {
        System.out.println("equals - No Valido 1");
        int[] a = {1,100,4};
        int[] b = null;
        boolean expResult = false;
        boolean result = VectorUtilidades.equals(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsNoValido2() {
        System.out.println("equals - No Valido 2");
        int[] a = {1,100,4};
        int[] b = {1,4};
        boolean expResult = false;
        boolean result = VectorUtilidades.equals(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsNoValido3() {
        System.out.println("equals - No Valido 2");
        int[] a = {1,100,4};
        int[] b = {1,50,4};
        boolean expResult = false;
        boolean result = VectorUtilidades.equals(a, b);
        assertEquals(expResult, result);
    }
    
//    @Test
//    public void testComprobar_existe() {
//        System.out.println("sumaTotal");
//        int[] vector = {1,2,3,4,5};
//        int expResult = 5;
//        VectorUtilidades instance = new VectorUtilidades();
//        boolean result = instance.comprobar_existe( vector, expResult );
//        assertEquals( expResult, result );
//    }
    
}
