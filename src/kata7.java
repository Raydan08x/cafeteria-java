import java.util.Scanner;

public class kata7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precio;
        int cantidad;

        double subtotal;
        double porcentajeDescuento;
        double valorDescuento;
        double iva;
        double total;
        double totalCompra = 0;

        String respuesta;

        do {
            System.out.print("Ingresa el precio del producto: ");
            precio = scanner.nextDouble();

            System.out.print("Ingresa la cantidad: ");
            cantidad = scanner.nextInt();

            subtotal = precio * cantidad;

            if (cantidad >= 1 && cantidad <= 2) {
                porcentajeDescuento = 0;
            } else if (cantidad >= 3 && cantidad <= 5) {
                porcentajeDescuento = 0.05;
            } else if (cantidad >= 6 && cantidad <= 10) {
                porcentajeDescuento = 0.10;
            } else {
                porcentajeDescuento = 0.15;
            }

            valorDescuento = subtotal * porcentajeDescuento;

            double subtotalConDescuento = subtotal - valorDescuento;

            iva = subtotalConDescuento * 0.19;

            total = subtotalConDescuento + iva;

            totalCompra = totalCompra + total;

            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento (" + (porcentajeDescuento * 100) + "%): $" + valorDescuento);
            System.out.println("IVA (19%): $" + iva);
            System.out.println("Total: $" + total);

            System.out.print("¿Agregar otro producto? (S/N): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Total de la compra: $" + totalCompra);

        scanner.close();
    }
}