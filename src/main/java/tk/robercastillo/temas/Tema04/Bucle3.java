import java.util.Scanner;
public class Bucle3 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        int contador=1;
        int resultado=0;
        System.out.println("Introduce el primer numero a multiplicar:");
        num1=lector.nextInt();
        lector.nextLine();
        System.out.println("Introduce el segundo numero:");
        num2=lector.nextInt();
        lector.nextLine();
        while (contador <= num2){
            resultado=resultado+num1;
            contador++;
        }
        System.out.println(num1+" X "+num2+" = "+resultado);
    }
}