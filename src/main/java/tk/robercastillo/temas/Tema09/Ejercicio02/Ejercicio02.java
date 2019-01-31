package tk.robercastillo.temas.Tema09.Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    private static int NUMARRAY = 10;
    public Ejercicio02() {
        Scanner lec = new Scanner(System.in);
        float[] numeros = new float[NUMARRAY];
        int errores=0;
        boolean isError;
        float numMayor;


        for(int i=0;i<numeros.length;i++) {
            do {
                try {
                    System.out.println("Escribe un numero decimal");
                    numeros[i] = lec.nextFloat();
                    isError=false;
                }
                catch (Exception e){
                    System.out.println("Solo se admiten numeros");
                    lec.nextLine();
                    errores++;
                    isError=true;
                }
            }while (isError);
        }
        numMayor=numeros[0];
        for (int i=0;i<numeros.length;i++) {
            if (numMayor<numeros[i]) {
                numMayor=numeros[i];
            }
        }
        System.out.println("El numero mas grande introducido es: "+numMayor);
    }
}
