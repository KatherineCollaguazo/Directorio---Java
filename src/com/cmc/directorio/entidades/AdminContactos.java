package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contactos buscarMasPesado(Contactos cont1, Contactos cont2) {
		if (cont1.getPeso() > cont2.getPeso()) {
			return cont1;
		} else {
			return cont2;
		}
	}

	public boolean compararOperadoras(Telefono telf1, Telefono telf2) {
		if (telf1.getOperadora() == telf2.getOperadora()) {
			return true;
		} else {
			return false;
		}

	}
	

	public void activarUsuario(Contactos cont1, Telefono telf) {
		if (telf.isTieneWhatsapp() == true) {
			cont1.setActivo(true);
		}
	}
}
