
import java.util.Scanner;

// Declaración de la clase Login
public class Login {

    // Declaración de variables de instancia para el usuario y la contraseña
    private String usuario;
    private static final String USER = "root"; // Usuario predeterminado
    private String contraseña;
    private static final String PASSWORD = "password"; // Contraseña predeterminada

    // Constructor de la clase Login que recibe un usuario y una contraseña
    public Login(String usuario, String contraseña) {
        // Asignación de los valores recibidos a las variables de instancia
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Método para obtener el usuario
    public String getUsuario() {
        return usuario;
    }

    // Método para obtener la contraseña
    public String getContraseña() {
        return contraseña;
    }

    // Método para intentar iniciar sesión
    public boolean Accesar() {
        // Creación de un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner sc = new Scanner(System.in);

        // Bucle do-while para permitir múltiples intentos de inicio de sesión
        do {
            // Solicitar al usuario que ingrese su nombre de usuario
            System.out.println("Ingresa tu usuario: ");
            String usuario = sc.nextLine(); // Leer la entrada del usuario

            // Solicitar al usuario que ingrese su contraseña
            System.out.println("Ingresa tu contraseña: ");
            String contraseña = sc.nextLine(); // Leer la entrada del usuario

            // Comprobar si el usuario y la contraseña ingresados coinciden con los valores predeterminados
            if (usuario.equals(USER) && contraseña.equals(PASSWORD)) {
                System.out.println("Haz iniciado sesión"); 
                return true; // Devuelve true si el inicio de sesión es exitoso
            } else {
                System.out.println("Usuario o contraseña incorrectos."); 
            }

            // Solicitar al usuario si desea intentar iniciar sesión nuevamente
            System.out.println("¿Deseas intentar iniciar sesión nuevamente? (1: Sí, cualquier tecla menos 1 mas enter para cerrar) ");
            int opc = sc.nextInt(); // Leer la opción del usuario
            sc.nextLine(); // Limpiar el buffer de entrada

            if (opc == 2) {
                return false; // Devuelve false si el usuario decide no intentar iniciar sesión nuevamente
            }
        } while (true);
        
    }
}