
import java.time.LocalDate;

public class Empleado {
    
    private String nombre;
    private int edad, id;
    private LocalDate fecha;
    
    
    public Empleado(String nombre, int edad, LocalDate fecha ,int id){
        this.nombre= nombre;
        this.edad= edad;
        this.fecha= fecha;
        this.id = id;
    
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", fecha=" + fecha + "]";
    }
    
}
