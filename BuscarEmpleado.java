import java.util.List;

public class BuscarEmpleado {
    public static Empleado buscarEmpleadoPorId(List<Empleado> lista, int id) {
        for (Empleado empleado : lista) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
}
}