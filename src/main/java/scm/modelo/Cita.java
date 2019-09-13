package scm.modelo;

import java.util.Date;

/**
 *
 * @author wilson
 */
public class Cita {

    private int id;
    private Date fecha;
    private Date hora;
    private String motivo;
    private Medico medico;
    private Paciente paciente;
    private String estado;

    public Cita(int id, Date fecha, Date hora, String motivo, 
                Medico medico, Paciente paciente,String estado) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.medico = medico;
        this.paciente = paciente;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }

    public String getMotivo() {
        return motivo;
    }
    
    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getEstado() {
        return estado;
    }
}