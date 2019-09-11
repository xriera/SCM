/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm.controlador;

import scm.modelo.Consulta;

/**
 *
 * @author DELL
 */
public class ControladorConsulta {
    
    
    
     public static boolean agregarConsulta(Consulta consulta) {
            String sql = "insert into consultas values(" +
                      consulta.getId() + "," +
                      consulta.getCita().getId() + "," +
                      consulta.getSintomas() + "', '" +
                      consulta.getDiagnostico() + "', '" +
                      consulta.getPresionArterial()+ "', " +
                      consulta.getFrecuenciaCardiaca()+ "," +
                      consulta.getFrecuenciaRespiratoria()+ "," +
                      consulta.getTemperaturaCorporal()+ "," +
                      consulta.getPeso() + "," +
                      consulta.getAltura() + "," +
                      consulta.getIndiceMasaCorporal()+ ", '" +
                      consulta.getReceta()+ "', '" +
                      consulta.getIndicaciones()+ "')";
            ConexionDB.ejecutarSentencia(sql);
            System.out.println("insertando...");
            return true;
    }
}