package com.teaching.android;

public class PracticaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Paco", 200f);
        Persona a = new Persona("Pepe", 0);

        p.pagar( p,100f);
        System.out.println(p);
    }
}
