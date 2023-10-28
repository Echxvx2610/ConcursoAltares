package Clases.ConcursoAltares;

public class Persona {
    // atributos de la clase padre
    public String nombre;
    public int edad;

    // constructor default
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    /**
     * @param nombre
     * @param edad
     */
    // método constructor con todos sus atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // getter y setters
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n";
    }
}
