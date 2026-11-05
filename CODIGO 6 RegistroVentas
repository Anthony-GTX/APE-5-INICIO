import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulado = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true))) {
            while (true) {
                System.out.print("Nombre del producto (o 'fin' para terminar): ");
                String nombre = sc.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }
                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());
                System.out.print("Cantidad vendida: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double subtotal = precio * cantidad;
                double descuento = 0;
                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }
                double totalPagar = subtotal - descuento;
                acumulado += totalPagar;

                System.out.println("Subtotal: $" + String.format("%.2f", subtotal)
                        + " | Descuento: $" + String.format("%.2f", descuento)
                        + " | Total a pagar: $" + String.format("%.2f", totalPagar));

                bw.write("Producto: " + nombre + " | Subtotal: $" + String.format("%.2f", subtotal)
                        + " | Descuento: $" + String.format("%.2f", descuento)
                        + " | Total: $" + String.format("%.2f", totalPagar));
                bw.newLine();
            }
            bw.write("TOTAL ACUMULADO DE VENTAS: $" + String.format("%.2f", acumulado));
            bw.newLine();
            System.out.println("Total acumulado de ventas: $" + String.format("%.2f", acumulado));
        } catch (IOException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        }
        sc.close();
    }
}
