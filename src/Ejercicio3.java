import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final String password = "1202";
        final String user = "miguel";
        String userPass, userIn; 

                
        do{
        
        System.out.println("Ingrese su usuario");
        userIn = scanner.nextLine();
           
        System.out.println("Ingrese su contraseña numerica");
        userPass = scanner.nextLine();


        }while(!(user.equals(userIn) && password.equals(userPass)));   

        System.out.println("Ingreso Exitoso");

        scanner.close();
    }
}
