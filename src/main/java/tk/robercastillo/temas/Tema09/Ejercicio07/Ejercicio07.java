package tk.robercastillo.temas.Tema09.Ejercicio07;

public class Ejercicio07 {
    public Ejercicio07() {
        String[] cadenas = {"hola",null,"adios"};
        mostrarCadenasArray(cadenas);
    }
    private static void mostrarCadenasArray(String[] cadenas) {
        for (int i=0;i<cadenas.length;i++) {
            if(cadenas[i]!=null) {
                System.out.println(cadenas[i].charAt(0));
            }
        }
    }
}
