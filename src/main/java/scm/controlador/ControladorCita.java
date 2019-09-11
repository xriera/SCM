/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import scm.modelo.Cita;

/**
 *
 * @author xavier
 */
public class ControladorCita {
   public static int generarID() {
        String sql = "select max(id) from citas";
        return ConexionDB.generarID(sql);
    }  
   public static boolean agregar(Cita cita) {
       
            String sql = "insert into cita values(" +
                      cita.getId() + ", '" + 
                      cita.getFecha() + "', '" +
                      cita.getHora() + "', '" +
                      cita.getMotivo() + "', '" +
                      cita.getMedico() + "', '" +
                      cita.getPaciente() + "')";
            ConexionDB.ejecutarSentencia(sql);
            return true;
        
    }
   
}
