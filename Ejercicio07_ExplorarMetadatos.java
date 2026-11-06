import java.io.File;
import java.io.IOException;

public class Ejercicio07_ExplorarMetadatos {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        // 1. Comprobación previa
        if (archivo.exists()) {
            System.out.println("El recurso ya existe en el disco.");
        } else {
            System.out.println("El recurso no existe. Intentando crearlo...");
            // 2. Creación controlada (try-catch obligatorio por IOException)
            try {
                File carpeta = archivo.getParentFile();
                if (carpeta != null && !carpeta.exists()) {
                    carpeta.mkdirs();   // createNewFile() no crea carpetas
                }
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                }
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        }

        // 3. Extracción de información (siempre se muestra)
        System.out.println("Nombre (getName): " + archivo.getName());
        System.out.println("Ruta (getPath): " + archivo.getPath());
    }
}
