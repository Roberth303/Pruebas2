import java.util.Scanner;
public class Metodo1 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int a;
        int b;
        int r;
        System.out.println("Escribe el primer numero");
        a=lector.nextInt();
        lector.nextLine();
        System.out.println("Escribe el segundo numero");
        b=lector.nextInt();
        lector.nextLine();
        r=suma(a,b);
        System.out.println("El resultado de "+a+" + "+b+" es "+r);
    }
    static int suma(int pepito, int juanito) {
        return pepito+juanito;
    }
}