import java.util.Scanner;
public class Bucle7 {
    public static void main(String args[]) {
        Scanner lector=new Scanner(System.in);
        float num;
        int exp;
        int contador=1;
        float resultado;
        System.out.println("Introduce el numero");
        num=lector.nextFloat();
        lector.nextLine();
        resultado=num;
        System.out.println("Introduce el exponente");
        exp=lector.nextInt();
        lector.nextLine();
        if  (exp>0) { 
            while (contador<exp) {
                resultado=resultado*num;
                contador++;
            }
        }else if (exp<0) {
            while (contador>exp) {
                resultado=resultado/num;
                contador--;
            }
        }else if (num==0 && exp==0) {
            resultado = 0;
        }else {
            resultado = 1;
        }
        System.out.println(num+" elevado a "+exp+" = "+resultado);
    }
}