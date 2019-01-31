import java.util.Scanner;
public class Ejer2 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduzca el numero 1");
        num1=lector.nextInt();
        lector.nextLine();
        System.out.println("Introduzca el numero 2");
        num2=lector.nextInt();
        lector.nextLine();
        if (num1==num2) {
            System.out.println("El numero "+num1+" es igual a "+num2);
        } else if (num1>num2) {
            System.out.println("El numero "+num1+" es mayor a "+num2);
        } else {
            System.out.println("El numero "+num1+" es menor a "+num2);
        }
    }
}