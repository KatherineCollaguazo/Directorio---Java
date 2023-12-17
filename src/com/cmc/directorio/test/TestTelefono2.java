package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0982364561", 20);
		AminTelefono at = new AminTelefono();

		at.activarMensaria(telf);

		System.out.println(
				"numero: " + telf.getNumero() + " operadora: " + telf.getOperadora() + " codigo: " + telf.getCodigo() + " ,tiene whatsapp: " + telf.isTieneWhatsapp());

	}

}
