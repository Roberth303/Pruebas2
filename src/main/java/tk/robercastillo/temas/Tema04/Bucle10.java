
import java.util.Scanner;
public class Bucle10 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int total=0;
        int numPedido;
        do {
            System.out.println("Escribe numeros a sumar y 0 para finalizar");
            numPedido=lector.nextInt();
            lector.nextLine();
            total=total+numPedido;
        }while (numPedido!=0);
        System.out.println("El total es "+total);
    }
}