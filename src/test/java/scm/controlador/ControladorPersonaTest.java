/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import scm.modelo.Medico;
import scm.modelo.Paciente;
import scm.modelo.Persona;

/**
 *
 * @author wilson
 */
public class ControladorPersonaTest {
    
    public ControladorPersonaTest() {
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
     * Test of generarID method, of class ControladorPersona.
     */
    @Test
    public void testGenerarID() {
        System.out.println("generarID");
        int expResult = 0;
        int result = ControladorPersona.generarID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class ControladorPersona.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Persona persona = null;
        String tipo = "";
        boolean expResult = false;
        boolean result = ControladorPersona.agregar(persona, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class ControladorPersona.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Persona persona = null;
        String tipo = "";
        boolean expResult = false;
        boolean result = ControladorPersona.modificar(persona, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ControladorPersona.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int id = 0;
        String tipo = "";
        Persona expResult = null;
        Persona result = ControladorPersona.buscar(id, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorPersona.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        String tipo = "";
        boolean expResult = false;
        boolean result = ControladorPersona.eliminar(id, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarMedicos method, of class ControladorPersona.
     */
    @Test
    public void testListarMedicos() {
        System.out.println("listarMedicos");
        List<Medico> expResult = null;
        List<Medico> result = ControladorPersona.listarMedicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPacientes method, of class ControladorPersona.
     */
    @Test
    public void testListarPacientes() {
        System.out.println("listarPacientes");
        List<Paciente> expResult = null;
        List<Paciente> result = ControladorPersona.listarPacientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
