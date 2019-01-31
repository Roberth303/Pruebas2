/*import java.util.Scanner;
public class Prueba {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        //Numero introducido
        float solicitado;
        //Variables de operacion
        float aDevolverEnteroQ;
        float aDevolverEnteroR;
        //Variables para quitar los decimales
        int sinDecimal;
        int sinDecimal2;
        //Variables para sacar las partes decimales
        float parteDecimal;
        int extractorDecimal;
        //Variables para los centimos a devolver
        int resto;
        int cent50;
        int cent20;
        int cent10;
        int cent5;
        int cent2;
        int cent1;
        System.out.println("Introduce una cantidad de Euros");
        solicitado=lector.nextFloat();
        aDevolverEnteroQ=solicitado/2;
        aDevolverEnteroR=solicitado%2;
        //Quitando los decimales
        sinDecimal=(int)aDevolverEnteroQ;
        extractorDecimal=(int)aDevolverEnteroR;
        parteDecimal=(aDevolverEnteroR-extractorDecimal)*100;
        sinDecimal2=(int)parteDecimal;
        //Sacando los centimos
        cent50=sinDecimal2/50;
        resto=sinDecimal2%50;
        cent20=resto/20;
        resto=resto%20;
        cent10=resto/10;
        resto=resto%10;
        cent5=resto/5;
        resto=resto%5;
        cent2=resto/2;
        resto=resto%2;
        cent1=resto;     
        System.out.println("La cantidad a devolver son de "+sinDecimal+" monedas de 2 euros y "+extractorDecimal+" monedas de 1 euro");
        System.out.println("Con "+cent50+" monedas de 50 cent, "+cent20+" monedas de 20cent, "+cent10+" monedas de 10cent, "+cent5+" monedas de 5cent, "+cent2+" monedas de 2cent y "+cent1+" monedas de 1cent");      
    }
}*/