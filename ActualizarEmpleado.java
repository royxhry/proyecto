import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ActualizarEmpleado {
    
    public void ejecutar(Scanner scanner, List<Empleado> lista) {
        ClearConsole.clearConsole();
        try {
            System.out.print("Ingresa el ID del empleado a actualizar: ");
            int idActualizar = scanner.nextInt();
            scanner.nextLine();
            Empleado empleadoActualizar = Main.buscarEmpleadoPorId(lista, idActualizar);
            if (empleadoActualizar != null) {
                System.out.print("Ingresa el nuevo nombre del empleado: ");
                String nuevoNombre = scanner.nextLine();
                System.out.print("Ingresa la nueva edad del empleado: ");
                int nuevaEdad = scanner.nextInt();
                System.out.print("Ingresa el nuevo año de ingreso: ");
                int nuevoAnio = scanner.nextInt();
                System.out.print("Ingresa el nuevo mes de ingreso: ");
                int nuevoMes = scanner.nextInt();
                System.out.print("Ingresa el nuevo día de ingreso: ");
                int nuevoDia = scanner.nextInt();
                scanner.nextLine();

                empleadoActualizar.setNombre(nuevoNombre);
                empleadoActualizar.setEdad(nuevaEdad);
                empleadoActualizar.setFecha(LocalDate.of(nuevoAnio, nuevoMes, nuevoDia));
                System.out.println("Empleado actualizado exitosamente.");
            } else {
                System.out.println("Empleado no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
