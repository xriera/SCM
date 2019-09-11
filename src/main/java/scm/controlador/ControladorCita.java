/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        Date fecha = cita.getFecha();
        String cadena = formato.format(fecha);
        
         SimpleDateFormat formato1 = new SimpleDateFormat("hh:mm:ss");
        Date hora = cita.getHora();
        String cadenaHora = formato1.format(hora);
        
            String sql = "insert into citas values(" +
                      cita.getId() + ", '" + 
                      cadena + "', '" +
                      cadenaHora + "', '" +
                      cita.getMotivo() + "', '" +
                      cita.getMedico().getId() + "', '" +
                      cita.getPaciente().getId() + "', '" +
                      cita.getEstado()+ "')";
            ConexionDB.ejecutarSentencia(sql);
            System.out.println("insertando......");
            return true;
        
    }
   
}
