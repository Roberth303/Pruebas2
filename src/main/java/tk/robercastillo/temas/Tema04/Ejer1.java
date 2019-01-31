import java.util.Scanner;
public class Ejer1 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int resultado;
        System.out.println("Introduce un numero entero:");
        numero=lector.nextInt();
        resultado=numero%2;
        if (resultado == 0) {
            System.out.println("Es un numero par.");
        } else {
            System.out.println("Es un numero impar.");

        }        
    }
}