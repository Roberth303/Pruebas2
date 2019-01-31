public class Bucle4 {
    public static void main(String args[]) {
        int contador=0;
        for (int i=1;i<=100;i+=2) {
            System.out.println(i);
            contador++;
        }
        System.out.println("Hay un total de "+contador+" numeros impares");
    }  
}