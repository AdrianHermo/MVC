import java.util.ArrayList;

public class View {

    public void muestraVelocidad(String matricula, int velocidad) {
        System.out.println("Velocidad del coche " + matricula + ": " + velocidad + " km/h");
    }

    public void mostrarCoches(ArrayList<Coche> coches) {
        if (coches.isEmpty()) {
            System.out.println("No hay coches registrados.");
        } else {
            for (Coche c : coches) {
                System.out.println(c);
            }
        }
    }
}
