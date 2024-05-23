import java.util.List;
import java.util.Scanner;

public class EliminarEmpleado {
    
    public void ejecutar(Scanner scanner, List<Empleado> lista) {
        ClearConsole.clearConsole();
        try {
            System.out.print("Ingresa el ID del empleado a eliminar: ");
            int idEliminar = scanner.nextInt();
            Empleado empleadoEliminar = BuscarEmpleado.buscarEmpleadoPorId(lista, idEliminar);
            if (empleadoEliminar != null) {
                lista.remove(empleadoEliminar);
                System.out.println("Empleado eliminado exitosamente.");
            } else {
                System.out.println("Empleado no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}