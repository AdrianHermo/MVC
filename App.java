import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear coche");
            System.out.println("2. Aumentar velocidad");
            System.out.println("3. Disminuir velocidad");
            System.out.println("4. Mostrar todos los coches");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Introduce modelo: ");
                    String modelo = scanner.nextLine();
                    controller.crearCoche(matricula, modelo);
                    break;

                case 2:
                    System.out.print("Introduce matrícula: ");
                    matricula = scanner.nextLine();
                    System.out.print("Cantidad a aumentar: ");
                    int inc = scanner.nextInt();
                    controller.aumentarVelocidad(matricula, inc);
                    view.muestraVelocidad(matricula, controller.getVelocidad(matricula));
                    break;

                case 3:
                    System.out.print("Introduce matrícula: ");
                    matricula = scanner.nextLine();
                    System.out.print("Cantidad a disminuir: ");
                    int dec = scanner.nextInt();
                    controller.disminuirVelocidad(matricula, dec);
                    view.muestraVelocidad(matricula, controller.getVelocidad(matricula));
                    break;

                case 4:
                    view.mostrarCoches(controller.obtenerTodosLosCoches());
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
