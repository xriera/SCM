package scm.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import scm.modelo.Usuario;

/**
 *
 * @author wilson
 */
public class ConexionDB {
    
    private static Usuario usuarioSesion;
    
    private static Connection conectar() {
        Connection conexion = null;
        String url =  "jdbc:postgresql://localhost:5432/scmdb"; 
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, "postgres", "postgres");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return conexion;
    }
    
    public static void ejecutarSentencia(String sql) {
        Connection conexion = conectar();
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static ResultSet ejecutarConsulta(String sql) {
        ResultSet resultado = null;
        Connection conexion = conectar();
        try {
            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            resultado.setFetchDirection(ResultSet.FETCH_FORWARD);
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return resultado;
    }

    public static Usuario getUsuarioSesion() {
        return usuarioSesion;
    }

    public static void setUsuarioSesion(Usuario usuarioSesion) {
        ConexionDB.usuarioSesion = usuarioSesion;
    }
    
    public static int generarID(String sql) {
        int id = 0;
        try {
            ResultSet resultado = ConexionDB.ejecutarConsulta(sql);
            if (resultado.next()) {
                id = resultado.getInt("max") + 1;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return id;
    }
}