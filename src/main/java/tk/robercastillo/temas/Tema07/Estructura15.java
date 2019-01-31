import java.util.Scanner;
public class Estructura15 {
    public static final int NUM_ARRAY=20;
    public static void main(String args[]) {
        double[] numeros = new double[NUM_ARRAY];
        pedirNum(numeros);
        mostrar(numeros);
    }
    public static void pedirNum(double[] numeros) {
        Scanner lector = new Scanner(System.in);
        for (int i=0;i<numeros.length;i++) {
            System.out.println("Introduce el Nº"+(i+1));
            numeros[i]=lector.nextDouble();
            lector.nextLine();
        }
    }
    public static void mostrar(double[] numeros) {
        int tabular=0;
        for (int i=0;i<numeros.length;i++) {
            System.out.printf("%-20.3f", numeros[i]);
            tabular++;
            if (tabular==4) {
                tabular=0;
                System.out.println();
            }
        }
    }
}