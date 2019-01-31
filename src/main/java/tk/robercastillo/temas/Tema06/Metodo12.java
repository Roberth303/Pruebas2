import java.util.Random;
public class Metodo12 {
    public static void main(String args[]) {
        double nota;
        String nombreNota;
        int min=0;
        int max=10;
        int numExamen=1;
        for (int i=1;i<=50;i++) {
            nota=azahar(min, max);
            nombreNota=equivalente(nota);
            System.out.printf("Examen Nº%d:\t%.2f %s\n", numExamen, nota, nombreNota);
            numExamen++;
        }
    }
    public static double azahar(int min, int max) {
        Random r = new Random();
        double nota;
        nota= min+(max-min) * r.nextDouble();
        return nota;
    }
    public static String equivalente(double nota) {
        if (nota>=0 && nota<5) {
            return "Insuficiente";
        }else if (nota>=5 && nota<6) {
            return "Suficiente";
        }else if (nota>=6 && nota<7) {
            return "Bien";
        }else if (nota>=7 && nota<9) {
            return "Notable";
        }else {
            return "Exelente";
        }
    }
}