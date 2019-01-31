import java.util.Scanner;
public class Estructura9 {
    public static void main(String args[]) {
        String[] frase;
        String[] fraseN;
        frase=pedirFrase();
        fraseN=cambiarFrase(frase);
        System.out.println(fraseN);
    }
    public static String[] pedirFrase() {
        Scanner lector = new Scanner(System.in);
        String frase;
        String[] palabras;
        System.out.println("Escribe la frase: ");
        frase=lector.nextLine();
        palabras=frase.split(" ");
        return palabras;
    }
    public static String[] cambiarFrase(String[] palabras) {
        for (int i=0;i<palabras.length;i++) {
            palabras[i]=impar(palabras[i]);
        }
        return palabras;
    }
    public static String impar(String normal) {
        String nuevo="";
        for (int i=0;i<normal.length();i+=2) {
            nuevo=nuevo+normal.charAt(i);
        }
        return nuevo;
    }
}