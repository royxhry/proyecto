import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado("rodrigo", 20, LocalDate.of(2021, 1, 15), 1));
        lista.add(new Empleado("pancho", 25, LocalDate.of(2023, 3, 5), 2));
        lista.add(new Empleado("pedro", 24, LocalDate.of(2021, 5, 30), 3));
        lista.add(new Empleado("eder", 27, LocalDate.of(2021, 12, 16),4));
        lista.add(new Empleado("evelyn", 22, LocalDate.of(2021, 10, 19), 5));

        boolean salir = false;
        
        do {
            System.out.println("Menu de Gestion de Empleados");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Consultar empleado");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                
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
                    break;

                case 2:
                    
                    System.out.print("Ingresa el ID del empleado a consultar: ");
                    int idConsulta = scanner.nextInt();
                    Empleado empleadoEncontrado = buscarEmpleadoPorId(lista, idConsulta);
                    if (empleadoEncontrado != null) {
                        System.out.println(empleadoEncontrado);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 3:
                    
                    System.out.print("Ingresa el ID del empleado a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine(); 
                    Empleado empleadoActualizar = buscarEmpleadoPorId(lista, idActualizar);
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
                    break;

                case 4:
                    
                    System.out.print("Ingresa el ID del empleado a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    Empleado empleadoEliminar = buscarEmpleadoPorId(lista, idEliminar);
                    if (empleadoEliminar != null) {
                        lista.remove(empleadoEliminar);
                        System.out.println("Empleado eliminado exitosamente.");
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 5:
                    
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }
        } while (!salir);

        scanner.close();
    }

    public static Empleado buscarEmpleadoPorId(List<Empleado> lista, int id) {
        for (Empleado empleado : lista) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }
}