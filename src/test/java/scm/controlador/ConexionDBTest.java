/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.sql.ResultSet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import scm.modelo.Usuario;

/**
 *
 * @author wilson
 */
public class ConexionDBTest {
    
    public ConexionDBTest() {
    }
   
    @Before
    public void setUp() {
    }

    /**
     * Test of ejecutarSentencia method, of class ConexionDB.
     */
    @Test
    public void testEjecutarSentencia() {
        boolean expResult = false;
        boolean result = ConexionDB.ejecutarSentencia(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of ejecutarConsulta method, of class ConexionDB.
     */
    @Test
    public void testEjecutarConsulta() {
        ResultSet expResult = null;
        ResultSet result = ConexionDB.ejecutarConsulta(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsuarioSesion method, of class ConexionDB.
     */
    @Test
    public void testGetUsuarioSesion() {
        Usuario expResult = null;
        Usuario result = ConexionDB.getUsuarioSesion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}