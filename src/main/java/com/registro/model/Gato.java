
package com.registro.model;


public class Gato implements Mascota{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String ObtenerRegistro(){
        return "Se acaba de registrar un gatito";
    }
    
    
}
