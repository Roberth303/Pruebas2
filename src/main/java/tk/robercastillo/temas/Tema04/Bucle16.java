import java.util.Scanner;
import java.util.Random;
public class Bucle16 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        Random r = new Random();
        int numRandom;
        int eleccion;
        int totalJ;
        int totalM;
        int puntJugador;
        int puntMaquina;
        int ronda;
        int continuar;

        System.out.println("Bienvenido al Blackjack con dados v.0.53.07 Open Beta");
        //Validacion
        do { 
            System.out.println("\t1.Jugar 2.Instrucciones 3.Salir");
            eleccion=lector.nextInt();
            lector.nextLine();
        }while (eleccion<1 || eleccion>3);
        if (eleccion==1) {
            do {
                //Reseteo de valores(para partida nueva)
                ronda=1;
                totalJ=0;
                totalM=0;
                puntJugador=0;
                puntMaquina=0;
                do {
                    System.out.println("---Ronda "+ronda+"---");
                    System.out.println("---Puntuacion--- J-M ("+puntJugador+"-"+puntMaquina+")");
                    //Turno Jugador
                    do {
                        numRandom=r.nextInt(6-1)+1;
                        totalJ=totalJ+numRandom;
                    
                        System.out.println("---Has sacado un "+numRandom+"!!!---");
                        System.out.println("||| Tienes un total de "+totalJ+" |||");
                        if (totalJ<11) {
                            //Validacion
                            do {
                                System.out.println("1.Volver a tirar 2.Plantarse");
                                eleccion=lector.nextInt();
                                lector.nextLine();
                            }while(eleccion<1||eleccion>2);
                        }else if (totalJ>11) {
                            System.out.println("Te has pasado!!! +1 punto para la maquina");
                            puntMaquina++;
                            totalJ=0;
                            ronda++;
                            System.out.println("Ronda "+ronda);
                            System.out.println("---Puntuacion--- J-M ("+puntJugador+"-"+puntMaquina+")");

                        }else {
                            System.out.println("Perfectt, Te llevas 1 punto + 1 de bonificacion");
                            puntJugador+=2;
                            totalJ=0;
                            ronda++;
                            System.out.println("Ronda "+ronda);
                            System.out.println("---Puntuacion--- J-M ("+puntJugador+"-"+puntMaquina+")");
                        }
                    }while (eleccion!=2 && puntJugador<5 && puntMaquina<5);
                    //Turno  Maquina
                    while (eleccion==2 && totalM<11 && totalM<totalJ) {
                        numRandom=r.nextInt(6-1)+1;
                        totalM=totalM+numRandom;
                        
                        if (totalM>11) {
                            System.out.println("La maquina se ha pasado de lista, ganas 1 punto");
                            puntJugador++;
                        }else if (totalM==11){
                            System.out.println("La maquina ha sacado un perfecto "+totalM+", +2 puntos para la maquina");
                            puntMaquina+=2;
                        }else if (totalM>totalJ) {
                            System.out.println("-.-La maquina ha ganado con un total de "+totalM+"-.-");
                            puntMaquina++;
                        }else if (totalM==totalJ) {
                            System.out.println("La maquina ha ganado al empatar al jugador"+totalM);
                            puntMaquina++;
                        }else {
                            System.out.println("La maquina tiene un total de "+totalM);
                        }
                    }
                    //Reseteo siguiente ronda
                    ronda++;
                    totalJ=0;
                    totalM=0;
                }while (puntJugador<5 && puntMaquina<5);
                //Ganador
                if (puntJugador>=5) {
                    System.out.println("Ha ganado el jugador con "+puntJugador+" puntos");
                }else {
                    System.out.println("Ha ganado la maquina con "+puntMaquina+" puntos");
                }
                //Validacion
                do {
                System.out.println("Otra partida?\t1.Si\t2.No");
                continuar=lector.nextInt();
                lector.nextLine();
                }while (continuar<1||continuar>2);
            }while (continuar==1);
        }else if (eleccion==2) {
            System.out.println("En este juego iras tirando los dados, hasta llegar o aproximarte al 11.\nSi te pasas la maquina ganara automaticamente, en cambio si haces 11 exactos ganaras 1 punto de bonificacion.\nGana el primero en conseguir 5 puntos.");
        }else {
            ;
        }
    }
}