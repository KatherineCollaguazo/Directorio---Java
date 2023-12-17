package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contactos;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0987654321" , 23);
		Contactos c = new Contactos("Rodriguez", telf, 45);
		
		System.out.println("Apellido: " + c.getApellido() + " numero: " + telf.getNumero() + " operadora: " + telf.getOperadora());

	}

}
