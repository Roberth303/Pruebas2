import java.util.Scanner;
public class Bucle15 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;
        int error=0;
        do {
            if (error==1) {
                System.out.println("Ha escrito mal los datos");
            }
            System.out.println("Escriba la Hora:");
            hora=lector.nextInt();
            lector.nextLine();
            System.out.println("Escriba los Minutos:");
            minutos=lector.nextInt();
            lector.nextLine();
            System.out.println("Escriba los Segundos:");
            segundos=lector.nextInt();
            lector.nextLine();
            error=1;
        }while (hora<=0||hora>24 || minutos<=0||minutos>60 || segundos<=0||segundos>60);
        System.out.println("Usted ha puesto la siguiente hora: "+hora+"h "+minutos+"min "+segundos+"s");
    }
}