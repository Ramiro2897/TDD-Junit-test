/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tddpruebas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class CocheTest {

    static Coche instance;

    public CocheTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        instance = new Coche("Audi", 10000);
        Coche.impuesto = 20f;

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testPrecioFinal() {
        System.out.println("precio final carro con descuento");
        float descuento = 10.0F;
        // Coche instance = new Coche("Audi", 10000);
        // Coche.impuesto = 20f;
        float expResult = 10800;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testPrecioFinal_CarroBaratoSinDescuento() {
        System.out.println("precio final carro barato sin descuento");
        // Coche carro = new Coche("Audi", 1000);
        // Coche.impuesto = 20f;
        float descuento = 10.0F;
        instance.precioBase = 1000f;
        float expResult = 1200;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testPrecioFinal_DescuentoInvalido() {
        System.out.println("precio final con descuento invalido");
        float descuento = 110.0F;
        assertThrows(IllegalArgumentException.class, () -> {
            instance.precioFinal(descuento);
        });
    }
}
