import java.util.Scanner;
public class Metodo19 {
    public static void main(String args[]) {
        boolean verificacion;
        String NIF;
        NIF=obtenerNIF();
        verificacion=verificar(NIF);
        if (verificacion==true) {
            System.out.println("Su NIF es: correcto");
        }else {
            System.out.println("Su NIF es: incorrecto");
        }

    }
    public static String obtenerNIF() {
        Scanner lector = new Scanner(System.in);
        String NIF;
        System.out.println("Introduzca su NIF:");
        NIF=lector.next();
        return NIF;
    }
    public static boolean verificar(String NIF) {
        String letraNIFUniversal="TRWAGMYFPDXBNJZSQVHLCKE";
        int puestoLetra, numDNI;
        String numNIFIntro="";
        String letraIntro="";
        String letraNIFReal;
        Character letraUniv;
        boolean validar;
        int longitud=NIF.length();
        char caractBucle;
        boolean numerNIF;
        for (int i= 0; i<longitud; i++) {
            caractBucle=NIF.charAt(i);
            numerNIF=Character.isDigit(caractBucle);
            if (numerNIF==true) {
                numNIFIntro=numNIFIntro+caractBucle;
            }else {
                letraIntro=letraIntro+caractBucle;
            }
        }
        numDNI=Integer.parseInt(numNIFIntro);
        puestoLetra=numDNI%23;
        letraUniv=letraNIFUniversal.charAt(puestoLetra);
        letraNIFReal=letraUniv.toString();
        validar=letraIntro.equalsIgnoreCase(letraNIFReal);
        if (validar==true) {
            return true;
        }else {
            return false;
        }
    }
}