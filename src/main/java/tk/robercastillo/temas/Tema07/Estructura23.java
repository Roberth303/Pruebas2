import java.util.Arrays;
import java.util.Random;
public class Estructura23 {
    public static void main(String args[]) {
        double[] v = new double[10];
        double[] p = new double[v.length];
        rellenar(v);
        completarP(v, p);
        for (int i=0;i<v.length;i++) {
            System.out.printf("%.3f, ",v[i]);
        }
        System.out.println();
        for (int i=0;i<v.length;i++) {
            System.out.printf("%.3f, ",p[i]);
        }
        System.out.println();
    }
    public static void rellenar(double[] v) {
        Random r = new Random();
        for (int i=0;i<v.length;i++) {
            v[i]=(0+(21-0))*r.nextDouble();
        }
    }
    public static void completarP(double[] v, double[] p) {
        int j=v.length;
        for (int i=0;i<v.length;i++) {
            p[i]=v[--j];
        }
    }
}