
package com.registro.model;

public class Perro implements Mascota{
    private String nombre;

    
    public String ObtenerRegistro(){
        return "El Perrito que registrarte es: "+nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
