import java.util.Random;
public class Bucle14 {
    public static void main(String args[]) {
        Random r = new Random();
        float d1=0, d2=0, d3=0, d4=0, d5=0, d6=0;
        int random;
        float porD1, porD2, porD3, porD4, porD5, porD6;
        for (int i=0;i<=1000000;i++) {
            random = r.nextInt(6);
            if (random==0) {
                d1++;
            }else if (random==1) {
                d2++;
            }else if (random==2) {
                d3++;
            }else if (random==3) {
                d4++;
            }else if (random==4) {
                d5++;
            }else {
                d6++;
            }
        }
        porD1=(d1*100)/1000000;
        porD2=(d2*100)/1000000;
        porD3=(d3*100)/1000000;
        porD4=(d4*100)/1000000;
        porD5=(d5*100)/1000000;
        porD6=(d6*100)/1000000;

        System.out.println("La cara 1 del dado ha salido un total de "+d1+" veces, es un "+porD1+"% del total");
        System.out.println("La cara 2 del dado ha salido un total de "+d2+" veces, es un "+porD2+"% del total");
        System.out.println("La cara 3 del dado ha salido un total de "+d3+" veces, es un "+porD3+"% del total");
        System.out.println("La cara 4 del dado ha salido un total de "+d4+" veces, es un "+porD4+"% del total");
        System.out.println("La cara 5 del dado ha salido un total de "+d5+" veces, es un "+porD5+"% del total");
        System.out.println("La cara 6 del dado ha salido un total de "+d6+" veces, es un "+porD6+"% del total");

    }
}