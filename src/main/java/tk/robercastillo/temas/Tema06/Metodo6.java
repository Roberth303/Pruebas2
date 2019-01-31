import java.util.Scanner;
public class Metodo6 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        char caracter;
        int numImprimir;
        int numFilas;
        System.out.println("Indique que caracter quiere imprimir:");
        caracter=lector.next().charAt(0);
        lector.nextLine();
        System.out.println("Indique el numero de veces que desea imprimir:");
        numImprimir=lector.nextInt();
        lector.nextLine();
        System.out.println("Indique el numero de filas que desea imprimir:");
        numFilas=lector.nextInt();
        lector.nextLine();
        imprimir(caracter, numImprimir, numFilas);
    }
    static void imprimir(char caracter, int numImprimir, int numFilas) {
        int contImprimir=0;
        int contFilas=0;
        while  (contFilas<numFilas) { 
            while (contImprimir<numImprimir) {
                System.out.print(caracter);
                contImprimir++;
            }
            System.out.println();
            contFilas++;
            contImprimir=0;
        }
    } 
}