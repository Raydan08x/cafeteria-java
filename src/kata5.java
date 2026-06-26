import java.util.Scanner;

public class kata5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int opcion = 0;


            while (opcion != 6)
            {
                System.out.println("--- Menú de la Cafetería ---");
                System.out.println("1. Café ($4.000)");
                System.out.println("2. Muffin ($3.500)");
                System.out.println("3. Sandwich ($7.500");
                System.out.println("4. Jugo ($5.000)");
                System.out.println("5. Té ($3.000))");
                System.out.println("6. Salir");
                System.out.println("Elige una opcion:  ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        total= total+4000;
                        break;
                    case 2:
                        total= total+3500;
                        break;
                    case 3:
                        total= total+7500;
                        break;
                    case 4:
                        total= total+5000;
                        break;
                    case 5:
                        total= total+3000;
                        break;
                    case 6:
                        System.out.println("Total: $ "+ total);
                        System.out.println("Gracias por su compra ");

                        break;

                 default:
                     System.out.println("Opcion invalida");
                      break;
                }

            }
        scanner.close();

    }
}