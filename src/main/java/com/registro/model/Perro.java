
package com.registro.model;


public class Perro {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String ObtenerRegistro(){
        return "Ele Perrito que registrarte es: "+nombre;
    }
    
}
