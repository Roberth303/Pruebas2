import java.util.Scanner;
public class Practica1 {
    public static void main(String args[]) {
        //Primero declaro las variables que voy a usar
        Scanner lector = new Scanner(System.in);
        int opcion;
        float numPedido1;
        float numPedido2;
        float resultado;
        //Hago este bucle hasta que se pulse 0 (Salir)
        do {
            System.out.println("$$$ Calculadora Basica $$$");
            System.out.println("Elige una opcion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Resto de division");
            System.out.println("---------------------");
            System.out.println("0. Salir");
            opcion=lector.nextInt();
            lector.nextLine();
            //Pongo este switch y no un if ya que se trata de un sistema numerado
            switch (opcion) {
                case 1:
                    System.out.println("Vamos a Sumar!");
                    System.out.println("Introduzca el primer sumando:");
                    numPedido1=lector.nextFloat();
                    lector.nextLine();
                    System.out.println("Introduzca el segundo sumando:");
                    numPedido2=lector.nextFloat();
                    lector.nextLine();
                    resultado=numPedido1+numPedido2;
                    System.out.println("-----------------------------");
                    System.out.println(numPedido1+" + "+numPedido2+" = "+resultado);
                    System.out.println("-----------------------------");
                    System.out.println("Pulse intro para continuar...");
                    lector.nextLine();
                    break;
                case 2:
                    System.out.println("Vamos a Restar!");
                    System.out.println("Introduce el minuendo:");
                    numPedido1=lector.nextFloat();
                    lector.nextLine();
                    System.out.println("Introduce el sustraendo:");
                    numPedido2=lector.nextFloat();
                    lector.nextLine();
                    resultado=numPedido1-numPedido2;
                    System.out.println("-----------------------------");
                    System.out.println(numPedido1+" - "+numPedido2+" = "+resultado);
                    System.out.println("-----------------------------");
                    System.out.println("Pulse intro para continuar...");
                    lector.nextLine();
                    break;
                case 3:
                    System.out.println("Vamos a Multiplicar!");
                    System.out.println("Introduce el primer factor:");
                    numPedido1=lector.nextFloat();
                    lector.nextLine();
                    System.out.println("Introduce el segundo factor:");
                    numPedido2=lector.nextFloat();
                    lector.nextLine();
                    resultado=numPedido1*numPedido2;
                    System.out.println("-----------------------------");
                    System.out.println(numPedido1+" X "+numPedido2+" = "+resultado);
                    System.out.println("-----------------------------");
                    System.out.println("Pulse intro para continuar...");
                    lector.nextLine();
                    break;
                case 4:
                    System.out.println("Vamos a Dividir!");
                    System.out.println("Introduce el dividendo:");
                    numPedido1=lector.nextFloat();
                    lector.nextLine();
                    System.out.println("Introduce el divisor:");
                    numPedido2=lector.nextFloat();
                    lector.nextLine();
                    resultado=numPedido1/numPedido2;
                    System.out.println("-----------------------------");
                    System.out.println(numPedido1+" / "+numPedido2+" = "+resultado);
                    System.out.println("-----------------------------");
                    System.out.println("Pulse intro para continuar...");
                    lector.nextLine();
                    break;
                case 5:
                    System.out.println("Vamos a sacar el Residuo!");
                    System.out.println("Introduce el dividendo:");
                    numPedido1=lector.nextFloat();
                    lector.nextLine();
                    System.out.println("Introduce el divisor:");
                    numPedido2=lector.nextFloat();
                    lector.nextLine();
                    resultado=numPedido1%numPedido2;
                    System.out.println("-----------------------------");
                    System.out.println("El residuo de "+numPedido1+" / "+numPedido2+" es "+resultado);
                    System.out.println("-----------------------------");
                    System.out.println("Pulse intro para continuar...");
                    lector.nextLine();
                    break;
                default:
                    break;
            }
        }while (opcion!=0);
    }   
}