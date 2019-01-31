import java.util.Random;
import java.util.Scanner;
public class Estructura20 {
    public static final int NUM_ARRAY=10;
    public static void main(String args[]) {
        int[] numeros=new int[NUM_ARRAY];
        for (int i=0;i<numeros.length;i++) {
            numeros[i]=random(1, 20);
        }
        buscar(numeros);
    }
    public static int random(int min, int max) {
        Random r = new Random();
        int devolver;
        devolver=r.nextInt(max-min+1)+min;
        return devolver;
    }
    public static void buscar(int[] numeros) {
        Scanner lector = new Scanner(System.in);
        int num;
        System.out.println("Escribe el numero que quieras buscar (1-20)");
        num=lector.nextInt();
    }
}