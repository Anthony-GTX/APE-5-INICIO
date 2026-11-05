import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("estudiantes.txt"));
            for (int i = 1; i <= 3; i++) {
                System.out.print("Nombre del estudiante " + i + ": ");
                String nombre = sc.nextLine();
                System.out.print("Calificación de " + nombre + ": ");
                String nota = sc.nextLine();

                bw.write(nombre);   // línea 1
                bw.newLine();
                bw.write(nota);     // línea 2
                bw.newLine();
            }
            System.out.println("Datos guardados en estudiantes.txt");
        } catch (IOException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();   // cierre correcto del archivo
            } catch (IOException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
            sc.close();
        }
    }
}
