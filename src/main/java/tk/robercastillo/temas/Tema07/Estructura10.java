import java.util.Scanner;
public class Estructura10 {
    public static void main(String args[]) {
        boolean polindroma;
        String palabra;
        palabra=pedir();
        polindroma=verificar(palabra);
        if (polindroma==true) {
            System.out.println("Es polindroma");
        }else {
            System.out.println("No es polindroma");
        }
    }
    public static String pedir() {
        Scanner lector = new Scanner(System.in);
        String palabra;
        System.out.println("Escribe la frase ");
        palabra=lector.nextLine();
        return palabra;
    }
    public static boolean verificar(String palabra) {
        char a;
        String reves="";
        boolean igual;
        for (int i=palabra.length()-1;i>=0;i--) {
            a=palabra.charAt(i);
            reves=reves+Character.toString(a);
        }
        if (palabra.equals(reves)) {
            igual=true;
        }else {
            igual=false;
        }
        return igual;
    }
}