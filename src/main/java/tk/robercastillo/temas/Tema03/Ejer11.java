import java.util.Scanner;
public class Ejer11 {

	public static void main(String args[]) {
	
	Scanner lector = new Scanner(System.in);
	float num1;
	float num2;
	System.out.println("Intrduzca el minuendo");
	num1=lector.nextFloat();
	System.out.println("Introduzca el sustraendo");
	num2=lector.nextFloat();
	float res=num1-num2;
	System.out.println("El resultado de la resta de "+num1+" menos "+num2+" = "+res);




	}




}
