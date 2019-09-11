/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.text.SimpleDateFormat;
import static scm.controlador.ControladorPersona.buscar;
import static scm.controlador.ControladorUsuario.buscar;
import scm.modelo.Consulta;
import scm.modelo.Medico;
import scm.modelo.Paciente;
import scm.modelo.Persona;
import scm.modelo.Usuario;

/**
 *
 * @author DELL
 */
public class ControladorConsulta {
    
    
    
     public static boolean agregarConsulta(Consulta consulta) {
            String sql = "insert into consultas values(" +
                      consulta.getIdCita()+ ", '" + 
                      consulta.getIdConsulta() + "', '" +
                      consulta.getSintomas() + "', '" +
                      consulta.getDiagnostico() + "', '" +
                      consulta.getPresionArterial()+ "', '" +
                      consulta.getFrecuenciaCardiaca()+ "', '" +
                      consulta.getFrecuenciaRespiratoria()+ "', '" +
                      consulta.getTemperaturaCorporal()+ "', '" +
                      consulta.getPeso()+ "', '" +
                      consulta.getAltura()+ "', '" +
                      consulta.getIndiceMasa()+ "', '" +
                      consulta.getReceta()+ "', '" +
                      consulta.getIndicaciones()+ "')";
            ConexionDB.ejecutarSentencia(sql);
            System.out.println("insertando...");
            return true;
        
    }
    
     public static void buscarConsulta(int idConsulta){
         String sql="SELECT * FROM  consultas where idconsulta ="+idConsulta+")";
         System.out.println(sql);
         
     }
     
     
}
