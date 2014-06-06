

package com.cuentas.banco;

public class CuentaNomina implements Cuentas {
    
    private String cuenta;

    public String getNombre() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.cuenta = nombre;
    }
    
    public String ObtenerCuenta() {
        return "Nueva cuenta de Nomina creada con exito";
    }

}
