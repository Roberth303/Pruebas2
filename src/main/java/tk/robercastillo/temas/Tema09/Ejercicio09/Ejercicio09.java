package tk.robercastillo.temas.Tema09.Ejercicio09;

public class Ejercicio09 {
    public Ejercicio09() {
        String[] cadena = {"Hola",null,"RJLJ"};
        int x = 2;
        int y = 0;
        try {
            for (int i=0;i<=cadena.length;i++) {
                try {
                    System.out.println(cadena[i].charAt(0));
                }catch (NullPointerException nu) {
                    throw (nu);
                }

            }
        }catch (IndexOutOfBoundsException io) {
            throw (io);
        }
        try {
            System.out.println(x+" / "+y+" = "+(x/y));
        }catch (ArithmeticException ae) {
            throw (ae);

        }
    }

}
