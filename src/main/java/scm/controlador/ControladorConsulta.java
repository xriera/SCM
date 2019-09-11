/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.text.SimpleDateFormat;
import static scm.controlador.ControladorPersona.buscar;
import scm.modelo.Medico;
import scm.modelo.Paciente;
import scm.modelo.Persona;

/**
 *
 * @author DELL
 */
public class ControladorConsulta {
    
    
     public static int generarID() {
        String sql = "select max(id) from personas";
        return ConexionDB.generarID(sql);
    }
    
  
    
    
     public void crear_consulta(Persona persona) {

        try {
            Conexion_BD.conectarBD();

            String sql = " INSERT INTO \"Registro\" "
                    + "(codigo,nombre,apellido,cedula,ciudad,telefono,correo_electronico)"
                    + "VALUES("
                    + persona.getCodigo()
                    + "  ,' " + persona.getNombre()
                    + " ',' " + persona.getApellido()
                    + " ',' " + persona.getCedula()
                    + " ',' " + persona.getCiudad()
                    + " ',' " + persona.getTelefono()
                    + " ',' " + persona.getCorreo_electronico() + "');";

            Statement sta = Conexion_BD.getConexion().createStatement();
            sta.execute(sql);

            Conexion_BD.cerrarBD();

        } catch (SQLException ex) {
            System.out.println("error sql , " + ex);
        }

    
    
    
    
    
    
}
