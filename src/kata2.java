import java.util.Scanner;

public class kata2{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la bebida: ");
        String bebida = scanner.nextLine();
        System.out.print("ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();


        if (temperatura >60) {
            System.out.println("Caliente");
        }
        else if (temperatura >= 30 && temperatura <= 60){
            System.out.println("Templada");
        }
        else {
            System.out.println("Fría");
        }

        scanner.close();
    }
}