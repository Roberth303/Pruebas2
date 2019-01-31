import java.util.Scanner;
public class Metodo2 {
    final static float pi=3.14f;
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        float radio;
        System.out.println("Escribe el radio:");
        radio=lector.nextFloat();
        lector.nextLine();
        System.out.println("El area de un circulo de radio "+radio+" es "+area(radio)+" y un perimetro de "+perimetro(radio));
   
    }
    static float area(float radio) {
        return pi*(radio*radio);
    }
    static float perimetro(float radio){
        return 2*pi*radio;
    }
}