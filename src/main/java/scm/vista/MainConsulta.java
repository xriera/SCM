/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.vista;

import static com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.id;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;




import static jdk.nashorn.internal.runtime.Debug.id;
import oracle.jrockit.jfr.tools.ConCatRepository;
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
    
    public static void main(String[] args) throws SQLException {
        
        
        
        
     Medico m=new Medico(1, null, null, null, null, null, null, null);
        Paciente p=new Paciente(1, null, null, null, 'H', null, null, null, null, null);
        
        
        
      float precionarterial=(float) 17.5;
      float frecuenciaCardiaca=(float)18.6;
         float frecuenciaRespiratoria=(float)18.6;
           float temperaturaCorporal=(float)18.6;
             float peso=(float)80;
               float altura=(float)1.83;
                 float indiceMasa=(float)18.6;
                 
      
     //insertar
  // Cita cita=new Cita(4, new Date(), new Date(), "prueba1", m, p, "A");
        
  //Consulta consulta=new Consulta(4, cita, "prueba1", "d1", precionarterial, frecuenciaCardiaca, frecuenciaRespiratoria, temperaturaCorporal, peso, altura, indiceMasa, "receta1", "cada 8 horas");
        
     //agregar consulta3
  //  ControladorConsulta.agregarConsulta(consulta);
  //  System.out.println("IMC="+consulta.calcularIndiceMasa()); 

                 
    //buscar  --> probar con el metodo del riera q falta      
    // Consulta consulta=ControladorConsulta.buscar(1);
     
                 
                
    //modificar 
    
   //   Cita c2=new Cita(4, null, null, "motivo3", m, p, null);
  // Consulta c7=new Consulta(4, c2, "cita55", "cita33", precionarterial, frecuenciaCardiaca, frecuenciaRespiratoria, temperaturaCorporal, peso, altura, indiceMasa, "receta 33", "cada 2 horas -");
  //  ControladorConsulta.modificar(4, c7);
    


        // listar
       //   ControladorConsulta.listar();
    //   for( Consulta c:ControladorConsulta.listar()){
    //     System.out.println("lista"+c.toString());
            
    //   }
                 
                 
                   //eliminar        
    //  ControladorConsulta.eliminar(4);
                 
                // ControladorConsulta cc=new ControladorConsulta();
                 
                 //buscar 
                  // ResultSet rs=null;
                    
         
          
       
          
          
            }
                
                 
                 
        }
   
         
       

        
     
    

