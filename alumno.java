public class alumno {

    private String matricula;
    private String nombre;
    private int edad;
    private curso curso;

    // Constructor por defecto
    public alumno() {
        this.matricula = "";
        this.nombre = "";
        this.edad = 0;
        this.curso = null;
    }

    // Constructor con parámetros
    public alumno(String matricula, String nombre, int edad, curso curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public curso getCurso() {
        return curso;
    }

    // Setters (permitimos cambiar datos básicos)
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCurso(curso curso) {
        this.curso = curso;
    }

    public String toString() {
        String info = "Alumno: " + nombre +
                      "\nMatrícula: " + matricula +
                      "\nEdad: " + edad;

        if (curso != null) {
            info += "\nCurso inscrito: " + curso.getNombre();
        } else {
            info += "\nNo está inscrito en ningún curso.";
        }

        return info;
    }
}

//para comentar


