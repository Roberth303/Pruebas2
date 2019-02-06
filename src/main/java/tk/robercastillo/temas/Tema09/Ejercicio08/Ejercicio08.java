package tk.robercastillo.temas.Tema09.Ejercicio08;

public class Ejercicio08 {
    public Ejercicio08() {
        String[] cadena = {"Hola",null,"RJLJ"};
        int x = 2;
        int y = 0;
        try {
            for (int i=0;i<=cadena.length;i++) {
                try {
                    System.out.println(cadena[i].charAt(0));
                }catch (NullPointerException nu) {
                    System.out.println("El Error:");
                    nu.printStackTrace();
                    System.out.println("ha sido tratado");
                }

            }
        }catch (IndexOutOfBoundsException io) {
            System.out.println("El Error:");
            io.printStackTrace();
            System.out.println("ha sido tratado");
        }
        try {
            System.out.println(x+" / "+y+" = "+(x/y));
        }catch (ArithmeticException ae) {
            System.out.println("No se puede dividir "+x+" entre "+y);
            System.out.println("El Error:");
            ae.printStackTrace();
            System.out.println("ha sido tratado");

        }
    }
}
