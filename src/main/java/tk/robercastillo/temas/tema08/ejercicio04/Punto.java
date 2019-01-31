package com.robercastillo.tema08.ejercicio04;

public class Punto {
    private double x;
    private double y;

    public Punto() {
        this.x=1;
        this.y=1;
    }
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public void setY(double y) {
        this.y=y;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x=x;
    }
    public double getX() {
        return x;
    }

    public double calcularPunto(double x, double y) {
        double resX;
        double resY;

        resX=this.x-x;
        resY=this.y-y;

        if(resX<0) {
            resX=resX*(-1);
        }
        if(resY<0) {
            resY=resY*(-1);
        }

        return Math.hypot(resX, resY);
    }
    public void visualizarPunto() {
        System.out.printf("( %.1f , %.1f )\n",this.x,this.y);
    }
}
