package com.krakedev.financiero.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;
import com.krakedev.financiero.servicios.Banco;

public class TestBanco {
	
	@Test
    public void testCrearCuenta() {

        Banco banco = new Banco();

        Cliente cliente = new Cliente(
                "1234567890",
                "Juan",
                "Perez"
        );

        Cuenta cuenta1 = banco.crearCuenta(cliente);
        Cuenta cuenta2 = banco.crearCuenta(cliente);

        assertEquals("1000", cuenta1.getId());
        assertEquals("1001", cuenta2.getId());

        assertSame(cliente, cuenta1.getPropietario());
        assertSame(cliente, cuenta2.getPropietario());
    }

}
