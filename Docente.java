package Sistemas_comp.ConcursoAltares;

public class Docente extends Persona {
    // constructor default
    public Docente() {
        super(); // atributos de la superclase Persona
    }

    public Docente(String nombre) {
        super(nombre);
    }

    /**
     * @param nombre
     * @param edad
     */
    // constructor con los atributos de la superclase Persona
    public Docente(String nombre, int edad) {
        super(nombre, edad);
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Datos del docente: \n" + super.toString();
    }
}
