import java.util.Scanner;
public class Metodo14 {
    public static void main (String args[]) {
        Scanner lector = new Scanner(System.in);
        int m, n;
        int resultado;
        int factM;
        System.out.println("Escriba el primer numero");
        m=lector.nextInt();
        lector.nextLine();
        System.out.println("Escribe el segundo numero");
        n=lector.nextInt();
        lector.nextLine();
        resultado=calculo(m,n);
        factM=factorial(m);
        System.out.printf("El resultado de m/n=m!/(n!*(m-n)!) es %d / %d", factM, resultado);

    }
    public static int calculo(int m, int n) {
        int resultado;
        int restaMN = m-n;
        resultado=(n=factorial(n))*(restaMN=factorial(restaMN));
        return resultado;
    }
    public static int factorial(int num) {
        int fact=1;
        for (int i=num;i>1;i--) {
            fact=fact*i;
        }
        return fact;
    }
}