package proyects.Sistemas.proyectos.concursoAltares;
import java.util.ArrayList;

public class Equipo{
    // atributos de la clase
    private String nombreEquipo;
    private String personaje;
    private Docente docente;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private int puntaje;

    // constructor default
    public Equipo() {
        this.nombreEquipo = "";
        this.personaje = "";
        this.docente = null;
        this.alumnos = null;
        this.puntaje = 0;
    }

    /**
     * @param nombreEquipo
     * @param personaje
     * @param docente
     * @param alumnos
     * @param puntaje
     */
    // constructor con todos los atributos
    public Equipo(String nombreEquipo, String personaje, Docente docente, ArrayList<Alumno> alumnos, int puntaje) {
        this.nombreEquipo = nombreEquipo;
        this.personaje = personaje;
        this.docente = docente;
        this.alumnos = alumnos;
        this.puntaje = puntaje;
    }

    // getter and setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
    
        // Encabezado
        sb.append("--------------------------------------------------------------\n");
        sb.append("Nombre del equipo: ").append(nombreEquipo).append("  Personaje: ").append(personaje).append("  Puntaje: ").append(puntaje).append("\n");
        sb.append("--------------------------------------------------------------\n");
    
        // Encabezado de la tabla de alumnos
        sb.append(String.format("%-15s%-15s%-15s%-13s%-10s\n", "Docente", "Alumnos", "Carrera", "No_Control","Grupo"));
        
        // Datos de docente
        sb.append(String.format("%-15s%-15s%-15s%-13s%-10s\n", docente.getNombre(), "", "", "",""));
    
        // Datos de alumnos
        for (Alumno alumno : alumnos) {
            sb.append(String.format("%-15s%-15s%-15s%-13s%-10s\n", "", alumno.getNombre(), alumno.getCarrera(), alumno.getNumeroControl(),alumno.getGrupo()));
        }
        sb.append("--------------------------------------------------------------\n");
        return sb.toString();
    }
    
}
