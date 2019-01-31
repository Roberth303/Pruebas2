public class Ejer10 {

	public enum Meses{ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
	public enum Musica {DO, RE, MI, FA, SOL, LA, SI}
	public enum Notas {INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE}
	public static void main(String args[]) {
		Meses mes = Meses.SEPTIEMBRE;
		Musica mus = Musica.RE;
		Notas not = Notas.BIEN;
		System.out.println("El mes es "+mes);
		System.out.println("Una nota musical es "+mus);
		System.out.println("Sacar un 6 en un examen es un  "+not);


	}

}

