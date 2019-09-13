/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
        String cadenaFecha = formato.format(fecha);
        
         SimpleDateFormat formato1 = new SimpleDateFormat("hh:mm:ss");
        Date hora = cita.getHora();
        String cadenaHora = formato1.format(hora);
        
            String sql = "insert into citas values(" +
                      cita.getId() + ", '" + 
                      cadenaFecha + "', '" +
                      cadenaHora + "', '" +
                      cita.getMotivo() + "', '" +
                      cita.getMedico().getId() + "', '" +
                      cita.getPaciente().getId() + "', '" +
                      cita.getEstado()+ "')";
            ConexionDB.ejecutarSentencia(sql);
             System.out.println("insertando...");
            return true;
        
    }
       public static boolean modificar(int idCita, Cita cita) {
       
            String sql = "update citas set " + 
                         "fecha = '" + cita.getFecha() + "'," +
                         "hora = '" + cita.getHora() +"' " +  
                         "motivo = '" + cita.getMotivo() +"' " +
                         "idmedico = '" + cita.getMedico().getId() +"' " +
                         "idpaciente = '" + cita.getPaciente().getId() +"' " +
                         "where id = " + cita.getId();
            ConexionDB.ejecutarSentencia(sql);
             System.out.println("Modificando...");
            return true;
        
    }
     
       public static boolean eliminar(int  id) {    
            String sql = "delete from citas where id = '" + id + "'";
            ConexionDB.ejecutarSentencia(sql);
            return true;
        }
       
          public static Cita buscar(int idCita) {
        Cita cita = null;
        String sql = "select * from citas where id = '" + idCita + "'";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            if (resultado.next()) {
                int id = resultado.getInt("id");
                String fecha = resultado.getString("fecha");
                String hora = resultado.getString("hora");
                String motivo  = resultado.getString("motivo");
                
                int idmedico = resultado.getInt("idmedico");
                String idpaciente = resultado.getString("idpaciente");
                String estado  = resultado.getString("estado");
               // cita = new Cita(id, fecha, hora, motivo, medico, paciente, estado);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return cita;
    }
       
       public static List<Cita> listar() {
        List<Cita> lista = new ArrayList();
        String sql = "select * from cita";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String fecha = resultado.getString("fecha");
                String hora = resultado.getString("hora");
                String motivo = resultado.getString("motivo");
                String idmedico = resultado.getString("idmedico");
                String idpaciente = resultado.getString("idpaciente");
                String estado  = resultado.getString("estado");
              //  lista.add(new Cita(id, fecha, hora, motivo, medico, paciente, estado));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
}
