/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author LuisOlaya
 */
public class calcuTest {
    static calcu calc;
    public calcuTest() {
    }
    
    @BeforeClass
    public static void beforeclass() {
        System.out.println("*****************************comienzo*****************************");
        calc = new calcu();
    }
    
    @AfterClass
    public static void afterclass() {
        calc.limpiar();
        System.out.println("*****************************terminado*****************************");
    }
    @Before
    public void before(){
        System.out.println("****before****");
        calc.limpiar();
    }

    @After
    public void after(){
        System.out.println("****after****");
    }
    /**
     * Test of suma method, of class calcu.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 4;
        int b = 2;
        int expResult = 6;
        int result = calc.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class calcu.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 4;
        int b = 2;
        int expResult = 2;
        int result = calc.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multi method, of class calcu.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        int a = 4;
        int b = 2;
        int expResult = 8;
        int result = calc.multi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class calcu.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 4;
        int b = 2;
        double expResult = 2.09;
        double result = calc.division(a, b);
        assertEquals(expResult, result,0.1);
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}
