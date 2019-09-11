/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.vista;

import static com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.id;
import java.util.Date;
import static jdk.nashorn.internal.runtime.Debug.id;
import static org.omg.CORBA.AnySeqHelper.id;
import static org.omg.CORBA.CurrentHelper.id;
import static org.omg.CORBA.DoubleSeqHelper.id;
import static org.omg.CORBA.LongLongSeqHelper.id;
import static org.omg.CORBA.LongSeqHelper.id;
import static org.omg.CORBA.NameValuePairHelper.id;
import static org.omg.CORBA.ParameterModeHelper.id;
import static org.omg.CORBA.PolicyListHelper.id;
import static org.omg.CORBA.RepositoryIdHelper.id;
import scm.controlador.ControladorConsulta;
import scm.modelo.Cita;
import scm.modelo.Consulta;
import scm.modelo.Medico;
import scm.modelo.Paciente;

/**
 *
 * @author DELL
 */
public class MainConsulta {
    
    public static void main(String[] args) {
        
        Medico m=new Medico(1, null, null, null, null, null, null, null);
        Paciente p=new Paciente(1, null, null, null, 'H', null, null, null, null, null);
        
        
        
      float precionarterial=(float) 17.5;
      float frecuenciaCardiaca=(float)18.6;
         float frecuenciaRespiratoria=(float)18.6;
           float temperaturaCorporal=(float)18.6;
             float peso=(float)18.6;
               float altura=(float)18.6;
                 float indiceMasa=(float)18.6;
                 
      
     
    // Cita c1=new Cita(1, new Date(), new Date(), "prueba1", m, p, "A");
        
//Consulta c6=new Consulta(3, 3, "prueba1", "d1", precionarterial, frecuenciaCardiaca, frecuenciaRespiratoria, temperaturaCorporal, peso, altura, indiceMasa, "receta1", "cada 8 horas");
       
//agregar consulta
//ControladorConsulta.agregarConsulta(c6);

                 
    //buscar  --> probar con el metodo del riera q falta      
    // Consulta consulta=ControladorConsulta.buscar(1);
     
                 
                
    //modificar 
   //  Cita c1=new Cita(4, new Date(), new Date(), "prueba1", m, p, "A");
    //Consulta c7=new Consulta(3, c1, "cita3", "cita3", precionarterial, frecuenciaCardiaca, frecuenciaRespiratoria, temperaturaCorporal, peso, altura, indiceMasa, "receta 3", "cada hora");
     //ControladorConsulta.modificar(3, c7);


        // listar
       //   ControladorConsulta.listar();
        //for( Consulta c:ControladorConsulta.listar()){
          // System.out.println("lista"+c.toString());
            
        
                 
                 
                   //eliminar        
     //   ControladorConsulta.eliminar(2);
                 
        }
   
         
       

        
    }  
    

