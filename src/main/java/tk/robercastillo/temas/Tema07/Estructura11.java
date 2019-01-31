import java.util.Scanner;
public class Estructura11 {
    public static void main(String args[]) {
        String nombre;
        nombre = solicitar();
        System.out.println(nombre);
        apartA(nombre);
        apartB(nombre);
        apartC(nombre);
        apartD(nombre);
        apartE(nombre);
        apartF(nombre);
        apartG(nombre);
    }
    public static String solicitar() {
        Scanner lector = new Scanner(System.in);
        StringBuilder completo = new StringBuilder();
        String nombre, apellido1, apellido2;
        do {
        System.out.println("Escribe tu nombre (min 2 letras)");
        nombre=lector.next();
        lector.nextLine();
        }while (nombre.length()<2);
        do {
        System.out.println("Escribre tu primer apellido (min 2 letras)");
        apellido1=lector.next();
        lector.nextLine();
        } while (apellido1.length()<2);
        do {
        System.out.println("Escribe tu segundo apellido (min 1 letra)");
        apellido2=lector.next();
        lector.nextLine();
        } while (apellido2.length()<1);
        completo.append(nombre +" "+apellido1+" "+apellido2);
        return completo.toString();
    }
    public static void apartA(String nombre) {
        String espacios;
        System.out.print("a) ");
        System.out.print(nombre.toLowerCase());
        System.out.print(", "+nombre.toUpperCase());
        espacios=nombre.replace(" ", "");
        System.out.println(", tiene "+espacios.length()+" letras");
    }
    public static void apartB(String nombre) {
        String espacios;
        espacios=nombre.replace(" ", "");
        System.out.print("b) ");
        for (int i=0;i<5;i++) {
            System.out.print(espacios.charAt(i));
        }
        System.out.println();
    }
    public static void apartC(String nombre) {
        int comienzo=0;
        String espacios;
        espacios=nombre.replace(" ", "");
        comienzo=espacios.length()-2;
        System.out.print("c) ");
        System.out.println(espacios.substring(comienzo));
    }
    public static void apartD(String nombre) {
        char ultima;
        int contador=0;
        String minusculas;
        minusculas=nombre.toLowerCase();
        ultima=minusculas.charAt(minusculas.length()-1);
        for (int i=0;i<minusculas.length();i++) {
            if (ultima==minusculas.charAt(i)) {
                contador++;
            }
        }
        System.out.println("d) La ultima letra ("+ultima+") se repite "+contador+" veces");
    }
    public static void apartE(String nombre) {
        char primera;
        String minusculas, mayus;
        minusculas=nombre.toLowerCase();
        primera=minusculas.charAt(0);
        mayus=nombre.replace(primera, Character.toUpperCase(primera));
        System.out.println("e) "+mayus);
    }
    public static void apartF(String nombre) {
        System.out.println("f) ***"+nombre+"***");
    }
    public static void apartG(String nombre) {
        System.out.print("g) ");
        for (int i=nombre.length()-1;i>=0;i--) {
            System.out.print(nombre.charAt(i));
        }
    }
}