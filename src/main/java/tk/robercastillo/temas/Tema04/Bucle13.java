import java.util.Random;
public class Bucle13 {
    public static void main(String args[]) {
        Random r = new Random();
        int cara=0;
        int cruz=0;
        int random;
        int porcentajeCa;
        int porcentajeCr;
        for (int i=0;i<=1000000;i++) {
            random = r.nextInt(2);
            if (random==0) {
                cara++;
            }else {
                cruz++;
            }
        }
        porcentajeCa=(cara*100)/1000000;
        porcentajeCr=(cruz*100)/1000000;
        System.out.println("Hay un "+porcentajeCa+"% de caras, y un "+porcentajeCr+"% de cruz");
    }
}