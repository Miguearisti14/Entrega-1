import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1");
        double userFirstOperator = scanner.nextDouble();

        System.out.println("Ingrese el numero 2");
        double userSecondOperator = scanner.nextDouble();

        scanner.close();

        System.out.println("Resultados:");

        System.out.println(userFirstOperator+userSecondOperator);
        System.out.println(userFirstOperator-userSecondOperator);
        System.out.println(userFirstOperator*userSecondOperator);
        System.out.println(userFirstOperator/userSecondOperator);

    }
}
