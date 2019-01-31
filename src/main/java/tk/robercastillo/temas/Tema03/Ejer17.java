import java.util.Scanner;
public class Ejer17 {
	public static void main(String args[]) {
		Scanner lector = new Scanner(System.in);
		float precio;
		float pagado;
		float kilometros;
		float precio2;
		float pagado2;
		float kilometros3;
		float litros1;
		float litros2;
		float viaje;
		float total;
		float total2;
		System.out.println("De la primera parada necesitamos saber 3 cosas:");
		System.out.println("A cuanto estaba el precio del combustible?");
		precio=lector.nextFloat();
		System.out.println("Cuanto ha pagado para llenar el deposito?");
		pagado=lector.nextFloat();
		System.out.println("Cuanto marcaba el cuentakilometros en ese momento?");
		kilometros=lector.nextFloat();
		System.out.println("De la segunda parada necesitamos 2 cosas:");
		System.out.println("Cuanto ha costado el combustible?");
		precio2=lector.nextFloat();
		System.out.println("Cuanto ha pagado para llenar el deposito?");
		pagado2=lector.nextFloat();
		System.out.println("De la ultima parada solo se solicita 1 cosa");
		System.out.println("Cuanto marcaba el cuentakilometros?");
		kilometros3=lector.nextFloat();
		litros1=pagado/precio;
		viaje=kilometros3-kilometros;
		litros2=pagado2/precio2;
		total=viaje/(litros2+litros1);
		total2=(litros1+litros2)/viaje;
		System.out.println("El coche ha consumido en 100km "+total+"l y en 1km consume "+total2+"ml");
		





	}
}
