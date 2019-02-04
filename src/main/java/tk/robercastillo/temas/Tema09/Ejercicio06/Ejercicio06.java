package tk.robercastillo.temas.Tema09.Ejercicio06;

public class Ejercicio06 {
    public Ejercicio06() {
        int[] numeros = {-2,-1,0,1,2};
        int divisor=2;
        dividirArrayA(divisor,numeros);
        dividirArrayB(divisor,numeros);



    }
    private static void dividirArrayA(int divisor, int[] numeros) {

        for (int i=0;i<numeros.length;i++) {
            try {
                System.out.println(divisor+" / "+numeros[i]+" = "+(divisor/numeros[i]));
            }
            catch (ArithmeticException ae) {
                System.out.println("No se puede dividir entre 0");
            }
        }
    }    private static void dividirArrayB(int divisor, int[] numeros) {

        for (int i=0;i<numeros.length;i++) {
            if(numeros[i]!=0) {
                System.out.println(divisor+" / "+numeros[i]+" = "+(divisor/numeros[i]));
            }
        }
    }
}
