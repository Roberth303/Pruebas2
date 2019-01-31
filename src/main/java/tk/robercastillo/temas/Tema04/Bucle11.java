import java.util.Scanner;
public class Bucle11 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int numPedido=0;
        float media=0;
        float contadorMedia=0;
        float total;
        do {
            System.out.println("Introduce numeros para calcular media e intrduce uno negativo para terminar.");
            numPedido=lector.nextInt();
            lector.nextLine();
            if (numPedido>=0) {
            contadorMedia++;
            media=media+numPedido;
            }
        }while (numPedido>=0);
        total = media / contadorMedia;
        System.out.println("La media de los numeros introducidos es de "+total);
    }
}