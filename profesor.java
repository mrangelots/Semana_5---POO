public class profesor {

    private String nombre;
    private String numeroNomina;
    private double sueldoPorHora;
    private materia materia;

    // Constructor por defecto
    public profesor() {
        this.nombre = "";
        this.numeroNomina = "";
        this.sueldoPorHora = 0;
        this.materia = null;
    }

    // Constructor con parámetros
    public profesor(String nombre, String numeroNomina, double sueldoPorHora, materia materia) {
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materia = materia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public materia getMateria() {
        return materia;
    }

    // Setters (menos materia)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    // Método para calcular sueldo semanal
    public double calcularSueldoSemanal() {
        if (materia != null) {
            return sueldoPorHora * materia.getHorasSemanales();
        }
        return 0;
    }

    public String toString() {
        String info = "Profesor: " + nombre +
                      "\nNómina: " + numeroNomina +
                      "\nSueldo por hora: $" + sueldoPorHora;

        if (materia != null) {
            info += "\nMateria que imparte: " + materia.getNombre();
            info += "\nSueldo semanal: $" + calcularSueldoSemanal();
        } else {
            info += "\nNo tiene materia asignada.";
        }

        return info;
    }
}
