import java.util.Arrays;
import java.util.Random;
public class Estructura18 {
    public static final int LON_ARRAY=10;
    public static int[] suma = new int[LON_ARRAY];
    public static double[] division = new double[LON_ARRAY];
    public static void main(String args[]) {
        int[] operando1 = new int[LON_ARRAY];
        int[] operando2 = new int[LON_ARRAY];
        for (int i=0;i<operando1.length;i++) {
            operando1[i]=random(1,10);
            operando2[i]=random(1,10);
        }
        sumar(operando1, operando2);
        dividir(operando1, operando2);
        System.out.println("Operando1: "+Arrays.toString(operando1));
        System.out.println("Operando2: "+Arrays.toString(operando2));
        System.out.println("Suma: "+Arrays.toString(suma));
        System.out.print("Division: [");
       
        for (int j=0;j<division.length;j++) {
            if(j>0)
                System.out.printf(",%.3f", division[j]);
            else
                System.out.printf("%.3f", division[j]);
        }
        System.out.println("]");
    }
    /**
     * Hacer un numero random
     * @param min parametro minimo
     * @param max parametro maximo
     * @return 
     */
    public static int random(int min, int max) {
        Random r = new Random();
        int devolver;
        devolver=r.nextInt(max-min+1)+min;
        return devolver;
    }
    public static void sumar(int[] operando1, int[] operando2) {
        for (int i=0;i<suma.length;i++) {
            suma[i]=operando1[i]+operando2[i];
        }
    }
    public static void dividir(int[] operando1, int[] operando2) {
        for (int i=0;i<division.length;i++) {
            division[i]=(double)operando1[i]/(double)operando2[i];
        }
    }
}