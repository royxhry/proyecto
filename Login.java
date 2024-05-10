// Importar la clase Scanner del paquete java.util, que permite leer la entrada del usuario desde la consola
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

        // Declaración de variables locales
        int opc; // Variable para almacenar la opción del usuario

        // Bucle do-while para permitir múltiples intentos de inicio de sesión
        do {
            // Solicitar al usuario que ingrese su nombre de usuario
            System.out.println("Ingresa tu usuario: ");
            String usuario = sc.nextLine(); // Leer la entrada del usuario

            // Solicitar al usuario que ingrese su contraseña
            System.out.println("Ingresa tu contraseña: ");
            String contraseña = sc.nextLine(); // Leer la entrada del usuario

            // Crear un nuevo objeto Login con el usuario y la contraseña proporcionados por el usuario
            Login login = new Login(usuario, contraseña);

            // Comprobar si el usuario y la contraseña ingresados coinciden con los valores predeterminados
            if (usuario.equals(login.USER) && contraseña.equals(login.PASSWORD)) {
                System.out.println("Haz iniciado sesión"); 
            } else {
                System.out.println("Usuario o contraseña incorrectos."); 
            }

            // Solicitar al usuario si desea intentar iniciar sesión nuevamente
            System.out.println("¿Deseas intentar iniciar sesión nuevamente? (1: Sí, 0: No)");
            opc = sc.nextInt(); // Leer la opción del usuario
            sc.nextLine(); // Limpiar el buffer de entrada
        // Continuar el bucle mientras la opción del usuario sea 1 (Sí)
        } while (opc == 1);

        return false; // Devolver false si el usuario decide no iniciar sesión nuevamente
    }
}