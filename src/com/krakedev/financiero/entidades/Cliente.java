package com.krakedev.financiero.entidades;

public class Cliente {
	
	private String cedula;
    private String nombre;
    private String apellido;
    
    public Cliente(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
