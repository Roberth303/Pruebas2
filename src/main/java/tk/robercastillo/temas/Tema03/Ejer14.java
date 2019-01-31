import java.util.Scanner;
public class Ejer14 {
	public static void main(String args[]) {
			Scanner lector= new Scanner(System.in);
			float radio;
			final float PI=3.1415f;
			float area;
			float perimetro;
			System.out.println("Indique el radio de la circunferencia:");
			radio=lector.nextFloat();
			area=PI*(radio*radio);
			perimetro=2*radio*PI;
			System.out.println("El area de este circulo es de "+area+"m^2");
			System.out.println("El perimetro de este circulo es de "+perimetro+"m");
	}
}
