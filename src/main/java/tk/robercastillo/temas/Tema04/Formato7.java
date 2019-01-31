public class Formato7 {
    public static void main(String args[]) {
        String acumulador = "";
        String acumulador2="";
        for (int i=1; i<10; i++) {
            acumulador=acumulador+i;
            acumulador2=i+acumulador2;
            System.out.printf("%9s%-9s\n",acumulador, acumulador2);
        }
    }
}