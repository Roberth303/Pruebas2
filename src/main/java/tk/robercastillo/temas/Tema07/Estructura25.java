import java.util.Arrays;
import java.util.Random;
public class Estructura25 {
    public static final int NUM_ARRAY=50;
    public static void main(String args[]) {
        int[] v = new int[NUM_ARRAY];
        int[] p;
        int longP;
        int j=0;
        rellenar(v);
        longP=pares(v);
        p=new int[longP];
        for (int i=0;i<v.length;i++) {
            if (v[i]%2==0) {
                    p[j]=v[i];
                    j++;
            }
        }
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(p));
    }
    public static int pares(int[] x) {
        int totalP=0;
        for (int i=0;i<x.length;i++) {
            if (x[i]%2==0) {
                totalP++;
            }
        }
        return totalP;
    }
    public static void rellenar(int[] x) {
        Random r = new Random();
        for (int i=0;i<x.length;i++) {
            x[i]=r.nextInt(101);
        }
    }
}