public class Formato5 {
    public static void main(String args[]) {
        String acumulador = "";
        int color =0;
        for (int i = 1; i<10; i++) { 
            acumulador+=i;
            System.out.printf("\u001B[0;3"+ color +"m %9s \u001B[0m\n", acumulador);
            color++;
            if (color >=8) {
                color=0;
            }
        }
    }
}