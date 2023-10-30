package proyects.Sistemas.proyectos.concursoAltares;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcursoAltares {
    // variables globales de la clase
    static ConcursoAltares control = new ConcursoAltares();
    static Scanner sc = new Scanner(System.in);
    int opcion;

    // listas de arrays alumnos,docentes y equipos
    static ArrayList<Alumno> alumnos = new ArrayList<>();
    static ArrayList<Equipo> equipos = new ArrayList<>();
    static ArrayList<Docente> docentes = new ArrayList<>();
    // arraylist de prueba
    static ArrayList<Equipo> equipos_test = new ArrayList<>();
    static ArrayList<Alumno> alumnos_test = new ArrayList<>();
    static ArrayList<Alumno> alumnos_test2 = new ArrayList<>();
    static ArrayList<Alumno> alumnos_test3 = new ArrayList<>();




    public static void main(String[] args) {
        
        // equipos de prueba
        alumnos_test.add(new Alumno("CRISTIAN", 21, "ING. SISTEMAS", "123456", "A"));
        alumnos_test.add(new Alumno("FRANCISCO", 20, "ING. SISTEMAS", "123456", "B"));
        alumnos_test.add(new Alumno("JESUS", 25, "ING. SISTEMAS", "123456", "C"));
        alumnos_test.add(new Alumno("MIGUEL", 21, "ING. SISTEMAS", "123456", "A"));
        alumnos_test.add(new Alumno("PEDRO", 20, "ING. SISTEMAS", "123456", "B"));


        alumnos_test2.add(new Alumno("ALEJANDRO", 21, "ING. SISTEMAS", "123456", "A"));
        alumnos_test2.add(new Alumno("ISRAEL", 20, "ING. SISTEMAS", "123456", "B"));
        alumnos_test2.add(new Alumno("OSCAR", 25, "ING. SISTEMAS", "123456", "C"));
        alumnos_test2.add(new Alumno("JOSE", 21, "ING. SISTEMAS", "123456", "A"));
        alumnos_test2.add(new Alumno("EDUARDO", 20, "ING. SISTEMAS", "123456", "B"));

        alumnos_test3.add(new Alumno("JUAN", 21, "ING. SISTEMAS", "123456", "A"));
        alumnos_test3.add(new Alumno("CARLOS", 20, "ING. SISTEMAS", "123456", "B"));
        alumnos_test3.add(new Alumno("LUIS", 25, "ING. SISTEMAS", "123456", "C"));
        alumnos_test3.add(new Alumno("MIGUEL", 21, "ING. SISTEMAS", "123456", "A"));
        alumnos_test3.add(new Alumno("PEDRO", 20, "ING. SISTEMAS", "123456", "B"));

        // objetos de docente para prueba
        Docente docente_1 = new Docente("LUIS CAMARENA");
        Docente docente_2 = new Docente("OCTAVIO PARRA");
        Docente docente_3 = new Docente("JUAN CARLOS");

        // objetos de equipo para prueba
        Equipo equipo_1 = new Equipo("DINOS", "Goku",docente_1, alumnos_test,0);
        Equipo equipo_2 = new Equipo("MAS CAPOS", "Vegeta",docente_2, alumnos_test2,0);
        Equipo equipo_3 = new Equipo("TEC", "Gohan",docente_3, alumnos_test3,0);

        equipos_test.add(equipo_1);
        equipos_test.add(equipo_2);
        equipos_test.add(equipo_3);

        // System.out.println(equipo_1);
        // System.out.println(equipo_2);
        
        
        
        control.menu();
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
            opcion = sc.nextInt();

            // switch del menu
            switch (opcion) {
                case 1: // llamar al método registrarEquipo si elije 1
                    control.registrarEquipo();
                    break;
                case 2: // llamar al método listaEquipos si elije 2
                    control.listaEquipos();
                    break;
                case 3: // llamar al método calificarEquipos si elije 3
                    sc.nextLine(); // Limpia el buffer
                    System.out.println("Ingrese el nombre del equipo a calificar (o 0 para salir): ");
                    String nombreEquipo = sc.nextLine();
                    System.out.println("Ingrese la calificación para el equipo (0-100): ");
                    double calificacion = sc.nextDouble();
                    if (calificacion >= 0 && calificacion <= 100) {
                        control.calificarEquipoPorNombre(nombreEquipo, (int) calificacion);
                    }else{
                        System.out.println("La calificación debe ser un valor entre 0 y 100");
                    }
                    break;
                case 4: // llamar al éetodo rankEquipos si elije 4
                    control.rankEquipos();
                    break;
                case 5: // salir del programa
                    break;
            } // fin del switch
        } while (opcion != 5);
    } // fin de la función menú

    public void registrarEquipo() {
        sc.nextLine(); // Limpia el buffer
        
        // Inicia registro de Equipo
        System.out.println("\t--- [Registrar Equipo] ---");
        System.out.print("Nombre del Equipo: ");
        String nombreEquipo = sc.nextLine();
        System.out.print("Personaje: ");
        String personaje = sc.nextLine();
        System.out.println("_______________________________________________________");
        System.out.println("Datos del Docente: ");
        System.out.print("Nombre del Docente: ");
        String nombreDocente = sc.nextLine();
        System.out.println("_______________________________________________________");
        System.out.println("Alumnos: ");
        int numAlumnos = 2;
        
        ArrayList<Alumno> alumnos = new ArrayList<>(); // Crear una nueva lista de alumnos para este equipo
        
        for (int i = 0; i < numAlumnos; i++) {
            // Instancia de Alumno
            Alumno alumno = new Alumno();
            System.out.print("Nombre del Alumno: ");
            alumno.setNombre(sc.nextLine());
            System.out.print("Edad del Alumno: ");
            alumno.setEdad(sc.nextInt());
            sc.nextLine();
            System.out.print("Carrera del Alumno: ");
            alumno.setCarrera(sc.nextLine()); // Limpia el buffer
            System.out.print("No.Control del Alumno: ");
            alumno.setNumeroControl(sc.nextLine());
            System.out.print("Grupo del Alumno: ");
            alumno.setGrupo(sc.nextLine());
            alumnos.add(alumno);
            System.out.println("_______________________________________________________");
        }
    
        // Puntaje default
        int puntaje = 0;
        
        // Se crea instancia de Equipo
        Equipo equipo = new Equipo(nombreEquipo, personaje, new Docente(nombreDocente), alumnos, puntaje);
        System.out.println("Equipo Registrado!");
        equipos.add(equipo);
        System.out.println(equipo);
    }
    

public void listaEquipos() {
    for (Equipo equipo : equipos_test) {
        System.out.println(equipo);
        System.out.println("\n");
    }
}

public void calificarEquipoPorNombre(String nombreEquipo, int calificacion) {

    if (equipos_test.isEmpty()) {
        System.out.println("No hay equipos registrados para calificar.");
    } else {
        boolean equipoEncontrado = false;

        for (Equipo equipo : equipos_test) {
            if (equipo.getNombreEquipo().equals(nombreEquipo)) {
                equipo.setPuntaje(calificacion);
                System.out.println("El equipo '" + nombreEquipo + "' ha sido calificado con " + calificacion + " puntos.");
                equipoEncontrado = true;
                break; // No es necesario continuar buscando
            }
        }

        if (!equipoEncontrado) {
            System.out.println("Equipo no encontrado: " + nombreEquipo + " por favor revise el nombre del equipo o registre el equipo.");
        }
    }
}

    public void rankEquipos() {
        System.out.println("Ranking de Equipos");
    }

} // fin de la función main
