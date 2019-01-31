import java.util.Scanner;

public class Dicotomica {
    public static void main(String args[]) {
        int numBuscar;
        int[] numeros = {1,4,9,11,16,17,19,22,23,24};
        numBuscar=pedir();
        buscar(numeros, numBuscar);
    }
    public static void buscar(int[] numeros, int numBuscar) {
        int centro;
        int min=0;
        int max=numeros.length-1;
        do{
            centro=(min+max)/2;
            if (numBuscar==numeros[centro]) {
                System.out.println("El numero "+numBuscar+" esta en la posicion "+centro);
            }else if (numBuscar<numeros[centro]) {
                max=centro-1;
            }else {
                min=centro+1;
            }
        }while(min<=max && numBuscar!=numeros[centro]);
        if (min>max) {
            System.out.println("El numero que buscas no esta en este vector");
        }
    }
    public static int pedir() {
        int num;
        Scanner lector = new Scanner(System.in);
        System.out.println("Cual numero desea buscar Buen Señor/a");
        num=lector.nextInt();
        lector.nextLine();
        return num;
    }
}