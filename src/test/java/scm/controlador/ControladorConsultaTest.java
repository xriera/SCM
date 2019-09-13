/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import scm.modelo.Cita;
import scm.modelo.Consulta;
import scm.modelo.Medico;
import scm.modelo.Paciente;
import scm.modelo.Usuario;

/**
 *
 * @author DELL
 */
public class ControladorConsultaTest {
    
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
    Cita c1=new Cita(3, new Date(), new Date(), "prueba1", m, p, "A");
        
   Consulta c6=new Consulta(3, c1, "Dolor de la pierna", "dolor", precionarterial, frecuenciaCardiaca, frecuenciaRespiratoria, temperaturaCorporal, peso, altura, indiceMasa, "receta1", "cada 8 horas");
        
    
    
    public ControladorConsultaTest() {
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
     * Test of agregarConsulta method, of class ControladorConsulta.
     */
    @Test
    public void testAgregar_Listar_Consulta_IMC() {
        System.out.println("Test para Agregar y listar Consulta y calcular IMC");
        boolean expResult = true;
     
        if (expResult == true) {
          
            boolean resultado = false;
            System.out.println("listar");
            for (Consulta c : ControladorConsulta.listar()) {
                System.out.println("lista" + c.toString());
                resultado = true;
            }
        } else {
            fail("error al ingresar.");
        }
        System.out.println("Calulo IMC");
        float resultadoReal = c6.calcularIndiceMasa();
        float resultadoEsperado = (float) 23.88844;
        assertEquals(resultadoEsperado, resultadoReal, 0.001);
        System.out.println("IMC Calculado...." + c6.calcularIndiceMasa());

    }

   
    

    /**
     * Test of modificar method, of class ControladorConsulta.
     */
    @Test
    public void testModificar() {
        System.out.println("ModificarTest");
        int id = 4;
        Consulta c6 = new Consulta(4, c1, "Dolor del pie", "dolor", precionarterial, frecuenciaCardiaca,
                frecuenciaRespiratoria, temperaturaCorporal, peso, altura, indiceMasa, "receta1", "cada 8 horas");

        boolean expResult = ControladorConsulta.modificar(4, c6);
        boolean result = ControladorConsulta.modificar(4, c6);

        assertEquals(expResult, result);

        if (result == true) {
            System.out.println("Actulizando Exitosamente");
        } else {

            fail("The test case is a prototype.");
        }
    }


    
        

    /**
     * Test of listar method, of class ControladorConsulta.
     */
  //  @Test
    /**
  public void testListar() {
      /**
        System.out.println("listar");
       List<Consulta > expResult =new ArrayList<>();
      // int expResult=-1;
       List<Consulta> result = ControladorConsulta.listar();
       assertEquals(expResult, result);
       if(result.size()>=0){
            
           System.out.println("consulta");
       }else { 
        fail("The test case is a prototype.");
    }
   
       boolean resultado=false;
            

      System.out.println("listar");
     
      for( Consulta c:ControladorConsulta.listar()){
         System.out.println("lista"+c.toString());
         resultado=true;
            
       }
      
      
  }
  
  */

    /**
     * Test of eliminar method, of class ControladorConsulta.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 2;
        boolean expResult = ControladorConsulta.eliminar(id);
        boolean result = ControladorConsulta.eliminar(id);

        assertEquals(expResult, result);
        if (result == true) {
            System.out.println("Eliminado exitosamente");
        } else {
            fail("The test case is a prototype.");
        }
    }

    
    
    
    
    
    
    
    public void testGetIndiceMasa() {
        
        System.out.println("Calulo IMC");
     
  
       float resultadoReal = c6.calcularIndiceMasa();
    float resultadoEsperado = (float) 23.88844;
    assertEquals(resultadoEsperado, resultadoReal, 0.001);
        
        fail("The test case is a prototype.");
        }
        
    
    
}
