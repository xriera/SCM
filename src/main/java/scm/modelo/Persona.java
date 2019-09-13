package scm.modelo;

/**
 *
 * @author wilson
 */
public abstract class Persona {
    
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;

    protected Persona(int id, String cedula, String nombre, String apellido) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
  
    @Override
    public String toString() {
        return cedula + " | " + nombre + " " + apellido;
    }
}