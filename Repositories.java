import java.util.List;
import java.util.Scanner;

public class Repositories {
    
    
    public void ejecutar(Scanner scanner, List<Empleado> lista) {
        ClearConsole.clearConsole();
        try {
            System.out.println("Lista de empleados:");
            for (Empleado emp : lista) {
                System.out.println(emp);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}

