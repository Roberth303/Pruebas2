public class Bucle5 {
    public static void main(String args[]) {
        int numeros=1 ;
        int calculo;
        int calculo5;
        int contImp=0;
        int contPar=0;
        int contMult=0;
        int totPar=0;
        int totImp=0;
        int totMult=0;
        String nombre;
        String multiple;
        while (numeros<=100) {
            calculo=numeros%2;
            calculo5=numeros%5;
            if (calculo!=0) { 
                nombre="Es impar";
                contImp++;
                totImp=totImp+numeros;
            }else {
                nombre="Es par";
                contPar++;
                totPar=totPar+numeros;
            }             
            if (calculo5==0) {
                multiple="y multiple de 5";
                System.out.println(numeros+" "+nombre+" "+multiple);
                contMult++;
                totMult=totMult+numeros;
            }else {
                System.out.println(numeros+" "+nombre);
            }
            numeros++;
        }
        System.out.println("Tenemos un total de "+contImp+" numeros impares que hace un total de "+totImp);
        System.out.println("Tenemos un total de "+contPar+" numeros pares que hace un total de "+totPar);
        System.out.println("Tenemos un total de "+contMult+" numeros multiples de 5 que hace un total de "+totMult);
    }
}