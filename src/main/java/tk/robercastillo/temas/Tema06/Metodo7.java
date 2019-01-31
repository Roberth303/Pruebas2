import java.util.Scanner;
public class Metodo7 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int numFact;
        System.out.println("Escriba el numero factorial");
        numFact=lector.nextInt();
        lector.nextLine();
        System.out.println("El factorial de "+numFact+" es "+factorial(numFact));
    }
    public static int factorial(int numFactorial) {
        int resultado=1;
        for (int i=numFactorial;i>0;i--) {
            resultado=resultado*i;
        }
        return resultado;
    }
}