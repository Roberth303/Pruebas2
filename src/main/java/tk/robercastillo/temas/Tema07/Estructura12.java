import java.util.Scanner;
public class Estructura12 {
    public static void main(String args[]) {
        String frase;
        String letras;
        String numeros;
        frase=pedirFrase();
        letras=cambiarEs(frase);
        numeros=cambiarNum(frase);
        System.out.println(letras);
        System.out.println(numeros);
    }
    public static String pedirFrase() {
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Escribe una frase:");
        frase=lector.nextLine();
        return frase;
    }
    public static String cambiarEs(String frase) {
        String fraseFinal;
        String minusculas;
        minusculas=frase.toLowerCase();
        fraseFinal=minusculas.replaceAll("es", "no por");
        return fraseFinal;
    }
    public static String cambiarNum(String frase) {
        String fraseFinal;
        fraseFinal=frase.replaceAll("\\d+", "*");
        return fraseFinal;
    }
}