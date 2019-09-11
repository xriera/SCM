package scm.modelo;

/**
 *
 * @author wilson
 */
public class Consulta {
    
    private int id;
    private Consulta consulta;
    private String sintomas;
    private String diagnostico;
    private float presionArterial;
    private float frecuenciaCardiaca;
    private float frecuenciaRespiratoria;
    private float temperaturaCorporal;
    private float peso;
    private float altura;
    private float indiceMasaCorporal;
    private String receta;
    private String indicaciones;

    public Consulta(int id, Consulta consulta, String sintomas, String diagnostico,
                    float presionArterial, float frecuenciaCardiaca,
                    float frecuenciaRespiratoria, float temperaturaCorporal,
                    float peso, float altura, String receta, String indicaciones) {
        this.id = id;
        this.consulta = consulta;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.presionArterial = presionArterial;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperaturaCorporal = temperaturaCorporal;
        this.peso = peso;
        this.altura = altura;
        this.indiceMasaCorporal = calcularIndiceMasaCorporal();
        this.receta = receta;
        this.indicaciones = indicaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
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

    public float getIndiceMasaCorporal() {
        return indiceMasaCorporal;
    }

    private float calcularIndiceMasaCorporal() {
        return peso / altura;
    }
}