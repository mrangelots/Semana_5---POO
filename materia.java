public class materia {
    
    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    public materia(){
        this.nombre = "";
        this.clave = "";
        this.creditos = 0;
        this.horasSemanales = 0;
    }

    public materia(String nombre, String clave, int creditos, int horasSemanales){
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    public materia(materia otra){
        this.nombre = otra.nombre;
        this.clave = otra.clave;
        this.creditos = otra.creditos;
        this.horasSemanales = otra.horasSemanales;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getClave(){
        return clave;
    }

    public void setClave(String clave){
        this.clave = clave;
    }

    public int getCreditos(){
        return creditos;
    }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }

    public int getHorasSemanales(){
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales){
        this.horasSemanales = horasSemanales;
    }

    public String toString(){
        return "Materia: " + nombre + "\nClave: " + clave + "\nCréditos: " + creditos + "\nHoras semanales: " + horasSemanales;
    }
}

//para comentar
