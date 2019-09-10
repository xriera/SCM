package scm.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import scm.modelo.Medico;
import scm.modelo.Paciente;
import scm.modelo.Persona;
import scm.modelo.Usuario;

/**
 *
 * @author wilson
 */
public class ControladorPersona {
    
    public static int generarID() {
        String sql = "select max(id) from personas";
        return ConexionDB.generarID(sql);
    }
    
    public static boolean agregar(Persona persona, String tipo) {
        if(buscar(persona.getId(), tipo) == null) {
            String sql = "insert into personas values(" + 
                          persona.getId() + ",'" +
                          persona.getCedula() + "', '" +
                          persona.getNombre() + "', '" +
                          persona.getApellido() + "')";
            ConexionDB.ejecutarSentencia(sql);
            if (tipo.equals("medico")) {
                Medico medico = (Medico) persona;
                sql = "insert into medicos values(" +
                      medico.getId() + ",'" +
                      medico.getDireccion() + "', '" +
                      medico.getEmail() + "', '" +
                      medico.getEspecialidad() + "'," +
                      medico.getUsuario().getId() + ")";
                ConexionDB.ejecutarSentencia(sql);
            } else if (tipo.equals("paciente")) {
                Paciente paciente = (Paciente) persona;
                SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
                String fechaFormateada = formato.format(paciente.getFechaNacimiento());
                sql = "insert into pacientes values(" +
                      paciente.getId() + ", '" + 
                      String.valueOf(paciente.getSexo()) + "', '" +
                      fechaFormateada + "', '" +
                      paciente.getTipoSangre() + "', '" +
                      paciente.getProcedencia() + "', '" + 
                      paciente.getEtnia() + "', '" +
                      paciente.getInstruccion() + "')";
                ConexionDB.ejecutarSentencia(sql);
            }
            return true;
        }
        return false;
    }
    
    public static boolean modificar(Persona persona, String tipo) {
        if(buscar(persona.getId(), tipo) == null) {
            String sql = "update personas set " + 
                         "cedula = '" + persona.getCedula() + "'," +
                         "nombre = '" + persona.getNombre() + "'," +
                         "apellido = '" + persona.getApellido() + "' " +
                         "where id = " + persona.getId() ;
            ConexionDB.ejecutarSentencia(sql);
            if (tipo.equals("medico")) {
                Medico medico = (Medico) persona;
                sql = "update medicos set " +
                      "direccion = '" + medico.getDireccion() + "'," +
                      "email = '" + medico.getEmail() + "'," +
                      "especialidad = '" + medico.getEspecialidad() + "'," +
                      "idUsuario = '" + medico.getUsuario().getId() + 
                      "where id = '" + medico.getId();
                ConexionDB.ejecutarSentencia(sql);
            } else if (tipo.equals("paciente")) {
                Paciente paciente = (Paciente) persona;
                SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
                String fechaFormateada = formato.format(paciente.getFechaNacimiento());
                sql = "update pacientes set " +
                      "sexo = '" + String.valueOf(paciente.getSexo()) + "'," +
                      "fechaNacimiento = '" + fechaFormateada + "'," +
                      "tipoSangre = '" + paciente.getTipoSangre() + "'," +
                      "procedencia = '" + paciente.getProcedencia() + "'," + 
                      "etnia = '" + paciente.getEtnia() + "'," +
                      "instruccion = '" + paciente.getInstruccion() + "' " +
                      "where id = " + paciente.getId();
                ConexionDB.ejecutarSentencia(sql);
            }
            return true;
        }
        return false;
    }
    
    public static Persona buscar(int id, String tipo) {
        Persona persona = null;
        String sql = "select * from personas where id = " + id;
        try {
            ResultSet resultadoPersona = ConexionDB.ejecutarConsulta(sql);
            if (resultadoPersona.next()) {
                String cedula = resultadoPersona.getString("cedula");
                String nombre = resultadoPersona.getString("nombre");
                String apellido = resultadoPersona.getString("apellido");
                if (tipo.equals("medico")) {
                    sql = "select * from medicos where id = " + id;
                    ResultSet resultadoMedico = ConexionDB.ejecutarConsulta(sql);
                    resultadoMedico.next();
                    String direccion = resultadoMedico.getString("direccion");
                    String email = resultadoMedico.getString("mail");
                    String especialidad = resultadoMedico.getString("especialidad");
                    Usuario usuario = ControladorUsuario.buscar(nombre + apellido);
                    persona = new Medico(id, cedula, nombre, apellido, direccion, email, especialidad, usuario);
                } else if (tipo.equals("paciente")){
                    sql = "select * from pacientes where id = " + id;
                    SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
                    ResultSet resultadoPaciente = ConexionDB.ejecutarConsulta(sql);
                    resultadoPaciente.next();
                    char sexo = resultadoPaciente.getString("sexo").charAt(0);
                    Date fechaNacimiento = formato.parse(resultadoPaciente.getDate("fechaNacimiento").toString());
                    String tipoSangre = resultadoPaciente.getString("tipoSangre");
                    String etnia = resultadoPaciente.getString("etnia");
                    String procedencia = resultadoPaciente.getString("procedencia");
                    String instruccion = resultadoPaciente.getString("instruccion");
                    persona = new Paciente(id, cedula, nombre, apellido, sexo, fechaNacimiento,
                                           tipoSangre, procedencia, etnia, instruccion);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Error de fecha: " + e.getMessage());
        }
        return persona;
    }
    
    public static boolean eliminar(int id, String tipo) {
        if (buscar(id, tipo) != null) {
            String sqlA = "delete from personas where id = " + id;
            String sqlB = "";
            if (tipo.equals("medico")) {
                sqlB = "select * from medicos where id = " + id;
            } else {
                sqlB = "select * from pacientes where id = " + id;
            }
            ConexionDB.ejecutarSentencia(sqlA);
            ConexionDB.ejecutarConsulta(sqlB);
            return true;
        }
        return false;
    }
    
    public static List<Medico> listarMedicos() {
        List<Medico> lista = new ArrayList();
        try {
            for(int i = 1; i < generarID(); i++) {
                Medico medico = (Medico) buscar(i, "medico");
                if (medico != null) {
                    lista.add(medico);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
    
    public static List<Paciente> listarPacientes() {
        List<Paciente> lista = new ArrayList();
        try {
            for(int i = 1; i < generarID(); i++) {
                Paciente paciente = (Paciente) buscar(i, "paciente");
                if (paciente != null) {
                    lista.add(paciente);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
}