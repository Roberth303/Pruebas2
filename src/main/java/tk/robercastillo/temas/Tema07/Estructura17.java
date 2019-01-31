import java.util.Scanner;
public class Estructura17 {
    public static void main(String args[]) {
        double[] medidas;
        int longarray;
        double media;
        longarray=pedirLongitud();
        medidas = new double[longarray];
        media=tomarMedidas(medidas);
        System.out.printf("La media es de %.2f\n",media);
        for (int i=0;i<medidas.length;i++) {
            if (medidas[i]>media) {
                System.out.printf("Nº%d. %.2f\n", i+1,medidas[i]);
            }
        }
    }
    public static int pedirLongitud() {
        Scanner lector = new Scanner(System.in);
        int registro;
        System.out.println("Dime cuantas medidas vas a poner");
        registro=lector.nextInt();
        lector.nextLine();
        return registro;
    }
    public static double tomarMedidas(double[] medidas) {
        Scanner lector = new Scanner(System.in);
        double media=0;
        for (int i=0;i<medidas.length;i++) {
            System.out.println("Introduzca la medida "+(i+1));
            medidas[i]=lector.nextDouble();
            lector.nextLine();
            media+=medidas[i];
        }
        return media/medidas.length;
    }

}