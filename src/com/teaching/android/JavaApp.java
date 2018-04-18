package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        System.out.println("Indroduce un número del 1 al 10");
        //Crea un numero rando del 1 al 10
        Random generator = new Random();
        int random = generator.nextInt(10) + 1;
        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();

        if (random > valor) {
        System.out.println("Mayor!");
    }else{
            System.out.printf("El número es menor");

        }

    {

        if ( random < valor) {
            valor = keyboard.nextInt();
            System.out.println("Menor!");
        }else {
            System.out.println("el número es mayor");
    }
    {

        if (random==valor){
            System.out.println("Correcto");
    }else {
            System.out.println("Has Fallado");
        }

            }
        }
    System.out.println(random);
    }
}
 