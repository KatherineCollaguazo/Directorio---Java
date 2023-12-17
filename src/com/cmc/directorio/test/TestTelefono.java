package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0987654321", 10);
		
		System.out.println("numero: " + telf.getNumero() + " operadora: " + telf.getOperadora() + " codigo: " + telf.getCodigo());
	}

}
