import java.util.Scanner;
public class Formato1 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        float num;
        System.out.println("Introduce un numero Real:");
        num=lector.nextFloat();
        lector.nextLine();
        System.out.printf("Numero introducido es %.2f",num);
    }
}