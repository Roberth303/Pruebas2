import java.util.Scanner;
public class Ejer13 {
	public static void main(String args[]) {
			Scanner lector = new Scanner(System.in);
			int lsegundos;
			int segundos;
			int minutosex;
			int horasex;
			int diasex;
			int minutos;
			int horas;
			System.out.println("Introduzca un numero:");
			lsegundos=lector.nextInt();
			segundos=lsegundos%60;
			minutos=lsegundos/60;
			minutosex=minutos%60;
			horas=minutos/60;
			horasex=horas%24;
			diasex=horas/24;
			System.out.println("El tiempo "+lsegundos+"seg equivale a: "+diasex+" dia/s "+horasex+" horas "+minutosex+" minutos "+segundos+" segundos");
	}
}
