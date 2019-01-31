import java.util.Scanner;
public class Formato9 {
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        String ciudad;
        int dia, mes, ano;
        int hora, minutos, segundos;
        int velViento;
        float temperatura;
        float pAtmosferica;
        int lluvia;
        int radiacion;

        String infoCiudad = "Ciudad:";
        String infoFecha = "Fecha:";
        String infoHora = "Hora:";
        String infoViento = "Velocidad Viento:";
        String infoTemp = "Temperatura:";
        String infoAtmosferica = "Presion atmosferica:";
        String infoLluvia = "Probabilidad Lluvia:";
        String infoRadiacion = "UVI:";

        //Ciudad
        System.out.println("Introduzca la ciudad:");
        ciudad=lector.next();
        lector.nextLine();

        //Fecha
        System.out.println("Introduce la fecha:");
        do {
            System.out.println("***Dia***");
            dia=lector.nextInt();
            lector.nextLine();
        }while (dia<1 || dia>31);
        do {
            System.out.println("***Mes***");
            mes=lector.nextInt();
            lector.nextLine();
        }while (mes<1 || mes>12);
        do {
            System.out.println("***Año***");
            ano=lector.nextInt();
            lector.nextLine();
        }while (ano<1500 || ano>3000);

        //Horas
        System.out.println("Introduce la Hora:");
        do {
            System.out.println("***Horas***");
            hora=lector.nextInt();
            lector.nextLine();
        }while (hora<1 || hora>24);
        do {
            System.out.println("***Minutos***");
            minutos=lector.nextInt();
            lector.nextLine();
        }while (minutos<1 || minutos>60);
        do {
            System.out.println("***Segundos***");
            segundos=lector.nextInt();
            lector.nextLine();
        }while (segundos<1 || segundos>60);

        //Velocidad del viento
        System.out.println("Introduce la velocidad del viento (km/h)");
        velViento=lector.nextInt();
        lector.nextLine();

        //Temperatura
        System.out.println("Introduce la Temperatura (Cº)");
        temperatura=lector.nextFloat();
        lector.nextLine();

        //Presion atmosferica
        System.out.println("Introduce la Presion atmosferica (hPa)");
        pAtmosferica=lector.nextFloat();
        lector.nextLine();

        //Probabilidad Lluvia
        do {
            System.out.println("Introduce el % de la probabilidad de lluvia (0-100)");
            lluvia=lector.nextInt();
            lector.nextLine();
        }while (lluvia<0 || lluvia>100);

        //Radiacion Ultravioleta
        System.out.println("Introduce la Radiacion Ultravioleta");
        radiacion=lector.nextInt();
        lector.nextLine();

        //Relleno
        System.out.println("Pulse Enter para mostrar Interfaz");
        lector.nextLine();

        //Salida interfaz
        System.out.printf("\u001B[1J\u001B[H");
        System.out.printf("\u001B[1;30;44m** DATOS ESTACION METEREOLOGICA **\u001B[0m%n");
        System.out.printf("%-23s%s%n",infoCiudad ,ciudad);
        System.out.printf("%-23s%02d/%02d/%04d%n",infoFecha, dia, mes, ano );
        System.out.printf("%-23s%02d:%02d:%02d%n",infoHora , hora, minutos, segundos);
        //Viento color
        if (velViento<30) { 
            System.out.printf("%-23s\u001B[0;32m%d\u001B[0m km/h%n",infoViento ,velViento);
        }else if (velViento>=30 && velViento<60) { 
            System.out.printf("%-23s\u001B[0;33m%d\u001B[0m km/h%n",infoViento ,velViento);
        }else {
            System.out.printf("%-23s\u001B[0;31m%d\u001B[0m km/h%n",infoViento ,velViento);
        }
        //Temperatura color
        if (temperatura<22) { 
            System.out.printf("%-23s\u001B[0;34m%.2f\u001B[0m Cº%n",infoTemp ,temperatura);
        }else if (temperatura>=22 && temperatura<27) { 
            System.out.printf("%-23s\u001B[0;32m%.2f\u001B[0m Cº%n",infoTemp ,temperatura);
        }else if (temperatura>=27 && temperatura<=35) { 
            System.out.printf("%-23s\u001B[0;33m%.2f\u001B[0m Cº%n",infoTemp ,temperatura);
        }else {
            System.out.printf("%-23s\u001B[0;31m%.2f\u001B[0m Cº%n",infoTemp ,temperatura);
        }
        //Presion atmosferica
        System.out.printf("%-23s%.1f hPa%n",infoAtmosferica ,pAtmosferica);
        //Probabilidad Lluvia color
        if (lluvia<35) { 
            System.out.printf("%-23s\u001B[0;32m%d\u001B[0m%c%n",infoLluvia ,lluvia,'%');
        }else if (lluvia>=35&&lluvia<70) { 
            System.out.printf("%-23s\u001B[0;33m%d\u001B[0m%c%n",infoLluvia ,lluvia,'%');
        }else {
            System.out.printf("%-23s\u001B[0;31m%d\u001B[0m%c%n",infoLluvia ,lluvia,'%');
        }
        //Radiacion Ultravioleta
        if (radiacion<=2) { 
            System.out.printf("%-23s\u001B[0;32m%d\u001B[0m%n",infoRadiacion ,radiacion);
        }else if (radiacion>=3 && radiacion<=5) { 
            System.out.printf("%-23s\u001B[0;34m%d\u001B[0m%n",infoRadiacion ,radiacion);
        }else if (radiacion>=6 && radiacion<=7) { 
            System.out.printf("%-23s\u001B[0;33m%d\u001B[0m%n",infoRadiacion ,radiacion);
        }else if (radiacion>=8 && radiacion<=10) { 
            System.out.printf("%-23s\u001B[0;31m%d\u001B[0m%n",infoRadiacion ,radiacion);
        }else {
            System.out.printf("%-23s\u001B[0;35m%d\u001B[0m%n",infoRadiacion ,radiacion);
        }
    }
}