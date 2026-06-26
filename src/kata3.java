import java.util.Scanner;

public class kata3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precio;
        double subtotal = 0;
        double iva;
        double total;
        double descuento;

        do {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = scanner.nextDouble();

            if (precio != 0) {
                subtotal = subtotal + precio;
            }

        } while (precio != 0);

        iva = subtotal * 0.19;
        total = subtotal + iva;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);

        if (total > 50000) {
            descuento = total * 0.10;
            total = total - descuento;

            System.out.println("Descuento (10%): $" + descuento);
        }

        System.out.println("Total: $" + total);

        scanner.close();
    }
}