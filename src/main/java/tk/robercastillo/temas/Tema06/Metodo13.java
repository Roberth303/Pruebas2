import java.util.Scanner;
public class Metodo13 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        char idiomaPre;
        System.out.println("Escribe tu nombre: ");
        nombre=lector.nextLine();
        do {
            System.out.println("Elige tu idioma de preferencia (a, b, c)");
            System.out.println("a) Valencia\nb) Castellano\nc) English");
            idiomaPre=lector.next().charAt(0);
            lector.nextLine();
        }while (idiomaPre!='a' && idiomaPre!='A' && idiomaPre!='b' && idiomaPre!='B' && idiomaPre!='c' && idiomaPre!='C');
        System.out.printf("\u001B[H\u001B[1J");
        mensaje(nombre, idiomaPre);
    }
    public static void mensaje(String nombre, char idioma) {
        if (idioma=='a' || idioma=='A') {
            System.out.println("Bon dia "+nombre);
        }else if (idioma=='b' || idioma=='B') {
            System.out.println("Buenos dias "+nombre);
        }else {
            System.out.println("Good morning "+nombre);
        }
    }
}