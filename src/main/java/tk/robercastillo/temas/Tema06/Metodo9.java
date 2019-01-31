import java.util.Scanner;
public class Metodo9 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int numSuma;
        System.out.println("Escriba el numero sumatorio");
        numSuma=lector.nextInt();
        lector.nextLine();
        System.out.println("El sumatorio de "+numSuma+" es "+sumatorio(numSuma));
    }
    public static int sumatorio(int numSuma) {
        int resultado=0;
        for (int i=numSuma;i>0;i--) {
            resultado=resultado+i;
        }
        return resultado;
    }
}