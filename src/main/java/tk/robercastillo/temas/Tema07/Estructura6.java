import java.util.Scanner;
public class Estructura6 {
    public static void main(String args[]) {
        String frase;
        frase=pedirFrase();
        mostrar(frase);
    }
    public static String pedirFrase() {
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Escribe la frase");
        frase=lector.nextLine();
        return frase;
    }
    public static void mostrar(String frase) {
        Scanner lector = new Scanner(System.in);
        int imprimir;
        System.out.println("Cuantas veces lo quieres escribir?");
        imprimir=lector.nextInt();
        lector.nextLine();
        for (int i=0;i<imprimir;i++) {
            System.out.println(frase);
        }
    }
}