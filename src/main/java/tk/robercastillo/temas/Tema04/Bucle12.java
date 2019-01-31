import java.util.Scanner;
import java.util.Random;
public class Bucle12 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        Random r = new Random();
        int numRandom;
        int intentos;
        int numProbar;
        System.out.println("Introduce tu numero de ♥");
        intentos=lector.nextInt();
        lector.nextLine();
        numRandom=r.nextInt(100-1)+1;
        do {
            System.out.println("▒▒▒ Adivina el numero ▒▒▒");
            numProbar=lector.nextInt();
            if (numProbar==numRandom) {
                System.out.println("Has Acertado");
            }else {
                System.out.println("No has acertado");
                intentos--;
                System.out.println("Te quedan "+intentos+" ♥ ");
                if (numProbar>numRandom) {
                    System.out.println("El numero es menor");
                }else {
                    System.out.println("El numero es mayor");
                }
            }
        } while (numProbar!=numRandom && intentos>0);
        if (intentos==0){
            System.out.println("Has perdido, el numero era "+numRandom);
        }else {
            System.out.println("Felicidades has ganado!!!!");
        }
    }
}