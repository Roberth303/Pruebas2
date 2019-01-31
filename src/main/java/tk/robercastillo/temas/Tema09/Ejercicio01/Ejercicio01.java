package tk.robercastillo.temas.Tema09.Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public Ejercicio01() {
        Scanner lec = new Scanner(System.in);
        int numero=0;

        do {
            try {
                System.out.println("Escribe un numero");
                numero = lec.nextInt();
            }
            catch (Exception e) {
                System.out.println("No se admiten caracteres");
                lec.nextLine();
            }
        }while(numero >= 0);
    }
}
