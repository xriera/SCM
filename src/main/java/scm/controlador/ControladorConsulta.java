/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import scm.modelo.Cita;
import scm.modelo.Consulta;

/**
 *Metodo para agregar consulta
 * @author Daniel Amay
 * @return  Consulta consulta
 * 
 * 
 */



public class ControladorConsulta {
    
    
    
   
   
    /**
     * Agrega Consulta corregido()
     * @param consulta
     * @return true si se ingreso una consulta
     */
    
  
 
 
    public static boolean agregarConsulta(Consulta consulta) {
       
      // if (buscar(consulta.getId()) != null) {
            String sql = "insert into consultas values(" 
                + consulta.getId() + ", '"
                + consulta.getCita().getId() + "', '"
                + consulta.getSintomas() + "', '"
                + consulta.getDiagnostico() + "', "
                + consulta.getPresionArterial() + ", "
                + consulta.getFrecuenciaCardiaca() + ", "
                + consulta.getFrecuenciaRespiratoria() + ", "
                + consulta.getTemperaturaCorporal() + ", "
                + consulta.getPeso() + ", "
                + consulta.getAltura() + ", "
                + consulta.getIndiceMasa() + ", '"
                + consulta.getReceta() + "', '"
                + consulta.getIndicaciones() + "');";
            
           

            ConexionDB.ejecutarSentencia(sql);
            System.out.println("insertando...");
            System.out.println(sql);
            return true;
       
            
            
       // }
       // return false;
        

    }
    

    
    
    /**
     * Metodo para Buscar Consulta
     * @param id Consulta
     * @return  Consulta consulta
     */
    
    /**
    public static Consulta buscar(int id) {
        Consulta consulta = null;
        String sql = "SELECT * FROM  consultas where id =" + id + ")";
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            if (resultado.next()) {
                //int idCita = resultado.getInt("idcita");
                String sintomas = resultado.getString("sintomas");
                String diagnostico = resultado.getString("diagonostico");
                float precionArterial = resultado.getFloat("pa");
                float frecuenciaCardiaca = resultado.getFloat("fc");
                float frecuenciaRespiratoria = resultado.getFloat("fr");
                float temperaturaCorporal = resultado.getFloat("tc");
                float peso = resultado.getFloat("peso");
                float altura = resultado.getFloat("altura");
                float indiceMasa = resultado.getFloat("imc");
                String receta = resultado.getString("receta");
                String indicaciones = resultado.getString("indicaciones");
               // Cita cita = null;
                //consulta = new Consulta(id, cita, sintomas, diagnostico, precionArterial,
                  //                      frecuenciaCardiaca, frecuenciaRespiratoria, temperaturaCorporal,
                    //                    peso, altura, indiceMasa, receta, indicaciones);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return consulta;
    }
    * */
    

    /**
     * Metodo para modificar una consulta (corregido)
     * @param id
     * @param consulta Consulta
     * @return true en caso de la modificacion sea correcta
     */
    
    public static boolean modificar(int id, Consulta consulta) {

       // if (buscar(id)!= null){
        String sql = "update consultas set "
                + "sintomas='" + consulta.getSintomas() + "', "
                + "diagonostico='" + consulta.getDiagnostico() + "',"
                + "pa=" + consulta.getPresionArterial() + ","
                + "fc=" + consulta.getFrecuenciaCardiaca() + ","
                + "fr=" + consulta.getFrecuenciaRespiratoria() + ","
                + "tc=" + consulta.getTemperaturaCorporal() + ","
                + "peso=" + consulta.getPeso() + ","
                + "altura=" + consulta.getAltura() + ","
                + "imc=" + consulta.getIndiceMasa() + ","
                + "receta='" + consulta.getReceta() + "',"
                + "indicaciones='" + consulta.getIndicaciones() + "'"
                + "where idcita = " + consulta.getId();
        ConexionDB.ejecutarSentencia(sql);
        System.out.println("Modificando....");
        System.out.println("" + sql);

        return true;
   // }
        // return false;
    }    
    
    
    /**
     * Meotod para listar (corregido)
     * @return lista de consultas
     */
    
    public static List<Consulta> listar() {
 List<Consulta> lista = new ArrayList();
        String sql = "select * from consultas";

        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            while (resultado.next()) {

                int id = resultado.getInt("id");
                int idcita = resultado.getInt("idcita");
                String sintomas = resultado.getString("sintomas");
                String diagnostico = resultado.getString("diagonostico");
                float pa = resultado.getFloat("pa");
                float fc = resultado.getFloat("fc");
                float fr = resultado.getFloat("fr");
                float tc = resultado.getFloat("tc");
                float peso = resultado.getFloat("peso");
                float altura = resultado.getFloat("altura");
                float imc = resultado.getFloat("imc");
                String receta = resultado.getString("receta");
                String indicaciones = resultado.getString("indicaciones");
                //Consulta c;
                lista.add(new Consulta(id, new Cita(1, new java.sql.Date(2019, 9, 11), null, receta, null, null, receta),
                       sintomas, diagnostico, pa, fc, fr, tc, peso, altura, imc, receta, indicaciones));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
       
    }

/**
 * Metodo para eliminar consulta (corregido)
 * @param id consulta
 * @return true si se elimino
 */
    public static boolean eliminar(int id){
    
       String sql="delete from consultas where id=" + id + ""; 
       ConexionDB.ejecutarSentencia(sql);
        System.out.println(sql);
        System.out.println("eliminado.....");
       return true;
    }
    
    

  
    
   
  
}
   
