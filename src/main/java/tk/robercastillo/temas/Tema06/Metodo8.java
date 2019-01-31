import java.util.Scanner;
public class Metodo8 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3, num4;
        boolean resultCapicua;
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
        resultCapicua=capicua(num1,num2,num3,num4);
        if (resultCapicua==true) {
            System.out.println("El numero es capicua");
        }else {
            System.out.println("El numero no es capicua");
        }
    }
    static boolean capicua(int num1, int num2, int num3, int num4) {

        if (num1==num4 && num2==num3) {
            return true;
        }
        else {
            return false;
        }
    }
}