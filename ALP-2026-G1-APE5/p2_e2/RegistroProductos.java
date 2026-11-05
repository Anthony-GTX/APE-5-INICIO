import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Cantidad disponible: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        double total = precio * cantidad;

        // try-with-resources cierra el archivo automáticamente; true = append
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true))) {
            bw.write("Producto: " + nombre + " | Precio: $" + String.format("%.2f", precio)
                    + " | Cantidad: " + cantidad + " | Valor total: $" + String.format("%.2f", total));
            bw.newLine();
            System.out.println("Producto guardado. Valor total: $" + String.format("%.2f", total));
        } catch (IOException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        }
        sc.close();
    }
}
