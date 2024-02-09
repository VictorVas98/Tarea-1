import java.util.Random;
public class SeleccionarAccion implements Seleccion{
    public void verFortuna() {
        String[] frases = {
                "Buena suerte",
                "Mala suerte",
                "Ganarás dinero fácil.",
                "Se te facilitará aprender un idioma",
                "Tendras una suerte regular"
        };
        Random rand = new Random();
        int n = rand.nextInt(5);
        String respuesta = frases[n];
        System.out.println("Tu fortuna es: " + respuesta);
    }
}