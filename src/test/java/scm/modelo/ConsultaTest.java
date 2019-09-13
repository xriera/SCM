

package scm.modelo;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


 
public class ConsultaTest {
    
    
    
    
    Usuario u=new Usuario(1, "Marco", "cuenca", "medico");
    
     Medico m=new Medico(1, "0106540214", "Marco", "Loja", "Av Don Bosco", "marcoloja@hotmail.com", "Medicina Genreal", u);
        Paciente p=new Paciente(1, "0102139490", "Susana", "Calle", 'M', new java.sql.Date(1996, 9, 16), "0+", "Cuenca", null, "Secundaria");
        
        
        
      float precionarterial=(float) 17.5;
      float frecuenciaCardiaca=(float)18.6;
         float frecuenciaRespiratoria=(float)18.6;
           float temperaturaCorporal=(float)18.6;
             float peso=(float)80;
               float altura=(float)1.83;
                 float indiceMasa=(float)18.6;
                 
      
     //insertar
    Cita c1=new Cita(2, new Date(), new Date(), "prueba1", m, p, "A");
        
   Consulta c6=new Consulta(2, c1, "Dolor de la pierna", "dolor", precionarterial, frecuenciaCardiaca, frecuenciaRespiratoria, temperaturaCorporal, peso, altura, indiceMasa, "receta1", "cada 8 horas");
        
    
    public ConsultaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        testGetIndiceMasa();
        
        
       
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Consulta.
     */
 //   @Test
   /**
    public void testGetId() {
        System.out.println("getId");
        Consulta instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setId method, of class Consulta.
     */
    
    /**
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Consulta instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsulta method, of class Consulta.
     */
    
    /**
    @Test
    public void testGetConsulta() {
        System.out.println("getConsulta");
        Consulta instance = null;
        Consulta expResult = null;
        Consulta result = instance.getConsulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsulta method, of class Consulta.
     */
    
    /**
    @Test
    public void testSetConsulta() {
        System.out.println("setConsulta");
        Consulta consulta = null;
        Consulta instance = null;
        instance.setConsulta(consulta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSintomas method, of class Consulta.
     */
    
    /**
    @Test
    public void testGetSintomas() {
        System.out.println("getSintomas");
        Consulta instance = null;
        String expResult = "";
        String result = instance.getSintomas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSintomas method, of class Consulta.
     */
    
    /**
    
    @Test
    public void testSetSintomas() {
        System.out.println("setSintomas");
        String sintomas = "";
        Consulta instance = null;
        instance.setSintomas(sintomas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnostico method, of class Consulta.
     */
   // @Test
    
    /**
    public void testGetDiagnostico() {
        System.out.println("getDiagnostico");
        Consulta instance = null;
        String expResult = "";
        String result = instance.getDiagnostico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiagnostico method, of class Consulta.
     */
    
    /**
    @Test
    public void testSetDiagnostico() {
        System.out.println("setDiagnostico");
        String diagnostico = "";
        Consulta instance = null;
        instance.setDiagnostico(diagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPresionArterial method, of class Consulta.
     */
 //   @Test
    /**
    public void testGetPresionArterial() {
        System.out.println("getPresionArterial");
        Consulta instance = null;
        float expResult = 0.0F;
        float result = instance.getPresionArterial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPresionArterial method, of class Consulta.
     */
  //  @Test
    
    /**
    public void testSetPresionArterial() {
        System.out.println("setPresionArterial");
        float presionArterial = 0.0F;
        Consulta instance = null;
        instance.setPresionArterial(presionArterial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuenciaCardiaca method, of class Consulta.
     */
   // @Test
    
    /**
    public void testGetFrecuenciaCardiaca() {
        System.out.println("getFrecuenciaCardiaca");
        Consulta instance = null;
        float expResult = 0.0F;
        float result = instance.getFrecuenciaCardiaca();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuenciaCardiaca method, of class Consulta.
     */
 //   @Test
    /**
    public void testSetFrecuenciaCardiaca() {
        System.out.println("setFrecuenciaCardiaca");
        float frecuenciaCardiaca = 0.0F;
        Consulta instance = null;
        instance.setFrecuenciaCardiaca(frecuenciaCardiaca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuenciaRespiratoria method, of class Consulta.
     */
 //   @Test
    
    /**
  
    public void testGetFrecuenciaRespiratoria() {
        System.out.println("getFrecuenciaRespiratoria");
        Consulta instance = null;
        float expResult = 0.0F;
        float result = instance.getFrecuenciaRespiratoria();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuenciaRespiratoria method, of class Consulta.
     */
  // @Test
    /**
    public void testSetFrecuenciaRespiratoria() {
        System.out.println("setFrecuenciaRespiratoria");
        float frecuenciaRespiratoria = 0.0F;
        Consulta instance = null;
        instance.setFrecuenciaRespiratoria(frecuenciaRespiratoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemperaturaCorporal method, of class Consulta.
     */
 //   @Test
    /**
    public void testGetTemperaturaCorporal() {
        System.out.println("getTemperaturaCorporal");
        Consulta instance = null;
        float expResult = 0.0F;
        float result = instance.getTemperaturaCorporal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperaturaCorporal method, of class Consulta.
     */
 //   @Test
    /**
    public void testSetTemperaturaCorporal() {
        System.out.println("setTemperaturaCorporal");
        float temperaturaCorporal = 0.0F;
        Consulta instance = null;
        instance.setTemperaturaCorporal(temperaturaCorporal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Consulta.
     */
  //  @Test
    /**
    public void testGetPeso() {
        System.out.println("getPeso");
        Consulta instance = null;
        float expResult = 0.0F;
        float result = instance.getPeso();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeso method, of class Consulta.
     */
 //   @Test
    /**
    public void testSetPeso() {
        System.out.println("setPeso");
        float peso = 0.0F;
        Consulta instance = null;
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Consulta.
     */
 //   @Test
    /**
    public void testGetAltura() {
        System.out.println("getAltura");
        Consulta instance = null;
        float expResult = 0.0F;
        float result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Consulta.
     */
  //  @Test
    /**
    public void testSetAltura() {
        System.out.println("setAltura");
        float altura = 0.0F;
        Consulta instance = null;
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndiceMasa method, of class Consulta.
     */
 //   @Test
    /**
    public void testGetIndiceMasa() {
        System.out.println("getIndiceMasa");
        Consulta instance = null;
        float expResult = 0.0F;
        float result = instance.getIndiceMasa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReceta method, of class Consulta.
     */
  //  @Test
    /**
    public void testGetReceta() {
        System.out.println("getReceta");
        Consulta instance = null;
        String expResult = "";
        String result = instance.getReceta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReceta method, of class Consulta.
     */
 //   @Test
    /**
    public void testSetReceta() {
        System.out.println("setReceta");
        String receta = "";
        Consulta instance = null;
        instance.setReceta(receta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndicaciones method, of class Consulta.
     */
 //   @Test
    /**
    public void testGetIndicaciones() {
        System.out.println("getIndicaciones");
        Consulta instance = null;
        String expResult = "";
        String result = instance.getIndicaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndicaciones method, of class Consulta.
     */
  //  @Test
    
    /**
     * 
     */
    
  //  /**
   // public void testSetIndicaciones() {
     //   System.out.println("setIndicaciones");
       // String indicaciones = "";
        //Consulta instance = null;
        //instance.setIndicaciones(indicaciones);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //
 //
    
    
    
  //   @Test
  
    
    
    
    
    
    public void testGetIndiceMasa() {
        
        System.out.println("Calulo IMC");
       
       float resultadoReal = c6.calcularIndiceMasa();
    float resultadoEsperado = (float) 23.88844;
    assertEquals(resultadoEsperado, resultadoReal, 1);
        
        fail("The test case is a prototype.");
        }
        }
    
    
        
    
    
    
    



