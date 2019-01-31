import java.util.Scanner;
public class Estructura5 {
    public static void main(String args[]) {
        String[] frase;
        String palabraLarga;
        int numLetras;
        frase=pedirFrase();
        palabraLarga=medirPalabras(frase);
        numLetras=palabraLarga.length();
        System.out.println("La palabra mas larga es: ---"+palabraLarga+"--- y tiene una longuitud de "+numLetras+" letras");
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
    public static String medirPalabras(String[] frase) {
        String palabraX=frase[0];
        String palabraY;
        for (int i=0;i<frase.length;i++) {
            palabraY=frase[i];
            palabraX=comparacion(palabraX, palabraY);
        }
        return palabraX;
    }
    public static String comparacion(String palabra1, String palabra2) {
        if (palabra1.length()>palabra2.length()) {
            return palabra1;
        }else {
            return palabra2;
        }
    }
}