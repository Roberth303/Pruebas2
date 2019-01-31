import java.util.Random;
public class Metodo11 {
    public static void main(String args[]) {
        int numPartido=1;
        for (int i=0;i<15;i++) {
            System.out.println("Partido "+numPartido+":\t"+resultadoQui());
            numPartido++;
        }
    }
    public static char resultadoQui() {
        int numAleatorio;
        int numMin=1;
        int numMax=3;
        numAleatorio=aleatorio(numMax, numMin);
        if (numAleatorio==1) {
            return '1';
        }else if (numAleatorio==2) {
            return '2';
        }else {
            return 'X';
        }
    }
    public static int aleatorio(int max, int min) {
        Random r = new Random();
        int num;
        num=r.nextInt(max-min+1)+min;
        return num;
    }
}