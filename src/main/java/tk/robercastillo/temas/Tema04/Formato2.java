import java.util.Scanner;
public class Formato2 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int horas, minutos, segundos;
        do {
            System.out.println("Escribe las horas");
            horas=lector.nextInt();
            lector.nextLine();
        }while (horas<0 || horas>24);
        do {
            System.out.println("Escribe los minutos");
            minutos=lector.nextInt();
            lector.nextLine();
        }while (minutos <0 || minutos>=60);
        do {
            System.out.println("Escribe los segundos");
            segundos=lector.nextInt();
            lector.nextLine();
        }while (segundos<0 || segundos>=60);
        System.out.println("-------------------------------");
        System.out.println("La Hora en Formato hh:mm:ss es:");
        System.out.printf("\t%02d:%02d:%02d",horas, minutos, segundos);
    }
    
}