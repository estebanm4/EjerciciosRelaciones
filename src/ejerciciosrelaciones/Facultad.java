package ejerciciosrelaciones;
import java.util.HashMap;

public class Facultad {
    private String nombre;
    private HashMap<Integer,Estudiante> estudiantes;
    
    public Facultad(String nombre) {
        this.nombre = nombre;
        this.estudiantes= new HashMap<>();
    }
    
    public void addEstudiante(Estudiante estudiante){
        this.estudiantes.put(estudiante.getCodigo(), estudiante);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
