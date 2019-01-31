import java.util.Scanner;

public class Metodo15 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        String palabra1 = new String();
        String palabra2 = new String();
        String palabra3 = new String();
        String palabraFinal;
        int totalVocales;
        int opcion;
        do {
        do {
            mostrarMenu();
            opcion = lector.nextInt();
        } while (opcion < 0 || opcion > 3);
        switch (opcion) {
        case 1:
            System.out.println("Escribe 3 palabras");
            System.out.println("Primera palabra");
            palabra1 = lector.next();
            lector.nextLine();
            System.out.println("Segunda palabra");
            palabra2 = lector.next();
            lector.nextLine();
            System.out.println("Tercera palabra");
            palabra3 = lector.next();
            lector.nextLine();
            palabraFinal = larga(palabra1, palabra2, palabra3);
            System.out.println("La palabra mas larga es "+palabraFinal);
            System.out.println("---------------------------------------");
            System.out.println("Presione enter para continuar");
            lector.nextLine();
            break;
        case 2:
            System.out.println("Escribe 3 palabras");
            System.out.println("Primera palabra");
            palabra1 = lector.next();
            lector.nextLine();
            System.out.println("Segunda palabra");
            palabra2 = lector.next();
            lector.nextLine();
            System.out.println("Tercera palabra");
            palabra3 = lector.next();
            lector.nextLine();
            palabraFinal = corta(palabra1, palabra2, palabra3);
            System.out.println("La palabra mas corta es"+palabraFinal);
            System.out.println("---------------------------------------");
            System.out.println("Presione enter para continuar");
            lector.nextLine();
            break;
        case 3:
            System.out.println("Escribe 1 palabra");
            System.out.println("Primera palabra");
            palabra1 = lector.next();
            lector.nextLine();
            totalVocales=vocales(palabra1);
            System.out.println("El numero total de vocales es "+totalVocales);
            System.out.println("---------------------------------------");
            System.out.println("Presione enter para continuar");
            lector.nextLine();
            break;
        default:
            break;
        }
        }while (opcion!=0);
    }

    public static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Palabra mas larga.\n2. Palabra mas corta.\n3. Número de vocales");
        System.out.println("-----------------------------");
        System.out.println("0. Salir");
        System.out.print("Introducir opcion: ");
    }

    public static String larga(String palabra1, String palabra2, String palabra3) {
        int cadena1, cadena2, cadena3;
        int max1, maxFinal;
        cadena1 = palabra1.length();
        cadena2 = palabra2.length();
        cadena3 = palabra3.length();
        max1 = mayor(cadena1, cadena2);
        maxFinal = mayor(max1, cadena3);
        if (maxFinal == cadena1) {
            return palabra1;
        } else if (maxFinal == cadena2) {
            return palabra2;
        } else {
            return palabra3;
        }
    }

    public static int mayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static String corta(String palabra1, String palabra2, String palabra3) {
        int cadena1, cadena2, cadena3;
        int min1, minFinal;
        cadena1 = palabra1.length();
        cadena2 = palabra2.length();
        cadena3 = palabra3.length();
        min1 = menor(cadena1, cadena2);
        minFinal = menor(min1, cadena3);
        if (minFinal == cadena1) {
            return palabra1;
        } else if (minFinal == cadena2) {
            return palabra2;
        } else {
            return palabra3;
        }
    }

    public static int menor(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int vocales(String palabra1) {
        int numLetras;
        int numVocales=0;
        String palabra;
        palabra = palabra1.toLowerCase();
        numLetras = palabra1.length();
        for (int i = 0; i < numLetras; i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'á' || palabra.charAt(i) == 'à'
                    || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'é' || palabra.charAt(i) == 'è'
                    || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'í' || palabra.charAt(i) == 'ì'
                    || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'ó' || palabra.charAt(i) == 'ò'
                    || palabra.charAt(i) == 'u' || palabra.charAt(i) == 'ú' || palabra.charAt(i) == 'ù') {
                numVocales++;
            }
        }
        return numVocales;
    }
}