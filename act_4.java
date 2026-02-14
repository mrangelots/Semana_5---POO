import java.util.Scanner;

public class act_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== CREAR MATERIAS =====
        System.out.println("=== CREACIÓN DE 3 MATERIAS ===");

        materia[] materias = new materia[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMateria " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Clave: ");
            String clave = sc.nextLine();

            System.out.print("Créditos: ");
            int creditos = sc.nextInt();

            System.out.print("Horas semanales: ");
            int horas = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            materias[i] = new materia(nombre, clave, creditos, horas);
        }

        // ===== CREAR CURSO =====
        System.out.println("\n=== CREACIÓN DEL CURSO ===");

        System.out.print("Nombre del curso: ");
        String nombreCurso = sc.nextLine();

        curso curso = new curso(nombreCurso);

        for (int i = 0; i < 3; i++) {
            curso.agregarMateria(materias[i]);
        }

        // ===== CREAR PROFESOR =====
        System.out.println("\n=== CREACIÓN DEL PROFESOR ===");

        System.out.print("Nombre del profesor: ");
        String nombreProfesor = sc.nextLine();

        System.out.print("Número de nómina: ");
        String nomina = sc.nextLine();

        System.out.print("Sueldo por hora: ");
        double sueldoHora = sc.nextDouble();

        System.out.println("Seleccione la materia que impartirá (1-3): ");
        int opcionMateria = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        profesor profesor = new profesor(
                nombreProfesor,
                nomina,
                sueldoHora,
                materias[opcionMateria - 1]
        );

        // ===== CREAR ALUMNO =====
        System.out.println("\n=== CREACIÓN DEL ALUMNO ===");

        System.out.print("Nombre del alumno: ");
        String nombreAlumno = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        alumno alumno = new alumno(matricula, nombreAlumno, edad, curso);

        // ===== MOSTRAR RESULTADOS =====
        System.out.println("\n\n===== INFORMACIÓN FINAL =====");

        System.out.println("\n--- Curso ---");
        System.out.println(curso);

        System.out.println("\n--- Profesor ---");
        System.out.println(profesor);

        System.out.println("\n--- Alumno ---");
        System.out.println(alumno);

        sc.close();
    }
}

//para comentar
