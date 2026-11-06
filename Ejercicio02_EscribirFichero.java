import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02_EscribirFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un mensaje: ");
        String mensaje = sc.nextLine();
        try {
            // true = modo append: conserva lo que ya tenía el archivo
            FileWriter escritor = new FileWriter("estudiantes.txt", true);
            escritor.write(mensaje + System.lineSeparator());
            escritor.close();
            System.out.println("La información se guardó correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir: " + e.getMessage());
        }
        sc.close();
    }
}
