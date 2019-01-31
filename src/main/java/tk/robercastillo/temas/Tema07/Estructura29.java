import java.util.Arrays;
import java.util.Random;
public class Estructura29 {
    public static void main(String args[]) {
        double[][] notas = new double[20][3];
        double[] mediaAlumn = new double[20];
        double[][] mediaMod = new double[3][2];

        for (int i=0;i<mediaMod.length;i++) {
            for (int j=0;j<mediaMod[i].length;j++) {
                mediaMod[i][j]=0;
            }
        }

        rellenar(notas);
        sacarMediaAlumn(notas,mediaAlumn);
        sacarMediaMod(notas,mediaMod);
        mostrarResultado(notas,mediaAlumn,mediaMod);

    }
    public static void rellenar(double[][] notas) {
        Random r = new Random();
        for (int i=0;i<notas.length;i++) {
            for(int j=0;j<notas[i].length;j++) {
                notas[i][j]=(0+(10-0))*r.nextDouble();
            }
        }
    }
    public static void sacarMediaAlumn(double[][] notas, double[] media) {
        double acumulador=0;
        for (int i=0;i<notas.length;i++) {
            for (int j=0;j<notas[i].length;j++) {
                acumulador+=notas[i][j];
            }
            media[i]=acumulador/3;
            acumulador=0;
        }
    }
    public static void sacarMediaMod(double[][] notas, double[][] mod) {
        double d1,d2;
        double[] acumulador = {0,0,0};
        for (int i=0;i<notas.length;i++) {
            for (int j=0;j<notas[i].length;j++) {
                acumulador[j]+=notas[i][j];
            }
        }
        for (int i=0;i<acumulador.length;i++) {
            mod[i][0]=acumulador[i]/20;
        }

        for (int i=0;i<mod.length;i++) {
            for (int j=0;j<notas.length;j++) {
                d1=notas[j][i];
                d2=mod[i][0];
                if (new Double(d1).compareTo(new Double(d2))==1) {
                    mod[i][1]+=1;
                }
            }
        }
    }
    public static void mostrarResultado(double[][] notas,double[] mediaAlumn, double[][] mediaMod) {
        final int tab=15;
        double[] maxima={0,0,0};
        int transformacion;
        System.out.printf("%-9s%"+tab+"s%"+tab+"s%"+tab+"s%"+tab+"s\n","","MOD1","MOD2","MOD3","MEDIA");
        for (int i=0;i<notas.length;i++) {
            System.out.printf("%s%-2d","Alumno ",(i+1));
            for (int j=0;j<notas[i].length;j++) {
                System.out.printf("%"+tab+".2f",notas[i][j]);
                if (notas[i][j]>maxima[j]) {
                    maxima[j]=notas[i][j];
                }
            }
            System.out.printf("%"+tab+".2f\n",mediaAlumn[i]);
        }
        System.out.println();
        System.out.printf("%-9s","MAXIMA");
        for (int i=0;i<maxima.length;i++) {
            System.out.printf("%"+tab+".2f",maxima[i]);
        }
        System.out.println();
        System.out.printf("%-13s","MEDIANA");
        for (int i=0;i<mediaMod.length;i++) {
            transformacion=(int)mediaMod[i][1];
            System.out.printf("%11.2f("+transformacion+")",mediaMod[i][0]);
        }
        System.out.println();
    }
}