import java.util.Arrays;
import java.util.Random;
public class Estructura22 {
    public static void main(String args[]) {
        int[] p = new int[10];
        int[] s = new int[p.length];
        rellenar(p);
        System.out.println(Arrays.toString(p));
        mayorDiez(p,s);
        System.out.println(Arrays.toString(s));
    }
    public static void rellenar(int[] p) {
        Random r = new Random();
        for (int i=0;i<p.length;i++) {
            p[i]=r.nextInt(21);
        }
    }
    public static void mayorDiez(int[] p, int[] s) {
        for (int i=0;i<p.length;i++) {
            if (p[i]>10) {
                s[i]=p[i];
            }else {
                s[i]=-1;
            }
        }
    }
}