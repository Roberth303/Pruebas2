public class Formato3 {
    public static void main(String args[]) {
        String acumulador = "";
        for (int i=1; i<10; i++) {
            acumulador=acumulador+i;
            System.out.printf("%9s\n",acumulador);
        }
    }
}