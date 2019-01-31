import java.util.Scanner;

public class Dias {
	public static void main(String args[]) {
		
			Scanner lector = new Scanner(System.in);
			int edad;
			int dias;
			System.out.println("Introduzca una edad y pulse enter.");
			edad=lector.nextInt();
			dias=edad*365;
			System.out.println("Una persona de "+edad+" años tiene "+dias+" dias de vida");
	}
}