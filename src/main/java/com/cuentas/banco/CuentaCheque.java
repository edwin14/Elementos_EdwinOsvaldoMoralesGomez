
package com.cuentas.banco;


public class CuentaCheque implements Cuentas{
    
    private String cuentas;

    public String getCuentas() {
        return cuentas;
    }

    public void setCuentas(String cuentas) {
        this.cuentas = cuentas;
    }

    public String ObtenerCuenta() {
        return "Nueva cuenta de Cheque creada con exito";
    }
  

}
