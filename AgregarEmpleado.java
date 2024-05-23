import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AgregarEmpleado {
    public void ejecutar(Scanner scanner, List<Empleado> lista) {
        ClearConsole.clearConsole();
        try {
            System.out.print("Ingresa el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad del empleado: ");
            int edad = scanner.nextInt();

            System.out.print("Ingresa el año de ingreso: ");
            int anio = scanner.nextInt();

            System.out.print("Ingresa el mes de ingreso: ");
            int mes = scanner.nextInt();

            System.out.print("Ingresa el día de ingreso: ");
            int dia = scanner.nextInt();

            System.out.print("Ingresa el ID del empleado: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            Empleado nuevoEmpleado = new Empleado(nombre, edad, LocalDate.of(anio, mes, dia), id);
            lista.add(nuevoEmpleado);
            System.out.println("Empleado agregado exitosamente.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
