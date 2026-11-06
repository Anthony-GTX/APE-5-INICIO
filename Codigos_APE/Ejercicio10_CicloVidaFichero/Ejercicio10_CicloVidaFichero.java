import java.io.File;
import java.io.IOException;

public class Ejercicio10_CicloVidaFichero {
    public static void main(String[] args) {
        // 1. Objeto File con la ruta indicada
        File archivo = new File("datos/temporal.txt");

        // 2. Consulta de estado y creación segura
        if (!archivo.exists()) {
            System.out.println("El archivo no existe. Creándolo...");
            try {
                File carpeta = archivo.getParentFile();
                if (carpeta != null && !carpeta.exists()) {
                    carpeta.mkdirs();
                }
                archivo.createNewFile();
                System.out.println("Archivo creado: " + archivo.getPath());
            } catch (IOException e) {
                System.out.println("Error de E/S: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe: " + archivo.getPath());
        }

        // 3. Validación: simula la confirmación del usuario
        boolean confirmarBorrado = true;

        // 4. delete() solo si hay confirmación
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de delete(): " + eliminado);
        } else {
            System.out.println("Borrado cancelado por el usuario.");
        }
    }
}
