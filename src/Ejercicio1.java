import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final int password = 1202;
        int userPass; 
        String user;

        System.out.println("Ingrese su usuario");
        user = scanner.nextLine();
                
        do{
           

        System.out.println("Ingrese su contraseña");
        userPass = scanner.nextInt();
            if(password!=userPass){
                System.out.println("Contraseña Incorrecta");

            }
        }while(password!=userPass);

        System.out.println("Ingreso Exitoso");

        scanner.close();
    }
}
