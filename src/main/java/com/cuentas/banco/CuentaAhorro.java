
package com.cuentas.banco;


public class CuentaAhorro implements Cuentas{
    
    private String cuenta;

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String ObtenerCuenta() {
     return "Nueva cuenta de Ahorro creada con exito";
    }
    
}
