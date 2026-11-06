import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio08_EscribirMaterias {
    public static void main(String[] args) {
        String[] materias = {
            "Programación I",
            "Matemática Discreta",
            "Fundamentos de Redes",
            "Física General",
            "Comunicación Oral y Escrita"
        };

        BufferedWriter bw = null;
        try {
            // Flujo: memoria RAM -> BufferedWriter -> FileWriter -> disco
            bw = new BufferedWriter(new FileWriter("materias.txt"));
            for (String materia : materias) {
                bw.write(materia);
                bw.newLine();   // salto de línea portable
            }
            System.out.println("Se escribieron " + materias.length + " asignaturas en materias.txt");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();   // libera el recurso y vacía el búfer
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
