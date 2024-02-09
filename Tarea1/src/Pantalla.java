import java.util.Scanner;
public class Pantalla {
    static void mostrarPantalla() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige la opción que desees:");
            System.out.println("1. Ver fortuna");
            System.out.println("2. Salir");
            opcion = scanner.nextInt();

            SeleccionarAccion seleccion = new SeleccionarAccion();
            switch (opcion) {
                case 1:
                    seleccion.verFortuna();
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Ingresa el número correspondiente a las opciones presentadas");
            }
        } while (opcion != 2);
    }
}
