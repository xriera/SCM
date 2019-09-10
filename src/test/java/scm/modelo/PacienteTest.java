/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.modelo;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wilson
 */
public class PacienteTest {
    
    public PacienteTest() {
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
     * Test of getSexo method, of class Paciente.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Paciente instance = null;
        char expResult = ' ';
        char result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Paciente.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        char sexo = ' ';
        Paciente instance = null;
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaNacimiento method, of class Paciente.
     */
    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Paciente instance = null;
        Date expResult = null;
        Date result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaNacimiento method, of class Paciente.
     */
    @Test
    public void testSetFechaNacimiento() {
        System.out.println("setFechaNacimiento");
        Date fechaNacimiento = null;
        Paciente instance = null;
        instance.setFechaNacimiento(fechaNacimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoSangre method, of class Paciente.
     */
    @Test
    public void testGetTipoSangre() {
        System.out.println("getTipoSangre");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getTipoSangre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoSangre method, of class Paciente.
     */
    @Test
    public void testSetTipoSangre() {
        System.out.println("setTipoSangre");
        String tipoSangre = "";
        Paciente instance = null;
        instance.setTipoSangre(tipoSangre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProcedencia method, of class Paciente.
     */
    @Test
    public void testGetProcedencia() {
        System.out.println("getProcedencia");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getProcedencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProcedencia method, of class Paciente.
     */
    @Test
    public void testSetProcedencia() {
        System.out.println("setProcedencia");
        String procedencia = "";
        Paciente instance = null;
        instance.setProcedencia(procedencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtnia method, of class Paciente.
     */
    @Test
    public void testGetEtnia() {
        System.out.println("getEtnia");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getEtnia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtnia method, of class Paciente.
     */
    @Test
    public void testSetEtnia() {
        System.out.println("setEtnia");
        String etnia = "";
        Paciente instance = null;
        instance.setEtnia(etnia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstruccion method, of class Paciente.
     */
    @Test
    public void testGetInstruccion() {
        System.out.println("getInstruccion");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getInstruccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstruccion method, of class Paciente.
     */
    @Test
    public void testSetInstruccion() {
        System.out.println("setInstruccion");
        String instruccion = "";
        Paciente instance = null;
        instance.setInstruccion(instruccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
