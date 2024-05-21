import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repositories {
    private String mostrarLista;

    public Repositories(String mostrarLista){
        this.mostrarLista = mostrarLista;
        
        
    }

    public String getMostrarLista() {
        List<Empleado> lista = new ArrayList<>();
                lista.add(new Empleado("rodrigo", 20, LocalDate.of(2021, 1, 15), 1));
                lista.add(new Empleado("pancho", 25, LocalDate.of(2023, 3, 5), 2));
                lista.add(new Empleado("pedro", 24, LocalDate.of(2021, 5, 30), 3));
                lista.add(new Empleado("eder", 27, LocalDate.of(2021, 12, 16), 4));
                lista.add(new Empleado("evelyn", 22, LocalDate.of(2021, 10, 19), 5));

        return mostrarLista;
    }

    public void setMostrarLista(String mostrarLista) {
        this.mostrarLista = mostrarLista;
    }
    

    case 5:
                            clearConsole(); // Limpiar la consola antes de mostrar el menú
                                Repositories rp = new Repositories();
                                .getMostrarLista();
                                break;
}

    

