import java.util.Scanner;
public class Ejer5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int calificacion;
        System.out.println("Introduce una calificación entre 0 y 10");
        calificacion=lector.nextInt();
        lector.nextLine();
        switch (calificacion) {
            case 0: case 1: case 2: case 3: case 4:
            System.out.println("Insuficiente");
                break;
            case 5:
            System.out.println("Suficiente");
                break;
            case 6:
            System.out.println("Bien");
                break;
            case 7: case 8:
            System.out.println("Notable");
                break;
            case 9: case 10:
            System.out.println("Sobresaliente");
                break;
        }
        if (calificacion<0 || calificacion>10) {
            System.out.println("ERROR");
        }
    }
    
}