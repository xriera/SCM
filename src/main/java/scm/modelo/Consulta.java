package scm.modelo;

/**
 *
 * @author wilson
 */
public class Consulta {
    
    private int idCita;
    private int idConsulta;
    private String sintomas;
    private String diagnostico;
    private float presionArterial;
    private float frecuenciaCardiaca;
    private float frecuenciaRespiratoria;
    private float temperaturaCorporal;
    private float peso;
    private float altura;
    private float indiceMasa;
    private String receta;
    private String indicaciones;
    private Cita cita;

    public Consulta(int idCita, int idConsulta, String sintomas, String diagnostico, float presionArterial, float frecuenciaCardiaca, float frecuenciaRespiratoria, float temperaturaCorporal, float peso, float altura, float indiceMasa, String receta, String indicaciones, Cita cita) {
        this.idCita = idCita;
        this.idConsulta = idConsulta;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.presionArterial = presionArterial;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperaturaCorporal = temperaturaCorporal;
        this.peso = peso;
        this.altura = altura;
        this.indiceMasa = indiceMasa;
        this.receta = receta;
        this.indicaciones = indicaciones;
        this.cita = cita;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public float getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(float presionArterial) {
        this.presionArterial = presionArterial;
    }

    public float getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(float frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public float getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(float frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIndiceMasa() {
        return indiceMasa;
    }

    public void setIndiceMasa(float indiceMasa) {
        this.indiceMasa = indiceMasa;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
    
    

    private float calcularIndiceMasa() {
        return peso / altura;
    }
}