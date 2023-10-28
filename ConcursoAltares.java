package Clases.ConcursoAltares;

import java.util.ArrayList;
// librerias de la clase
import java.util.Scanner;

public class ConcursoAltares {
    // variables globales de la clase
    static ConcursoAltares control = new ConcursoAltares();
    Scanner leer = new Scanner(System.in);
    int opcion;

    // listas de arrays alumnos y equipos
    static ArrayList<Alumno> alumnos = new ArrayList<>();
    static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        // Persona persona1 = new Persona("Cristian", 20);
        // System.out.println(persona1);

        // Alumno alumno1 = new Alumno("Laura", 20, "Informatica", "23760077", "A");
        // Alumno alumno2 = new Alumno("Cristian", 20, "Informatica", "23760077", "A");
        // Alumno alumno3 = new Alumno("Cristian", 20, "Informatica", "23760077", "A");

        // alumnos.add(alumno1);
        // alumnos.add(alumno2);
        // alumnos.add(alumno3);

        // Docente docente1 = new Docente("Luis", 30);
        // System.out.println(docente1);

        // Equipo equipo1 = new Equipo("Los mas Pitudones", "Goku", docente1, alumnos,
        // 10);
        // System.out.println(equipo1);
        // control.menu();
    }

    public void menu() {
        // ciclo do-while para mostrar el menú del programa
        do {
            // menu del programa
            System.out.println("\t--- [BIENVENIDO AL CONCURSO ALTARES DE MUERTOS] --- \n");
            System.out.println("\t--- [MENU] ---");
            System.out.println("[1] Registrar un equipo");
            System.out.println("[2] Lista de los equipos registrados");
            System.out.println("[3] Calificar equipos");
            System.out.println("[4] Top rank de los equipos");
            System.out.println("[5] Salir del programa");
            System.out.print("Selecciona una opción: ");

            // variable global que se usa para guardar la opción
            opcion = leer.nextInt();

            // switch del menu
            switch (opcion) {
                case 1: // llamar al método registrarEquipo si elije 1
                    control.registrarEquipo();
                    break;
                case 2: // llamar al método listaEquipos si elije 2
                    control.listaEquipos();
                    break;
                case 3: // llamar al método calificarEquipos si elije 3
                    control.calificarEquipos();
                    break;
                case 4: // llamar al éetodo rankEquipos si elije 4
                    control.rankEquipos();
                    break;
                case 5: // salir del programa
                    break;
            } // fin del switch
        } while (opcion != 5);
    } // fin de la función menú

    public void registrarEquipo(ArrayList<Equipo> equipos) {

        System.out.println("Escriba el nombre del equipo: ");
        Equipo.setNombreEquipo = leer.nextLine();

    } // fin de la función registrarEquipo

    public void listaEquipos() {

    } // fin de la función listaEquipos

    public void calificarEquipos() {

    } // fin de la función calificarEquipos

    public void rankEquipos() {

    } // fin de la función rankEquipos
} // fin de la función main