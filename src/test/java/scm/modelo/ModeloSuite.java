/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author wilson
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({scm.modelo.MedicoTest.class, scm.modelo.ConsultaTest.class, scm.modelo.PersonaTest.class, scm.modelo.CitaTest.class, scm.modelo.UsuarioTest.class, scm.modelo.PacienteTest.class})
public class ModeloSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
