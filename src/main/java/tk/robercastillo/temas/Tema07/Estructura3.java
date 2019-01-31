import java.util.Scanner;
public class Estructura3 {
    public static void main(String args[]) {
        String frase;
        int palabras;
        frase=pedirFrase();
        palabras=contPalabras(frase);
        System.out.println("Hay un total de "+palabras+" palabras");
    }
    public static String pedirFrase() {
        Scanner lector=new Scanner(System.in);
        String frase;
        System.out.println("Escribe la frase");
        frase=lector.nextLine();
        return frase;
    }
    public static int contPalabras(String frase) {
        int total;
        String[] palabras;
        palabras=frase.split(" ");
        total=palabras.length;
        return total;
    }
}