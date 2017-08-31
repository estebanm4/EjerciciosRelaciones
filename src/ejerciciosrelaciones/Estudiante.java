package ejerciciosrelaciones;

public class Estudiante {
    private String nombre;
    private int codigo;

    public Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int código) {
        this.codigo = código;
    }
    
    
    
}
