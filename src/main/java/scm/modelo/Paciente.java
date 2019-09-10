package scm.modelo;

import java.util.Date;
/**
 *
 * @author wilson
 */
public class Paciente extends Persona {

    private char sexo;
    private Date fechaNacimiento;
    private String tipoSangre;
    private String procedencia;
    private String etnia;
    private String instruccion;

    public Paciente(int id, String cedula, String nombre, String apellido,
                    char sexo, Date fechaNacimiento, String tipoSangre,
                    String procedencia, String etnia, String instruccion) {
        super(id, cedula, nombre, apellido);
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.procedencia = procedencia;
        this.etnia = etnia;
        this.instruccion = instruccion;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }
}