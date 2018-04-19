package com.teaching.android;

public class Punto {
    //atributos
    private int x;
    private int y;

    //constructor
    public Punto() {

    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(int pX, int pY) {
        int diferenciaX = pX - x;
        int diferenciaY = pY - y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);

        return resultado;
    }

    public double distancia(Punto pDestino) {
        int diferenciaX = pDestino.x - x;
        int diferenciaY = pDestino.y - y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);

        return resultado ;
    }
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
