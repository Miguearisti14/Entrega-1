import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i;

        do{

        System.out.println("Ingrese el numero 1");
        double userFirstOperator = scanner.nextDouble();

        System.out.println("Ingrese el numero 2");
        double userSecondOperator = scanner.nextDouble();
        

        System.out.println("Resultados:");

        System.out.println("La suma es "+(userFirstOperator+userSecondOperator));
        System.out.println("La resta es "+(userFirstOperator-userSecondOperator));
        System.out.println("La multiplicacion es "+(userFirstOperator*userSecondOperator));
        System.out.println("La division es "+(userFirstOperator/userSecondOperator));

        System.out.println("Si desea realizar otro calculo presione 1. de lo contrario presione 0");
        i = scanner.nextInt();

        

        }while(i!=0);

        scanner.close();
        System.out.println("Programa finalizado");

    }
}
