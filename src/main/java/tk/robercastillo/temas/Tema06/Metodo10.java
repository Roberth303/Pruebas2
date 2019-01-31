import java.util.Scanner;
public class Metodo10 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int numTabla;

        do {
            System.out.println("Escribe un numero para ver su respectiva tabla de multiplicar");
            numTabla=lector.nextInt();
            lector.nextLine();
            if (numTabla>=0) {
                tablaMultiplicar(numTabla);
                System.out.println("Pulse intro para continuar");
                lector.nextLine();
                System.out.printf("\u001B[1J\u001B[H");
            }else {
                ;
            }
        }while (numTabla>=0);
    }
    public static void tablaMultiplicar(int numero) {
        int multiplicado=0;
        int resultado;
        do {
            resultado=numero*multiplicado;
            System.out.println(numero+" X "+multiplicado+" = "+resultado);
            multiplicado++;
        }while (multiplicado<=10);
    }
}