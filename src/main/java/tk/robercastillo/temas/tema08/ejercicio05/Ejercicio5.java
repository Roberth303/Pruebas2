package com.robercastillo.tema08.ejercicio05;

import com.robercastillo.tema08.ejercicio04.Punto;

public class Ejercicio5 {
    public Ejercicio5() {
        Punto p1 = new Punto(2.0, 6.0);
        Punto p2 = new Punto(3.5, 8.2);

        Circulo c1 = new Circulo(p1, 8.5);
        Circulo c2 = new Circulo(p2, 5);

        c1.visualizarCirculo();
        System.out.println("Circulo 1 de area " + c1.calcularArea() + " y de perimetro " + c1.calcularPerimetro());
        c2.visualizarCirculo();
        System.out.println("Circulo 2 de area " + c2.calcularArea() + " y de perimetro " + c2.calcularPerimetro());

        System.out.println("La distancia entre los dos circulos es " + c1.calcularDistancia(c2.getCentro()));


    }
}
