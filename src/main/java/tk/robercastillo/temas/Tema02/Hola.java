public class Hola  {

	public static void main(String args[]) {
		int x;
		x=5;
		System.out.println(x);
		System.out.println("Hola mundo");
		System.out.println("Hola de nuevo");
		Ladrar();
		System.out.println(unNumero());
	}
	//hola esto es un comentario
	/*Esto es un comentario
	 *que no acaba hasta que se cierre
	 */
	static void Ladrar() {
		System.out.println("Miau");
	}

	static int unNumero() {
		return 3;
	}



}
