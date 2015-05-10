/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travis.pkg2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class OperacionesIT {
    
    public OperacionesIT() {
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
     * Test of sumar method, of class Operaciones.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int numero1 = 6;
        int numero2 = 6;
        Operaciones instance = new Operaciones();
        int expResult = 12;
        int result = instance.sumar(numero1, numero2);
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class Operaciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int numero1 = 5;
        int numero2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.restar(numero1, numero2);
        assertEquals(expResult, result);

    }

    /**
     * Test of multiplicar method, of class Operaciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int numero1 = 6;
        int numero2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 30;
        int result = instance.multiplicar(numero1, numero2);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of dividir method, of class Operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int numero1 = 6;
        int numero2 = 6;
        Operaciones instance = new Operaciones();
        int expResult = 1;
        int result = instance.dividir(numero1, numero2);
        assertEquals(expResult, result);

    }
    
}
