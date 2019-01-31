import java.util.Scanner;
public class Estructura1 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        String palabra;
        char[]frase;
        System.out.println("Escribe una palabra");
        palabra=lector.nextLine();
        frase = palabra.toCharArray();
        frase[0] = Character.toUpperCase(frase[0]);
        System.out.println(frase);
    }
}