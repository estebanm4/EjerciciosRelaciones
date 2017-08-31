package ejerciciosrelaciones;
import java.util.ArrayList;
import java.util.TreeMap;


public class Universidad {
    private String nombre;
    private ArrayList <Facultad> facultades;
    private TreeMap<Integer, Estudiante> estudiantes;
    
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.facultades = new ArrayList<>();
        this.estudiantes = new TreeMap<>();
    }
    
    public boolean addFacultad(String nombre){
        Facultad facultad = new Facultad(nombre);
        if (this.facultades.add(facultad))
            return true;
        else
            return false;
    }
    
    public boolean addEstudiante(Estudiante estudiante){
        if(this.estudiantes.put(estudiante.getCodigo(), estudiante) != null)
            return true;
        else
            return false;                  
    }
    
    public boolean addEstudianteFacultad(String nombreFacultad,Estudiante estudiante) {
        boolean resultado = false;
        for(Facultad facultad : facultades){ //forEach;
            if(facultad.getNombre().equals(nombreFacultad)){
                facultad.addEstudiante(estudiante);
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public ArrayList<Estudiante> listAllEstudiantes(){
        return (ArrayList)this.estudiantes.values();
    }
    
    public ArrayList<Facultad> listAllFacultades(){
        return this.facultades;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
