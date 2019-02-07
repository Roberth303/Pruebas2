package tk.robercastillo.temas.Tema09.Ejercicio10;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    private Scanner lec = new Scanner(System.in);
    private Random rnd = new Random();
    public Ejercicio10() {
        int eleccion=-1;
        do{
            do{
                try {
                    mostrarMenu();
                    eleccion=lec.nextInt();
                }catch (InputMismatchException im) {
                    System.out.println("Solo se admiten numeros del 0 al 5");
                    lec.nextLine();
                }

            }while(eleccion<0 || eleccion>5);

            switch (eleccion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplica();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    restoDiv();
                    break;
            }


        }while(eleccion!=0);

    }
    public void suma() {
        float numPedido1=0, numPedido2=0;
        boolean isIncorrect;
        System.out.println("Vamos a Sumar!");
        System.out.println("Introduzca el primer sumando:");
        do {
            try {
                numPedido1 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while(isIncorrect);
        System.out.println("Introduzca el segundo sumando:");
        do {
            try {
                numPedido2 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while (isIncorrect);
        System.out.println("-----------------------------");
        System.out.println(numPedido1+" + "+numPedido2+" = "+(numPedido1+numPedido2));
        System.out.println("-----------------------------");
        System.out.println("Pulse intro para continuar...");
        lec.nextLine();
    }
    public void resta() {
        float numPedido1=0, numPedido2=0;
        boolean isIncorrect;
        System.out.println("Vamos a Restar!");
        System.out.println("Introduzca el primer minuendo:");
        do {
            try {
                numPedido1 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while(isIncorrect);
        System.out.println("Introduzca el segundo sustranedo:");
        do {
            try {
                numPedido2 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while (isIncorrect);
        System.out.println("-----------------------------");
        System.out.println(numPedido1+" - "+numPedido2+" = "+(numPedido1-numPedido2));
        System.out.println("-----------------------------");
        System.out.println("Pulse intro para continuar...");
        lec.nextLine();
    }
    public void multiplica() {
        float numPedido1=0, numPedido2=0;
        boolean isIncorrect;
        System.out.println("Vamos a Multiplicar!");
        System.out.println("Introduzca el primer factor:");
        do {
            try {
                numPedido1 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while(isIncorrect);
        System.out.println("Introduzca el segundo factor:");
        do {
            try {
                numPedido2 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while (isIncorrect);
        System.out.println("-----------------------------");
        System.out.println(numPedido1+" X "+numPedido2+" = "+(numPedido1*numPedido2));
        System.out.println("-----------------------------");
        System.out.println("Pulse intro para continuar...");
        lec.nextLine();
    }
    public void divide(){
        float numPedido1=0, numPedido2=0;
        boolean isIncorrect;
        System.out.println("Vamos a Dividir!");
        System.out.println("Introduzca el Dividendo:");
        do {
            try {
                numPedido1 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while(isIncorrect);
        System.out.println("Introduzca el Divisor:");
        do {
            try {
                numPedido2 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while (isIncorrect);
        System.out.println("-----------------------------");
        try {
            System.out.println(numPedido1+" / "+numPedido2+" = "+(numPedido1/numPedido2));
        }catch (ArithmeticException ae) {
            System.out.println("No se puede dividir entre 0, SYNTAX ERROR");
        }
        System.out.println("-----------------------------");
        System.out.println("Pulse intro para continuar...");
        lec.nextLine();
    }
    public void restoDiv() {
        float numPedido1=0, numPedido2=0;
        boolean isIncorrect;
        System.out.println("Vamos a Extraer el Resto!");
        System.out.println("Introduzca el Dividendo:");
        do {
            try {
                numPedido1 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while(isIncorrect);
        System.out.println("Introduzca el Divisor:");
        do {
            try {
                numPedido2 = lec.nextFloat();
                lec.nextLine();
                isIncorrect=false;
            } catch (InputMismatchException im2) {
                System.out.println("Solo se admiten numeros reales");
                lec.nextLine();
                isIncorrect=true;
            }
        }while (isIncorrect);
        if (numPedido2==0){
            System.out.println("No se puede dividir entre 0");
        }else {
            System.out.println("-----------------------------");
            System.out.println("El resto de "+numPedido1+" / "+numPedido2+" es "+(numPedido1%numPedido2));
            System.out.println("-----------------------------");
        }
        System.out.println("Pulse intro para continuar...");
        lec.nextLine();
    }

    public void mostrarMenu() {
        System.out.println("$$$ Calculadora Basica $$$");
        System.out.println("Elige una opcion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Resto de division");
        System.out.println("---------------------");
        System.out.println("0. Salir");
    }
    public int aleatorio(int min, int max) {
        int eleccion;
        eleccion=rnd.nextInt(1);
        if (eleccion==0) {
            return rnd.nextInt()
        }
    }
}
