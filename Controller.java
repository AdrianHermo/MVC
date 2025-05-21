import java.util.ArrayList;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void crearCoche(String matricula, String modelo) {
        model.crearCoche(matricula, modelo);
    }

    public void aumentarVelocidad(String matricula, int incremento) {
        model.cambiarVelocidad(matricula, incremento);
    }

    public void disminuirVelocidad(String matricula, int decremento) {
        model.cambiarVelocidad(matricula, -decremento);
    }

    public ArrayList<Coche> obtenerTodosLosCoches() {
        return model.getTodosLosCoches();
    }

    public int getVelocidad(String matricula) {
        return model.getVelocidad(matricula);
    }
}
