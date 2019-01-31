import java.util.Scanner;
public class Ejer7 {
    public static void main(String args[]) {
        Scanner lector= new Scanner(System.in);
        int edad;
        String si;
        final int cuotaBase=500;
        int descuento;
        int pagar;
        System.out.println("Introduce tu edad:");
        edad=lector.nextInt();
        lector.nextLine();
        if (edad > 65) {
            descuento=cuotaBase*50/100;
            pagar=cuotaBase-descuento;
            System.out.println("Tiene que pagar "+pagar+" euros/mes");
        }else if (edad <18) {
            System.out.println("Tus padres son socios?");
            si=lector.nextLine();
            if (si.equals ("Si") || si.equals("si") || si.equals("s") || si.equals("S") ) {
                descuento=(cuotaBase*35)/100;
                pagar=cuotaBase-descuento;
                System.out.println("Tiene que pagar "+pagar+" euros/mes");
            }else {
                descuento=(cuotaBase*25)/100;
                pagar=cuotaBase-descuento;
                System.out.println("Tiene que pagar "+pagar+" euros/mes");
            }
        }else {
            System.out.println("Tiene que pagar "+cuotaBase+" euros/mes");
        }
    }
    
}