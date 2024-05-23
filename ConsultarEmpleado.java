import java.util.List;
import java.util.Scanner;

public class ConsultarEmpleado {
    
    public void ejecutar(Scanner scanner, List<Empleado> lista) {
        ClearConsole.clearConsole();
        try {
            System.out.print("Ingresa el ID del empleado a consultar: ");
            int idConsulta = scanner.nextInt();
            Empleado empleadoEncontrado = Main.buscarEmpleadoPorId(lista, idConsulta);
            if (empleadoEncontrado != null) {
                System.out.println(empleadoEncontrado);
            } else {
                System.out.println("Empleado no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
