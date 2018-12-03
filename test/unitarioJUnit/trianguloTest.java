/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarioJUnit;

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
public class trianguloTest {
    
    public trianguloTest() {
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

    @Test
    public void testDeterminaTipoTrianguloInexistente() {
        System.out.println("DeterminaTipoTrianguloInexistente");
        int a = 0;
        int b = 0;
        int c = 0;
        triangulo instance = new triangulo();
        String expResult = "INEXISTENTE";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeterminaTipoTrianguloInexistente2() {
        System.out.println("DeterminaTipoTrianguloInexistente2");
        int a = 1;
        int b = 2;
        int c = 3;
        triangulo instance = new triangulo();
        String expResult = "INEXISTENTE";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminaTipoTrianguloEquilatero() {
        System.out.println("DeterminaTipoTrianguloEquilatero");
        int a = 1;
        int b = 1;
        int c = 1;
        triangulo instance = new triangulo();
        String expResult = "EQUILATERO";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminaTipoTrianguloIsosceles() {
        System.out.println("DeterminaTipoTrianguloIsosceles");
        int a = 1;
        int b = 2;
        int c = 2;
        triangulo instance = new triangulo();
        String expResult = "ISOSCELES";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminaTipoTrianguloIsosceles2() {
        System.out.println("DeterminaTipoTrianguloIsosceles2");
        int a = 2;
        int b = 2;
        int c = 1;
        triangulo instance = new triangulo();
        String expResult = "ISOSCELES";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

    @Test
    public void testDeterminaTipoTrianguloEscaleno() {
        System.out.println("DeterminaTipoTrianguloEscaleno");
        int a = 2;
        int b = 3;
        int c = 4;
        triangulo instance = new triangulo();
        String expResult = "ESCALENO";
        String result = instance.DeterminaTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
}
