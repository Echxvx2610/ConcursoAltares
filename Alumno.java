package Clases.ConcursoAltares;

public class Alumno extends Persona {
    // atributos propios de la clase hija
    private String carrera;
    private String numeroControl;
    private String grupo;

    // constructor default
    public Alumno() {
        super(); // atributos de la superclase Persona
        this.carrera = "";
        this.numeroControl = "";
        this.grupo = "";
    }

    /**
     * @param nombre
     * @param edad
     * @param carrera
     * @param numeroControl
     * @param grupo
     */
    // construcotr con todos los atributos de la superclase
    public Alumno(String nombre, int edad, String carrera, String numeroControl, String grupo) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroControl = numeroControl;
        this.grupo = grupo;
    }

    // getters y setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Datos del alumno: \n" + super.toString() +
                "Número de control: " + numeroControl + "\n" +
                "Carrera: " + carrera + "\n" +
                "Grupo: " + grupo + "\n";
    }
}
