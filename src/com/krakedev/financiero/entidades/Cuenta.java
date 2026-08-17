package com.krakedev.financiero.entidades;

public class Cuenta {
	
	    private String id;
	    private double saldoActual;
	    private String tipo;
	    
	    public Cuenta(String id) {
	        this.id = id;
	        this.saldoActual = 0;
	        this.tipo = "A";
	    }
	}


