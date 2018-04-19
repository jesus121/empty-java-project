package com.teaching.android;

public class Persona {
   private String nombre ;
   private float dinero ;
   //Constructor
    public Persona (String nombre ,float dinero ){
        this.nombre=nombre ;
        this.dinero=dinero;
    }
    public void pagar (Persona q , float cantidad){
        this.dinero = this.dinero + cantidad ;
        q.dinero = q.dinero - cantidad ;
    }
   public String getNombre () {
        return nombre ;
   }
    public float getDinero (){
        return dinero;
    }
}


