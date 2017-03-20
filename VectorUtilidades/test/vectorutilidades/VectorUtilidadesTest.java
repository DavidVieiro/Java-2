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

    /**
     * Test of llenarVector method, of class VectorUtilidades.
     * @throws java.lang.Exception
     */
    @Test
    public void testLlenarVector() throws Exception {
        System.out.println("llenarVector");
        int[] vector = null;
        VectorUtilidades instance = new VectorUtilidades();
        instance.llenarVector( vector );
    }

    /**
     * Test of elMayor method, of class VectorUtilidades.
     */
    @Test
    public void testElMayor() {
        System.out.println("elMayor");
        int[] vector = null;
        int expResult = 0;
        int result = VectorUtilidades.elMayor(vector);
        assertEquals(expResult, result);
    }

    /**
     * Test of sumaTotal method, of class VectorUtilidades.
     */
    @Test
    public void testSumaTotal() {
        System.out.println("sumaTotal");
        int[] vector = null;
        long expResult = 0L;
        long result = VectorUtilidades.sumaTotal(vector);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class VectorUtilidades.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        int[] a = null;
        int[] b = null;
        boolean expResult = false;
        boolean result = VectorUtilidades.equals(a, b);
        assertEquals(expResult, result);
    }
    
}
