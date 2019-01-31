import java.util.Scanner;
public class Ejer3 {
	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		int edad;
		System.out.println("Pon tu edad:");
		edad=lector.nextInt();
		lector.nextLine();
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}
	}
}