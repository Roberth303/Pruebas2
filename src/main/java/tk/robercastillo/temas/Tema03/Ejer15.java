import java.util.Scanner;
public class Ejer15 {
	
	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		float celcius;
		float fah;
		float kelvin;
		System.out.println("Introduzca la temperatura en grados centigrados:");
		celcius=lector.nextFloat();
		kelvin=273.15f+celcius;
		fah=celcius*(9/5)+32;
		System.out.println("La temperatura es de "+celcius+"ºC");
		System.out.println("La temperatura en Kelvin es de "+kelvin+"K");
		System.out.println("La temperatura en Fahrenheit es de "+fah+"F");
	}
	
	
	
	
	
}
