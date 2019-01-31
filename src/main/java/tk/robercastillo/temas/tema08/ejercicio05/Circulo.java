package com.robercastillo.tema08.ejercicio05;

import com.robercastillo.tema08.ejercicio04.Punto;

public class Circulo {
    private static final double pi=3.14;
    private Punto centro;
    private double radio;

    public Circulo() {
        this.centro = new Punto();
        this.radio = 5;
    }
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public Circulo(double pX, double pY, double radio) {
        this.centro = new Punto(pX,pY);
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularDistancia(Punto rnd) {
        double resX;
        double resY;

        resX=this.centro.getX()-rnd.getX();
        resY=this.centro.getY()-rnd.getY();

        if(resX<0) {
            resX=resX*(-1);
        }
        if(resY<0) {
            resY=resY*(-1);
        }
        return Math.hypot(resX, resY);

    }
    public double calcularArea() {
        return pi*(this.radio*this.radio);
    }
    public double calcularPerimetro() {
        return 2*pi*this.radio;
    }
    public void visualizarCirculo() {
        if(centro.getX()==0 && centro.getY()==0) {
            System.out.println("Circulo de radio "+this.radio+" situado en el origen de las cordenadas");
        }else {
            System.out.print("Circulo de radio "+this.radio+" situado en el punto ");
            this.centro.visualizarPunto();
        }
    }
}
