import java.util.Scanner;
public class Bucle9 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int pedido;
        int calculo;
        int i;
        int contador=0;
        System.out.println("Introduce un numero entero");
        pedido = lector.nextInt();
        
        for (i=pedido;i>0;i--) {
            calculo=pedido%i;
            if (calculo==0){
                contador++;
            }
        }
        if (contador==2) {
            System.out.println("El numero "+pedido+" es primo");
        } else {
            System.out.println("El numero "+pedido+" no es primo");
        }
    }
}