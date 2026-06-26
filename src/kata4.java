import java.util.Scanner;

public class kata4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el dia (1=Lunes, 7 = Domingo): ");
        int dia = scanner.nextInt();

        System.out.println("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("La hora no es valida");
        } else  {

            switch (dia) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                        if (hora >= 6 && hora <= 20) {
                            System.out.println("La cafetería está abiera.");
                        }
                        else {
                            System.out.println("Cerrada (Horario de lunes a viertes: 6:00 AM - 8:00 PM)");
                        }
                        break;
                case 6:
                        if  (hora >= 7 && hora <= 14) {
                            System.out.println("La cafetería está abiera.");
                        }
                        else {
                            System.out.println("Cerrada (Horario de sábado: 7:00 AM - 2:00 PM)");
                        }
                        break;
                case 7:
                        System.out.println("Domingo cerrado");

                        break;
                default:
                    System.out.println("Dia invalido");
                    break;
            }


        }
scanner.close();

    }
}