import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio09_AgregarMaterias {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            // El segundo parámetro (true) activa el modo APPEND:
            // el contenido anterior se conserva y se escribe al final.
            bw = new BufferedWriter(new FileWriter("materias.txt", true));
            bw.write("Bases de Datos");
            bw.newLine();
            bw.write("Ética Profesional");
            bw.newLine();
            System.out.println("Se añadieron 2 asignaturas al final de materias.txt");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
