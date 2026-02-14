import java.util.ArrayList;

public class curso {

    private String nombre;
    private ArrayList<materia> materias;

    // Constructor por defecto
    public curso() {
        this.nombre = "";
        this.materias = new ArrayList<>();
    }

    // Constructor con parámetro
    public curso(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    // Getter y Setter del nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar materias (máximo 3)
    public void agregarMateria(materia materia) {
        if (materias.size() < 3) {
            materias.add(materia);
        } else {
            System.out.println("No se pueden agregar más de 3 materias.");
        }
    }

    // Método para calcular créditos totales del curso
    public int calcularCreditosTotales() {
        int total = 0;

        for (materia m : materias) {
            total += m.getCreditos();
        }

        return total;
    }

    // Getter del ArrayList (por si lo necesitamos después)
    public ArrayList<materia> getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        String info = "Curso: " + nombre + "\n";
        info += "Materias:\n";

        for (materia m : materias) {
            info += "- " + m.getNombre() + "\n";
        }

        info += "Créditos totales: " + calcularCreditosTotales();

        return info;
    }
}

//para comentar


