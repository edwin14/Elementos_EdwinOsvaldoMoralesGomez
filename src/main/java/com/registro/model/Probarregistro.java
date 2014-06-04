
package com.registro.model;


public class Probarregistro {
    public static void main(String[] args) {
        Perro p=new Perro();
        p.setNombre("kukis");
        Persona a=new Persona();
        a.setPerro(p);
        //el siguiente es lo0 que resivira el cliente en el paso 4
        System.out.println(a.getPerro().getNombre());
    }
    
}
