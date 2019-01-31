import java.util.Scanner;
public class Estructura14 {
    public static final int NUM_ARRAY=10;
    public static final int PAR=1;
    public static final int IMPAR=0;
    public static void main(String args[]) {
        char[] vec = new char[NUM_ARRAY];
        pedirChar(vec);
        mostrar(vec, PAR);
        mostrar(vec, IMPAR);
    }
    public static void pedirChar(char[] vec) {
        Scanner lector = new Scanner(System.in);
        for (int i=0;i<vec.length;i++) {
            System.out.println("Introduce el caracter Nº"+(i+1));
            vec[i]=lector.next().charAt(0);
            lector.nextLine();
        }
    }
    public static void mostrar(char[] vec, int cond) {
        for (int i=0;i<vec.length;i++) {
            if (i%2==cond) {
                System.out.printf("%s, ", vec[i]);
            }
        }
        System.out.println();
    }
}