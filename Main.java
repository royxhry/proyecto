import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entrar = false;

        do {
            Login login = new Login("admin", "123");
            entrar = login.Accesar();

            if (entrar) {
                ClearConsole.clearConsole(); 
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
                    System.out.println("1. Mostrar lista de empleados");
                    System.out.println("2. Agregar empleado");
                    System.out.println("3. Consultar empleado");
                    System.out.println("4. Actualizar empleado");
                    System.out.println("5. Eliminar empleado");
                    System.out.println("6. Salir");
                    System.out.print("Seleccione una opción: ");

                    try {
                        int opcion = scanner.nextInt();
                        scanner.nextLine();

                        try {
                            switch (opcion) {
                                case 1:
                                try{ 
                                    new Repositories().ejecutar(scanner, lista);
                                    } catch (Exception e) {
                                        System.out.println("Ocurrió un error:"+ e.getMessage());
                                    }
                                    break;
                                case 2:
                                try {
                                    new AgregarEmpleado().ejecutar(scanner, lista);
                                } catch (Exception e) {
                                    System.out.println("Ocurrió un error: " + e.getMessage());
                            scanner.nextLine(); 
                                }                     
                                    break;
                                case 3:
                                try {
                                    new ConsultarEmpleado().ejecutar(scanner, lista);
                                } catch (Exception e) {
                                    System.out.println("Ocurrió un error: " + e.getMessage());
                                }
                                    break;
                                case 4:
                                try {
                                    new ActualizarEmpleado().ejecutar(scanner, lista);
                                } catch (Exception e) {
                                    System.out.println("Ocurrió un error:"+ e.getMessage());
                                }
                                    break;
                                case 5:
                                try {
                                    new EliminarEmpleado().ejecutar(scanner, lista);
                                } catch (Exception e) {
                                    System.out.println("Ocurrió un error:"+ e.getMessage());
                                }
                                    break;
                                case 6:
                                try {
                                    ClearConsole.clearConsole(); 
                                    salir = true;
                                } catch (Exception e) {
                                    System.out.println("Ocurrió un error:"+ e.getMessage());
                                }
                                    break;
                                default:
                                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("Ocurrió un error: " + e.getMessage());
                            scanner.nextLine(); 
                        }
                    } catch (Exception e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número."+ e.getMessage());
                        scanner.nextLine(); 
                    }
                } while (!salir);
            } else {
                System.out.println("Acceso incorrecto. Intente nuevamente.");
            }

        } while (!entrar);

        scanner.close();
    }
    }
