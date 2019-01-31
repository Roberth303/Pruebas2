import java.util.Scanner;
public class Estructura13 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        double[] numeros=new double[10];
        pedirNumeros(numeros);
        mostrar(numeros);
    }
    public static void pedirNumeros(double[] numeros) {
        Scanner lector = new Scanner(System.in);
        for (int i=0;i<numeros.length;i++) {
            System.out.println("Introduce el numero "+(i+1));
            numeros[i]=lector.nextDouble();
            lector.nextLine();
        }
    }
    public static void mostrar(double[] numeros) {
        double total=0;
        for (int i=0;i<numeros.length;i++) {
            System.out.printf("%.3f, ", numeros[i]);
            total+=numeros[i];
        }
        total/=numeros.length;
        System.out.printf("\nLa media es de %g\n", total);
    }
}