import java.util.Random;
public class Estructura24 {
    public static final int NUM_ARRAY=50;
    public static void main(String args[]) {
        double[] v = new double[NUM_ARRAY];
        double[] p = new double[NUM_ARRAY];
        rellenar(v);
        for (int i=0;i<p.length;i++) {
            p[i]=suma(v,i);
        }
        for (int i=0;i<v.length;i++) {
            System.out.printf("%.3f, ",v[i]);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        for (int i=0;i<p.length;i++) {
            System.out.printf("%.3f, ",p[i]);
        }
        System.out.println();
    }
    public static double suma(double[] v, int cont) {
        double total=0;
        for (int i=0;i<=cont;i++) {
            total+=v[i];
        }
        return total;
    }
    public static void rellenar(double[] x) {
        Random r = new Random();
        for (int i=0;i<x.length;i++) {
            x[i]=(0+(21-0))*r.nextDouble();
        }
    }
}