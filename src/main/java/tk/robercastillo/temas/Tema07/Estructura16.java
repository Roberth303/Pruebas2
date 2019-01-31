import java.util.Random;
public class Estructura16 {
    public static final int NUM_ARRAY=30;
    public static final int MAX=10;
    public static final int MIN=0;
    public static void main(String args[]) {
        double[] numeros = new double[NUM_ARRAY];
        generarNum(numeros, MAX, MIN);
        media(numeros);
        mediaTotal(numeros);
    }
    public static void generarNum(double[] numeros, int max, int min) {
        Random r = new Random();
        for (int i=0;i<numeros.length;i++) {
            numeros[i]=min+(max-min)*r.nextDouble();
        }
    }
    public static void media(double[] numeros) {
        double media=0;
        int cont=0;
        for (int i=0;i<numeros.length;i++) {
            if (numeros[i]>=5) {
                media+=numeros[i];
                cont++;
            }
        }
        System.out.printf("La nota media de aprobados es %.2f\n",media/cont);
    }
    public static void mediaTotal(double[] numeros) {
        double total=0;
        for (int i=0;i<numeros.length;i++) {
            total+=numeros[i];
        }
        System.out.printf("La nota media total es %.2f\n", total/numeros.length);
    }
}