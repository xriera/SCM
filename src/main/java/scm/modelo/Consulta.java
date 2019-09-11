package scm.modelo;

/**
 *
 * @author wilson
 */
public class Consulta {
    
    private int id;
    private Cita cita;
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
   

    public Consulta(int id, Cita cita, String sintomas, String diagnostico, float presionArterial, float frecuenciaCardiaca, float frecuenciaRespiratoria, float temperaturaCorporal, float peso, float altura, float indiceMasa, String receta, String indicaciones) {
        this.id = id;
        this.cita = cita;
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
       
    }

    public int getId() {
        return id;
    }

    public void setId(int idCita) {
        this.id = idCita;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
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

    private float calcularIndiceMasa() {
        return peso / altura;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", cita=" + cita + ", sintomas=" + sintomas + ", diagnostico=" + diagnostico + ", presionArterial=" + presionArterial + ", frecuenciaCardiaca=" + frecuenciaCardiaca + ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", temperaturaCorporal=" + temperaturaCorporal + ", peso=" + peso + ", altura=" + altura + ", indiceMasa=" + indiceMasa + ", receta=" + receta + ", indicaciones=" + indicaciones + '}';
    }
    
    
    
    
}