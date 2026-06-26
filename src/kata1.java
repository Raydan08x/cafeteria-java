import java.util.Scanner;

public class kata1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la cuenta total:");
        double cuentaTotal = scanner.nextDouble();
        System.out.println("Por favor ingrese la propina:");
        double porcentaje = scanner.nextDouble();


        if (porcentaje < 5) {
            System.out.println("Propina muy baja");
        }
        else if (porcentaje > 30){
                System.out.println("¡Propina generosa!");
        }
        else {
            System.out.println("Propina normal");
        }

        double propina = cuentaTotal * porcentaje / 100;
        double totalPagar = cuentaTotal + propina;

        System.out.println("Valor de la propina: " + propina);
        System.out.println("Total a pagar: " + totalPagar);

        scanner.close();
    }
}