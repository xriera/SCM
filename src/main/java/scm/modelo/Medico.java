package scm.modelo;

/**
 *
 * @author wilson
 */
public class Medico extends Persona {

    private String direccion;
    private String email;
    private String especialidad;
    private Usuario usuario;

    public Medico(int id, String cedula, String nombre, String apellido, 
                  String direccion, String email, String especialidad,
                  Usuario usuario) {
        super(id, cedula, nombre, apellido);
        this.direccion = direccion;
        this.email = email;
        this.especialidad = especialidad;
        this.usuario = usuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}