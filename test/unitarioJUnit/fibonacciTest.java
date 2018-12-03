/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarioJUnit;

import atividadeteste.Fibonacci;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Filipe Oliveira RA: 317112097
 */
public class fibonacciTest {
    
    public fibonacciTest() {
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
     * Test of DeterminaPosicaoFibonacci method, of class fibonacci.
     */
    @Test
    public void testDeterminaPosicaoFibonacci() {
        System.out.println("DeterminaPosicaoFibonacci");
        int posicao = 6;
        fibonacci instance = new fibonacci();
        int expResult = 8;
        int result = instance.DeterminaPosicaoFibonacci(posicao);
        assertEquals(expResult, result);
    }

    @Test
        public void testDeterminaPosicaoFibonacciNegativo() {
        System.out.println("DeterminaPosicaoFibonacciNegativo");
        int posicao = -2;
        fibonacci instance = new fibonacci();
        int expResult = 0;
        int result = instance.DeterminaPosicaoFibonacci(posicao);
        assertEquals(expResult, result);
        fail("ERROR: posicao deve ser maior que 0.");
    }

    @Test
        public void testDeterminaPosicaoFibonacciLetra() {
        System.out.println("DeterminaPosicaoFibonacciLetra");
        int posicao = a;
        fibonacci instance = new fibonacci();
        int expResult = 0;
        int result = instance.DeterminaPosicaoFibonacci(posicao);
        assertEquals(expResult, result);
        fail("ERROR: Entre com um numero inteiro positivo.");
    }
    
}
