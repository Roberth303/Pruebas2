import java.util.Scanner;
public class Metodo4 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Escriba el primer numero");
        num1=lector.nextInt();
        lector.nextLine();
        System.out.println("Escriba el segundo numero");
        num2=lector.nextInt();
        lector.nextLine();
        System.out.println("Escriba el tercer numero");
        num3=lector.nextInt();
        lector.nextLine();
        System.out.println("Escriba el cuarto numero");
        num4=lector.nextInt();
        lector.nextLine();
        int max1=mayor(num1,num2);
        int max2=mayor(num3, num4);
        int maxFinal=mayor(max1,max2);
        System.out.println("El numero mas grande entre "+num1+", "+num2+", "+num3+" y "+num4+" es "+maxFinal);
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