import java.util.Scanner;
public class Ejer12 {

	public static void main(String args[]) {
	
	Scanner lector = new Scanner(System.in);
	float num1;
	float num2;
	System.out.println("Intrduzca el dividendo");
	num1=lector.nextInt();
	System.out.println("Introduzca el divisor");
	num2=lector.nextInt();
	float prov=num1/num2;
	System.out.println("El resultado de la division de "+num1+" entre "+num2+" = "+prov);




	}




}
