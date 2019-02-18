package tk.robercastillo.temas.Tema09.Ejercicio11;

import java.util.Random;
import java.util.Scanner;

public class Gestion {
    private static Alumno gAlumnos[] = new Alumno[100];
    private static int puntero=0;
    public Gestion() {


        int opcion;

        menu();
        opcion=elegir(0,3);
        switch (opcion) {
            case 1:
                crearAlumno();
                break;
            case 2:
                //bajaAlumno();
                break;
            case 3:
                //consulta();
                break;
            case 0:
                break;
        }

    }
    private static void crearAlumno() {

    }
    private static int elegir(int min, int max) {
        Scanner lec = new Scanner(System.in);
        int devolver=0;
        boolean isError;
        do{
            try {
                devolver=Integer.parseInt(lec.nextLine());
                isError=false;
            }catch(NumberFormatException nfe) {
                System.out.println("Solo se admiten numeros del "+min+" al "+max);
                isError=true;
            }
            if (devolver<min || devolver>max) {
                System.out.println("Solo se admiten numeros del "+min+" al "+max);
            }
        }while(isError || devolver<min || devolver>max);
        return devolver;
    }
    private static void menu() {
        System.out.println("************************");
        System.out.println("** GESTION DE ALUMNOS **");
        System.out.println("************************");
        System.out.println("\n1. Nuevo alumno ...");
        System.out.println("2. Baja de alumnos ...");
        System.out.println("3. Consultas ...");
        System.out.println("\n------------------------");
        System.out.println("\n0. Salir");
    }
}
