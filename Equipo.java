package Clases.ConcursoAltares;

import java.util.ArrayList;

public class Equipo {
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
        return "Datos del equipo: \n" +
                "Nombre del equipo: " + nombreEquipo + "\n" +
                "Docente: " + docente.getNombre() + "\n" +
                "Personaje: " + personaje + "\n" +
                "Alumnos:" + alumnos + "\n" +
                "Puntaje: " + puntaje + "\n";

    }
}
