import java.util.Scanner;
import java.util.Random;
public class Metodo21 {
    public static Scanner lector = new Scanner(System.in);
    public static Random r = new Random();
    public static void main(String args[]) {
        int eleccion;
        String ganador;
        boolean continuar;
        eleccion=elegirOpcion();
        if (eleccion==1) {
            do {
                ganador=partida();
                continuar=mensfinal(ganador);
            }while (continuar==true);
        }else if (eleccion==2) {
            instrucciones();
        }else {
            ;
        }
    }
    public static int elegirOpcion() {
        int eleccion;
        do {
            System.out.println("Bienvenido al Blackjack con dados v.0.53.07 Cutre Beta");
            System.out.println("\t1.Jugar 2.Instrucciones 3.Salir");
            eleccion=lector.nextInt();
            lector.nextLine();
        }while (eleccion<1 || eleccion>3);
        return eleccion;
    }
    public static String partida() {
        int puntJugador=0;
        int puntMaquina=0;
        int tirarDado;
        int eleccion=1;
        int ronda=1;
        String ganador;
        do {
            tirarDado=0;
            ronda=infPartida(puntJugador, puntMaquina, ronda);
            do {
                tirarDado=numRandomDado(tirarDado);
                if (tirarDado<11) {
                    eleccion=volverTirar();
                }
            }while (tirarDado<11 && eleccion!=2);
            if (tirarDado==11) {
                puntJugador+=2;
                mensGanarRonda(tirarDado);
            }else if (tirarDado>11) {
                puntMaquina++;
                mensPerderRonda();
            }else {
                if (tirarMaquina(tirarDado)==true) {
                    puntMaquina++;
                    mensPerderRonda();
                }else {
                    puntJugador++;
                    mensGanarRonda(tirarDado);
                }
            }
        }while (puntJugador<5 && puntMaquina<5);
        if (puntJugador>=5) {
            return ganador="Has ganado";
        }else {
            return ganador="Ha ganado la maquina";
        }
    }
    public static boolean tirarMaquina(int resJugador) {
        int resultadoMaquina=0;
        boolean ganar;
        do {
            resultadoMaquina=resultadoMaquina+r.nextInt(6-1)+1;
        }while (resultadoMaquina<resJugador);
        if (resultadoMaquina>=resJugador && resultadoMaquina<=11) {
            ganar=true;
            System.out.println("La Maquina tiene "+resultadoMaquina);
        }else {
            ganar=false;
            System.out.println("La Maquina tiene "+resultadoMaquina);
        }
        return ganar;
    }
    public static int volverTirar() {
        int elegir;
        do {
            System.out.println("1.Tirar 2.Plantarse");
            elegir=lector.nextInt();
            lector.nextLine();
        }while (elegir<1 || elegir>2);
        return elegir;
    }
    public static int numRandomDado(int total) {
        int resultado;
        resultado=r.nextInt(6-1)+1;
        total=total+resultado;
        infJugada(resultado, total);
        return total;
    }
    public static int infPartida(int puntJugador, int puntMaquina, int ronda) {
        System.out.println("---RONDA "+ronda+"---");
        System.out.println("---Puntuacion J-M: ("+puntJugador+"-"+puntMaquina+")");
        ronda++;
        return ronda;
    }
    public static void infJugada(int numDado, int numTotal) {
        System.out.println("Has sacado: "+numDado);
        System.out.println("Tienes un total de: "+numTotal);
    }
    public static boolean mensfinal(String ganador) {
        int eleccion;
        System.out.println(ganador);
        do {
            System.out.println("Quieres jugar otra vez\t1.Si 2.No");
            eleccion=lector.nextInt();
            lector.nextLine();
        }while (eleccion<1||eleccion>2);
        return eleccion==1;
    }
    public static void instrucciones() {
        System.out.println("En este juego iras tirando los dados, hasta llegar o aproximarte al 11.\nSi te pasas la maquina ganara automaticamente, en cambio si haces 11 exactos ganaras 1 punto de bonificacion.\nGana el primero en conseguir 5 puntos.");
    }
    public static void mensGanarRonda(int punt) {
        System.out.println("Has ganado sacando "+punt);
    }
    public static void mensPerderRonda() {
        System.out.println("Has perdido esta ronda");
    }
}
//Thread.sleep(arg0);
