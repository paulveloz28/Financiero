package com.krakedev.financiero.servicios;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;

public class Banco {
	
	private int ultimoCodigo;
	
	public Banco() {
        ultimoCodigo = 1000;
    }
	
	public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }
    
    public Cuenta crearCuenta(Cliente cliente) {

        String codigoStr = ultimoCodigo + "";

        ultimoCodigo++;

        Cuenta cuenta = new Cuenta(codigoStr);

        cuenta.setPropietario(cliente);

        return cuenta;
    }

}
