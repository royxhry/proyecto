import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entrar = false;

        do {
            // Crear un nuevo objeto Login con el usuario y la contraseña predeterminados
            Login login = new Login("root", "password");
            // Llamar al método Accesar() del objeto Login para intentar iniciar sesión
            entrar = login.Accesar();

            if (entrar) {
                clearConsole(); // Limpiar la consola antes de mostrar el menú
                System.out.println("Acceso correcto");
                List<Empleado> lista = new ArrayList<>();
                lista.add(new Empleado("rodrigo", 20, LocalDate.of(2021, 1, 15), 1));
                lista.add(new Empleado("pancho", 25, LocalDate.of(2023, 3, 5), 2));
                lista.add(new Empleado("pedro", 24, LocalDate.of(2021, 5, 30), 3));
                lista.add(new Empleado("eder", 27, LocalDate.of(2021, 12, 16), 4));
                lista.add(new Empleado("evelyn", 22, LocalDate.of(2021, 10, 19), 5));

                boolean salir = false;

                do {
                    
                    System.out.println("Menu de Gestion de Empleados");
                    System.out.println("1. Agregar empleado");
                    System.out.println("2. Consultar empleado");
                    System.out.println("3. Actualizar empleado");
                    System.out.println("4. Eliminar empleado");
                    System.out.println("5. Mostrar lista de empleados");
                    
                    System.out.println("6. Salir");
                    
                    System.out.print("Seleccione una opción: ");

                    int opcion = scanner.nextInt();
                    scanner.nextLine();
                    try {
                     
                    switch (opcion) {
                        case 1:
                        clearConsole(); // Limpiar la consola antes de mostrar el menú
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
                            
                            
                            System.out.println("si agregaste los datos correctos el usuario se a creado si no ps no y intenta de nuevo con valores correctos");
                            break;

                        case 2:
                        clearConsole(); // Limpiar la consola antes de mostrar el menú
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
                        clearConsole(); // Limpiar la consola antes de mostrar el menú
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
                        clearConsole(); // Limpiar la consola antes de mostrar el menú
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

                        
    
                        case 6:
                        clearConsole(); // Limpiar la consola antes de mostrar el menú
                            salir = true;
                            break;

                        default:
                            System.out.println("Opción no válida. Por favor, intente nuevamente.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("el error"+e);   // TODO: handle exception
                   }
                } while (!salir);
            } else {
                System.out.println("Acceso incorrecto. Intente nuevamente.");
            }
        
        } while (!entrar);
           
    
        scanner.close();
    }

    // Método para limpiar la consola
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al intentar limpiar la consola.");
        }
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
