import java.util.Scanner;
public class Metodo3 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int num1, num2;
        System.out.println("Escriba un numero");
        num1=lector.nextInt();
        lector.nextLine();
        System.out.println("Escriba otro numero");
        num2=lector.nextInt();
        lector.nextLine();
        System.out.println("El numero mas grande entre "+num1+" y "+num2+" es "+mayor(num1, num2));
    }
    static int mayor(int num1, int num2) {
        if (num1>num2) {
            return num1;
        }
        else {
            return num2;
        }
    }
}