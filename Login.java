import java.util.Scanner;

class Login {
    private String usuario;
    private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean Accesar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String user = scanner.nextLine();
        System.out.print("Contraseña: ");
        String pass = scanner.nextLine();

        return usuario.equals(user) && contrasena.equals(pass);
    
    }
    
}