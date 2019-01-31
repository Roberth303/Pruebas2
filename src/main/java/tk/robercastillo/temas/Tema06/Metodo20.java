import java.util.Scanner;
public class Metodo20 {
    public static void main(String args[]) {
        String fecha, numSuerte;
        int resultado;
        fecha=pedirFecha();
        resultado=sumaNumeros(fecha);
        while(resultado>9) {
            numSuerte=Integer.toString(resultado);
            resultado=sumaNumeros(numSuerte);
        }
        System.out.println("Su numero de la suerte es: "+resultado);
    }
    public static String pedirFecha() {
        Scanner lector = new Scanner(System.in);
        String fecha;
        int dia, mes, ano;
        do {
            do {
            System.out.println("Introduce la fecha en el siguiente formato: dd-mm-aaaa");
            fecha=lector.next();
            lector.nextLine();
            }while (fecha.length()!=10);
        dia=conversion(fecha, 0, 2);
        mes=conversion(fecha, 3, 5);
        ano=conversion(fecha, 6, 10);
        }while (dia<1||dia>32||mes<1||mes>12||ano<1900||ano>2050);
        return fecha;
    }
    public static int conversion(String fecha, int empiezaEn, int acabaEn) {
        String devolucion;
        int devolucionInt;
        devolucion=fecha.substring(empiezaEn,acabaEn);
        devolucionInt=Integer.parseInt(devolucion);
        return devolucionInt;
    }
    public static int sumaNumeros(String numSuma) {
        char suma;
        Boolean digito;
        int resultado=0;
        int num;
        int i;
        int longitud=numSuma.length();
        for (i=0;i<longitud;i++) {
            suma=numSuma.charAt(i);
            digito=Character.isDigit(suma);
            if (digito==true) {
                num=Character.getNumericValue(suma);
                resultado=resultado+num;
            }else {
                ;
            }
        }
        return resultado;
    }
}