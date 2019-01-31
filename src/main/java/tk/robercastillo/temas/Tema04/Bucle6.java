import java.util.Scanner;
public class Bucle6 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        int escoger;
        int resultado;
        System.out.println("Chuleta Tabla de multiplicar");
        do {
            System.out.println("Elija una tabla 1-10");
            escoger=lector.nextInt();
            lector.nextLine();
        }while (escoger<=0||escoger>10);
        for (int i=1;i<=10;i++) {
            resultado = escoger*i;
            System.out.println(escoger+" X "+i+" = "+resultado);
        }
    }
}