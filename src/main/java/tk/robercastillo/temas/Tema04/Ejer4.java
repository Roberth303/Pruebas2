import java.util.Scanner;
public class Ejer4 {
	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		float num1;
		float num2;
		System.out.println("Introduce un numero 1");
		num1=lector.nextFloat();
		lector.nextLine();
		System.out.println("Introduce el numero 2");
		num2=lector.nextFloat();
		lector.nextLine();
		if (num1>num2) {
			System.out.println(num1+">"+num2);
		} else {
			System.out.println(num2+">"+num1);
		}
	}
}