import java.util.Scanner;

public class kata6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hora;
        int clientes;

        int totalClientes = 0;
        int contadorHoras = 0;

        int horaPico = 0;
        int maxClientes = 0;

        System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
        hora = scanner.nextInt();

        while (hora != -1) {

            if (hora >= 0 && hora <= 23) {

                System.out.print("Ingresa el número de clientes en esa hora: ");
                clientes = scanner.nextInt();

                totalClientes = totalClientes + clientes;
                contadorHoras++;

                if (clientes > maxClientes) {
                    maxClientes = clientes;
                    horaPico = hora;
                }

            } else {
                System.out.println("Hora inválida");
            }

            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            hora = scanner.nextInt();
        }

        System.out.println("--- Reporte de Clientes ---");

        if (contadorHoras > 0) {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("Total de clientes: " + totalClientes);
            System.out.println("Promedio por hora: " + promedio);
            System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " clientes)");
        } else {
            System.out.println("No se ingresaron horas válidas.");
        }

        scanner.close();
    }
}