import java.util.Scanner;

public class Maquina {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido! Que bebida quieres?");
        System.out.println("1. Mate");
        System.out.println("2. Cafe");
        System.out.println("3. Bebida");
        System.out.println("4. Agua");

        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Preparando opcion: "+opcion+ ". Mate");
                break;
        
            case 2:
                System.out.println("Preparando opcion: "+opcion+ ". Cafe");
                break;
        
            case 3:
                System.out.println("Preparando opcion: "+opcion+ ". Bebida");
                break;
        
            case 4:
                System.out.println("Preparando opcion: "+opcion+ ". Agua");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        System.out.println("Hasta luego");
        
        scanner.close();
    }
}
