import java.util.Scanner;
public class Metodo5 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        char caracter;
        int numImprimir;
        System.out.println("Indique que caracter quiere imprimir:");
        caracter=lector.next().charAt(0);
        System.out.println(caracter);
        System.out.println("Indique el numero de veces que desea imprimir:");
        numImprimir=lector.nextInt();
        imprimir(caracter, numImprimir);
        System.out.println();
    }
    static void imprimir(char caracter, int numImprimir) {
        int i=0;
        while  (i<numImprimir) {
            System.out.print(caracter);
            i++;
        }
    } 
}