import java.util.Scanner;
public class Estructura2 {
    public static void main(String args[]) {
        String frase;
        int[] vocCon;
        frase=pedirFrase();
        vocCon=contarCon(frase);
        System.out.println("Hay "+vocCon[0]+" vocales y "+vocCon[1]+" consonantes");
    }
    public static String pedirFrase() {
        Scanner lector = new Scanner(System.in);
        String frase, fMinuscula, fEspacios;
        System.out.println("Escriba la frase");
        frase=lector.nextLine();
        fEspacios=frase.replace(" ", "");
        fMinuscula=fEspacios.toLowerCase();
        return fMinuscula;
    }
    public static int[] contarCon(String frase) {
        int totalVo=0;
        int totalCo=0;
        char letraAct;
        char[] vocales={'a','e','i','o','u',};
        char[] consonante={'q','w','e','r','t','y','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        int[] voCo = new int[2];
        for (int i=0;i<frase.length();i++) {
            letraAct=frase.charAt(i);
            for (int j=0;j<vocales.length;j++) {
                if (letraAct==vocales[j]) {
                    totalVo++;
                }
            }
            for (int k=0;k<consonante.length;k++) {
                if (letraAct==consonante[k]) {
                    totalCo++;
                }
            }
        }
        voCo[0]=totalVo;
        voCo[1]=totalCo;
        return voCo;
    }
}