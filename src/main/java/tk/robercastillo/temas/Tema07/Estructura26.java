import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Estructura26 {
    public static final int MAX_ALEATORIO=100;
    public static final int NUM_FILAS=4;
    public static final int NUM_COLUM=8;
    public static void main(String args[]) {
        int[][] numeros = new int[NUM_FILAS][NUM_COLUM];


        rellenar(numeros);
        apartA(numeros);
        apartB(numeros);
        apartC(numeros);
        apartD(numeros);
        apartE(numeros);
        apartF(numeros);
        apartG(numeros);
        apartH(numeros);
        apartI(numeros);
    }
    public static void apartA(int[][] numeros) {
        System.out.println("a)");
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<numeros[i].length;j++) {
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void apartB(int[][] numeros) {
        System.out.println("b)");
        for (int i=0;i<numeros[0].length;i++) {
            for (int j=0;j<numeros.length;j++) {
                System.out.print(numeros[j][i]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void apartC(int[][] numeros) {
        int total=0;
        System.out.println("c)");
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<numeros[i].length;j++) {
                System.out.print(numeros[i][j]+"\t");
                total+=numeros[i][j];
            }
            System.out.println("= "+total);
            total=0;
        }
        System.out.println("");
    }
    public static void apartD(int[][] numeros) {
        int max=0;
        int min=MAX_ALEATORIO;
        System.out.println("d)");
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<numeros[i].length;j++) {
                if (max<numeros[i][j]) {
                    max=numeros[i][j];
                }
                if (min>numeros[i][j]){
                    min=numeros[i][j];
                }
            }
        }
        System.out.println("El maximo es: "+max+"\nEl minimo es: "+min);
        System.out.println();
    }
    public static void apartE(int[][] numeros) {
        double total=0;
        System.out.println("e)");
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<numeros[i].length;j++) {
                total+=numeros[i][j];
            }
        }
        System.out.printf("La media es de %.3f\n",total/(numeros.length*numeros[0].length));
        System.out.println();
    }
    public static void apartF(int[][] numeros) {
        int colum, fila;
        System.out.println("f)");
        fila=pedirFilas();
        colum=pedirColumna();
        System.out.println("El numero en la fila "+(fila+1)+" y columna "+(colum+1)+" es "+numeros[fila][colum]);
        System.out.println();
    }
    public static void apartG(int[][] numeros) {
        int fila;
        System.out.println("g)");
        fila=pedirFilas();
        System.out.println(Arrays.toString(numeros[fila]));
    }
    public static void apartH(int[][] numeros) {
        int colum;
        System.out.println("h)");
        colum=pedirColumna();
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<numeros[i].length;j++) {
                if (j==colum){
                    System.out.println(numeros[i][j]);
                }
            }
        }
        System.out.println("");
    }
    public static void apartI(int[][] numeros) {
        int total=0;
        for (int i=0;i<numeros.length-1;i++) {
            total=0;
            for (int j=0;j<numeros[i].length;j++) {
                total+=numeros[i][j];
            }
            numeros[i][7]=total;
        }
        System.out.println("");
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<numeros[i].length;j++) {
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void rellenar(int[][] numeros) {
        Random r = new Random();
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<numeros[i].length;j++) {
                numeros[i][j]=r.nextInt(MAX_ALEATORIO);
            }
        }
    }
    public static int pedirFilas() {
        Scanner lector = new Scanner(System.in);
        int total;
        do {
        System.out.println("Dime una fila");
        total=lector.nextInt();
        lector.nextLine();
        }while (total<1 || total>NUM_FILAS);
        return total-1;
    }
    public static int pedirColumna() {
        Scanner lector = new Scanner(System.in);
        int total;
        do {
        System.out.println("Dime una columna");
        total=lector.nextInt();
        lector.nextLine();
        }while (total<1 || total>NUM_COLUM);
        return total-1;
    }
}