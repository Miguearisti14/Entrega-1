import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final int password = 1202;
        int userPass; 
        final String user = "miguel"; 
        String userIn;
                
        do{
        
        System.out.println("Ingrese su usuario");
        userIn = scanner.nextLine();
           
        System.out.println("Ingrese su contraseña numerica");
        userPass = scanner.nextInt();


        }while((user.equals(userIn) == false) && password!=userPass);   

        System.out.println("Ingreso Exitoso");

        scanner.close();
    }
}
