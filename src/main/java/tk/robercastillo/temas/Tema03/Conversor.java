import java.util.Scanner;
public class Conversor {
	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		float euros;
		float libra;
		float dolar;
		System.out.println("Introduce una cantidad de euros");
		euros=lector.nextFloat();
		libra=euros*0.89f;
		dolar=euros*1.18f;
		System.out.println("Tenemos "+euros+"€ que son "+libra+" libras");
		System.out.println("Tenemos "+euros+"€ que son "+dolar+" dolares");
	}

}
