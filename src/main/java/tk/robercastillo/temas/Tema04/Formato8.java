public class Formato8 {
    public static void main(String args[]) {
        int colortexto=0;
        int colorfondo=0;
        int negrita=0;
        int contador;
        for (contador=0;contador<128;contador++) {
            System.out.printf("\u001B["+negrita+";3"+colortexto+";4"+colorfondo+"m "+negrita+";3"+colortexto+";4"+colorfondo+" \u001B[0m");
            colorfondo++;
            if (colorfondo>7) {
                System.out.printf("%n");
                colorfondo=0;
                colortexto++;
                if (colortexto>7) {
                    colortexto=0;
                    negrita++;
                }
            } 
        }
    }
}