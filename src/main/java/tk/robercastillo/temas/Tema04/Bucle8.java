import java.util.Scanner;
public class Bucle8 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.println("Introduce el numero factorial:");
        num=lector.nextInt();
        for (int i=num;i>1;i--) {
            fact=fact*i;
        }
        System.out.println("El factorial de "+num+" es "+fact);
    }
}