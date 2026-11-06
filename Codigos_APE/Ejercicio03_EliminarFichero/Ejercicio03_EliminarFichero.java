import java.io.File;

public class Ejercicio03_EliminarFichero {
    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");
        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " fue eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo (puede que no exista o esté en uso).");
        }
    }
}
