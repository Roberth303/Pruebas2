import java.util.Scanner;
public class Estructura8 {
    public static void main(String args[]) {
        String[] frase;
        frase=pedirFrase();
        mostrar(frase);
    }
    public static String[] pedirFrase() {
        Scanner lector = new Scanner(System.in);
        String frase;
        String[] palabras;
        System.out.println("Escribe una frase:");
        frase=lector.nextLine();
        palabras=frase.split(" ");
        return palabras;
    }
    public static void mostrar(String[] frase) {
        for (int i=0;i<frase.length;i++) {
            System.out.printf("%-15s%d\n",frase[i],frase[i].length());
        }
    }
}