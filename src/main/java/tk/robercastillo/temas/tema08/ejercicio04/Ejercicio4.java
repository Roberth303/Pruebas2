package com.robercastillo.tema08.ejercicio04;
public class Ejercicio4 {
    public Ejercicio4() {
        double hipotenusa;
        Punto p1 = new Punto();
        Punto p2 = new Punto(3.5,5.2);

        p2.visualizarPunto();
        p1.visualizarPunto();
        hipotenusa=p2.calcularPunto(9.3, 8.6);
        System.out.println(hipotenusa);
    }
}
