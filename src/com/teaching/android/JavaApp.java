package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        System.out.println("Escribe un número"); // Display the string.
     Scanner keyboard = new Scanner(System.in);
     int valor = keyboard.nextInt();

     if (valor % 2 ==0 ) {
         System.out.println("Es par;");
     }else {
         System.out.println("Es impar");
     }
    }
}
