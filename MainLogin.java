// Declaración de la clase MainLogin
public class MainLogin {

    // Método principal, punto de entrada del programa
    public static void main(String[] args) {
        // Crear un nuevo objeto Login con el usuario y la contraseña predeterminados
        Login login = new Login("root", "password"); 
        // Llamar al método Accesar() del objeto Login para intentar iniciar sesión
        login.Accesar();
    }
}
